/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import patientmanagementsystem.PatientManagementSystem;

/**
 *
 * @author espow
 */
public class RegisterNewPatient extends javax.swing.JFrame {

    /**
     * Creates new form RegisterNewPatient
     */
    public RegisterNewPatient() {
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

        patientRegistrationPanel1 = new Panels.PatientRegistrationPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register new Patient");
        setFont(PatientManagementSystem.getTextFont());
        setMaximumSize(new java.awt.Dimension(550, 440));
        setMinimumSize(new java.awt.Dimension(550, 440));
        setPreferredSize(new java.awt.Dimension(550, 400));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        patientRegistrationPanel1.setMaximumSize(new java.awt.Dimension(550, 400));
        patientRegistrationPanel1.setMinimumSize(new java.awt.Dimension(550, 400));
        patientRegistrationPanel1.setPreferredSize(new java.awt.Dimension(550, 450));
        patientRegistrationPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                patientRegistrationPanel1ComponentHidden(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        getContentPane().add(patientRegistrationPanel1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void patientRegistrationPanel1ComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_patientRegistrationPanel1ComponentHidden
        this.dispose();
    }//GEN-LAST:event_patientRegistrationPanel1ComponentHidden

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Panels.PatientRegistrationPanel patientRegistrationPanel1;
    // End of variables declaration//GEN-END:variables
}
