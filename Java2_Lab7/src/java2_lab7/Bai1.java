package java2_lab7;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Bai1 extends Applet{
    @Override
    public void paint(Graphics g){
        this.setSize(300, 250);
        this.setBackground(Color.CYAN);
        g.setColor(Color.BLUE);
        g.fillRect(0, 200, getWidth(), 30);
        g.setColor(Color.WHITE);
        g.fillOval((getWidth() / 2 - 40), 160, 80, 50);
        g.fillOval((getWidth() / 2 - 30), 120, 60, 45);
        g.setColor(Color.BLACK);
        g.drawLine(110, 110, 130, 140);
        g.drawLine(170, 140, 200, 140);
        g.setColor(Color.WHITE);
        g.fillOval((getWidth() / 2 - 20), 85, 40, 40);
        g.setColor(Color.BLACK);
        //g.drawArc(135, 105, 30, 20, 10, 10);
        g.fillOval(140, 95, 5, 5);
        g.fillOval(160, 95, 5, 5);
        g.drawLine((getWidth() / 2 - 20), 90, 170, 90);
        g.fillRect((getWidth() / 2 - 15), 65, 30, 25);
    }
}