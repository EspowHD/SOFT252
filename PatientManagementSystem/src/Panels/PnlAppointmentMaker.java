/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Panels;

import java.text.SimpleDateFormat;
import java.util.Date;
import patientmanagementsystem.PatientManagementSystem;
import patientmanagementsystem.UserTypes.Doctor;

/**
 *
 * @author espow
 */
public class PnlAppointmentMaker extends javax.swing.JPanel {

    Date date = null;
    public PnlAppointmentMaker() {
        initComponents();
        loadDoctors();
        updateAddress();
        updateDate();
    }
    
    public Date getDate(){
        return this.date;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        CoBoDoctorSelector = new javax.swing.JComboBox<>();
        LblPickDoctor = new javax.swing.JLabel();
        LblPickDate = new javax.swing.JLabel();
        LblPickTime = new javax.swing.JLabel();
        TxtAddress = new javax.swing.JTextArea();
        SpinMonth = new javax.swing.JSpinner();
        SpinYear = new javax.swing.JSpinner();
        SpinDay = new javax.swing.JSpinner();
        LblSlash = new javax.swing.JLabel();
        LblSlash1 = new javax.swing.JLabel();
        LblColon = new javax.swing.JLabel();
        SpinHour = new javax.swing.JSpinner();
        SpinMinutes = new javax.swing.JSpinner();
        LblDoctorRating = new javax.swing.JLabel();

        setFont(PatientManagementSystem.getTextFont());
        setMaximumSize(new java.awt.Dimension(600, 200));
        setMinimumSize(new java.awt.Dimension(600, 200));
        setName(""); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 200));
        setLayout(new java.awt.GridBagLayout());

        CoBoDoctorSelector.setFont(PatientManagementSystem.getTextFont());
        CoBoDoctorSelector.setMaximumSize(new java.awt.Dimension(127, 32767));
        CoBoDoctorSelector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CoBoDoctorSelectorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(CoBoDoctorSelector, gridBagConstraints);

        LblPickDoctor.setFont(PatientManagementSystem.getTextFont());
        LblPickDoctor.setText("Pick Doctor: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        add(LblPickDoctor, gridBagConstraints);

        LblPickDate.setFont(PatientManagementSystem.getTextFont());
        LblPickDate.setText("Pick Date:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(LblPickDate, gridBagConstraints);

        LblPickTime.setFont(PatientManagementSystem.getTextFont());
        LblPickTime.setText("Pick Time");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(LblPickTime, gridBagConstraints);

        TxtAddress.setEditable(false);
        TxtAddress.setBackground(javax.swing.UIManager.getDefaults().getColor("Panel.background"));
        TxtAddress.setColumns(20);
        TxtAddress.setFont(PatientManagementSystem.getTextFont());
        TxtAddress.setLineWrap(true);
        TxtAddress.setRows(4);
        TxtAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtAddress.setMinimumSize(new java.awt.Dimension(200, 20));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridheight = 2;
        add(TxtAddress, gridBagConstraints);

        SpinMonth.setFont(PatientManagementSystem.getTextFont());
        SpinMonth.setModel(new javax.swing.SpinnerListModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"}));
        SpinMonth.setEditor(new javax.swing.JSpinner.ListEditor(SpinMonth));
        SpinMonth.setPreferredSize(new java.awt.Dimension(40, 22));
        SpinMonth.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinMonthStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        add(SpinMonth, gridBagConstraints);

        SpinYear.setFont(PatientManagementSystem.getTextFont());
        SpinYear.setModel(new javax.swing.SpinnerListModel(new String[] {"2019", "2020", "2021"}));
        SpinYear.setEditor(new javax.swing.JSpinner.ListEditor(SpinYear));
        SpinYear.setPreferredSize(new java.awt.Dimension(60, 22));
        SpinYear.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinYearStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(SpinYear, gridBagConstraints);

        SpinDay.setFont(PatientManagementSystem.getTextFont());
        SpinDay.setModel(new javax.swing.SpinnerListModel(new String[] {"01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        SpinDay.setEditor(new javax.swing.JSpinner.ListEditor(SpinDay));
        SpinDay.setMinimumSize(new java.awt.Dimension(40, 22));
        SpinDay.setPreferredSize(new java.awt.Dimension(40, 22));
        SpinDay.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SpinDayStateChanged(evt);
            }
        });
        SpinDay.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                SpinDayPropertyChange(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(SpinDay, gridBagConstraints);

        LblSlash.setFont(PatientManagementSystem.getTextFont());
        LblSlash.setText("/");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        add(LblSlash, gridBagConstraints);

        LblSlash1.setFont(PatientManagementSystem.getTextFont());
        LblSlash1.setText("/");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        add(LblSlash1, gridBagConstraints);

        LblColon.setFont(PatientManagementSystem.getTextFont());
        LblColon.setText(":");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        add(LblColon, gridBagConstraints);

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
        SpinHour.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                SpinHourPropertyChange(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(SpinHour, gridBagConstraints);

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
        SpinMinutes.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                SpinMinutesPropertyChange(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 3;
        add(SpinMinutes, gridBagConstraints);

        LblDoctorRating.setFont(PatientManagementSystem.getTextFont());
        LblDoctorRating.setText("Rating: N/A");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        add(LblDoctorRating, gridBagConstraints);
    }// </editor-fold>//GEN-END:initComponents

    private void CoBoDoctorSelectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CoBoDoctorSelectorActionPerformed
        updateAddress();
        updateRating();
    }//GEN-LAST:event_CoBoDoctorSelectorActionPerformed

    private void SpinDayPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_SpinDayPropertyChange
        // Was unable to remove it after a mis-click
    }//GEN-LAST:event_SpinDayPropertyChange

    private void SpinDayStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinDayStateChanged
       setDayToValid();
    }//GEN-LAST:event_SpinDayStateChanged

    private void SpinMonthStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinMonthStateChanged
        setDayToValid();
    }//GEN-LAST:event_SpinMonthStateChanged

    private void SpinYearStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinYearStateChanged
        setDayToValid();
    }//GEN-LAST:event_SpinYearStateChanged

    private void SpinHourStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinHourStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_SpinHourStateChanged

    private void SpinHourPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_SpinHourPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_SpinHourPropertyChange

    private void SpinMinutesStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SpinMinutesStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_SpinMinutesStateChanged

    private void SpinMinutesPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_SpinMinutesPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_SpinMinutesPropertyChange

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> CoBoDoctorSelector;
    private javax.swing.JLabel LblColon;
    private javax.swing.JLabel LblDoctorRating;
    private javax.swing.JLabel LblPickDate;
    private javax.swing.JLabel LblPickDoctor;
    private javax.swing.JLabel LblPickTime;
    private javax.swing.JLabel LblSlash;
    private javax.swing.JLabel LblSlash1;
    private javax.swing.JSpinner SpinDay;
    private javax.swing.JSpinner SpinHour;
    private javax.swing.JSpinner SpinMinutes;
    private javax.swing.JSpinner SpinMonth;
    private javax.swing.JSpinner SpinYear;
    private javax.swing.JTextArea TxtAddress;
    // End of variables declaration//GEN-END:variables

    private boolean checkDateValid(){
        boolean result = false;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date(this.SpinYear.getValue().toString()+"/"+this.SpinMonth.getValue().toString()+"/"+this.SpinDay.getValue().toString());
        if((this.SpinDay.getValue().toString()+"/"+this.SpinMonth.getValue().toString()+"/"+this.SpinYear.getValue().toString()).equals(dateFormat.format(date))) return true;
        else return result;
    }
    
    private void setDayToValid(){
        if(!checkDateValid()){
            int month = Integer.parseInt(this.SpinMonth.getValue().toString());
            if(month<=7){
                if(month == 2)
                    if((Integer.parseInt(this.SpinYear.getValue().toString())%4 == 0)) this.SpinDay.setValue("29");
                    else this.SpinDay.setValue("28");
                else if (month%2 == 0) this.SpinDay.setValue("30");
                else this.SpinDay.setValue("31");
            }
            else{
                if (month%2 == 0) this.SpinDay.setValue("31");
                else this.SpinDay.setValue("30");
            }
        }
        updateDate();
    }
    
    private void loadDoctors() {
        for (int i = 0; i < PatientManagementSystem.getUsers().size(); i++) {
            String userID = PatientManagementSystem.getUsers().get(i).getUniqueID();
            if(userID.contains("D")){
                this.CoBoDoctorSelector.addItem("Dr "+PatientManagementSystem.getUsers().get(i).getFirstName()+" "+PatientManagementSystem.getUsers().get(i).getLastName());
            }
        }
        if(this.CoBoDoctorSelector.getItemCount() == 0) this.CoBoDoctorSelector.addItem("No Doctors Loaded");
    }

    private void updateAddress() {
        for (int i = 0; i < PatientManagementSystem.getUsers().size(); i++) {
            String userID = PatientManagementSystem.getUsers().get(i).getUniqueID();
            if(userID.contains("D")){
                if(this.CoBoDoctorSelector.getSelectedItem().toString().contains(PatientManagementSystem.getUsers().get(i).getFirstName()) &&
                    this.CoBoDoctorSelector.getSelectedItem().toString().contains(PatientManagementSystem.getUsers().get(i).getLastName())){
                    this.TxtAddress.setText(PatientManagementSystem.getUsers().get(i).getAddress().getFormattedAddress());
                }
            }
        }
        if(this.TxtAddress.getText() == null || this.TxtAddress.getText() == "") this.TxtAddress.setText("No Doctors Loaded");
    }

    private void updateDate() {
        date = new Date(this.SpinYear.getValue().toString()+"/"+this.SpinMonth.getValue().toString()+"/"+this.SpinDay.getValue().toString()+" "+this.SpinHour.getValue().toString()+":"+this.SpinMinutes.getValue().toString());
    }

    private void updateRating() {
        for (int i = 0; i < PatientManagementSystem.getUsers().size(); i++) {
            String userID = PatientManagementSystem.getUsers().get(i).getUniqueID();
            if(userID.contains("D")){
                if(this.CoBoDoctorSelector.getSelectedItem().toString().contains(PatientManagementSystem.getUsers().get(i).getFirstName()) &&
                    this.CoBoDoctorSelector.getSelectedItem().toString().contains(PatientManagementSystem.getUsers().get(i).getLastName())){
                    this.LblDoctorRating.setText("Rating: "+((Doctor) PatientManagementSystem.getUsers().get(i)).getAverageRating());
                }
            }
        }
        if(this.LblDoctorRating.getText() == null || this.LblDoctorRating.getText() == "") this.LblDoctorRating.setText("Rating: N/A");
    }
}
