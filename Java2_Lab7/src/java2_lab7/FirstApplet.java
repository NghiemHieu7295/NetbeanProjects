package java2_lab7;

import java.applet.Applet;
import java.awt.Graphics;

public class FirstApplet extends Applet{
    @Override
    public void paint(Graphics g){
        g.drawRect(10, 10, 100, 100);
    }
}