/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms.Makers;

import Forms.HomePages.AdministratorHomePage;
import javax.swing.JOptionPane;
import patientmanagementsystem.PatientManagementSystem;
import patientmanagementsystem.UserTypes.Administrator;
import patientmanagementsystem.UserTypes.Doctor;
import patientmanagementsystem.UserTypes.Patient;
import patientmanagementsystem.UserTypes.Secretary;

/**
 *
 * @author espow
 */
public class MakeASDAccountsPage extends javax.swing.JFrame {

    private final AdministratorHomePage ahp;
    public MakeASDAccountsPage(AdministratorHomePage ahp) {
        this.ahp = ahp;
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

        LblFirstName = new javax.swing.JLabel();
        LblLastName = new javax.swing.JLabel();
        LblPassword = new javax.swing.JLabel();
        LblRePassword = new javax.swing.JLabel();
        TxtFirstName = new javax.swing.JTextField();
        BtnMakeAccount = new javax.swing.JButton();
        TxtLastName = new javax.swing.JTextField();
        BtnCancel = new javax.swing.JButton();
        pfPassword = new javax.swing.JPasswordField();
        addressInputPart = new Panels.Parts.AddressInputPart();
        pfRePassword = new javax.swing.JPasswordField();
        LblUserType = new javax.swing.JLabel();
        CbxUserType = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Make a new User");

        LblFirstName.setFont(PatientManagementSystem.getTextFont());
        LblFirstName.setText("First Name:");

        LblLastName.setFont(PatientManagementSystem.getTextFont());
        LblLastName.setText("Last Name:");

        LblPassword.setFont(PatientManagementSystem.getTextFont());
        LblPassword.setText("Password:");

        LblRePassword.setFont(PatientManagementSystem.getTextFont());
        LblRePassword.setText("Re-type Password:");

        TxtFirstName.setFont(PatientManagementSystem.getTextFont());
        TxtFirstName.setMaximumSize(new java.awt.Dimension(100, 22));
        TxtFirstName.setMinimumSize(new java.awt.Dimension(100, 22));
        TxtFirstName.setPreferredSize(new java.awt.Dimension(100, 22));

        BtnMakeAccount.setFont(PatientManagementSystem.getTextFont());
        BtnMakeAccount.setText("Make this Account");
        BtnMakeAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMakeAccountActionPerformed(evt);
            }
        });

        TxtLastName.setFont(PatientManagementSystem.getTextFont());
        TxtLastName.setMaximumSize(new java.awt.Dimension(100, 22));
        TxtLastName.setMinimumSize(new java.awt.Dimension(100, 22));
        TxtLastName.setPreferredSize(new java.awt.Dimension(100, 22));

        BtnCancel.setFont(PatientManagementSystem.getTextFont());
        BtnCancel.setText("Cancel");
        BtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelActionPerformed(evt);
            }
        });

        pfPassword.setFont(PatientManagementSystem.getTextFont());
        pfPassword.setMaximumSize(new java.awt.Dimension(100, 22));
        pfPassword.setMinimumSize(new java.awt.Dimension(100, 22));
        pfPassword.setPreferredSize(new java.awt.Dimension(100, 22));

        pfRePassword.setFont(PatientManagementSystem.getTextFont());
        pfRePassword.setMaximumSize(new java.awt.Dimension(100, 22));
        pfRePassword.setMinimumSize(new java.awt.Dimension(100, 22));
        pfRePassword.setPreferredSize(new java.awt.Dimension(100, 22));

        LblUserType.setFont(PatientManagementSystem.getTextFont());
        LblUserType.setText("User type:");

        CbxUserType.setFont(PatientManagementSystem.getTextFont());
        CbxUserType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrator", "Doctor", "Secretary" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(LblUserType)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CbxUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblRePassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(pfRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LblLastName)
                                    .addComponent(LblPassword)
                                    .addComponent(LblFirstName))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addComponent(addressInputPart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(BtnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnMakeAccount)
                .addGap(62, 62, 62))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblUserType)
                    .addComponent(CbxUserType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblFirstName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblLastName))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblPassword)
                            .addComponent(pfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblRePassword)
                            .addComponent(pfRePassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(addressInputPart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancel)
                    .addComponent(BtnMakeAccount))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelActionPerformed
        this.dispose();;
    }//GEN-LAST:event_BtnCancelActionPerformed

    private void BtnMakeAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMakeAccountActionPerformed
        if(this.addressInputPart.getAddress() != null) {
            if(this.checkPasswordsMatch()){
                switch (this.CbxUserType.getSelectedItem().toString()) {
                    case "Administrator":
                            PatientManagementSystem.getUsers().add(new Administrator(this.TxtFirstName.getText(),this.TxtLastName.getText(),
                                this.pfPassword.getText(),this.addressInputPart.getAddress()));
                        break;
                    case "Doctor":
                            PatientManagementSystem.getUsers().add(new Doctor(this.TxtFirstName.getText(),this.TxtLastName.getText(),
                                this.pfPassword.getText(),this.addressInputPart.getAddress()));
                        break;
                    case "Secretary":
                        PatientManagementSystem.getUsers().add(new Secretary(this.TxtFirstName.getText(),this.TxtLastName.getText(),
                                this.pfPassword.getText(),this.addressInputPart.getAddress()));
                        break;
                    default:
                        break;
                }
                PatientManagementSystem.saveInformation(PatientManagementSystem.getFile());
                this.ahp.loadUsers();
                this.dispose();
            }
        }
        else JOptionPane.showMessageDialog(null,
                            "Not all information is filled in\nmake sure to press input address",
                            "Invalid Address",
                            JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_BtnMakeAccountActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancel;
    private javax.swing.JButton BtnMakeAccount;
    private javax.swing.JComboBox<String> CbxUserType;
    private javax.swing.JLabel LblFirstName;
    private javax.swing.JLabel LblLastName;
    private javax.swing.JLabel LblPassword;
    private javax.swing.JLabel LblRePassword;
    private javax.swing.JLabel LblUserType;
    private javax.swing.JTextField TxtFirstName;
    private javax.swing.JTextField TxtLastName;
    private Panels.Parts.AddressInputPart addressInputPart;
    private javax.swing.JPasswordField pfPassword;
    private javax.swing.JPasswordField pfRePassword;
    // End of variables declaration//GEN-END:variables
    private boolean checkPasswordsMatch(){
        if(this.pfPassword.getText().equals(this.pfRePassword.getText())) return true;
        else{
            JOptionPane.showMessageDialog(null,
                                "The Passwords do not match",
                                "Incorrect Pass",
                                JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
