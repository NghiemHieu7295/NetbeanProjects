package java2_lab8;

import java.io.File;
import javax.swing.JFileChooser;

public class JFileChooserTest {

    public static void main(String[] args) {
        JFileChooser fc = new JFileChooser();
        
        int retVal = fc.showOpenDialog(null);
        if(retVal == JFileChooser.APPROVE_OPTION){
            File file = fc.getSelectedFile();
        }
    }   
}