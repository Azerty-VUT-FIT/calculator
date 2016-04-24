
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

public class Main extends Applet implements ActionListener {

	JFrame frame = new JFrame("Azerty calculator");
	JPanel panel = new JPanel(new FlowLayout());

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
	//plus=1, minus=2, divide=3, multiply=4, modulo=6, factorial=5, exponent=7
	int operace = 0; 
 
/******************************************************************************/
/*																Operations																	*/
/******************************************************************************/ 
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
				if(input.equals("")){
                            input=a;
                        }
                        if(input.contains(".")) {
                            System.out.println("break piont");
                            int i = input.indexOf('.');
                            for (int j=i; j<input.length(); j++) {
                                System.out.println(j);
                                if(input.charAt(j) != '0') {
                                    System.out.println("if");
                                    answer.setText(MathLib.overError);
                                    check=false;
                                    break;
                                    //System.out.println("if");
                                }
                                else {
                                    a=a.substring(0, i-1);
                                    System.out.println("else");
                                }
                            }
                        }
                        if(!check){
                            check=true;
                            break;
                        }
                        a=MathLib.getFactorial(Long.parseLong(a));
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
/*																	 Panel																		*/
/******************************************************************************/
	public void init() {
		frame.setSize(560,350);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.add(panel);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

//add buttons and TextField on panel		
		panel.add(answer);
		answer.setEditable(false);
		answer.setPreferredSize( new Dimension( 530, 40 ) );
		
		panel.add(seven);
		seven.setPreferredSize( new Dimension( 100, 50 ) );
		seven.addActionListener(this);
		
		panel.add(eight);
		eight.setPreferredSize( new Dimension( 100, 50 ) );
		eight.addActionListener(this);
		
		panel.add(nine);
		nine.setPreferredSize( new Dimension( 100, 50 ) );
		nine.addActionListener(this);
		
		panel.add(plus);
		plus.setPreferredSize( new Dimension( 100, 50 ) );
		plus.addActionListener(this);
		
		panel.add(minus);
		minus.setPreferredSize( new Dimension( 100, 50 ) );
		minus.addActionListener(this);
		
		panel.add(four);
		four.setPreferredSize( new Dimension( 100, 50 ) );
		four.addActionListener(this);
		
		panel.add(five);
		five.setPreferredSize( new Dimension( 100, 50 ) );
		five.addActionListener(this);
		
		panel.add(six);
		six.setPreferredSize( new Dimension( 100, 50 ) );
		six.addActionListener(this);
		
		panel.add(divide);
		divide.setPreferredSize( new Dimension( 100, 50 ) );
		divide.addActionListener(this);
		
		panel.add(multiply);
		multiply.setPreferredSize( new Dimension( 100, 50 ) );
		multiply.addActionListener(this);
		
		panel.add(one);
		one.setPreferredSize( new Dimension( 100, 50 ) );
		one.addActionListener(this);
		
		panel.add(two);
		two.setPreferredSize( new Dimension( 100, 50 ) );
		two.addActionListener(this);
		
		panel.add(three);
		three.setPreferredSize( new Dimension( 100, 50 ) );
		three.addActionListener(this);
		
		panel.add(exponent);
		exponent.setPreferredSize( new Dimension( 100, 50 ) );
		exponent.addActionListener(this);
		
		panel.add(factorial);
		factorial.setPreferredSize( new Dimension( 100, 50 ) );
		factorial.addActionListener(this);
		
		panel.add(dot);
		dot.setPreferredSize( new Dimension( 100, 50 ) );
		dot.addActionListener(this);
		
		panel.add(zero);
		zero.setPreferredSize( new Dimension( 100, 50 ) );
		zero.addActionListener(this);
		
		panel.add(modulo);
		modulo.setPreferredSize( new Dimension( 100, 50 ) );
		modulo.addActionListener(this);
		
		panel.add(delete);
		delete.setPreferredSize( new Dimension( 100, 50 ) );
		delete.addActionListener(this);

		panel.add(plmin);
		plmin.setPreferredSize( new Dimension( 100, 50 ) );
		plmin.addActionListener(this);

		panel.add(ans);
		ans.setPreferredSize( new Dimension( 100, 50 ) );
		ans.addActionListener(this);		

		panel.add(equals);
		equals.setPreferredSize( new Dimension( 100, 50 ) );
		equals.addActionListener(this);
	}

/******************************************************************************/
/*																	Actions																		*/
/******************************************************************************/    
	public void actionPerformed(ActionEvent e) {
	//click on 9  
	 	if(e.getSource() == nine){
     	if(input.length()<9){	
     	  answer.setText(input+="9");
       }
     }
	//click on 8
     if(e.getSource() == eight){
      if(input.length()<9){
        answer.setText(input+="8");
       }
     }
	//click on 7
		if(e.getSource() == seven){
			if(input.length()<9){
				answer.setText(input+="7");
			}
    }
	//click on 6
		if(e.getSource() == six){
			if(input.length()<9){
				answer.setText(input+="6");
			}
		}
 	//click on 5   
		if(e.getSource() == five){
	    if(input.length()<9){
	      answer.setText(input+="5");
      }
    }
  //click on 4  
		if(e.getSource() == four){
			if(input.length()<9){
				answer.setText(input+="4");
			}
		}
	//click on 3  
		if(e.getSource() == three){
			if(input.length()<9){
				answer.setText(input+="3");
			}
		}
	//click on 2
		if(e.getSource() == two){
			if(input.length()<9){
				answer.setText(input+="2");
			}
		}
	//click on 1
		if(e.getSource() == one){
			if(input.length()<9){
				answer.setText(input+="1");
			}
		}
	//click on 0
		if(e.getSource() == zero){
			if(input.length()<9){
				answer.setText(input+="0");
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
				}
				a=input;
				operace=0;
				answer.setText(a);
				input="";
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
		Main applet = new Main();     
		applet.init();
	}
}
