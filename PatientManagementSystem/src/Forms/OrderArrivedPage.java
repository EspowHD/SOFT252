/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import Forms.HomePages.SecretaryHomePage;
import Objects.Medicine;
import java.util.ArrayList;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import patientmanagementsystem.PatientManagementSystem;

/**
 *
 * @author espow
 */
public class OrderArrivedPage extends javax.swing.JFrame {
    SecretaryHomePage shp;
    Medicine selectedMedicine;
    public OrderArrivedPage(SecretaryHomePage shp) {
        this.shp = shp;
        initComponents();
        loadMedicines(PatientManagementSystem.getMedicines());
        updateSelectedMedicine(PatientManagementSystem.getMedicines());
        updateOrderedAmount();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LblMedicine = new javax.swing.JLabel();
        CbxMedicines = new javax.swing.JComboBox<>();
        LblOrdered = new javax.swing.JLabel();
        SpnArrived = new javax.swing.JSpinner();
        LblArrived = new javax.swing.JLabel();
        BtnCancel = new javax.swing.JButton();
        BtnStockOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Order Arrived");
        setMaximumSize(new java.awt.Dimension(400, 100));
        setMinimumSize(new java.awt.Dimension(400, 100));
        setResizable(false);

        LblMedicine.setFont(PatientManagementSystem.getTextFont());
        LblMedicine.setText("Medicine:");

        CbxMedicines.setFont(PatientManagementSystem.getTextFont());
        CbxMedicines.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxMedicinesActionPerformed(evt);
            }
        });

        LblOrdered.setFont(PatientManagementSystem.getTextFont());
        LblOrdered.setText("Amount Ordered: ");
        LblOrdered.setToolTipText("");

        SpnArrived.setFont(PatientManagementSystem.getTextFont());

        LblArrived.setFont(PatientManagementSystem.getTextFont());
        LblArrived.setText("Amount Arrived:");

        BtnCancel.setFont(PatientManagementSystem.getTextFont());
        BtnCancel.setText("Cancel");
        BtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelActionPerformed(evt);
            }
        });

        BtnStockOrder.setFont(PatientManagementSystem.getTextFont());
        BtnStockOrder.setText("Stock order");
        BtnStockOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnStockOrderActionPerformed(evt);
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
                        .addComponent(LblArrived)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SpnArrived, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(BtnCancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnStockOrder))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblMedicine)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CbxMedicines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LblOrdered)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblMedicine)
                    .addComponent(CbxMedicines, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblOrdered))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SpnArrived, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblArrived)
                    .addComponent(BtnCancel)
                    .addComponent(BtnStockOrder))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCancelActionPerformed

    private void BtnStockOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnStockOrderActionPerformed
        for(Medicine medicine : PatientManagementSystem.getMedicines()){
            if(medicine.equals(selectedMedicine)) medicine.orderArrived((Integer)this.SpnArrived.getValue());
        }
        shp.updateAll();
        this.dispose();
    }//GEN-LAST:event_BtnStockOrderActionPerformed

    private void CbxMedicinesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxMedicinesActionPerformed
        updateSelectedMedicine(PatientManagementSystem.getMedicines());
        updateOrderedAmount();
    }//GEN-LAST:event_CbxMedicinesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancel;
    private javax.swing.JButton BtnStockOrder;
    private javax.swing.JComboBox<String> CbxMedicines;
    private javax.swing.JLabel LblArrived;
    private javax.swing.JLabel LblMedicine;
    private javax.swing.JLabel LblOrdered;
    private javax.swing.JSpinner SpnArrived;
    // End of variables declaration//GEN-END:variables

    private void loadMedicines(ArrayList<Medicine> medicines) {
        this.CbxMedicines.removeAllItems();
        for(Medicine medicine : medicines){
            this.CbxMedicines.addItem(medicine.getMedicineName());
        }
    }

    private void updateSelectedMedicine(ArrayList<Medicine> medicines) {
        for(Medicine medicine : medicines){
            if(this.CbxMedicines.getSelectedItem().toString().equals(medicine.getMedicineName())) this.selectedMedicine = medicine;
        }
    }

    private void updateOrderedAmount() {
        this.LblOrdered.setText("Amount Ordered: "+this.selectedMedicine.getOrdered());
        this.SpnArrived.setModel((new SpinnerNumberModel(0,0,this.selectedMedicine.getOrdered(),1)));
    }
}
