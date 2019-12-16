/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;
import java.util.Arrays;
import patientmanagementsystem.PatientManagementSystem;
import patientmanagementsystem.UserTypes.*;
import Forms.HomePages.*;
/**
 *
 * @author espow
 */
public class LoginPanel extends javax.swing.JPanel {
    boolean done = false;
    public LoginPanel() {
        initComponents();
    }
    
    public User loginCheck(){
        User userLogin = null;
        String uniqueID = txtUniqueID.getText();
        String password = String.valueOf(pfPassword.getPassword());
        System.out.println(uniqueID + "" + password);
        for (User user : PatientManagementSystem.getUsers()) {
            if(user.getUniqueID().equals(uniqueID)){
                if(user.getPassword().equals(password))userLogin = User.getUser(PatientManagementSystem.getUsers(), uniqueID);
            }
        }
        return userLogin;
    }
    
    public boolean getDone(){
        return this.done;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        pfPassword = new javax.swing.JPasswordField();
        txtUniqueID = new javax.swing.JTextField();
        jbLogin = new javax.swing.JButton();
        lblUniqueID = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(200, 125));
        setMinimumSize(new java.awt.Dimension(200, 125));
        setPreferredSize(new java.awt.Dimension(200, 125));
        setLayout(new java.awt.GridBagLayout());

        pfPassword.setFont(PatientManagementSystem.getTextFont());
        pfPassword.setMaximumSize(new java.awt.Dimension(100, 22));
        pfPassword.setMinimumSize(new java.awt.Dimension(100, 22));
        pfPassword.setName(""); // NOI18N
        pfPassword.setPreferredSize(new java.awt.Dimension(100, 22));
        pfPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfPasswordActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 15);
        add(pfPassword, gridBagConstraints);
        pfPassword.getAccessibleContext().setAccessibleName("");

        txtUniqueID.setFont(PatientManagementSystem.getTextFont());
        txtUniqueID.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtUniqueID.setToolTipText("Your user type (P for Patient,\nD for Doctor, A for Administrator,\nS for Secretary) followed\n by 4 numbers.");
        txtUniqueID.setAutoscrolls(false);
        txtUniqueID.setMaximumSize(new java.awt.Dimension(100, 22));
        txtUniqueID.setMinimumSize(new java.awt.Dimension(100, 22));
        txtUniqueID.setName("txtUniqueID"); // NOI18N
        txtUniqueID.setPreferredSize(new java.awt.Dimension(100, 22));
        txtUniqueID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniqueIDActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(5, 10, 0, 15);
        add(txtUniqueID, gridBagConstraints);

        jbLogin.setFont(PatientManagementSystem.getTextFont());
        jbLogin.setText("Log in");
        jbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        add(jbLogin, gridBagConstraints);

        lblUniqueID.setFont(PatientManagementSystem.getTextFont());
        lblUniqueID.setText("Unique ID:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(7, 15, 0, 0);
        add(lblUniqueID, gridBagConstraints);

        lblPassword.setFont(PatientManagementSystem.getTextFont());
        lblPassword.setText("Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(13, 15, 0, 0);
        add(lblPassword, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void pfPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pfPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pfPasswordActionPerformed

    private void txtUniqueIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniqueIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUniqueIDActionPerformed

    private void jbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginActionPerformed
        User user = loginCheck();
        if(user != null){
            char type = user.getUniqueID().charAt(0);
            switch(type){
                case 'D':
                    Doctor doctor = (Doctor) user;
                    break;
                case 'P':
                    Patient patient = (Patient) user;
                    PatientManagementSystem.setPhp(new PatientHomePage(patient));
                    PatientManagementSystem.getPhp().setVisible(true);
                    this.done = true;
                    break;
            }
        }
        
    }//GEN-LAST:event_jbLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbLogin;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUniqueID;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JTextField txtUniqueID;
    // End of variables declaration//GEN-END:variables
}