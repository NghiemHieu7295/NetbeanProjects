package java2_lab8;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FrameTest {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        JPanel panel = new JPanel();
        JButton btn = new JButton("Hello");
        
        frame.add(panel);
        frame.add(btn);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 100);
        frame.setVisible(true);
    }   
}