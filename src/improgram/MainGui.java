package improgram;

import javax.swing.*;
/**
 *
 * @author Joseph Ahrens
 */
public class MainGui extends JFrame{
    public MainGui(){
        LoginDialog logIn = new LoginDialog(this, true);
        logIn.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        logIn.setVisible(true);
    }
}
