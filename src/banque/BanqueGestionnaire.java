package banque;

import java.io.BufferedReader;
import java.io.FileReader;

import weka.classifiers.bayes.NaiveBayes;
import weka.classifiers.meta.FilteredClassifier;
import weka.core.Instances;
import weka.filters.unsupervised.attribute.Remove;

public class BanqueGestionnaire {

	Instances data;

	public BanqueGestionnaire() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("database/credit-g.arff"));
			data = new Instances(reader);
			reader.close();
			data.setClassIndex(data.numAttributes() - 1);
			System.out.println("File loaded.");
			Remove rm = new Remove();

			rm.setOptions(new String[] { "-V" });
			rm.setAttributeIndices("3,2,20,7,8,4,6,21"); // remove 1st attribute
			// classifier
			NaiveBayes classifier = new NaiveBayes();

			// meta-classifier
			FilteredClassifier fc = new FilteredClassifier();
			fc.setFilter(rm);
			fc.setClassifier(classifier);

			// train and make predictions
			fc.buildClassifier(data);
			for (int i = 0; i < data.numInstances(); i++) {
				double pred = fc.classifyInstance(data.instance(i));
				System.out.print("ID: " + data.instance(i).value(0));
				System.out.print(", actual: " + data.classAttribute().value((int) data.instance(i).classValue()));
				System.out.println(", predicted: " + data.classAttribute().value((int) pred));
			}
			System.out.println(fc.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
