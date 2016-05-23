package banque;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;

public class formulaire {

	private JFrame frame;
	private JTextField tXTCREDITACCOUNT;
	private JTextField textField;


	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					formulaire window = new formulaire();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public formulaire() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 338);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton_1 = new JButton("Submit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setBounds(253, 265, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"", "unemployed", "<1", ">=1", "<4", ">=4", "<7"}));
		comboBox1.setBounds(164, 34, 130, 20);
		frame.getContentPane().add(comboBox1);
		
		JLabel lblCheckingAccount = new JLabel("Employment");
		lblCheckingAccount.setBounds(53, 36, 101, 17);
		frame.getContentPane().add(lblCheckingAccount);
		
		JLabel lblCreditHistory = new JLabel("Credit history");
		lblCreditHistory.setBounds(53, 64, 82, 14);
		frame.getContentPane().add(lblCreditHistory);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "no credit", "All paid", "existing paid", "delayed previously", "Critical/ other existing credit", ""}));
		comboBox.setBounds(164, 65, 130, 20);
		frame.getContentPane().add(comboBox);
		
		JLabel lblFormulaire = new JLabel("Formulaire");
		lblFormulaire.setFont(new Font("Comic Sans MS", Font.PLAIN, 17));
		lblFormulaire.setVerticalAlignment(SwingConstants.TOP);
		lblFormulaire.setBounds(145, 0, 149, 23);
		frame.getContentPane().add(lblFormulaire);
		
		JLabel lblSavingAccount = new JLabel("Saving account");
		lblSavingAccount.setBounds(53, 104, 101, 14);
		frame.getContentPane().add(lblSavingAccount);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"", "<100", ">=100", "<500", ">=500", "<1000", ">=1000"}));
		comboBox_1.setBounds(164, 101, 130, 20);
		frame.getContentPane().add(comboBox_1);
		
		JLabel lblCreditAccount = new JLabel("Installment_commitment");
		lblCreditAccount.setBounds(53, 139, 120, 14);
		frame.getContentPane().add(lblCreditAccount);
		
		JLabel lblOtherPaymentPlans = new JLabel("Purpose");
		lblOtherPaymentPlans.setBounds(53, 164, 101, 14);
		frame.getContentPane().add(lblOtherPaymentPlans);
		
		JLabel lblDuration = new JLabel("Duration");
		lblDuration.setBounds(53, 199, 82, 14);
		frame.getContentPane().add(lblDuration);
		
		JLabel lblHousing = new JLabel("foreign_worker");
		lblHousing.setBounds(53, 224, 101, 14);
		frame.getContentPane().add(lblHousing);
		
		tXTCREDITACCOUNT = new JTextField();
		tXTCREDITACCOUNT.setBounds(174, 136, 120, 20);
		frame.getContentPane().add(tXTCREDITACCOUNT);
		tXTCREDITACCOUNT.setColumns(10);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"", "New car", "used car", "furniture/equipment", "Radio/tv", "domestic appliance", "repairs", "education ", "vacation", "retraining", "business", "other", "", "", "", "", ""}));
		comboBox_2.setBounds(164, 161, 130, 20);
		frame.getContentPane().add(comboBox_2);
		
		textField = new JTextField();
		textField.setBounds(174, 196, 120, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"", "Yes", "No"}));
		comboBox_3.setBounds(164, 221, 130, 20);
		frame.getContentPane().add(comboBox_3);
	}
}
