import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    double input, result;
    int cal;
    JFrame frame;
    JLabel label = new JLabel();
    JTextField textView = new JTextField();
    JButton btnDel = new JButton("DEL");
    JButton btnClr = new JButton("CLR");
    JButton btnMul = new JButton("*");
    JButton btnDiv = new JButton("/");

    JButton btnSeven = new JButton("7");
    JButton btnEight = new JButton("8");
    JButton btnNine = new JButton("9");
    JButton btnSub = new JButton("-");

    JButton btnFour = new JButton("4");
    JButton btnFive = new JButton("5");
    JButton btnSix = new JButton("6");
    JButton btnPlus = new JButton("+");

    JButton btnOne = new JButton("1");
    JButton btnTwo = new JButton("2");
    JButton btnThree = new JButton("3");
    JButton btnEqual = new JButton("=");

    JButton btnZero = new JButton("0");
    JButton btnDot = new JButton(".");

    Calculator() {
        CreateInterface();
        InterfaceComponents();
    }

    public void CreateInterface() {
        frame = new JFrame();
        frame.setTitle("Java.Calc");
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setSize(305,400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void InterfaceComponents() {
        label.setBounds(240,0,40,40);
        frame.add(label);
        textView.setBounds(10,40,270,60);
        textView.setEditable(false);
        textView.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.add(textView);

        btnClr.setBounds(10,110,60,40);
        frame.add(btnClr);

        btnDel.setBounds(80,110,60,40);
        frame.add(btnDel);
        btnMul.setBounds(150,110,60,40);
        frame.add(btnMul);
        btnDiv.setBounds(220,110,60,40);
        frame.add(btnDiv);

        btnSeven.setBounds(10, 160, 60, 40);
        frame.add(btnSeven);
        btnEight.setBounds(80, 160, 60, 40);
        frame.add(btnEight);
        btnNine.setBounds(150, 160, 60, 40);
        frame.add( btnNine);
        btnSub.setBounds(220, 160, 60, 40);
        frame.add( btnSub);

        btnFour.setBounds(10, 210, 60, 40);
        frame.add(btnFour);
        btnFive.setBounds(80, 210, 60, 40);
        frame.add(btnFive);
        btnSix.setBounds(150, 210, 60, 40);
        frame.add( btnSix);
        btnPlus.setBounds(220, 210, 60, 40);
        frame.add( btnPlus);

        btnOne.setBounds(10, 260, 60, 40);
        frame.add(btnOne);
        btnTwo.setBounds(80, 260, 60, 40);
        frame.add(btntwo);
        btnThree.setBounds(150, 260, 60, 40);
        frame.add( btnThree);
        btnEqual.setBounds(220, 260, 60,90);
        frame.add( btnEqual);
        btnZero.setBounds(10, 310, 130, 40);
        frame.add(btnZero);
        btnDot.setBounds(10, 310, 130, 40);
        frame.add(btnDot);
       
        // Add other components similarly
    }

    public static void main(String [] args) {
        new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Define actions for the buttons here
    }
}
