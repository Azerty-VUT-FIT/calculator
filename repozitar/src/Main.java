
/**
 *@file Main.java
 *@brief Main program of Azerty calculator
 *@author Azerty team
 *@date April 2016
 */
/******************************************************************************/
/*																Libraries																		*/
/******************************************************************************/
package toTest;

import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {

	
	public Main(){
		init();
   }

	JPanel panel = new JPanel(new GridBagLayout());

	JTextField answer = new JTextField("0");

//buttons for numbers
	JButton one = new JButton("1");
	JButton two = new JButton("2");
	JButton three = new JButton("3");
	JButton four = new JButton("4");
	JButton five = new JButton("5");
	JButton six = new JButton("6");
	JButton seven = new JButton("7");
	JButton eight = new JButton("8");
	JButton nine = new JButton("9");
	JButton zero = new JButton("0");
 
//buttons for operations  
	JButton plus = new JButton("+");
	JButton minus = new JButton("-");
	JButton divide = new JButton("/");
	JButton multiply = new JButton("*");	
	JButton exponent = new JButton("x^y");
	JButton factorial = new JButton("!");
	JButton modulo = new JButton("%");
	JButton equals = new JButton("=");
	JButton delete = new JButton("C");
	JButton dot = new JButton(".");
	JButton plmin = new JButton("+/-");
	JButton ans = new JButton("ans");
    
	String input = "";
	String a = "";
	String b = "";
	String Sans = "";
	boolean check;
	int dot_n=0;
	int zero_n=0;

	//plus=1, minus=2, divide=3, multiply=4, modulo=6, factorial=5, exponent=7
	int operace = 0; 
 

/******************************************************************************/
/*																	 Panel																		*/
/******************************************************************************/
		/**
     * This method generates graphical user interface
		 */
	public void init() {
    
		this.setMinimumSize((new Dimension(660,300)));
		this.setVisible(true);
		this.add(panel);
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		GridBagLayout layout = new GridBagLayout();
		panel.setLayout(layout);
		GridBagConstraints c;
    
//add buttons and TextField on panel
                c =  new GridBagConstraints();
                
                c.fill = GridBagConstraints.BOTH;
                c.gridwidth = 5;
                c.gridx = 0;
                c.gridy = 2;
                c.weightx = 1.0;
								c.insets = new Insets(5,5,5,5);
		panel.add(answer, c);
		answer.setEditable(false);
		
                c.gridwidth = 1;
								c.fill = GridBagConstraints.BOTH;
                c.gridx = 0;
                c.gridy = 3;
								c.weightx = 0.5;
								c.weighty = 0.5;

		panel.add(seven, c);
		seven.addActionListener(this);
		
                c.fill = GridBagConstraints.BOTH;
                c.gridx = 1;
                c.gridy = 3;
                
		panel.add(eight,c);
		eight.addActionListener(this);
		
                c.fill = GridBagConstraints.BOTH;
                c.gridx = 2;
                c.gridy = 3;
                
		panel.add(nine, c);
		nine.addActionListener(this);
		
                c.fill = GridBagConstraints.BOTH;
                c.gridx = 3;
                c.gridy = 3;
                c.weightx = 0.5;
								c.weighty = 0.5;
		panel.add(plus,c);
		plus.addActionListener(this);
		
                c.fill = GridBagConstraints.BOTH;
                c.gridx = 4;
                c.gridy = 3;
                c.weightx = 0.5;
                panel.add(minus,c);
		minus.addActionListener(this);
                
                
                c.fill = GridBagConstraints.BOTH;
                c.gridx = 0;
                c.gridy = 4;
		panel.add(four,c);
		four.addActionListener(this);
		
                c.fill = GridBagConstraints.BOTH;
                c.gridx = 1;
                c.gridy = 4;
		panel.add(five, c);
		five.addActionListener(this);
		
                c.fill = GridBagConstraints.BOTH;
                c.gridx = 2;
                c.gridy = 4;        
		panel.add(six,c);
		six.addActionListener(this);
		
                c.fill = GridBagConstraints.BOTH;
                c.gridx = 3;
                c.gridy = 4;
		panel.add(divide,c);
		divide.addActionListener(this);
		
                c.fill = GridBagConstraints.BOTH;
                c.gridx = 4;
                c.gridy = 4;
		panel.add(multiply, c);
		multiply.addActionListener(this);
		
                c.fill = GridBagConstraints.BOTH;
                c.gridx = 0;
                c.gridy = 5;
		panel.add(one, c);
		one.addActionListener(this);
		
                c.fill = GridBagConstraints.BOTH;
                c.gridx = 1;
                c.gridy = 5;
		panel.add(two,c);
		two.addActionListener(this);
		
                c.fill = GridBagConstraints.BOTH;
                c.gridx = 2;
                c.gridy = 5;
		panel.add(three,c);
		three.addActionListener(this);
		
                c.fill = GridBagConstraints.BOTH;
                c.gridx = 3;
                c.gridy = 5;
		panel.add(exponent,c);
		exponent.addActionListener(this);
		
                c.fill = GridBagConstraints.BOTH;
                c.gridx = 4;
                c.gridy = 5;
		panel.add(factorial, c);
		factorial.addActionListener(this);
		
                c.fill = GridBagConstraints.BOTH;
                c.gridx = 0;
                c.gridy = 6;
		panel.add(dot,c);
		dot.addActionListener(this);
		
                c.fill = GridBagConstraints.BOTH;
                c.gridx = 1;
                c.gridy = 6;
		panel.add(zero,c);
		zero.addActionListener(this);
		
                c.fill = GridBagConstraints.BOTH;
                c.gridx = 2;
                c.gridy = 6;
		
		panel.add(delete,c);
		delete.addActionListener(this);

                c.fill = GridBagConstraints.BOTH;
                c.gridx = 4;
                c.gridy =6;

		panel.add(modulo,c);
		modulo.addActionListener(this);
		
                c.fill = GridBagConstraints.BOTH;
                c.gridx = 3;
                c.gridy = 6;
		panel.add(plmin,c);
		plmin.addActionListener(this);

                c.fill = GridBagConstraints.BOTH;
                c.gridx = 3;
                c.gridy = 7;
		panel.add(ans,c);
		
		ans.addActionListener(this);		

                c.fill = GridBagConstraints.BOTH;
                c.gridx = 4;
                c.gridy = 7;
		panel.add(equals,c);
		equals.addActionListener(this);
	}

/******************************************************************************/
/*																Operations																	*/
/******************************************************************************/ 
		/**
     * This method executes required operation
		 */
	public void executeOperation(){
		b=input;
		switch (operace) {
			case 1:
				a=MathLib.getPlus(Double.parseDouble(a),Double.parseDouble(b));
				break;
			case 2:
				a=MathLib.getMinus(Double.parseDouble(a),Double.parseDouble(b));
				break;
			case 3:
				a=MathLib.getDivide(Double.parseDouble(a),Double.parseDouble(b));
				break;
			case 4:
				a=MathLib.getMultiply(Double.parseDouble(a),Double.parseDouble(b));
				break;
			case 5:
				if(answer.getText().contains(".0")){
					a = a.substring(0, a.length() - 2);
				}
				a=MathLib.getFactorial(Long.parseLong(a));
				a=a+".0";
				break;
			case 6:
				a=MathLib.getModulo(Double.parseDouble(a),Integer.parseInt(b));
				break;
			case 7:
				a=MathLib.getExponent(Double.parseDouble(a),Integer.parseInt(b));
				break;
			default:
				answer.setText(MathLib.mathError);    
				break;
		}
		operace=0;
		answer.setText(a);
		input="";
	}
/******************************************************************************/
/*																	Actions																		*/
/******************************************************************************/   
		/**
     * This is method for functional buttons
		 */
	public void actionPerformed(ActionEvent e) {
	//click on 9  
	 	if(e.getSource() == nine){
     	if(input.length()<9){	
				if(answer.getText().equals("0") || answer.getText().equals("0.0")){
     	  	input="";					
				}
     	  answer.setText(input+="9");
				zero_n=0;
       }
     }
	//click on 8
     if(e.getSource() == eight){
      if(input.length()<9){
				if(answer.getText().equals("0") || answer.getText().equals("0.0")){
     	  	input="";					
				}
        answer.setText(input+="8");
				zero_n=0;
       }
     }
	//click on 7
		if(e.getSource() == seven){
			if(input.length()<9){
				if(answer.getText().equals("0") || answer.getText().equals("0.0")){
     	  	input="";					
				}
				answer.setText(input+="7");
				zero_n=0;
			}
    }
	//click on 6
		if(e.getSource() == six){
			if(input.length()<9){
				if(answer.getText().equals("0") || answer.getText().equals("0.0")){
     	  	input="";					
				}
				answer.setText(input+="6");
				zero_n=0;
			}
		}
 	//click on 5   
		if(e.getSource() == five){
	    if(input.length()<9){
				if(answer.getText().equals("0") || answer.getText().equals("0.0")){
     	  	input="";					
				}
	      answer.setText(input+="5");
				zero_n=0;
      }
    }
  //click on 4  
		if(e.getSource() == four){
			if(input.length()<9){
				if(answer.getText().equals("0") || answer.getText().equals("0.0")){
     	  	input="";					
				}
				answer.setText(input+="4");
				zero_n=0;
			}
		}
	//click on 3  
		if(e.getSource() == three){
			if(input.length()<9){
				if(answer.getText().equals("0") || answer.getText().equals("0.0")){
     	  	input="";					
				}
				answer.setText(input+="3");
				zero_n=0;
			}
		}
	//click on 2
		if(e.getSource() == two){
			if(input.length()<9){
				if(answer.getText().equals("0") || answer.getText().equals("0.0")){
     	  	input="";					
				}
				answer.setText(input+="2");
				zero_n=0;
			}
		}
	//click on 1
		if(e.getSource() == one){
			if(input.length()<9){
				if(answer.getText().equals("0") || answer.getText().equals("0.0")){
     	  	input="";					
				}
				answer.setText(input+="1");
				zero_n=0;
			}
		}
	//click on 0
		if(e.getSource() == zero){
			if(input.length()<9 && zero_n<1){
				if(answer.getText().equals("0") || answer.getText().equals("0.0")){
     	  	input="";					
				}
				answer.setText(input+="0");
				zero_n=0;
			}
		}
	//click on .
		if(e.getSource() == dot){
			if(input.length()<9 && dot_n<1){
				answer.setText(input+=".");
				dot_n=1;
			}
		}
	//click on C
		if(e.getSource() == delete){
			Sans=answer.getText();
			a="";
			b="";
			input="";
			operace=0;
			dot_n=0;					
			answer.setText("0");
		}
	//click on +
		if (e.getSource()==plus) {
			if(input.equals("")) {
				a=Sans;
			}
			if (operace!=0){
				executeOperation();
				operace=1;
				answer.setText(a);
			}
			else{
				operace=1;
				if (a.equals("")) {
					a=input;
				}
				answer.setText(a);
			}
			dot_n=0;
			Sans=answer.getText();
			input="";
		}
	//click on -
		if (e.getSource()==minus) {
			if(input.equals("")) {
				a=Sans;
			}
			if (operace!=0){
				executeOperation();
				operace=2;
				answer.setText(a);
       }
			else{
				operace=2;
        if (a.equals("")) {
      		a=input;
        }
      	answer.setText(a);
      }
			dot_n=0;
			Sans=answer.getText();
			input="";
		}
	//click on /
		if (e.getSource()==divide) {
			if(input.equals("")) {
				a=Sans;
			}
			if (operace!=0){
				executeOperation();
				operace=3;
				answer.setText(a);
				input="";
			}
			else{
				operace=3;
				if (a.equals("")) {
					a=input;
				}
				answer.setText(a);
				input="";
			}
			dot_n=0;
			Sans=answer.getText();
			input="";
		}
	//click on *
		if (e.getSource()==multiply) {
			if(input.equals("")) {
				a=Sans;
			}
			if (operace!=0){
				executeOperation();
				operace=4;
				answer.setText(a);
				input="";
			}
			else{
				operace=4;
				if (a.equals("")) {
					a=input;
				}
				answer.setText(a);
				input="";
			}	
			dot_n=0;
			Sans=answer.getText();
			input="";
		}
	//click on %
		if (e.getSource()==modulo) {
			if(input.equals("")) {
				a=Sans;
			}
			if (operace!=0){
				executeOperation();
				operace=6;
				answer.setText(a);
				input="";
			}
			else{
				operace=6;
				if (a.equals("")) {
   				a=input;
				}
				answer.setText(a);
				input="";
			}
			dot_n=0;
			Sans=answer.getText();
			input="";
		}
	//click on !
		if (e.getSource()==factorial) {
			if(input.equals("")) {
				a=Sans;
			}
			operace=5;
			if (a.equals("")) {
				a=input;
			}
			executeOperation();
			answer.setText(a);
			Sans=answer.getText();
			input="";
			dot_n=0;
		}
	//click on x^y
		if (e.getSource()==exponent) {
			if(input.equals("")) {
				a=Sans;
			}
			if (operace!=0){
				executeOperation();
				operace=7;
				answer.setText(a);
				input="";
			}
			else{
				operace=7;
				if (a.equals("")) {
					a=input;
				}
				answer.setText(a);
				input="";
			}
			dot_n=0;
			Sans=answer.getText();
			input="";
		}
	//click on +/-
		if(e.getSource() == plmin){
			if(input.equals("")) {
				a=Sans;
			}
			String k = answer.getText();
			if(!"0".equals(k) && !"0.0".equals(k)){
				double s = Double.parseDouble(k)*(-1.0);
				input=Double.toString(s);
				answer.setText(input);
				Sans=answer.getText();
				a=input;
				input="";
			}
		}
	//click on ans
		if (e.getSource() == ans){
			a=Sans;
			answer.setText(Sans);
		}
	//click on =
		if (e.getSource() == equals){
			if (a.equals("")){
				if(input.equals("")) {
					a="0";
					input=a;
					answer.setText(Sans);
				}
				else{
				a=input;
				operace=0;
				answer.setText(a);
				input="";
				}
			}
			else{
				executeOperation();
			}	
			Sans=answer.getText();
			a="";
			b="";
			input="";
			operace=0;
			dot_n=0;	
		}
	}
/******************************************************************************/
/*																		Main																		*/
/******************************************************************************/  
	public static void main(String args[]) {
		
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    new Main().setVisible(true);
                }
            });
	}
}
