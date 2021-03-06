/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package improgram;

import java.awt.Frame;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Joseph Ahrens
 */
public class MessagesDialog extends javax.swing.JDialog {
    ServerCommunicator server;
    Frame parent;
    DefaultComboBoxModel box;
    /**
     * Creates new form MessagesDialog
     */
    public MessagesDialog(java.awt.Frame parent, boolean modal, ServerCommunicator server) {
        super(parent, modal);
        initComponents();
        this.parent = parent;
        this.server = server;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        messagesTextArea = new javax.swing.JTextArea();
        buddyLabel = new javax.swing.JLabel();
        buddyComboBox = new javax.swing.JComboBox();
        selectedBuddysCheckBox = new javax.swing.JCheckBox();
        messagesLabel = new javax.swing.JLabel();
        sendMessageLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buddyLabel2 = new javax.swing.JLabel();
        buddyComboBox2 = new javax.swing.JComboBox();
        sendMessageButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        messagesTextArea.setEditable(false);
        messagesTextArea.setColumns(20);
        messagesTextArea.setRows(5);
        jScrollPane1.setViewportView(messagesTextArea);

        buddyLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buddyLabel.setText("Buddy");

        box = new DefaultComboBoxModel();
        updateBuddyComboBox();
        buddyComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        updateBuddyComboBox();
        buddyComboBox.setModel(box);

        selectedBuddysCheckBox.setText("Show selected buddy's messages only");

        messagesLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        messagesLabel.setText("Messages");

        sendMessageLabel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        sendMessageLabel.setText("Send Message");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        buddyLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buddyLabel2.setText("Buddy");

        box = new DefaultComboBoxModel();
        updateBuddyComboBox();
        buddyComboBox2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        updateBuddyComboBox();
        buddyComboBox2.setModel(box);

        sendMessageButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        sendMessageButton.setText("Send Message");
        sendMessageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendMessageButtonActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buddyLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buddyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buddyLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buddyComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(sendMessageButton)))
                        .addGap(23, 23, 23))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(selectedBuddysCheckBox)
                        .addGap(78, 78, 78)
                        .addComponent(backButton)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(messagesLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sendMessageLabel)
                .addGap(84, 84, 84))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messagesLabel)
                    .addComponent(sendMessageLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buddyLabel)
                    .addComponent(buddyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buddyLabel2)
                    .addComponent(buddyComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendMessageButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectedBuddysCheckBox)
                    .addComponent(backButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("Messaging - Instant Messaging Program");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sendMessageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendMessageButtonActionPerformed
        JOptionPane.showMessageDialog(this, "A message would be sent to the selected buddy.");
    }//GEN-LAST:event_sendMessageButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        setVisible(false);
        MainWindowDialog mainWindow = new MainWindowDialog(parent, true, server);
        mainWindow.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        mainWindow.setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    public void updateBuddyComboBox(){
        box.removeAllElements();
        for(int i = 0; i < server.buddies.size(); i++){
            box.addElement(server.buddies.get(i));
            System.out.println("Added " + server.buddies.get(i) + " to the list / box.");
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox buddyComboBox;
    private javax.swing.JComboBox buddyComboBox2;
    private javax.swing.JLabel buddyLabel;
    private javax.swing.JLabel buddyLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel messagesLabel;
    private javax.swing.JTextArea messagesTextArea;
    private javax.swing.JCheckBox selectedBuddysCheckBox;
    private javax.swing.JButton sendMessageButton;
    private javax.swing.JLabel sendMessageLabel;
    // End of variables declaration//GEN-END:variables
}
