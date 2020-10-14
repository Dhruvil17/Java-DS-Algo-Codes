package Chapt2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ThreadRequirement extends JFrame {

	private JPanel contentPane;
	private JTextField input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ThreadRequirement frame = new ThreadRequirement();
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
	public ThreadRequirement() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnCalculateSum = new JButton("Calculate Sum");
		btnCalculateSum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				new Thread(() -> {
				Long inputNumber = Long.parseLong(input.getText());
				
				Long sum = 0L;
				
				for(int i=1;i<=inputNumber;i++)
				{
					sum = sum + i;
				}
				JOptionPane.showMessageDialog(rootPane, "Sum = "+sum);
				}).start();
			}
		});
		btnCalculateSum.setFont(new Font("Calibri", Font.BOLD, 16));
		btnCalculateSum.setBounds(146, 157, 150, 29);
		contentPane.add(btnCalculateSum);
		
		input = new JTextField();
		input.setFont(new Font("Calibri", Font.BOLD, 16));
		input.setBounds(160, 43, 125, 29);
		contentPane.add(input);
		input.setColumns(10);
	}

}
