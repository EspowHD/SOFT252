/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms.Requesters;

import Forms.HomePages.DoctorHomePage;
import Objects.Appointment;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import patientmanagementsystem.PatientManagementSystem;
import patientmanagementsystem.UserTypes.Doctor;
import patientmanagementsystem.UserTypes.Patient;

/**
 *
 * @author espow
 */
public class DoctorAppointmentRequester extends javax.swing.JFrame {
    DoctorHomePage dhp;
    Patient patient;
    Date date;
    public DoctorAppointmentRequester(DoctorHomePage dhp) {
        this.dhp = dhp;
        initComponents();
        this.LblDoctor.setText(this.LblDoctor.getText()+this.dhp.getDoctor().getFirstName()+" "+this.dhp.getDoctor().getLastName());
        loadPatients();
        updateDate();
        updatePatient();
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

        LblPickTime = new javax.swing.JLabel();
        LblColon = new javax.swing.JLabel();
        BtnCancel = new javax.swing.JButton();
        SpinHour = new javax.swing.JSpinner();
        BtnRequest = new javax.swing.JButton();
        SpinMinutes = new javax.swing.JSpinner();
        LblDoctor = new javax.swing.JLabel();
        CbxPatientSelector = new javax.swing.JComboBox<>();
        LblPickPatient = new javax.swing.JLabel();
        Date lastDate = new Date();
        lastDate.setYear(lastDate.getYear()+2);
        dateSelectPart1 = new Panels.Parts.DateSelectPart(new Date(),lastDate);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        LblPickTime.setFont(PatientManagementSystem.getTextFont());
        LblPickTime.setText("Pick Time:");

        LblColon.setFont(PatientManagementSystem.getTextFont());
        LblColon.setText(":");

        BtnCancel.setFont(PatientManagementSystem.getTextFont());
        BtnCancel.setText("Cancel");
        BtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelActionPerformed(evt);
            }
        });

        SpinHour.setFont(PatientManagementSystem.getTextFont());
        SpinHour.setModel(new javax.swing.SpinnerListModel(new String[] {"08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"}));
        SpinHour.setEditor(new javax.swing.JSpinner.ListEditor(SpinHour));
        SpinHour.setMinimumSize(new java.awt.Dimension(40, 22));
        SpinHour.setPreferredSize(new java.awt.Dimension(40, 22));
        SpinHour.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinHourStateChanged(evt);
            }
        });

        BtnRequest.setFont(PatientManagementSystem.getTextFont());
        BtnRequest.setText("Request this Appoinment");
        BtnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRequestActionPerformed(evt);
            }
        });

        SpinMinutes.setFont(PatientManagementSystem.getTextFont());
        SpinMinutes.setModel(new javax.swing.SpinnerListModel(new String[] {"00", "15", "30", "45"}));
        SpinMinutes.setEditor(new javax.swing.JSpinner.ListEditor(SpinMinutes));
        SpinMinutes.setMinimumSize(new java.awt.Dimension(40, 22));
        SpinMinutes.setPreferredSize(new java.awt.Dimension(40, 22));
        SpinMinutes.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinMinutesStateChanged(evt);
            }
        });

        LblDoctor.setFont(PatientManagementSystem.getTextFont());
        LblDoctor.setText("Doctor: ");

        CbxPatientSelector.setFont(PatientManagementSystem.getTextFont());
        CbxPatientSelector.setMaximumSize(new java.awt.Dimension(127, 32767));
        CbxPatientSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxPatientSelectorActionPerformed(evt);
            }
        });

        LblPickPatient.setFont(PatientManagementSystem.getTextFont());
        LblPickPatient.setText("Pick Patient: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LblDoctor))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(LblPickPatient)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CbxPatientSelector, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(dateSelectPart1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblPickTime)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SpinHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LblColon)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SpinMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(BtnCancel)
                        .addGap(18, 18, 18)
                        .addComponent(BtnRequest)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(LblDoctor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblPickPatient)
                    .addComponent(CbxPatientSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateSelectPart1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LblPickTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SpinHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SpinMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblColon))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnCancel)
                    .addComponent(BtnRequest))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_BtnCancelActionPerformed

    private void SpinHourStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinHourStateChanged
        updateDate();
    }//GEN-LAST:event_SpinHourStateChanged

    private void BtnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRequestActionPerformed
        try{
            updateDate();
            if(patient != null ){
                if(!checkIfBusy(patient,this.dhp.getDoctor(),date)){
                    PatientManagementSystem.getAppointments().add(new Appointment(patient,this.dhp.getDoctor(),"Request",date));
                    this.dhp.updateAll();
                    PatientManagementSystem.saveInformation(PatientManagementSystem.getFile());
                    dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null, "The doctor or patient is busy\nat this time");
                }
            }
            else JOptionPane.showMessageDialog(null, "No doctor is selected");
        } catch (Exception e){
        }
    }//GEN-LAST:event_BtnRequestActionPerformed

    private void SpinMinutesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinMinutesStateChanged
        updateDate();
    }//GEN-LAST:event_SpinMinutesStateChanged

    private void CbxPatientSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxPatientSelectorActionPerformed
        updatePatient();
    }//GEN-LAST:event_CbxPatientSelectorActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCancel;
    private javax.swing.JButton BtnRequest;
    public javax.swing.JComboBox<String> CbxPatientSelector;
    private javax.swing.JLabel LblColon;
    private javax.swing.JLabel LblDoctor;
    private javax.swing.JLabel LblPickPatient;
    private javax.swing.JLabel LblPickTime;
    private javax.swing.JSpinner SpinHour;
    private javax.swing.JSpinner SpinMinutes;
    private Panels.Parts.DateSelectPart dateSelectPart1;
    // End of variables declaration//GEN-END:variables
    private boolean checkIfBusy(Patient patient, Doctor doctor, Date date) {
        boolean busy = false;
        for (Appointment appointment : PatientManagementSystem.getAppointments()) {
            if (appointment.getDoctor() == doctor || appointment.getPatient() == patient){
                if(appointment.getDateTime().equals(date)) busy = true;
            }
        }
        return busy;
    }
    
    private void loadPatients() {
        for (int i = 0; i < PatientManagementSystem.getUsers().size(); i++) {
            String userID = PatientManagementSystem.getUsers().get(i).getUniqueID();
            if(userID.contains("P")){
                this.CbxPatientSelector.addItem(PatientManagementSystem.getUsers().get(i).getFirstName()+" "+PatientManagementSystem.getUsers().get(i).getLastName());
            }
        }
        if(this.CbxPatientSelector.getItemCount() == 0) this.CbxPatientSelector.addItem("No Patients Loaded");
    }
    
    private void updateDate() {
        date = this.dateSelectPart1.getDate();
        date.setHours(Integer.parseInt(this.SpinHour.getValue().toString()));
        date.setMinutes(Integer.parseInt(this.SpinMinutes.getValue().toString()));
    }

    private void updatePatient() {
        for (int i = 0; i < PatientManagementSystem.getUsers().size(); i++) {
            String userID = PatientManagementSystem.getUsers().get(i).getUniqueID();
            if(userID.contains("P")){
                if(this.CbxPatientSelector.getSelectedItem().toString().contains(PatientManagementSystem.getUsers().get(i).getFirstName()) &&
                    this.CbxPatientSelector.getSelectedItem().toString().contains(PatientManagementSystem.getUsers().get(i).getLastName())){
                    this.patient = (Patient) PatientManagementSystem.getUsers().get(i);
                }
            }
        }
    }
}
