package calculatrice_corps;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.Policy;
import java.util.jar.JarInputStream;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.text.GapContent;

public class Principale extends JFrame {
	JButton btnOne;
	JButton btnTwo;
	JButton btnThree;
	JButton btnFoor;
	JButton btnFive;
	JButton btnSix;
	JButton btnSeven;
	JButton btnEight;
	JButton btnNine;
	JButton btnZero;
	JButton btnEqual;
	JButton btnAdd;
	JButton btnSub;
	JButton btnDiv;
	JButton btnMult;
	JButton btnClear;
    static JLabel screen= new JLabel();
    static String temporaryValue = "";
    static String clickOperation = "";
    static double firstValue = 0.0;
    static double secondValue = 0.0;
 /*-------------------------------------VARIABLES-------------------------------------------------------------------*/  
    
	public Principale (){
		
		super("Calculatrice");
	
/*--------------------------------------------La Fenetre------------------------------------------------------------*/ 
				setResizable(true);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setLocationRelativeTo(null);
				
	
/*-----------------------------------------------------------------------------------------------------------------*/	
			
				

				
/*-----------------------SCREEN------------------------------------------------------------------------------------*/
		screen = new JLabel("0");
		screen.setSize(300,100);
		screen.setVisible(true);
		Font backGround = new Font("Arial", Font.BOLD, 20);
		screen.setFont(backGround);

		
		screen.setHorizontalAlignment(JLabel.RIGHT);
		  
		JPanel screen_Jpanel = new JPanel();
		screen_Jpanel.setSize(new Dimension(500,200));
		screen_Jpanel.setBorder(BorderFactory.createLineBorder(Color.black));
		screen_Jpanel.add(screen);
		add(screen);
/*-----------------------------------------------------------------------------------------------------------------*/
		
	

/*--------------------------------------------------------------------NUMBERS-------------------------------------------------------------*/
		btnOne = new JButton("1");	
		btnOne.setBounds(10, 300, 50, 50);
		add(btnOne);
		btnOne.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			System.out.println("btn One was clicked");	
			temporaryValue = screen.getText();
			screen.setText((screen.getText() == "0")?"1":screen.getText()+"1");
			temporaryValue = screen.getText(); 
			System.out.println(temporaryValue);
			getFirstAndSecondValue();		
			
			}
		});
		
		// object
		btnTwo = new JButton("2");
		btnTwo.setBounds(70, 300, 50, 50);
		add(btnTwo);
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn Two was clicked");
				temporaryValue = screen.getText();
				screen.setText((screen.getText() == "0")?"2":screen.getText()+"2");
				temporaryValue = screen.getText(); 
				System.out.println(temporaryValue);
				getFirstAndSecondValue();
			
			}
		});
		
		btnThree = new JButton("3");
		btnThree.setBounds(130, 300, 50, 50);
		add(btnThree);
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn Three was clicked");
				temporaryValue = screen.getText();
				screen.setText((screen.getText() == "0")?"3":screen.getText()+"3");
				temporaryValue = screen.getText(); 
				System.out.println(temporaryValue);
				getFirstAndSecondValue();
				
			}
		});
		
		btnFoor = new JButton("4");
		btnFoor.setBounds(10, 240, 50, 50);
		add(btnFoor);
		btnFoor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn four was clicked");
				temporaryValue = screen.getText();
				screen.setText((screen.getText() == "0")?"4":screen.getText()+"4");
				temporaryValue = screen.getText(); 
				System.out.println(temporaryValue);
				getFirstAndSecondValue();	
			}
		});
		
		btnFive = new JButton("5");
		btnFive.setBounds(70, 240, 50, 50);
		add(btnFive);
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn five was clicked");
				temporaryValue = screen.getText();
				screen.setText((screen.getText() == "0")?"5":screen.getText()+"5");
				temporaryValue = screen.getText(); 
				System.out.println(temporaryValue);
				getFirstAndSecondValue();
				
			}
		});
		
		btnSix = new JButton("6");
		btnSix.setBounds(130, 240, 50, 50);
		add(btnSix);
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn six was clicked");
				temporaryValue = screen.getText();
				screen.setText((screen.getText() == "0")?"6":screen.getText()+"6");
				temporaryValue = screen.getText(); 
				System.out.println(temporaryValue);
				getFirstAndSecondValue();
			}
		});
		
		btnSeven = new JButton("7");
		btnSeven.setBounds(10, 180, 50, 50);
		add(btnSeven);
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn seven was clicked");
				temporaryValue = screen.getText();
				screen.setText((screen.getText() == "0")?"7":screen.getText()+"7");
				temporaryValue = screen.getText(); 
				System.out.println(temporaryValue);
				getFirstAndSecondValue();
				
			}
		});
		
		btnEight = new JButton("8");
		btnEight.setBounds(70, 180, 50, 50);
		add(btnEight);
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn eight was clicked");
				temporaryValue = screen.getText();
				screen.setText((screen.getText() == "0")?"8":screen.getText()+"8");
				temporaryValue = screen.getText(); 
				System.out.println(temporaryValue);
				getFirstAndSecondValue();
				
			}
		});
		
		btnNine = new JButton("9");
		btnNine.setBounds(130, 180, 50, 50);
		add(btnNine);
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn nine was clicked");
				temporaryValue = screen.getText();
				screen.setText((screen.getText() == "0")?"9":screen.getText()+"9");
				temporaryValue = screen.getText(); 
				System.out.println(temporaryValue);
				getFirstAndSecondValue();
				
			}
		});
		
		btnZero = new JButton("0");
		btnZero.setBounds(10, 360, 170 ,50);
		add(btnZero);
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn zero was clicked");
				temporaryValue = screen.getText();		
				screen.setText(screen.getText()!="0" ? temporaryValue+"0" : "0" );
				temporaryValue = screen.getText(); 
				System.out.println(temporaryValue);
				getFirstAndSecondValue();
				
			}
		});
		
/*--------------------------------Operator--------------------------------*/
		
		btnEqual = new JButton("=");
		btnEqual.setBounds(200, 360, 170 ,50);
		add(btnEqual);
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn Equal was clicked");
				temporaryValue = screen.getText();
				screen.setText(temporaryValue+"=");
				System.out.println(addOperator(firstValue, secondValue, clickOperation));
				screen.setText(addOperator(firstValue, secondValue, clickOperation)+"");
			}
		});
		
		btnAdd = new JButton("+");
		btnAdd.setBounds(200, 300, 170 ,50);
		add(btnAdd);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn + was clicked");
				temporaryValue = screen.getText();
				screen.setText(temporaryValue+"+");
				clickOperation = "+";
				
				
				
			}
			
		});

		btnSub = new JButton("-");
		btnSub.setBounds(200, 240, 170 ,50);
		add(btnSub);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn - was clicked");
				temporaryValue = screen.getText();
				screen.setText(temporaryValue + "-");
				clickOperation = "-";	
			}
		});

		btnMult = new JButton("*");
		btnMult.setBounds(200, 180, 170 ,50);
		add(btnMult);
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn * was clicked");
				temporaryValue = screen.getText();
				screen.setText(temporaryValue + "*");
				clickOperation = "*";
			}
		});
		
		btnDiv = new JButton("/");
		btnDiv.setBounds(200, 120, 170 ,50);
		add(btnDiv);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn / was clicked");
				temporaryValue = screen.getText();
				screen.setText(temporaryValue + "/");
				clickOperation = "/";
				
			}
		});

		btnClear = new JButton("C");
		btnClear.setBounds(10,120, 170 ,50);
		btnClear.setForeground(Color.red);
		add(btnClear);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("btn C was clicked");
				temporaryValue = screen.getText();
				screen.setText("0");
				temporaryValue = screen.getText();
			}
		});
		
		setLayout(null);
		setLocation(800,400);
		setSize(400, 500);
		setVisible(true);

	}
	
	
	
	// operation
	public static double addOperator(double firstValue,double secondValue, String operator)
	{
		double resultOperation = 0.0;
		switch (operator) {
		case "+":
			resultOperation = firstValue + secondValue;
			break;
		case "-":
		resultOperation = firstValue - secondValue;
		break;
		case "*":
			resultOperation = firstValue * secondValue;
			break;
		case "/":
			if(secondValue != 0)
			{
			resultOperation = firstValue / secondValue;
			}else {
				return -1;
			}	
		default:		
			break;
		}
		return resultOperation;
		
	}
	
	// operation, a refaire avec switch, et une autre methode parail avec les ternaire 
	public static void getFirstAndSecondValue() {
		
		if(temporaryValue.contains("+")) {
			secondValue = Double.valueOf(temporaryValue.substring(temporaryValue.lastIndexOf("+")+1));
			System.out.println(secondValue);
			
		} else if(temporaryValue.contains("-")) {
			secondValue = Double.valueOf(temporaryValue.substring(temporaryValue.lastIndexOf("-")+1));
			System.out.println(secondValue);
			
		} else if(temporaryValue.contains("*")) {
			secondValue = Double.valueOf(temporaryValue.substring(temporaryValue.lastIndexOf("*")+1));
			System.out.println(secondValue);
			
		}else if(temporaryValue.contains("/"))
		{
			secondValue = Double.valueOf(temporaryValue.substring(temporaryValue.lastIndexOf("/")+1));
			System.out.println(secondValue);
			
		} else {
			firstValue = Double.valueOf(screen.getText());
			System.out.println("firstValue : "+firstValue);
		}	
	}
	
	public static void main(String[] args) {
		new Principale(); 
	
	
		
	 
	}

	

}
