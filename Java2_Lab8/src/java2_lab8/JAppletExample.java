package java2_lab8;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JApplet;
import javax.swing.JButton;

public class JAppletExample extends JApplet{
    
    @Override
    public void init(){
        Container content = getContentPane();
        content.setBackground(Color.white);
        content.setLayout(new FlowLayout());
        content.add(new JButton("Button1"));
        content.add(new JButton("Button2"));
        content.add(new JButton("Button3"));
    }
}