import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class cargo extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					cargo frame = new cargo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public cargo() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 412);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLUE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null,"YOUR PACKAGE BEEN RECORED ");
				JOptionPane.showMessageDialog(null,"THANK YOU/n/n visit us again ");
			}
		});
		btnNewButton.setBounds(46, 146, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("WEIGHT");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBackground(Color.CYAN);
		lblNewLabel.setBounds(21, 78, 62, 30);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(93, 84, 103, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDistance = new JLabel("DISTANCE");
		lblDistance.setForeground(Color.RED);
		lblDistance.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblDistance.setBackground(Color.CYAN);
		lblDistance.setBounds(228, 78, 89, 30);
		contentPane.add(lblDistance);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(327, 79, 103, 23);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_1 = new JLabel("CARGO SHIPPING");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setForeground(Color.ORANGE);
		lblNewLabel_1.setBounds(34, 11, 198, 56);
		contentPane.add(lblNewLabel_1);
	}
}
