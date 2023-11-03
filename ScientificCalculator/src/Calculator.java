import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Calculator {
		private JFrame frame;
	private JTextField textField;
	
	double first;
	double second;
	double result;
	String operation;
	String answer;
	
	private JButton btnFact;
	private JButton btn7;
	private JButton btn4;
	private JButton btn1;
	private JButton btn0;
	private JButton btnCub;
	private JButton btnR;
	private JButton btnExp;
	private JButton btn8;
	private JButton btn5;
	private JButton btn2;
	private JButton btnDot;
	private JButton btnPow;
	private JButton btnSin;
	private JButton btnSinh;
	private JButton btn9;
	private JButton btn6;
	private JButton btn3;
	private JButton btnPer;
	private JButton btnInv;
	private JButton btnCos;
	private JButton btnCosh;
	private JButton btnDel;
	private JButton btnMul;
	private JButton btnAdd;
	private JButton btnopt;
	private JButton btnLog;
	private JButton btnTan;
	private JButton btnTanh;
	private JButton btnCLR;
	private JButton btnDiv;
	private JButton btnSub;
	private JButton btnEqual;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		});
	}

	
	public Calculator() {
		initialize();
	}
		private void initialize() {
			
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.control);
		frame.setBounds(100, 100, 352, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setResizable(false);
		frame.setTitle("Scientific Calculator!");
		
		ImageIcon image = new ImageIcon("logo.jpg");
		frame.setIconImage(image.getImage());
		
		
		JLabel lblNewLabel = new JLabel("Scientific Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(75, 11, 202, 28);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 16));
		textField.setBounds(10, 40, 314, 65);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnSqu = new JButton("x^2");
		btnSqu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 try {
			            double a = Double.parseDouble(textField.getText());
			            a = a * a;
			            textField.setText("");
			            textField.setText(textField.getText() + a);
			        } catch (NumberFormatException ex) {
			            JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
			        }
			}
			
			
		});
		btnSqu.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnSqu.setBounds(10, 116, 55, 55);
		frame.getContentPane().add(btnSqu);
		
		btnFact = new JButton("n!");
		btnFact.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String input = textField.getText();
		        if (input.isEmpty()) {
		            JOptionPane.showMessageDialog(frame, "Please enter a value first.", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		            double value = Double.parseDouble(input);
		            if (value < 0) {
		                JOptionPane.showMessageDialog(frame, "Invalid input. Factorial is defined only for non-negative integers.", "Error", JOptionPane.ERROR_MESSAGE);
		            } else {
		                double fact = 1;
		                for (int i = 1; i <= value; i++) {
		                    fact *= i;
		                }
		                textField.setText(String.valueOf(fact));
		            }
		        }
		    }
		});

		btnFact.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnFact.setBounds(10, 182, 55, 55);
		frame.getContentPane().add(btnFact);
		
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn7.getText();
				textField.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn7.setBounds(10, 304, 55, 55);
		frame.getContentPane().add(btn7);
		
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn4.getText();
				textField.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn4.setBounds(10, 364, 55, 55);
		frame.getContentPane().add(btn4);
		
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn1.getText();
				textField.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn1.setBounds(10, 424, 55, 55);
		frame.getContentPane().add(btn1);
		
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn0.getText();
				textField.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn0.setBounds(10, 490, 120, 55);
		frame.getContentPane().add(btn0);
		
		btnCub = new JButton("x^3");
		btnCub.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String input = textField.getText();
		        if (input.isEmpty()) {
		            JOptionPane.showMessageDialog(frame, "Please enter a value first.", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		            double a = (Double.parseDouble(input));
		            a = a * a * a;
		            textField.setText("");
		            textField.setText(textField.getText() + a);
		        }
		    }
		});

		btnCub.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCub.setBounds(75, 116, 55, 55);
		frame.getContentPane().add(btnCub);
		
		btnR = 	new JButton("\u221A");
		btnR.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String input = textField.getText();
		        if (input.isEmpty()) {
		            JOptionPane.showMessageDialog(frame, "Please enter a value first.", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		            double value = Double.parseDouble(input);
		            if (value < 0) {
		                JOptionPane.showMessageDialog(frame, "Invalid input. Cannot take the square root of a negative number.", "Error", JOptionPane.ERROR_MESSAGE);
		            } else {
		                double result = Math.sqrt(value);
		                textField.setText(String.valueOf(result));
		            }
		        }
		    }
		});

		btnR.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnR.setBounds(75, 180, 55, 55);
		frame.getContentPane().add(btnR);
		
		btnExp = new JButton("e^x");
		btnExp.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String input = textField.getText();
		        if (input.isEmpty()) {
		            JOptionPane.showMessageDialog(frame, "Please enter a value first.", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		            double value = Double.parseDouble(input);
		            double result = Math.exp(value);
		            textField.setText(String.valueOf(result));
		        }
		    }
		});

		btnExp.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnExp.setBounds(75, 246, 55, 55);
		frame.getContentPane().add(btnExp);
		
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn8.getText();
				textField.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn8.setBounds(75, 304, 55, 55);
		frame.getContentPane().add(btn8);
		
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn5.getText();
				textField.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn5.setBounds(75, 364, 55, 55);
		frame.getContentPane().add(btn5);
		
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn2.getText();
				textField.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn2.setBounds(75, 424, 55, 55);
		frame.getContentPane().add(btn2);
		
		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btnDot.getText();
				textField.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDot.setBounds(140, 490, 55, 55);
		frame.getContentPane().add(btnDot);
		
		btnPow = new JButton("x^y");
		btnPow.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String input = textField.getText();
		        if (input.isEmpty()) {
		            JOptionPane.showMessageDialog(frame, "Please enter a base value first.", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		            first = Double.parseDouble(input);
		            textField.setText("");
		            operation = "X^Y";
		        }
		    }
		});

		btnPow.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPow.setBounds(140, 116, 55, 55);
		frame.getContentPane().add(btnPow);
		
		btnSin = new JButton("sin");
		btnSin.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String input = textField.getText();
		        if (input.isEmpty()) {
		            JOptionPane.showMessageDialog(frame, "Please enter a value first.", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		            double a = Math.sin(Double.parseDouble(input));
		            textField.setText("");
		            textField.setText(textField.getText() + a);
		        }
		    }
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSin.setBounds(140, 182, 55, 55);
		frame.getContentPane().add(btnSin);
		
		btnSinh = new JButton("sinh");
		btnSinh.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String input = textField.getText();
		        if (input.isEmpty()) {
		            JOptionPane.showMessageDialog(frame, "Please enter a value first.", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		            double a = Math.sinh(Double.parseDouble(input));
		            textField.setText("");
		            textField.setText(textField.getText() + a);
		        }
		    }
		});
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnSinh.setBounds(140, 246, 55, 55);
		frame.getContentPane().add(btnSinh);
		
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn9.getText();
				textField.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn9.setBounds(140, 304, 55, 55);
		frame.getContentPane().add(btn9);
		
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn6.getText();
				textField.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn6.setBounds(140, 364, 55, 55);
		frame.getContentPane().add(btn6);
		
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number = textField.getText()+btn3.getText();
				textField.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btn3.setBounds(140, 424, 55, 55);
		frame.getContentPane().add(btn3);
		
		btnPer = new JButton("%");
		btnPer.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String input = textField.getText();
		        if (input.isEmpty()) {
		            JOptionPane.showMessageDialog(frame, "Please enter a value first.", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		            if (operation == null) {
		                // If no operation is selected, store the current input as 'first' for potential future calculations
		                first = Double.parseDouble(input);
		                operation = "%";
		                textField.setText("");
		            } else {
		                JOptionPane.showMessageDialog(frame, "Please press '=' before using '%' with another operation.", "Error", JOptionPane.ERROR_MESSAGE);
		            }
		        }
		    }
		});
		btnPer.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnPer.setBounds(205, 490, 55, 55);
		frame.getContentPane().add(btnPer);
		
		btnInv = new JButton("1/x");
		btnInv.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String input = textField.getText();
		        if (input.isEmpty()) {
		            JOptionPane.showMessageDialog(frame, "Please enter a value first.", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		            double a = 1 / Double.parseDouble(input);
		            textField.setText("");
		            textField.setText(textField.getText() + a);
		        }
		    }
		});
		btnInv.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnInv.setBounds(205, 116, 55, 55);
		frame.getContentPane().add(btnInv);
		
		btnCos = new JButton("cos");
		btnCos.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String input = textField.getText();
		        if (input.isEmpty()) {
		            JOptionPane.showMessageDialog(frame, "Please enter a value first.", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		            double a = Math.cos(Double.parseDouble(input));
		            textField.setText("");
		            textField.setText(textField.getText() + a);
		        }
		    }
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCos.setBounds(205, 182, 55, 55);
		frame.getContentPane().add(btnCos);
		
		btnCosh = new JButton("cosh");
		btnCosh.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String input = textField.getText();
		        if (input.isEmpty()) {
		            JOptionPane.showMessageDialog(frame, "Please enter a value first.", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		            double a = Math.cosh(Double.parseDouble(input));
		            textField.setText("");
		            textField.setText(textField.getText() + a);
		        }
		    }
		});
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnCosh.setBounds(205, 246, 55, 55);
		frame.getContentPane().add(btnCosh);
		
		btnDel = new JButton("\uF0E7");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace = null;
				
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}						
			}
		});
		btnDel.setFont(new Font("Wingdings", Font.PLAIN, 14));
		btnDel.setBounds(205, 304, 55, 55);
		frame.getContentPane().add(btnDel);
		
		btnMul = new JButton("*");

btnMul.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        String input = textField.getText();
        if (input.isEmpty()) {
            JOptionPane.showMessageDialog(frame, "Please enter a value first.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            first = Double.parseDouble(input);
            textField.setText("");
            operation = "*";
        }
    }
});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnMul.setBounds(205, 364, 55, 55);
		frame.getContentPane().add(btnMul);
		
		btnAdd = new JButton("+");
		btnAdd.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String input = textField.getText();
		        if (input.isEmpty()) {
		            JOptionPane.showMessageDialog(frame, "Please enter a value first.", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		            first = Double.parseDouble(input);
		            textField.setText("");
		            operation = "+";
		        }
		    }
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnAdd.setBounds(205, 424, 55, 55);
		frame.getContentPane().add(btnAdd);
		
		btnopt = new JButton("+/-");
		btnopt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a = Double.parseDouble(String.valueOf(textField.getText()));
				a = a * (-1);
				textField.setText(String.valueOf(a));
			}
		});
		btnopt.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnopt.setBounds(10, 245, 55, 55);
		frame.getContentPane().add(btnopt);
		
		btnLog = new JButton("log");
		btnLog.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String input = textField.getText();
		        if (input.isEmpty()) {
		            JOptionPane.showMessageDialog(frame, "Please enter a value first.", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		            double value = Double.parseDouble(input);
		            if (value <= 0) {
		                JOptionPane.showMessageDialog(frame, "Invalid input. Please enter a positive value for the logarithm.", "Error", JOptionPane.ERROR_MESSAGE);
		            } else {
		                double result = Math.log(value);
		                textField.setText(String.valueOf(result));
		            }
		        }
		    }
		});

		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLog.setBounds(270, 116, 55, 55);
		frame.getContentPane().add(btnLog);
		
		btnTan = new JButton("tan");
		btnTan.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String input = textField.getText();
		        if (input.isEmpty()) {
		            JOptionPane.showMessageDialog(frame, "Please enter a value first.", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		            double a = Math.tan(Double.parseDouble(input));
		            textField.setText("");
		            textField.setText(textField.getText() + a);
		        }
		    }
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnTan.setBounds(269, 182, 55, 55);
		frame.getContentPane().add(btnTan);
		
		btnTanh = new JButton("tanh");
		frame.getContentPane().add(btnTanh);
		btnTanh.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String input = textField.getText();
		        if (input.isEmpty()) {
		            JOptionPane.showMessageDialog(frame, "Please enter a value first.", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		            double a = Math.tanh(Double.parseDouble(input));
		            textField.setText("");
		            textField.setText(textField.getText() + a);
		        }
		    }
		});
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnTanh.setBounds(270, 246, 55, 55);
		frame.getContentPane().add(btnTanh);
		
		btnCLR = new JButton("AC");
		btnCLR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);			}
		});
		btnCLR.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnCLR.setBounds(270, 304, 55, 55);
		frame.getContentPane().add(btnCLR);
		
		btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	  String input = textField.getText();
		    	if (input.isEmpty()) {
		            JOptionPane.showMessageDialog(frame, "Please enter a value first.", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		            first = Double.parseDouble(input);
		            textField.setText("");
		            operation = "/";
		        }
		    }
		});

		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnDiv.setBounds(270, 364, 55, 55);
		frame.getContentPane().add(btnDiv);
		
		btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String input = textField.getText();
		        if (input.isEmpty()) {
		            JOptionPane.showMessageDialog(frame, "Please enter a value first.", "Error", JOptionPane.ERROR_MESSAGE);
		        } else {
		            first = Double.parseDouble(input);
		            textField.setText("");
		            operation = "-";
		        }
		    }
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnSub.setBounds(270, 424, 55, 55);
		frame.getContentPane().add(btnSub);
		
		btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        if (operation != null) {
		            second = Double.parseDouble(textField.getText());
		            if (operation.equals("/") && second == 0) {
		                JOptionPane.showMessageDialog(frame, "Cannot divide by zero.", "Error", JOptionPane.ERROR_MESSAGE);
		            } else {
		                if (operation.equals("+")) {
		                    result = first + second;
		                } else if (operation.equals("-")) {
		                    result = first - second;
		                } else if (operation.equals("*")) {
		                    result = first * second;
		                } else if (operation.equals("/")) {
		                    result = first / second;
		                } else if (operation.equals("%")) {
		                    result = first % second;
		                } else if (operation.equals("X^Y")) {
		                    double resultt = 1;
		                    for (int i = 0; i < second; i++) {
		                        resultt *= first;
		                    }
		                    result = resultt;
		                }
		                answer = String.format("%.2f", result);
		                textField.setText(answer);
		            }
		            operation = null; // Reset the operation after calculation
		        } else {
		            JOptionPane.showMessageDialog(frame, "Please select an operation first.", "Error", JOptionPane.ERROR_MESSAGE);
		        }
		    }
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEqual.setBounds(270, 490, 55, 55);
		frame.getContentPane().add(btnEqual);
	}
}
