package java2_lab7;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;

public class Bai2 extends Applet{
    //int n;
    
//    @Override
//    public void init(){
//        Label lblNum = new Label("Nhap so duong thang muon ve:");
//        TextField txtNum = new TextField(30);
//        Button btnOK = new Button("OK");
//        BoxLayout b = new BoxLayout(this, BoxLayout.Y_AXIS);
//
//        this.setSize(250, 100);
//        this.setVisible(true);
//        this.setLayout(b);
//        this.add(lblNum);
//        this.add(txtNum);
//        this.add(btnOK);
//
//        btnOK.addActionListener(new ActionListener(){
//        @Override
//        public void actionPerformed(ActionEvent e) {
//                n = Integer.parseInt(txtNum.getText());
//                repaint();
//            }
//        });
//    }
    
    @Override
    public void paint(Graphics g){
        this.setSize(300, 300);
        int y = 0;
        for(int i = 0; i < 10; i++){
            y += 20;
            if((i % 2) == 0){
                g.setColor(Color.red);
                g.drawLine(0, y, 250, y);
            }
            else{
                g.setColor(Color.blue);
                g.drawLine(0, y, 250, y);
            }
        }
    }
}