package Main;

import java.awt.EventQueue;
import java.lang.Math;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

/**
 * 
 * 
 * @author samuel,roope,jesse
 * 
 *
 */

public class Window {

	private JFrame frame;
	private JTextField textField;
	
	double num1;
	double num2;
	int operator;
	double result;

	/**
	 * kaynnistaa sovelluksen.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Window window = new Window();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Luo sovelluksen.
	 */
	public Window() {
		initialize();
	}

	/**
	 * Maarittaa ikkunan sisallon.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 362, 420);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(40, 29, 262, 59);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		/**
		 * Tyhjentaa ruudun
		 */
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnClear.setBounds(6, 179, 76, 29);
		frame.getContentPane().add(btnClear);
		/**
		 * Poistaa viimeisimman merkin naytolta
		 */
		JButton btnback = new JButton("Back");
		btnback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = textField.getText();
				str = str.substring(0,  str.length() - 1);
				textField.setText(str);
				
			}
		});
		btnback.setBounds(94, 179, 76, 29);
		frame.getContentPane().add(btnback);
		/**
		 * X:n neliojuuri
		 */
		JButton btnsqr = new JButton("sqrt");
		btnsqr.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				textField.setText(""+Math.sqrt(num1));
				
			}
		});
		btnsqr.setBounds(268, 179, 76, 29);
		frame.getContentPane().add(btnsqr);
		/**
		 * X potenssiin Y
		 */
		JButton btnpower = new JButton("^");
		btnpower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				operator = 5;
				textField.setText("");
			}
		});
		btnpower.setBounds(182, 179, 76, 29);
		frame.getContentPane().add(btnpower);
		/**
		 * X jaettuna Y:lla
		 */
		JButton btndivide = new JButton("%");
		btndivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				operator = 1;
				textField.setText("");
			}
		});
		btndivide.setBounds(268, 220, 76, 29);
		frame.getContentPane().add(btndivide);
		/**
		 * X kerrottuna Y:lla
		 */
		JButton btnmulti = new JButton("*");
		btnmulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				operator = 2;
				textField.setText("");
			}
		});
		btnmulti.setBounds(268, 261, 76, 29);
		frame.getContentPane().add(btnmulti);
		/**
		 * X:sta vahennetaan Y
		 */
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				operator = 3;
				textField.setText("");
			}
		});
		btnminus.setBounds(268, 302, 76, 29);
		frame.getContentPane().add(btnminus);
		 
		
		JButton btnsum = new JButton("=");
		btnsum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				num2 = Double.parseDouble(textField.getText());
				
				switch(operator) {
				case 1: result = num1 / num2;
				break;
				case 2: result = num1 * num2;
				break;
				case 3: result = num1 - num2;
				break;
				case 4: result = num1 + num2;
				break;
				case 5: result = Math.pow(num1,num2);
				break;
				
				
				default: result = 0.0;
				}
				
				textField.setText(""+result);
			}
		});
		btnsum.setBounds(182, 343, 76, 29);
		frame.getContentPane().add(btnsum);
		/**
		 * X:aan lisataan Y
		 */
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(textField.getText());
				operator = 4;
				textField.setText("");
			}
		});
		btnplus.setBounds(268, 343, 76, 29);
		frame.getContentPane().add(btnplus);
		
		JButton btncol = new JButton(".");
		btncol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String str = textField.getText();
				str += ".";
				textField.setText(str);
				
				
			}
		});
		btncol.setBounds(6, 343, 76, 29);
		frame.getContentPane().add(btncol);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setBounds(6, 220, 76, 29);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setBounds(94, 220, 76, 29);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setBounds(182, 220, 76, 29);
		frame.getContentPane().add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setBounds(6, 261, 76, 29);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setBounds(94, 261, 76, 29);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setBounds(182, 261, 76, 29);
		frame.getContentPane().add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setBounds(6, 302, 76, 29);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setBounds(94, 302, 76, 29);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setBounds(182, 302, 76, 29);
		frame.getContentPane().add(btn3);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText() + btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setBounds(94, 343, 76, 29);
		frame.getContentPane().add(btn0);
	}
}
