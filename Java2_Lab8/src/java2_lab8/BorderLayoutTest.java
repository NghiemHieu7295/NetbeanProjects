package java2_lab8;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

public class BorderLayoutTest {

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        JPanel panel = new JPanel();
        JButton btn1 = new JButton("North");
        JButton btn2 = new JButton("South");
        JButton btn3 = new JButton("East");
        JButton btn4 = new JButton("West");
        JButton btn5 = new JButton("Center");
        BorderLayout layout = new BorderLayout();
        
        panel.setLayout(layout);
        panel.add(btn1, BorderLayout.NORTH);
        panel.add(btn2, BorderLayout.SOUTH);
        panel.add(btn3, BorderLayout.EAST);
        panel.add(btn4, BorderLayout.WEST);
        panel.add(btn5, BorderLayout.CENTER);
        
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }   
}