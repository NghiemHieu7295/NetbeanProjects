package java2_lab8;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Bai1 {

    JFrame frm;
    JButton btnClick;
    JLabel lblMessage;
    private int count;
    
    Bai1(){
        frm = new JFrame("Count Button Hit");
        lblMessage = new JLabel("Click to the button");
        lblMessage.setFont(new Font("Arial", 1, 25));
        btnClick = new JButton("Click here");
        btnClick.setFont(new Font("Arial", 1, 25));
        count = 0;
        
        frm.add(btnClick, BorderLayout.CENTER);
        frm.add(lblMessage, BorderLayout.SOUTH);
        frm.setSize(300, 200);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLocationRelativeTo(null);
        frm.setVisible(true);
        
        btnClick.addActionListener(new ActionButton());
    }
    
    class ActionButton implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            count = count + 1;
            lblMessage.setText("You have clicked " + count);
        }
        
    }
    
    public static void main(String[] args) {
        Bai1 obj = new Bai1();
    }   
}