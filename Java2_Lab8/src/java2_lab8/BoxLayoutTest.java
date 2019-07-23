package java2_lab8;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.BoxLayout;

public class BoxLayoutTest {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        JPanel panel = new JPanel();
        JButton btn1 = new JButton("Button1");
        JButton btn2 = new JButton("Button2");
        JButton btn3 = new JButton("Button3");
        JButton btn4 = new JButton("Button4");
        JButton btn5 = new JButton("Button5");
        BoxLayout layout1 = new BoxLayout(panel, BoxLayout.X_AXIS);
        BoxLayout layout2 = new BoxLayout(panel, BoxLayout.Y_AXIS);
        
        panel.setLayout(layout1);
        //panel.setLayout(layout2);
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);
        panel.add(btn4);
        panel.add(btn5);
        
        frame.add(panel);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }   
}