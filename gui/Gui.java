import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import javax.swing.*;

public class Gui extends Applet {
    JButton one, two, three, four, five, six, seven, eight, nine, zero, plus, minus, divide, multiply, exponent, 
    factorial, modulo, equals, delete;
    JTextField answer;


    public void init() {
        GuiLayout customLayout = new GuiLayout();

        setFont(new Font("Helvetica", Font.PLAIN, 12));
        setLayout(customLayout);

        seven = new JButton("7");
        add(seven);
        
        answer = new JTextField("0.0");
        add(answer);

        eight = new JButton("8");
        add(eight);

        nine = new JButton("9");
        add(nine);

        plus = new JButton("+");
        add(plus);

        minus = new JButton("-");
        add(minus);

        five = new JButton("5");
        add(five);

        four = new JButton("4");
        add(four);

        six = new JButton("6");
        add(six);

        divide = new JButton("/");
        add(divide);

        multiply = new JButton("*");
        add(multiply);

        one = new JButton("1");
        add(one);

        three = new JButton("3");
        add(three);

        two = new JButton("2");
        add(two);

        exponent = new JButton("x^y");
        add(exponent);

        factorial = new JButton("!");
        add(factorial);

        zero = new JButton("0");
        add(zero);

        modulo = new JButton("%");
        add(modulo);

        equals = new JButton("=");
        add(equals);

        delete = new JButton("C");
        add(delete);

        setSize(getPreferredSize());

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
        if (c.isVisible()) {c.setBounds(insets.left+384,insets.top+280,112,48);}
        c = parent.getComponent(18);
        if (c.isVisible()) {c.setBounds(insets.left+568,insets.top+280,48,48);}
        c = parent.getComponent(19);
        if (c.isVisible()) {c.setBounds(insets.left+504,insets.top+280,48,48);}
    }
}
