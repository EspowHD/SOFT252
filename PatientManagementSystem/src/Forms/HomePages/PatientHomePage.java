/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms.HomePages;
import Forms.Requesters.PatientApppintmentRequester;
import Forms.Makers.RatingMakerPage;
import Forms.StartPage;
import Panels.AppointmentPanel;
import Panels.PrescriptionPanel;
import Panels.RatingPanel;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.*;
import Objects.Appointment;
import patientmanagementsystem.PatientManagementSystem;
import Objects.Prescription;
import Objects.Rating;
import patientmanagementsystem.UserTypes.Doctor;
import patientmanagementsystem.UserTypes.Patient;
import patientmanagementsystem.UserTypes.User;
/**
 *
 * @author espow
 */
public final class PatientHomePage extends JFrame {
    private final Patient PATIENT;
    private Doctor selectedDoctor = null;
    public PatientHomePage(Patient patient) {
        this.PATIENT = patient;
        initComponents();
        loadDoctors();
        updateDoctor();
        updateRatingsList();
        updateAppointmentsList(this.PATIENT.getAppointments());
        updatePrescriptionsList(this.PATIENT.getPrescriptions());
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

        SclAppointments = new javax.swing.JScrollPane();
        AppointmentsContainer = new javax.swing.JPanel();
        BtnRequestAppointment = new javax.swing.JButton();
        LblAppointments = new javax.swing.JLabel();
        BtnLogOut = new javax.swing.JButton();
        SclPrescriptions = new javax.swing.JScrollPane();
        PrescriptionsContainer = new javax.swing.JPanel();
        LblPrescriptions = new javax.swing.JLabel();
        SclRatings = new javax.swing.JScrollPane();
        RatingsContainer = new javax.swing.JPanel();
        LblDoctor = new javax.swing.JLabel();
        CbxDoctor = new javax.swing.JComboBox<>();
        LblDoctorRating = new javax.swing.JLabel();
        BtnNewReview = new javax.swing.JButton();
        BtnRequestTermination = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Patient Home Page");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setFont(PatientManagementSystem.getTextFont());
        setMaximumSize(new Dimension(PatientManagementSystem.getSCREEN_SIZE().width,PatientManagementSystem.getSCREEN_SIZE().height));
        setMinimumSize(new Dimension(PatientManagementSystem.getSCREEN_SIZE().width,PatientManagementSystem.getSCREEN_SIZE().height));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        SclAppointments.setBackground(new java.awt.Color(255, 102, 102));
        SclAppointments.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SclAppointments.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        SclAppointments.setAlignmentX(0.0F);
        SclAppointments.setAlignmentY(0.0F);
        SclAppointments.setMaximumSize(new Dimension(600,PatientManagementSystem.getSCREEN_SIZE().height-250));
        SclAppointments.setMinimumSize(new Dimension(600,PatientManagementSystem.getSCREEN_SIZE().height-250));
        SclAppointments.setPreferredSize(new Dimension(600,PatientManagementSystem.getSCREEN_SIZE().height-250));

        AppointmentsContainer.setBackground(new java.awt.Color(247, 247, 247));
        AppointmentsContainer.setAutoscrolls(true);
        AppointmentsContainer.setMaximumSize(new java.awt.Dimension(700, 10000));
        AppointmentsContainer.setMinimumSize(new Dimension(700,PatientManagementSystem.getSCREEN_SIZE().height-100));
        AppointmentsContainer.setName(""); // NOI18N
        AppointmentsContainer.setPreferredSize(new Dimension(700,PatientManagementSystem.getSCREEN_SIZE().height-150));
        AppointmentsContainer.setLayout(new javax.swing.BoxLayout(AppointmentsContainer, javax.swing.BoxLayout.Y_AXIS));
        SclAppointments.setViewportView(AppointmentsContainer);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(SclAppointments, gridBagConstraints);

        BtnRequestAppointment.setFont(PatientManagementSystem.getTextFont());
        BtnRequestAppointment.setText("Request new appointment");
        BtnRequestAppointment.setAlignmentY(0.0F);
        BtnRequestAppointment.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BtnRequestAppointment.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnRequestAppointment.setMargin(new java.awt.Insets(0, 0, 0, 0));
        BtnRequestAppointment.setMaximumSize(new java.awt.Dimension(200, 50));
        BtnRequestAppointment.setMinimumSize(new java.awt.Dimension(200, 50));
        BtnRequestAppointment.setPreferredSize(new java.awt.Dimension(200, 50));
        BtnRequestAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRequestAppointmentActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        getContentPane().add(BtnRequestAppointment, gridBagConstraints);

        LblAppointments.setFont(PatientManagementSystem.getTextFont());
        LblAppointments.setText("Appointments:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 0);
        getContentPane().add(LblAppointments, gridBagConstraints);

        BtnLogOut.setFont(PatientManagementSystem.getTextFont());
        BtnLogOut.setText("Log Out");
        BtnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogOutActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 15, 15);
        getContentPane().add(BtnLogOut, gridBagConstraints);

        SclPrescriptions.setBackground(new java.awt.Color(255, 102, 102));
        SclPrescriptions.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SclPrescriptions.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        SclPrescriptions.setAlignmentX(0.0F);
        SclPrescriptions.setAlignmentY(0.0F);
        SclPrescriptions.setMaximumSize(new Dimension(650,PatientManagementSystem.getSCREEN_SIZE().height-250));
        SclPrescriptions.setMinimumSize(new Dimension(650,PatientManagementSystem.getSCREEN_SIZE().height-250));
        SclPrescriptions.setName(""); // NOI18N
        SclPrescriptions.setPreferredSize(new Dimension(650,PatientManagementSystem.getSCREEN_SIZE().height-250));

        PrescriptionsContainer.setBackground(new java.awt.Color(247, 247, 247));
        PrescriptionsContainer.setAutoscrolls(true);
        PrescriptionsContainer.setMaximumSize(new java.awt.Dimension(700, 10000));
        PrescriptionsContainer.setMinimumSize(new Dimension(700,PatientManagementSystem.getSCREEN_SIZE().height-100));
        PrescriptionsContainer.setName(""); // NOI18N
        PrescriptionsContainer.setPreferredSize(new Dimension(700,PatientManagementSystem.getSCREEN_SIZE().height-150));
        PrescriptionsContainer.setLayout(new javax.swing.BoxLayout(PrescriptionsContainer, javax.swing.BoxLayout.Y_AXIS));
        SclPrescriptions.setViewportView(PrescriptionsContainer);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(SclPrescriptions, gridBagConstraints);

        LblPrescriptions.setFont(PatientManagementSystem.getTextFont());
        LblPrescriptions.setText("Prescriptions:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 0);
        getContentPane().add(LblPrescriptions, gridBagConstraints);

        SclRatings.setBackground(new java.awt.Color(255, 102, 102));
        SclRatings.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SclRatings.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        SclRatings.setAlignmentX(0.0F);
        SclRatings.setAlignmentY(0.0F);
        SclRatings.setMaximumSize(new Dimension(600,PatientManagementSystem.getSCREEN_SIZE().height-250));
        SclRatings.setMinimumSize(new Dimension(600,PatientManagementSystem.getSCREEN_SIZE().height-250));
        SclRatings.setPreferredSize(new Dimension(600,PatientManagementSystem.getSCREEN_SIZE().height-250));

        RatingsContainer.setBackground(new java.awt.Color(247, 247, 247));
        RatingsContainer.setAutoscrolls(true);
        RatingsContainer.setMaximumSize(new java.awt.Dimension(700, 10000));
        RatingsContainer.setMinimumSize(new Dimension(700,PatientManagementSystem.getSCREEN_SIZE().height-100));
        RatingsContainer.setName(""); // NOI18N
        RatingsContainer.setPreferredSize(new Dimension(700,PatientManagementSystem.getSCREEN_SIZE().height-150));
        RatingsContainer.setLayout(new javax.swing.BoxLayout(RatingsContainer, javax.swing.BoxLayout.PAGE_AXIS));
        SclRatings.setViewportView(RatingsContainer);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(SclRatings, gridBagConstraints);

        LblDoctor.setFont(PatientManagementSystem.getTextFont());
        LblDoctor.setText("Doctor:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 10);
        getContentPane().add(LblDoctor, gridBagConstraints);

        CbxDoctor.setFont(PatientManagementSystem.getTextFont());
        CbxDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbxDoctorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 15);
        getContentPane().add(CbxDoctor, gridBagConstraints);

        LblDoctorRating.setFont(PatientManagementSystem.getTextFont());
        LblDoctorRating.setText("Average Rating: ");
        getContentPane().add(LblDoctorRating, new java.awt.GridBagConstraints());

        BtnNewReview.setFont(PatientManagementSystem.getTextFont());
        BtnNewReview.setText("Make a Review");
        BtnNewReview.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BtnNewReview.setMaximumSize(new java.awt.Dimension(200, 50));
        BtnNewReview.setMinimumSize(new java.awt.Dimension(200, 50));
        BtnNewReview.setPreferredSize(new java.awt.Dimension(200, 50));
        BtnNewReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNewReviewActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 15);
        getContentPane().add(BtnNewReview, gridBagConstraints);

        BtnRequestTermination.setFont(PatientManagementSystem.getTextFont());
        BtnRequestTermination.setText("Terminate Account");
        BtnRequestTermination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRequestTerminationActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 15, 10);
        getContentPane().add(BtnRequestTermination, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnRequestAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRequestAppointmentActionPerformed
        new PatientApppintmentRequester(this).setVisible(true);
    }//GEN-LAST:event_BtnRequestAppointmentActionPerformed

    private void BtnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogOutActionPerformed
        logout();
    }//GEN-LAST:event_BtnLogOutActionPerformed

    private void CbxDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxDoctorActionPerformed
        updateDoctor();
        updateRatingsList();
    }//GEN-LAST:event_CbxDoctorActionPerformed

    private void BtnNewReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNewReviewActionPerformed
        new RatingMakerPage(this).setVisible(true);
    }//GEN-LAST:event_BtnNewReviewActionPerformed

    private void BtnRequestTerminationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRequestTerminationActionPerformed
        this.PATIENT.setStatus("Request termination");
        logout();
    }//GEN-LAST:event_BtnRequestTerminationActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AppointmentsContainer;
    private javax.swing.JButton BtnLogOut;
    private javax.swing.JButton BtnNewReview;
    private javax.swing.JButton BtnRequestAppointment;
    private javax.swing.JButton BtnRequestTermination;
    private javax.swing.JComboBox<String> CbxDoctor;
    private javax.swing.JLabel LblAppointments;
    private javax.swing.JLabel LblDoctor;
    private javax.swing.JLabel LblDoctorRating;
    private javax.swing.JLabel LblPrescriptions;
    private javax.swing.JPanel PrescriptionsContainer;
    private javax.swing.JPanel RatingsContainer;
    private javax.swing.JScrollPane SclAppointments;
    private javax.swing.JScrollPane SclPrescriptions;
    private javax.swing.JScrollPane SclRatings;
    // End of variables declaration//GEN-END:variables
    //Getters
    public Patient getPatient(){
        return this.PATIENT;
    }
    
    //Update components for containers
    public void updateAppointmentsList(ArrayList<Appointment> appointments) {
        AppointmentsContainer.removeAll();
        for(Appointment appointment : appointments){
            AppointmentPanel AP = new AppointmentPanel(appointment);
            AP.setAlignmentX(Component.CENTER_ALIGNMENT);
            AP.setVisible(true);
            AppointmentsContainer.add(AP);
        }
        resizeAppointmentContainerToFit();
        validate();
        repaint();
    }
    
    private void updatePrescriptionsList(ArrayList<Prescription> prescriptions) {
        PrescriptionsContainer.removeAll();
        for(Prescription prescription : prescriptions){
            PrescriptionPanel PP = new PrescriptionPanel(prescription);
            PP.setAlignmentX(Component.CENTER_ALIGNMENT);
            PP.setVisible(true);
            PrescriptionsContainer.add(PP);
        }
        resizePrescriptionContainerToFit();
        validate();
        repaint();
    }
    
    public void updateRatingsList() {
        RatingsContainer.removeAll();
        ArrayList<Rating> ratings = this.selectedDoctor.getRatings();
        for(Rating rating : ratings){
            RatingPanel RP = new RatingPanel(rating);
            RP.setAlignmentX(Component.CENTER_ALIGNMENT);
            RP.setVisible(true);
            RatingsContainer.add(RP);
        }
        resizeRatingContainerToFit();
        validate();
        repaint();
    }

    //Update the size for the containers
    public void resizeAppointmentContainerToFit(){
        int componentHeight = 100*(this.PATIENT.getAppointments().size());
        this.AppointmentsContainer.setPreferredSize(new Dimension(600, componentHeight));
    }
    
    public void resizeRatingContainerToFit(){
        int componentHeight;
        componentHeight = 100*(this.selectedDoctor.getRatings().size());
        this.RatingsContainer.setPreferredSize(new Dimension(600, componentHeight));
    }
    
    private void resizePrescriptionContainerToFit() {
        if(!this.PATIENT.getPrescriptions().isEmpty()){
        int componentHeight = 350*(this.PATIENT.getPrescriptions().size());
        this.PrescriptionsContainer.setPreferredSize(new Dimension(600, componentHeight));
        }
    }
    
    //Fills combo box with all doctors
    private void loadDoctors() {
        ArrayList<User> users = PatientManagementSystem.getUsers();
         for (int i = 0; i < users.size(); i++) {
            String userID = users.get(i).getUniqueID();
            if(userID.contains("D")){
                this.CbxDoctor.addItem(users.get(i).displayUser());
            }
        }
        if(this.CbxDoctor.getItemCount() == 0) this.CbxDoctor.addItem("No Doctors Loaded");
        updateDoctor();
    }

    private void updateDoctor() {
        ArrayList<User> users = PatientManagementSystem.getUsers();
        for(User user: users){
            if(user.getUniqueID().contains("D")){
                    if(this.CbxDoctor.getSelectedItem().toString().contains(user.getFirstName()) &&
                        this.CbxDoctor.getSelectedItem().toString().contains(user.getLastName())){
                        this.selectedDoctor = ((Doctor) user);
                        break;
                    }
            }
        }
        if(this.selectedDoctor!=null)this.LblDoctorRating.setText("Rating: "+this.selectedDoctor.getAverageRating()+"/5");
    }

    private void logout() {
        PatientManagementSystem.saveInformation(PatientManagementSystem.getFile());
        new StartPage().setVisible(true);
        this.dispose();
    }
}
