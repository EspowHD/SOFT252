/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms.Requesters;

import javax.swing.JOptionPane;
import patientmanagementsystem.PatientManagementSystem;
import patientmanagementsystem.UserTypes.Patient;

/**
 *
 * @author espow
 */
public class RequestNewPatient extends javax.swing.JFrame {

    /**
     * Creates new form RegisterNewPatient
     */
    public RequestNewPatient() {
        initComponents();
        setLocationRelativeTo(null);
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

        BtnCancel = new javax.swing.JButton();
        BtnRequestPatient = new javax.swing.JButton();
        patientRegistrationPanel = new Panels.PatientRegistrationPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register new Patient");
        setFont(PatientManagementSystem.getTextFont());
        setMinimumSize(new java.awt.Dimension(550, 410));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        BtnCancel.setFont(PatientManagementSystem.getTextFont());
        BtnCancel.setText("Cancel");
        BtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 100, 15, 10);
        getContentPane().add(BtnCancel, gridBagConstraints);

        BtnRequestPatient.setFont(PatientManagementSystem.getTextFont());
        BtnRequestPatient.setText("Request this Account");
        BtnRequestPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRequestPatientActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.SOUTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 15, 100);
        getContentPane().add(BtnRequestPatient, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        getContentPane().add(patientRegistrationPanel, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCancelActionPerformed

    private void BtnRequestPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRequestPatientActionPerformed
        if(this.patientRegistrationPanel.checkPasswordsMatch() && this.patientRegistrationPanel.dateSelectPart1.getDate() != null && this.patientRegistrationPanel.addressInputPart1.getAddress() != null) {
            PatientManagementSystem.getUsers().add(new Patient(this.patientRegistrationPanel.TxtFirstName.getText(),this.patientRegistrationPanel.TxtLastName.getText(),
                this.patientRegistrationPanel.pfPassword.getText(),this.patientRegistrationPanel.CBoxGender.getSelectedItem().toString(),
                this.patientRegistrationPanel.dateSelectPart1.getDate(),this.patientRegistrationPanel.addressInputPart1.getAddress(),"Requested"));
            PatientManagementSystem.saveInformation(PatientManagementSystem.getFile());
            this.setVisible(false);
        }
        else JOptionPane.showMessageDialog(null,
            "Not all information is filled in\nmake sure to press input address",
            "Invalid Post Code",
            JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_BtnRequestPatientActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancel;
    private javax.swing.JButton BtnRequestPatient;
    private Panels.PatientRegistrationPanel patientRegistrationPanel;
    // End of variables declaration//GEN-END:variables
}
