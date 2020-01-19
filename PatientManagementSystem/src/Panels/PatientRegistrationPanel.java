/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import java.util.Date;
import javax.swing.JOptionPane;
import patientmanagementsystem.PatientManagementSystem;
import patientmanagementsystem.UserTypes.Patient;

/**
 *
 * @author espow
 */
public class PatientRegistrationPanel extends javax.swing.JPanel {
    Patient patient;
    /**
     * Creates new form PatientRegistrationPanel
     */
    public PatientRegistrationPanel() {
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

        dateSelectPart1 = new Panels.Parts.DateSelectPart(new Date("1/1/1900 00:00"),new Date());
        addressInputPart1 = new Panels.Parts.AddressInputPart();
        LblDOB = new javax.swing.JLabel();
        LblAddress = new javax.swing.JLabel();
        LblFirstName = new javax.swing.JLabel();
        LblLastName = new javax.swing.JLabel();
        LblPassword = new javax.swing.JLabel();
        LblRePassword = new javax.swing.JLabel();
        LblGender = new javax.swing.JLabel();
        TxtFirstName = new javax.swing.JTextField();
        TxtLastName = new javax.swing.JTextField();
        pfPassword = new javax.swing.JPasswordField();
        pfRePassword = new javax.swing.JPasswordField();
        CBoxGender = new javax.swing.JComboBox<>();

        setMaximumSize(new java.awt.Dimension(550, 350));
        setMinimumSize(new java.awt.Dimension(550, 350));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(550, 350));
        setLayout(new java.awt.GridBagLayout());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        add(dateSelectPart1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 10, 15);
        add(addressInputPart1, gridBagConstraints);

        LblDOB.setFont(PatientManagementSystem.getTextFont());
        LblDOB.setText("DOB:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 10);
        add(LblDOB, gridBagConstraints);

        LblAddress.setFont(PatientManagementSystem.getTextFont());
        LblAddress.setText("Address:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 15);
        add(LblAddress, gridBagConstraints);

        LblFirstName.setFont(PatientManagementSystem.getTextFont());
        LblFirstName.setText("First Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 10);
        add(LblFirstName, gridBagConstraints);

        LblLastName.setFont(PatientManagementSystem.getTextFont());
        LblLastName.setText("Last Name:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 10);
        add(LblLastName, gridBagConstraints);

        LblPassword.setFont(PatientManagementSystem.getTextFont());
        LblPassword.setText("Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 10);
        add(LblPassword, gridBagConstraints);

        LblRePassword.setFont(PatientManagementSystem.getTextFont());
        LblRePassword.setText("Re-type Password:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 10);
        add(LblRePassword, gridBagConstraints);

        LblGender.setFont(PatientManagementSystem.getTextFont());
        LblGender.setText("Gender:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 10, 10);
        add(LblGender, gridBagConstraints);

        TxtFirstName.setFont(PatientManagementSystem.getTextFont());
        TxtFirstName.setMaximumSize(new java.awt.Dimension(100, 22));
        TxtFirstName.setMinimumSize(new java.awt.Dimension(100, 22));
        TxtFirstName.setPreferredSize(new java.awt.Dimension(100, 22));
        TxtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFirstNameActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(TxtFirstName, gridBagConstraints);

        TxtLastName.setFont(PatientManagementSystem.getTextFont());
        TxtLastName.setMaximumSize(new java.awt.Dimension(100, 22));
        TxtLastName.setMinimumSize(new java.awt.Dimension(100, 22));
        TxtLastName.setPreferredSize(new java.awt.Dimension(100, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(TxtLastName, gridBagConstraints);

        pfPassword.setFont(PatientManagementSystem.getTextFont());
        pfPassword.setMaximumSize(new java.awt.Dimension(100, 22));
        pfPassword.setMinimumSize(new java.awt.Dimension(100, 22));
        pfPassword.setPreferredSize(new java.awt.Dimension(100, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(pfPassword, gridBagConstraints);

        pfRePassword.setFont(PatientManagementSystem.getTextFont());
        pfRePassword.setMaximumSize(new java.awt.Dimension(100, 22));
        pfRePassword.setMinimumSize(new java.awt.Dimension(100, 22));
        pfRePassword.setPreferredSize(new java.awt.Dimension(100, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(pfRePassword, gridBagConstraints);

        CBoxGender.setFont(PatientManagementSystem.getTextFont());
        CBoxGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Other" }));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(CBoxGender, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void TxtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFirstNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> CBoxGender;
    private javax.swing.JLabel LblAddress;
    private javax.swing.JLabel LblDOB;
    private javax.swing.JLabel LblFirstName;
    private javax.swing.JLabel LblGender;
    private javax.swing.JLabel LblLastName;
    private javax.swing.JLabel LblPassword;
    private javax.swing.JLabel LblRePassword;
    public javax.swing.JTextField TxtFirstName;
    public javax.swing.JTextField TxtLastName;
    public Panels.Parts.AddressInputPart addressInputPart1;
    public Panels.Parts.DateSelectPart dateSelectPart1;
    public javax.swing.JPasswordField pfPassword;
    private javax.swing.JPasswordField pfRePassword;
    // End of variables declaration//GEN-END:variables

public boolean checkPasswordsMatch(){
    if(pfPassword.getText().equals(pfRePassword.getText())) return true;
    else{
        JOptionPane.showMessageDialog(null,
                            "The Passwords do not match",
                            "Incorrect Pass",
                            JOptionPane.ERROR_MESSAGE);
        return false;
    }
}
}
