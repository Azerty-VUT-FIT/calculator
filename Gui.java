package com.azerty

import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui extends Applet implements ActionListener {
    JButton one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, divide, multiply, exponent, dot, 
    factorial, modulo, equals, delete;
    JTextField answer;


    public void init() {
        GuiLayout customLayout = new GuiLayout();

        setFont(new Font("Helvetica", Font.PLAIN, 12));
        setLayout(customLayout);

        seven = new JButton("7");
        add(seven);
        seven.doClick();
        seven.addActionListener(this);
        
        answer = new JTextField("0");
        add(answer);
        answer.setEditable(false);

        eight = new JButton("8");
        add(eight);
        eight.doClick();
        eight.addActionListener(this);

        
        nine = new JButton("9");
        add(nine);
        nine.doClick();
        nine.addActionListener(this);
        
        plus = new JButton("+");
        add(plus);
        plus.doClick();
        plus.addActionListener(this);

        minus = new JButton("-");
        add(minus);
        minus.doClick();
        minus.addActionListener(this);

        five = new JButton("5");
        add(five);
        five.doClick();
        five.addActionListener(this);
        
        four = new JButton("4");
        add(four);
        four.doClick();
        four.addActionListener(this);
        
        six = new JButton("6");
        add(six);
        six.doClick();
        six.addActionListener(this);

        divide = new JButton("/");
        add(divide);
        divide.doClick();
        divide.addActionListener(this);

        multiply = new JButton("*");
        add(multiply);
        multiply.doClick();
        multiply.addActionListener(this);

        one = new JButton("1");
        add(one);
        one.doClick();
        one.addActionListener(this);
        
        three = new JButton("3");
        add(three);
        three.doClick();
        three.addActionListener(this);

        two = new JButton("2");
        add(two);
        two.doClick();
        two.addActionListener(this);

        exponent = new JButton("x^y");
        add(exponent);
        exponent.doClick();
        exponent.addActionListener(this);

        factorial = new JButton("!");
        add(factorial);
        factorial.doClick();
        factorial.addActionListener(this);

        zero = new JButton("0");
        add(zero);
        zero.doClick();
        zero.addActionListener(this);

        modulo = new JButton("%");
        add(modulo);
        modulo.doClick();
        modulo.addActionListener(this);

        equals = new JButton("=");
        add(equals);
        equals.doClick();
        equals.addActionListener(this);

        delete = new JButton("C");
        add(delete);
        delete.doClick();
        delete.addActionListener(this);

				dot = new JButton(".");
        add(dot);
        dot.doClick();
        dot.addActionListener(this);

        setSize(getPreferredSize());

    }
    String input="";
    String a="";
    String b="";
    int operace=0;//plus=1, minus=2, divide=3, multiply=4, modulo=5, factorial=6, exponent=7
    public void actionPerformed(ActionEvent e) {
    	if(e.getSource() == nine)
            answer.setText(input+="9");
        if(e.getSource() == eight)
        	answer.setText(input+="8");
        if(e.getSource() == seven)
        	answer.setText(input+="7");
        if(e.getSource() == six)
        	answer.setText(input+="6");
        if(e.getSource() == five)
        	answer.setText(input+="5");
        if(e.getSource() == four)
        	answer.setText(input+="4");
        if(e.getSource() == three)
        	answer.setText(input+="3");
        if(e.getSource() == two)
        	answer.setText(input+="2");
        if(e.getSource() == one)
        	answer.setText(input+="1");
        if(e.getSource() == zero)
        	answer.setText(input+="0");
        if(e.getSource() == delete){
            a="";
            b="";
            operace=0;
        	answer.setText(input="");
        }
				if(e.getSource() == dot){
            answer.setText(input+=".");
        }
				
        if (e.getSource()==plus) {
            operace=1;
            a=input;

        }
        if (e.getSource() == equals){
            if(b==""){
                operace=0;
                answer.setText(a);
            }
            else{
                switch(operace){
                    case 1:
                        MathLib.getPlus(Double.parseDouble(a),Double.parseDouble(b));
                        break;
                    case 2:
                        MathLib.getMinus(Double.parseDouble(a),Double.parseDouble(b));
                        break;
                    case 3:
                        MathLib.getDivide(Double.parseDouble(a),Double.parseDouble(b));
                        break;
                    case 4:
                        MathLib.getMultiply(Double.parseDouble(a),Double.parseDouble(b));
                        break;
                    case 5:
                        MathLib.getFactorial(Double.parseDouble(a),Double.parseDouble(b));
                        break;
                    case 6:
                        MathLib.getMinus(Double.parseDouble(a),Double.parseDouble(b));
                        break;
                    case 7:
                        MathLib.getExponent(Double.parseDouble(a),Double.parseDouble(b));
                        break;
                }
                operace=0;
                answer.setText(a);
            }
            
        }
    }
    
    public static void main(String args[]) {
        Gui applet = new Gui();
        Frame window = new Frame("Gui");

        window.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        applet.init();
        window.add("Center", applet);
        window.pack();
        window.setVisible(true);
    }


}
class GuiLayout implements LayoutManager {

    public GuiLayout() {
    }

    public void addLayoutComponent(String name, Component comp) {
    }

    public void removeLayoutComponent(Component comp) {
    }

    public Dimension preferredLayoutSize(Container parent) {
        Dimension dim = new Dimension(0, 0);

        Insets insets = parent.getInsets();
        dim.width = 644 + insets.left + insets.right;
        dim.height = 355 + insets.top + insets.bottom;

        return dim;
    }

    public Dimension minimumLayoutSize(Container parent) {
        Dimension dim = new Dimension(0, 0);
        return dim;
    }

    public void layoutContainer(Container parent) {
        Insets insets = parent.getInsets();

        Component c;
        c = parent.getComponent(0);
        if (c.isVisible()) {c.setBounds(insets.left+24,insets.top+88,112,48);}
        c = parent.getComponent(1);
        if (c.isVisible()) {c.setBounds(insets.left+24,insets.top+16,592,56);}
        c = parent.getComponent(2);
        if (c.isVisible()) {c.setBounds(insets.left+144,insets.top+88,112,48);}
        c = parent.getComponent(3);
        if (c.isVisible()) {c.setBounds(insets.left+264,insets.top+88,112,48);}
        c = parent.getComponent(4);
        if (c.isVisible()) {c.setBounds(insets.left+384,insets.top+88,112,48);}
        c = parent.getComponent(5);
        if (c.isVisible()) {c.setBounds(insets.left+504,insets.top+88,112,48);}
        c = parent.getComponent(6);
        if (c.isVisible()) {c.setBounds(insets.left+144,insets.top+152,112,48);}
        c = parent.getComponent(7);
        if (c.isVisible()) {c.setBounds(insets.left+24,insets.top+152,112,48);}
        c = parent.getComponent(8);
        if (c.isVisible()) {c.setBounds(insets.left+264,insets.top+152,112,48);}
        c = parent.getComponent(9);
        if (c.isVisible()) {c.setBounds(insets.left+384,insets.top+152,112,48);}
        c = parent.getComponent(10);
        if (c.isVisible()) {c.setBounds(insets.left+504,insets.top+152,112,48);}
        c = parent.getComponent(11);
        if (c.isVisible()) {c.setBounds(insets.left+24,insets.top+216,112,48);}
        c = parent.getComponent(12);
        if (c.isVisible()) {c.setBounds(insets.left+264,insets.top+216,112,48);}
        c = parent.getComponent(13);
        if (c.isVisible()) {c.setBounds(insets.left+144,insets.top+216,112,48);}
        c = parent.getComponent(14);
        if (c.isVisible()) {c.setBounds(insets.left+384,insets.top+216,112,48);}
        c = parent.getComponent(15);
        if (c.isVisible()) {c.setBounds(insets.left+504,insets.top+216,112,48);}
        c = parent.getComponent(16);
        if (c.isVisible()) {c.setBounds(insets.left+144,insets.top+280,112,48);}
        c = parent.getComponent(17);
        if (c.isVisible()) {c.setBounds(insets.left+448,insets.top+280,48,48);}
        c = parent.getComponent(18);
        if (c.isVisible()) {c.setBounds(insets.left+568,insets.top+280,48,48);}
        c = parent.getComponent(19);
        if (c.isVisible()) {c.setBounds(insets.left+504,insets.top+280,48,48);}
        c = parent.getComponent(20);
        if (c.isVisible()) {c.setBounds(insets.left+384,insets.top+280,48,48);}
}
