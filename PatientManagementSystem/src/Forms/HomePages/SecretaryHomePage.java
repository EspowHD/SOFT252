/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms.HomePages;

import Forms.Makers.SecretaryAppointmentMakerPage;
import Forms.*;
import Objects.Appointment;
import Objects.Medicine;
import Panels.ContainedComponents.AppointmentPanel;
import Panels.ContainedComponents.MedicinePanel;
import Panels.ContainedComponents.UserPanel;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import patientmanagementsystem.PatientManagementSystem;
import patientmanagementsystem.UserTypes.Doctor;
import patientmanagementsystem.UserTypes.Patient;
import patientmanagementsystem.UserTypes.User;

/**
 *
 * @author espow
 */
public class SecretaryHomePage extends javax.swing.JFrame {

    private Doctor selectedDoctor;
    private Patient selectedPatient;
    
    public SecretaryHomePage() {
        initComponents();
        updateAll();
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

        SclUsers = new javax.swing.JScrollPane();
        UsersContainer = new javax.swing.JPanel();
        SclAppointments = new javax.swing.JScrollPane();
        AppointmentsContainer = new javax.swing.JPanel();
        LblDoctor = new javax.swing.JLabel();
        CbxDoctor = new javax.swing.JComboBox<>();
        BtnRequestAppointment = new javax.swing.JButton();
        SclRequests = new javax.swing.JScrollPane();
        RequestsContainer = new javax.swing.JPanel();
        LblPatients = new javax.swing.JLabel();
        LblPatient = new javax.swing.JLabel();
        CbxPatient = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        TblMedicines = new javax.swing.JTable();
        BtnRemovePatient = new javax.swing.JButton();
        CbxRequests = new javax.swing.JComboBox<>();
        LblRequest = new javax.swing.JLabel();
        BtnApprove = new javax.swing.JButton();
        BtnDeny = new javax.swing.JButton();
        BtnLogout = new javax.swing.JButton();
        BtnOrderArrived = new javax.swing.JButton();
        BtnGivePrescription = new javax.swing.JButton();
        LblMedicines = new javax.swing.JLabel();
        BtnOrderMedicine = new javax.swing.JButton();
        LblRequests = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Secretary Home Page");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setMaximumSize(new Dimension(PatientManagementSystem.getSCREEN_SIZE().width,PatientManagementSystem.getSCREEN_SIZE().height));
        setMinimumSize(new Dimension(PatientManagementSystem.getSCREEN_SIZE().width,PatientManagementSystem.getSCREEN_SIZE().height));
        setPreferredSize(new Dimension(PatientManagementSystem.getSCREEN_SIZE().width,PatientManagementSystem.getSCREEN_SIZE().height));
        getContentPane().setLayout(new java.awt.GridBagLayout());

        SclUsers.setBackground(new java.awt.Color(255, 102, 102));
        SclUsers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SclUsers.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        SclUsers.setAlignmentX(0.0F);
        SclUsers.setAlignmentY(0.0F);
        SclUsers.setMaximumSize(new java.awt.Dimension(600, 300));
        SclUsers.setMinimumSize(new java.awt.Dimension(600, 300));
        SclUsers.setPreferredSize(new java.awt.Dimension(600, 300));

        UsersContainer.setBackground(new java.awt.Color(247, 247, 247));
        UsersContainer.setAutoscrolls(true);
        UsersContainer.setMaximumSize(new java.awt.Dimension(600, 10000));
        UsersContainer.setMinimumSize(new Dimension(600,PatientManagementSystem.getSCREEN_SIZE().height-100));
        UsersContainer.setName(""); // NOI18N
        UsersContainer.setPreferredSize(new Dimension(600,PatientManagementSystem.getSCREEN_SIZE().height-100));
        UsersContainer.setLayout(new javax.swing.BoxLayout(UsersContainer, javax.swing.BoxLayout.PAGE_AXIS));
        SclUsers.setViewportView(UsersContainer);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(SclUsers, gridBagConstraints);

        SclAppointments.setBackground(new java.awt.Color(255, 102, 102));
        SclAppointments.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SclAppointments.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        SclAppointments.setAlignmentX(0.0F);
        SclAppointments.setAlignmentY(0.0F);
        SclAppointments.setMaximumSize(new java.awt.Dimension(600, 300));
        SclAppointments.setMinimumSize(new java.awt.Dimension(600, 300));
        SclAppointments.setPreferredSize(new java.awt.Dimension(600, 300));

        AppointmentsContainer.setBackground(new java.awt.Color(247, 247, 247));
        AppointmentsContainer.setAutoscrolls(true);
        AppointmentsContainer.setMaximumSize(new java.awt.Dimension(700, 10000));
        AppointmentsContainer.setMinimumSize(new Dimension(700,PatientManagementSystem.getSCREEN_SIZE().height-100));
        AppointmentsContainer.setName(""); // NOI18N
        AppointmentsContainer.setPreferredSize(new Dimension(700,PatientManagementSystem.getSCREEN_SIZE().height-150));
        AppointmentsContainer.setLayout(new javax.swing.BoxLayout(AppointmentsContainer, javax.swing.BoxLayout.Y_AXIS));
        SclAppointments.setViewportView(AppointmentsContainer);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(SclAppointments, gridBagConstraints);

        LblDoctor.setFont(PatientManagementSystem.getTextFont());
        LblDoctor.setText("Doctor:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 5);
        getContentPane().add(LblDoctor, gridBagConstraints);

        CbxDoctor.setFont(PatientManagementSystem.getTextFont());
        CbxDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxDoctorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 15);
        getContentPane().add(CbxDoctor, gridBagConstraints);

        BtnRequestAppointment.setFont(PatientManagementSystem.getTextFont());
        BtnRequestAppointment.setText("Request new appointment");
        BtnRequestAppointment.setAlignmentY(0.0F);
        BtnRequestAppointment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BtnRequestAppointment.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnRequestAppointment.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnRequestAppointment.setMaximumSize(new java.awt.Dimension(200, 32));
        BtnRequestAppointment.setMinimumSize(new java.awt.Dimension(200, 32));
        BtnRequestAppointment.setPreferredSize(new java.awt.Dimension(200, 32));
        BtnRequestAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRequestAppointmentActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        getContentPane().add(BtnRequestAppointment, gridBagConstraints);

        SclRequests.setBackground(new java.awt.Color(255, 102, 102));
        SclRequests.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SclRequests.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        SclRequests.setAlignmentX(0.0F);
        SclRequests.setAlignmentY(0.0F);
        SclRequests.setMaximumSize(new Dimension(600,PatientManagementSystem.getSCREEN_SIZE().height-250));
        SclRequests.setMinimumSize(new Dimension(600,PatientManagementSystem.getSCREEN_SIZE().height-250));
        SclRequests.setPreferredSize(new Dimension(600,PatientManagementSystem.getSCREEN_SIZE().height-250));

        RequestsContainer.setBackground(new java.awt.Color(247, 247, 247));
        RequestsContainer.setAutoscrolls(true);
        RequestsContainer.setMaximumSize(new java.awt.Dimension(600, 10000));
        RequestsContainer.setMinimumSize(new Dimension(600,PatientManagementSystem.getSCREEN_SIZE().height-100));
        RequestsContainer.setName(""); // NOI18N
        RequestsContainer.setPreferredSize(new Dimension(600,PatientManagementSystem.getSCREEN_SIZE().height-150));
        RequestsContainer.setLayout(new javax.swing.BoxLayout(RequestsContainer, javax.swing.BoxLayout.Y_AXIS));
        SclRequests.setViewportView(RequestsContainer);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(SclRequests, gridBagConstraints);

        LblPatients.setFont(PatientManagementSystem.getTextFont());
        LblPatients.setText("Patients:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 10);
        getContentPane().add(LblPatients, gridBagConstraints);

        LblPatient.setFont(PatientManagementSystem.getTextFont());
        LblPatient.setText("Patient:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 5);
        getContentPane().add(LblPatient, gridBagConstraints);

        CbxPatient.setFont(PatientManagementSystem.getTextFont());
        CbxPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxPatientActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 8;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 15);
        getContentPane().add(CbxPatient, gridBagConstraints);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane3.setMaximumSize(new Dimension(600,PatientManagementSystem.getSCREEN_SIZE().height-250));
        jScrollPane3.setMinimumSize(new Dimension(600,PatientManagementSystem.getSCREEN_SIZE().height-250));
        jScrollPane3.setPreferredSize(new Dimension(600,PatientManagementSystem.getSCREEN_SIZE().height-250));

        TblMedicines.setFont(PatientManagementSystem.getTextFont());
        TblMedicines.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medicine Name", "Stock", "Ordered"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TblMedicines.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TblMedicines.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(TblMedicines);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(jScrollPane3, gridBagConstraints);

        BtnRemovePatient.setFont(PatientManagementSystem.getTextFont());
        BtnRemovePatient.setText("Remove Selected User");
        BtnRemovePatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRemovePatientActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 15, 15);
        getContentPane().add(BtnRemovePatient, gridBagConstraints);

        CbxRequests.setFont(PatientManagementSystem.getTextFont());
        CbxRequests.setMaximumSize(new java.awt.Dimension(350, 26));
        CbxRequests.setMinimumSize(new java.awt.Dimension(350, 26));
        CbxRequests.setName(""); // NOI18N
        CbxRequests.setPreferredSize(new java.awt.Dimension(350, 26));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 10);
        getContentPane().add(CbxRequests, gridBagConstraints);

        LblRequest.setFont(PatientManagementSystem.getTextFont());
        LblRequest.setText("Request:");
        LblRequest.setAutoscrolls(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 10);
        getContentPane().add(LblRequest, gridBagConstraints);

        BtnApprove.setFont(PatientManagementSystem.getTextFont());
        BtnApprove.setText("Approve");
        BtnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnApproveActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(15, 5, 15, 5);
        getContentPane().add(BtnApprove, gridBagConstraints);

        BtnDeny.setFont(PatientManagementSystem.getTextFont());
        BtnDeny.setText("Deny");
        BtnDeny.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDenyActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(15, 5, 15, 10);
        getContentPane().add(BtnDeny, gridBagConstraints);

        BtnLogout.setFont(PatientManagementSystem.getTextFont());
        BtnLogout.setText("Log out");
        BtnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogoutActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 9;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 10, 15);
        getContentPane().add(BtnLogout, gridBagConstraints);

        BtnOrderArrived.setFont(PatientManagementSystem.getTextFont());
        BtnOrderArrived.setText("Order Arrived");
        BtnOrderArrived.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOrderArrivedActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 15, 15);
        getContentPane().add(BtnOrderArrived, gridBagConstraints);

        BtnGivePrescription.setFont(PatientManagementSystem.getTextFont());
        BtnGivePrescription.setText("Give medicine for Prescription");
        BtnGivePrescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnGivePrescriptionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 10);
        getContentPane().add(BtnGivePrescription, gridBagConstraints);

        LblMedicines.setFont(PatientManagementSystem.getTextFont());
        LblMedicines.setText("Medicine Stock List:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 10);
        getContentPane().add(LblMedicines, gridBagConstraints);

        BtnOrderMedicine.setFont(PatientManagementSystem.getTextFont());
        BtnOrderMedicine.setText("Order new Stock");
        BtnOrderMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOrderMedicineActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 15, 10);
        getContentPane().add(BtnOrderMedicine, gridBagConstraints);

        LblRequests.setFont(PatientManagementSystem.getTextFont());
        LblRequests.setText("Requests:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 10);
        getContentPane().add(LblRequests, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CbxDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxDoctorActionPerformed
        updateSelected();
        updateAppointmentsList(this.selectedDoctor.getAppointments());
    }//GEN-LAST:event_CbxDoctorActionPerformed

    private void BtnRequestAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRequestAppointmentActionPerformed
        new SecretaryAppointmentMakerPage(this).setVisible(true);
    }//GEN-LAST:event_BtnRequestAppointmentActionPerformed

    private void CbxPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxPatientActionPerformed
        updateSelected();
    }//GEN-LAST:event_CbxPatientActionPerformed

    private void BtnRemovePatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRemovePatientActionPerformed
        Patient.removePatient(selectedPatient);
        PatientManagementSystem.saveInformation(PatientManagementSystem.getFile());
        updateAll();
    }//GEN-LAST:event_BtnRemovePatientActionPerformed

    private void BtnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnApproveActionPerformed
        if(this.CbxRequests.getSelectedItem()!= null){
        if(this.CbxRequests.getSelectedItem().toString().contains("Patient:")){
            String uniqueID = this.CbxRequests.getSelectedItem().toString().replace("Patient: ","");
            Patient patient = (Patient) User.getUser(PatientManagementSystem.getUsers(), uniqueID);
            if(patient.getStatus().contains("Termination")) Patient.removePatient(patient);
            else patient.setStatus("Approved");
        }
        else if(this.CbxRequests.getSelectedItem().toString().contains("Appointment")){
            for(Appointment appointment : PatientManagementSystem.getAppointments()){
                if(this.CbxRequests.getSelectedItem().toString().contains(appointment.getDoctor().getUniqueID()) &&
                        this.CbxRequests.getSelectedItem().toString().contains(PatientManagementSystem.getFormat().format(appointment.getDateTime())))
                {
                    appointment.setStatus("Approved");
                }
            }
        } else if(this.CbxRequests.getSelectedItem().toString().contains("Order")){
            for(Medicine medicine : PatientManagementSystem.getMedicines()){
                if(this.CbxRequests.getSelectedItem().toString().contains(medicine.getMedicineName()))
                {
                    medicine.setOrdered(medicine.getOrdered()+medicine.getRequestedOrdered());
                }
            }
        }
        PatientManagementSystem.saveInformation(PatientManagementSystem.getFile());
        updateAll();
        } else JOptionPane.showMessageDialog(null,
                            "There is no request selected",
                            "Nothing Selected",
                            JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_BtnApproveActionPerformed

    private void BtnDenyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDenyActionPerformed
        if(this.CbxRequests.getSelectedItem()!= null){
        if(this.CbxRequests.getSelectedItem().toString().contains("Patient:")){
            String uniqueID = this.CbxRequests.getSelectedItem().toString().replace("Patient: ","");
            Patient patient = (Patient) User.getUser(PatientManagementSystem.getUsers(), uniqueID);
            if(patient.getStatus().contains("Termination")) patient.setStatus("Approved");
            else Patient.removePatient(patient);
        } else if(this.CbxRequests.getSelectedItem().toString().contains("Appointment")){
            for(int i = PatientManagementSystem.getAppointments().size()-1;i>=0;i--){
                if(this.CbxRequests.getSelectedItem().toString().contains(PatientManagementSystem.getAppointments().get(i).getDoctor().getUniqueID()) &&
                        this.CbxRequests.getSelectedItem().toString().contains(PatientManagementSystem.getFormat().format(PatientManagementSystem.getAppointments().get(i).getDateTime())))
                {
                    PatientManagementSystem.getAppointments().remove(PatientManagementSystem.getAppointments().get(i));
                }
            }
        } else if(this.CbxRequests.getSelectedItem().toString().contains("Order")){
            for(Medicine medicine : PatientManagementSystem.getMedicines()){
                if(this.CbxRequests.getSelectedItem().toString().contains(medicine.getMedicineName()))
                {
                    medicine.setRequestedOrdered(0);
                }
            }
        }
        PatientManagementSystem.saveInformation(PatientManagementSystem.getFile());
        updateAll();
        } else JOptionPane.showMessageDialog(null,
                            "There is no request selected",
                            "Nothing Selected",
                            JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_BtnDenyActionPerformed

    private void BtnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogoutActionPerformed
        PatientManagementSystem.saveInformation(PatientManagementSystem.getFile());
        new StartPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnLogoutActionPerformed

    private void BtnGivePrescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnGivePrescriptionActionPerformed
        new PrescriptionPage(this).setVisible(true);
    }//GEN-LAST:event_BtnGivePrescriptionActionPerformed

    private void BtnOrderArrivedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOrderArrivedActionPerformed
        new OrderArrivedPage(this).setVisible(true);
    }//GEN-LAST:event_BtnOrderArrivedActionPerformed

    private void BtnOrderMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOrderMedicineActionPerformed
        new MakeOrderPage(this).setVisible(true);
    }//GEN-LAST:event_BtnOrderMedicineActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AppointmentsContainer;
    private javax.swing.JButton BtnApprove;
    private javax.swing.JButton BtnDeny;
    private javax.swing.JButton BtnGivePrescription;
    private javax.swing.JButton BtnLogout;
    private javax.swing.JButton BtnOrderArrived;
    private javax.swing.JButton BtnOrderMedicine;
    private javax.swing.JButton BtnRemovePatient;
    private javax.swing.JButton BtnRequestAppointment;
    private javax.swing.JComboBox<String> CbxDoctor;
    private javax.swing.JComboBox<String> CbxPatient;
    private javax.swing.JComboBox<String> CbxRequests;
    private javax.swing.JLabel LblDoctor;
    private javax.swing.JLabel LblMedicines;
    private javax.swing.JLabel LblPatient;
    private javax.swing.JLabel LblPatients;
    private javax.swing.JLabel LblRequest;
    private javax.swing.JLabel LblRequests;
    private javax.swing.JPanel RequestsContainer;
    private javax.swing.JScrollPane SclAppointments;
    private javax.swing.JScrollPane SclRequests;
    private javax.swing.JScrollPane SclUsers;
    private javax.swing.JTable TblMedicines;
    private javax.swing.JPanel UsersContainer;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    private void updateAppointmentsList(ArrayList<Appointment> appointments) {
        AppointmentsContainer.removeAll();
        for(Appointment appointment : appointments){
            if(!appointment.getStatus().contains("Request")){
                AppointmentPanel AP = new AppointmentPanel(appointment);
                AP.setAlignmentX(Component.CENTER_ALIGNMENT);
                AP.setVisible(true);
                AppointmentsContainer.add(AP);
                }
        }
        resizeAppointmentContainerToFit();
        validate();
        repaint();
    }
    
    private void updateUsersList(ArrayList<Patient> patients) {
        UsersContainer.removeAll();
        for(Patient patient : patients){
            if (!patient.getStatus().contains("Request")){
                UserPanel UP = new UserPanel(patient);
                UP.setAlignmentX(Component.CENTER_ALIGNMENT);
                UP.setVisible(true);
                UsersContainer.add(UP);
            }
        }
        resizeUsersContainerToFit();
        validate();
        repaint();
    }

    private void updateMedicinesList(ArrayList<Medicine> medicines) {
        String[] col = {"Medicine Name","Stock","Ordered"};
        Object[][] data = new String[PatientManagementSystem.getMedicines().size()][3];
        for(int i = 0;i<data.length;i++){
            data[i][0] = medicines.get(i).getMedicineName();
            data[i][1] = Integer.toString(medicines.get(i).getStock());
            data[i][2] = Integer.toString(medicines.get(i).getOrdered());
        }
        DefaultTableModel model = new DefaultTableModel(data,col){
            @Override
            public boolean isCellEditable(int i, int i1){return false;}
        };
        this.TblMedicines.setModel(model);
        this.TblMedicines.getColumnModel().getColumn(0).setPreferredWidth(190);//Medicine Name width
        this.TblMedicines.getColumnModel().getColumn(1).setPreferredWidth(190);//Medicine Stock width
        this.TblMedicines.getColumnModel().getColumn(2).setPreferredWidth(190);//Medicine Ordered width
    }

    private void updateRequestsList(ArrayList<Patient> patients,ArrayList<Appointment> appointments) {
        RequestsContainer.removeAll();
        for(Patient patient : patients){
            UserPanel UP = new UserPanel(patient);
            UP.setAlignmentX(Component.CENTER_ALIGNMENT);
            UP.setVisible(true);
            RequestsContainer.add(UP);
        }
        for(Appointment appointment : appointments){
            AppointmentPanel AP = new AppointmentPanel(appointment);
            AP.setAlignmentX(Component.CENTER_ALIGNMENT);
            AP.setVisible(true);
            RequestsContainer.add(AP);
        }
        for(Medicine medicine : PatientManagementSystem.getMedicines()){
            if(medicine.getRequestedOrdered() > 0){
            MedicinePanel MRP = new MedicinePanel(medicine);
            MRP.setAlignmentX(Component.CENTER_ALIGNMENT);
            MRP.setVisible(true);
            RequestsContainer.add(MRP);
            }
        }
        resizeRequestsContainerToFit();
        validate();
        repaint();
    }
    
    public void resizeAppointmentContainerToFit(){
        int componentHeight = 100*(this.AppointmentsContainer.getComponentCount());
        this.AppointmentsContainer.setPreferredSize(new Dimension(600, componentHeight));
    }
    
    private void resizeRequestsContainerToFit() {
        int componentHeight = 100*(this.RequestsContainer.getComponentCount());
        this.RequestsContainer.setPreferredSize(new Dimension(600, componentHeight));
    }
    
    private void resizeUsersContainerToFit() {
        int componentHeight = 100*(this.UsersContainer.getComponentCount());
        this.UsersContainer.setPreferredSize(new Dimension(600, componentHeight));
    }
    
    private void updateSelected() {
        ArrayList<User> users = PatientManagementSystem.getUsers();
        for(User user: users){
            if(user.getUniqueID().contains("D")&& this.CbxDoctor.getSelectedItem() != null){
                if(this.CbxDoctor.getSelectedItem().toString().contains(user.getFirstName()) &&
                    this.CbxDoctor.getSelectedItem().toString().contains(user.getLastName())){
                    this.selectedDoctor = ((Doctor) user);
                }
            } else if(user.getUniqueID().contains("P") && this.CbxPatient.getSelectedItem() != null){
                if(this.CbxPatient.getSelectedItem().toString().contains(user.getFirstName()) &&
                    this.CbxPatient.getSelectedItem().toString().contains(user.getLastName())){
                    this.selectedPatient = ((Patient) user);
                }
            }
        }
    }

    private void fillCombos(ArrayList<User> users,ArrayList<Appointment> appointments) {
        this.CbxDoctor.removeAllItems();
        this.CbxPatient.removeAllItems();
        this.CbxRequests.removeAllItems();
        for(User user : users){
            if(user.getUniqueID().contains("P")){
                Patient patient = (Patient) user;
                if(!patient.getStatus().contains("Request"))this.CbxPatient.addItem(patient.displayUser());
                else this.CbxRequests.addItem("Patient: "+patient.getUniqueID());
            }
            else if (user.getUniqueID().contains("D")) this.CbxDoctor.addItem(user.displayUser());
        }
        for(Appointment appointment : appointments){
            if(appointment.getStatus().contains("Request")) this.CbxRequests.addItem(appointment.getAppointmentName());
        }
        for(Medicine medicine : PatientManagementSystem.getMedicines()){
            if(medicine.getRequestedOrdered()>0) this.CbxRequests.addItem("Order: "+medicine.getMedicineName());
        }
        validate();
        repaint();
    }       
    
    private ArrayList<Patient> getRequestedPatients(ArrayList<User> users){
        ArrayList<Patient> patients = new ArrayList<>();
        for(User user : users){
            if(user.getUniqueID().contains("P")){
                Patient patient = (Patient) user;
                if(patient.getStatus().contains("Request"))patients.add(patient);
            }
        }
        return patients;
    }
    
    private ArrayList<Appointment> getRequestedAppointments(ArrayList<Appointment> appointments){
        ArrayList<Appointment> requestedAppointments = new ArrayList<>();
        for(Appointment appointment : appointments){
            if(appointment.getStatus().contains("Request")) requestedAppointments.add(appointment);
        }
        return requestedAppointments;
    }

    public void updateAll() {
        fillCombos(PatientManagementSystem.getUsers(),PatientManagementSystem.getAppointments());
        updateSelected();
        updateAppointmentsList(this.selectedDoctor.getAppointments());
        
        updateUsersList(Patient.getPatients(PatientManagementSystem.getUsers()));
        
        updateRequestsList(this.getRequestedPatients(PatientManagementSystem.getUsers()),
                this.getRequestedAppointments(PatientManagementSystem.getAppointments()));
        
        updateMedicinesList(PatientManagementSystem.getMedicines());
    }
}
