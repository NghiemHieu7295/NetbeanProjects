package java2_lab8;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GridLayoutTest {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        JPanel panel = new JPanel();
        JButton btn1 = new JButton("Button1");
        JButton btn2 = new JButton("Button2");
        JButton btn3 = new JButton("Button3");
        JButton btn4 = new JButton("Button4");
        JButton btn5 = new JButton("Button5");
        JButton btn6 = new JButton("Button6");
        JButton btn7 = new JButton("Button7");
        JButton btn8 = new JButton("Button8");
        JButton btn9 = new JButton("Button9");
        //JButton btn10 = new JButton("Button10");
        GridLayout layout = new GridLayout(3, 3);
        
        panel.setLayout(layout);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        panel.add(btn6);
        panel.add(btn7);
        panel.add(btn8);
        panel.add(btn9);
        //panel.add(btn10);
        
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }   
}