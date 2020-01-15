/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import Objects.Medicine;
import patientmanagementsystem.PatientManagementSystem;

/**
 *
 * @author espow
 */
public class MedicineOrderPanel extends javax.swing.JPanel {

    /**
     * Creates new form MedicineRequestPanel
     */
    public MedicineOrderPanel() {
        initComponents();
        loadCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        CbxMedicine = new javax.swing.JComboBox<>();
        LblMedicine = new javax.swing.JLabel();
        LblNewMedicine = new javax.swing.JLabel();
        TxtNewMedicine = new javax.swing.JTextField();
        LblQuantity = new javax.swing.JLabel();
        SpnQuantity = new javax.swing.JSpinner();

        CbxMedicine.setFont(PatientManagementSystem.getTextFont());

        LblMedicine.setFont(PatientManagementSystem.getTextFont());
        LblMedicine.setText("Medicine:");

        LblNewMedicine.setFont(PatientManagementSystem.getTextFont());
        LblNewMedicine.setText("New Medicine:");

        TxtNewMedicine.setFont(PatientManagementSystem.getTextFont());
        TxtNewMedicine.setToolTipText("Only used when New Medicine is selected in the drop box");

        LblQuantity.setFont(PatientManagementSystem.getTextFont());
        LblQuantity.setText("Quantity:");

        SpnQuantity.setFont(PatientManagementSystem.getTextFont());
        SpnQuantity.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblMedicine)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CbxMedicine, 0, 115, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LblQuantity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SpnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblNewMedicine)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtNewMedicine)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblMedicine)
                    .addComponent(CbxMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblQuantity)
                    .addComponent(SpnQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblNewMedicine)
                    .addComponent(TxtNewMedicine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CbxMedicine;
    private javax.swing.JLabel LblMedicine;
    private javax.swing.JLabel LblNewMedicine;
    private javax.swing.JLabel LblQuantity;
    private javax.swing.JSpinner SpnQuantity;
    private javax.swing.JTextField TxtNewMedicine;
    // End of variables declaration//GEN-END:variables

    public String getMedicineName(){
        if(this.CbxMedicine.getSelectedItem().toString().contains("New Medicine")){
            return this.TxtNewMedicine.getText();
        } else return this.CbxMedicine.getSelectedItem().toString();
    }

    public int getQuantity(){
        return (Integer) this.SpnQuantity.getValue();
    }

    private void loadCombo() {
        this.CbxMedicine.addItem("New Medicine");
        for(Medicine medicine : PatientManagementSystem.getMedicines()){
            this.CbxMedicine.addItem(medicine.getMedicineName());
        }
        
    }
}
