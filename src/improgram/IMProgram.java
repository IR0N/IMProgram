package improgram;

import java.awt.*;
import javax.swing.JFrame;

/**
 *
 * @author Joseph Ahrens
 */
public class IMProgram {
    public static void main(String[] args){
        EventQueue.invokeLater(new Runnable(){
            public void run(){
                MainGui gui = new MainGui();
                gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                gui.setVisible(true);
            }
        });
    }
}
