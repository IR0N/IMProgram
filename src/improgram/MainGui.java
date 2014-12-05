package improgram;

import javax.swing.*;
/**
 *
 * @author Joseph Ahrens
 */
public class MainGui extends JFrame{
    public MainGui(){
        ServerCommunicator server = new ServerCommunicator();
        
        LoginDialog logInDialog = new LoginDialog(this, true, server);
        logInDialog.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        /*registerDialog = new RegisterDialog(this, true);
        registerDialog.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        MainWindowDialog mainDialog = new MainWindowDialog(this, true);
        mainDialog.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        EditBuddyListDialog editBuddyListDialog = new EditBuddyListDialog(this, true);
        editBuddyListDialog.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        
        MessagesDialog messagesDialog = new MessagesDialog(this, true);
        messagesDialog.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);*/
        
        logInDialog.setVisible(true);
        
        /*while(true){
            if(logInDialog.registerButtonClicked){
                registerDialog.setVisible(true);
                logInDialog.registerButtonClicked = false;
            }
            if(logInDialog.logInButtonClicked){
                mainDialog.setVisible(true);
                logInDialog.logInButtonClicked = false;
            }
            if(registerDialog.registerButtonClicked || registerDialog.cancelButtonClicked){
                logInDialog.setVisible(true);
                registerDialog.registerButtonClicked = false;
                registerDialog.cancelButtonClicked = false;
            }
            if(mainDialog.editBuddyListMenuItemClicked){
                editBuddyListDialog.setVisible(true);
                mainDialog.editBuddyListMenuItemClicked = false;
            }
            if(mainDialog.messagesMenuItemClicked){
                messagesDialog.setVisible(true);
                mainDialog.messagesMenuItemClicked = false;
            }
            if(mainDialog.logOutButtonClicked){
                logInDialog.setVisible(true);
                mainDialog.logOutButtonClicked = false;
            }
            if(editBuddyListDialog.backButtonClicked){
                mainDialog.setVisible(true);
                editBuddyListDialog.backButtonClicked = false;
            }
            if(messagesDialog.backButtonClicked){
                mainDialog.setVisible(true);
                messagesDialog.backButtonClicked = false;
            }
            
        }*/
    }
    
}
