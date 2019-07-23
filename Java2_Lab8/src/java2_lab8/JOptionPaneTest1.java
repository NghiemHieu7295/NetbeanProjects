package java2_lab8;

import javax.swing.JOptionPane;

public class JOptionPaneTest1 {

    public static void main(String[] args) {
        String ans;
        ans = JOptionPane.showInputDialog("Tốc độ trên giờ?");
        double mph = Double.parseDouble(ans);
        double kph = 1.621 * mph;
        JOptionPane.showMessageDialog(null, "KPH = " + kph);
        System.exit(0);
    }   
}