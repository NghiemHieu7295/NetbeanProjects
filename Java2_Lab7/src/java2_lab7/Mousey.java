package java2_lab7;

import java.applet.Applet;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Mousey extends Applet implements MouseListener{
    int x1, y1, x2, y2;
    
    @Override
    public void init(){
        setLayout(new FlowLayout());
        setBounds(100, 100, 300, 300);
        addMouseListener(this);
        this.setVisible(true);
    }
    
    @Override
    public void mousePressed(MouseEvent e){
        x1 = e.getX();
        y1 = e.getY();
    }
    
    @Override
    public void mouseReleased(MouseEvent e){
        x2 = e.getX();
        y2 = e.getY();
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
    
    @Override
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        g.drawRect(x1, y1, Math.abs(x2 - x1), Math.abs(y2 - y1));
        x2 = 0;
        y2 = 0;
    }
}