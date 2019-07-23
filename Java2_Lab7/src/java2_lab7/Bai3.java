package java2_lab7;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;

public class Bai3 extends Applet{
    TextField txtRad, txtPerimeter, txtArea;
    Label lblRad, lblPerimeter, lblArea;
    Button btnCalc;
    
    @Override
    public void init(){
        lblRad = new Label("Radius:");
        lblPerimeter = new Label("Perimeter:");
        lblArea = new Label("Area:");
        txtRad = new TextField(30);
        txtPerimeter = new TextField(30);
        txtArea = new TextField(30);
        btnCalc = new Button("Calculate");
        BoxLayout b = new BoxLayout(this, BoxLayout.Y_AXIS);
        
        this.setSize(300, 200);
        this.setVisible(true);
        this.setLayout(b);
        this.add(lblRad);
        this.add(txtRad);
        this.add(lblPerimeter);
        this.add(txtPerimeter);
        this.add(lblArea);
        this.add(txtArea);
        this.add(btnCalc);
        btnCalc.addActionListener((ActionEvent e) -> {
            double r = Double.parseDouble(txtRad.getText());
            double p = 2 * Math.PI * r;
            double s = Math.PI * Math.pow(r, 2);
            
            txtPerimeter.setText(p + "");
            txtArea.setText(s + "");
        });
    }
}