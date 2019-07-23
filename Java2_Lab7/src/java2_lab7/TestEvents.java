package java2_lab7;

import java.applet.Applet;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TestEvents extends Applet implements ActionListener{
    private int count = 0;
    TextField text;
    Button btnInc, btnDec;
    
    @Override
    public void init(){
        text = new TextField("" + count);
        btnInc = new Button("Increment");
        btnDec = new Button("Decrement");
        
        add(text);
        add(btnInc);
        add(btnDec);
        
        btnInc.addActionListener(this);
        btnDec.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                text.setText("" + --count);
            }
            
        });
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == btnInc){
            text.setText("" + ++count);
        }
    }
}