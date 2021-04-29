import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class posgui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	int calculation;
	
	double ans,num;
	private JLabel label;
	/**
	 * Launch the application.
	 * 
	 */
public void ari_operator () {
	
		switch(calculation) {
		
		case 1 :
			ans=num+Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));

			break;
			
		case 2 :
			ans=num-Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));

			break;
			
		case 3 :
			ans=num*Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));

			break;
		case 4 :
			ans=num/Double.parseDouble(textField.getText());
			textField.setText(Double.toString(ans));

			break;
			
		}
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					posgui frame = new posgui();
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
	public posgui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 562, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("0");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"0");
			}
		});
		btnNewButton.setBounds(157, 363, 89, 46);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(20, 39, 363, 46);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("1");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"1");
			}
		});
		btnNewButton_1.setBounds(20, 107, 99, 53);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"2");
			}
		});
		btnNewButton_2.setBounds(157, 107, 89, 53);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("3");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"3");
			}
		});
		btnNewButton_3.setBounds(289, 107, 89, 53);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"4");
			}
		});
		btnNewButton_4.setBounds(20, 200, 99, 46);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"5");
			}
		});
		btnNewButton_5.setBounds(157, 200, 89, 46);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"6");
			}
		});
		btnNewButton_6.setBounds(289, 200, 89, 46);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText()+"7");
			}
		});
		btnNewButton_7.setBounds(20, 275, 89, 46);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"8");
			}
		});
		btnNewButton_8.setBounds(157, 275, 89, 46);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+"9");
			}
		});
		
		btnNewButton_9.setBounds(289, 275, 89, 46);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("+");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Double.parseDouble(textField.getText());
				calculation=1;
				textField.setText("");
				label.setText(num+"+");
				
			}
		});
		btnNewButton_10.setBounds(428, 107, 89, 53);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("-");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num=Double.parseDouble(textField.getText());
				calculation=2;
				textField.setText("");
				label.setText(num+"-");
			}
		});
		btnNewButton_11.setBounds(428, 200, 89, 46);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("*");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Double.parseDouble(textField.getText());
				calculation=3;
				textField.setText("");
				label.setText(num+"*");
			}
		});
		btnNewButton_12.setBounds(428, 283, 89, 38);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("/");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num=Double.parseDouble(textField.getText());
				calculation=4;
				textField.setText("");
				label.setText(num+"/");
			}
		});
		btnNewButton_13.setBounds(428, 363, 89, 46);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("C");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnNewButton_14.setBounds(428, 22, 89, 46);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("=");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ari_operator();
				label.setText("");
			}
		});
		btnNewButton_15.setBounds(289, 363, 89, 46);
		contentPane.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton(".");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText()+".");
			}
		});
		btnNewButton_16.setBounds(20, 363, 89, 46);
		contentPane.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("<--");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length=textField.getText().length();
				int number=textField.getText().length()-1;
				String store ;
				
				if(length>0)
				{
					StringBuilder back = new StringBuilder(textField.getText());
					back.deleteCharAt(number);
					store=back.toString();
					textField.setText(store);
				}
			}
		});
		btnNewButton_17.setBounds(428, 79, 89, 23);
		contentPane.add(btnNewButton_17);
		
		label = new JLabel("");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(297, 14, 86, 14);
		contentPane.add(label);
	}
}
