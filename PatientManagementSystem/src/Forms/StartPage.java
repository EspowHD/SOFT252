package Forms;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author espow
 */
import java.awt.Font;
import patientmanagementsystem.PatientManagementSystem;
public class StartPage extends javax.swing.JFrame {
    /**
     * Creates new form HomePageUI
     */
    public StartPage() {
        initComponents();
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

        BtnLogin = new javax.swing.JButton();
        loginPanel = new Panels.LoginPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Patient Management System - Start page");
        setBounds(new java.awt.Rectangle(0, 0, 400, 300));
        setMinimumSize(new java.awt.Dimension(300, 250));
        setName("Start Page"); // NOI18N
        setPreferredSize(new java.awt.Dimension(300, 250));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        BtnLogin.setFont(PatientManagementSystem.getTextFont());
        BtnLogin.setText("Register");
        BtnLogin.setAlignmentX(0.5F);
        BtnLogin.setAlignmentY(0.0F);
        BtnLogin.setMaximumSize(new java.awt.Dimension(100, 30));
        BtnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLoginActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1;
        getContentPane().add(BtnLogin, gridBagConstraints);
        BtnLogin.getAccessibleContext().setAccessibleName("");

        loginPanel.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                loginPanelComponentHidden(evt);
            }
        });
        loginPanel.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                loginPanelPropertyChange(evt);
            }
        });
        getContentPane().add(loginPanel, new java.awt.GridBagConstraints());

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnLoginActionPerformed

    private void loginPanelPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_loginPanelPropertyChange

    }//GEN-LAST:event_loginPanelPropertyChange

    private void loginPanelComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_loginPanelComponentHidden
        if(this.loginPanel.getDone())this.dispose();
    }//GEN-LAST:event_loginPanelComponentHidden


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnLogin;
    private Panels.LoginPanel loginPanel;
    // End of variables declaration//GEN-END:variables

}
