package improgram;

import javax.swing.*;
/**
 *
 * @author Joseph Ahrens
 */
public class MainGui extends JFrame{
    public MainGui(){
        LoginDialog logInDialog = new LoginDialog(this, true);
        logInDialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        RegisterDialog registerDialog = new RegisterDialog(this, true);
        registerDialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        logInDialog.setVisible(true);
        
        while(true){
            if(logInDialog.registerButtonClicked){
                registerDialog.setVisible(true);
                logInDialog.registerButtonClicked = false;
            }
            if(registerDialog.registerButtonClicked){
                logInDialog.setVisible(true);
                registerDialog.registerButtonClicked = false;
            }
        }
    }
    
}
