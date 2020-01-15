/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms.HomePages;

import Forms.Makers.FeedbackMakerPage;
import Forms.Makers.MakeASDAccountsPage;
import Forms.StartPage;
import Panels.ContainedComponents.RatingPanel;
import java.awt.Component;
import java.awt.Dimension;
import java.util.ArrayList;
import javax.swing.JFrame;
import patientmanagementsystem.PatientManagementSystem;
import Objects.Rating;
import Panels.ContainedComponents.UserPanel;
import javax.swing.JOptionPane;
import patientmanagementsystem.UserTypes.*;

/**
 *
 * @author espow
 */
public class AdministratorHomePage extends javax.swing.JFrame {
    private final Administrator ADMIN;
    private Doctor selectedDoctor = null;
    public AdministratorHomePage(Administrator admin) {
        this.ADMIN = admin;
        initComponents();
        loadUsers();
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

        SclRatings = new javax.swing.JScrollPane();
        RatingsContainer = new javax.swing.JPanel();
        LblDoctor = new javax.swing.JLabel();
        CbxDoctor = new javax.swing.JComboBox<>();
        LblDoctorRating = new javax.swing.JLabel();
        BtnMakeNewUser = new javax.swing.JButton();
        SclUsers = new javax.swing.JScrollPane();
        UsersContainer = new javax.swing.JPanel();
        LblUsers = new javax.swing.JLabel();
        LblSelectUser = new javax.swing.JLabel();
        CbxUser = new javax.swing.JComboBox<>();
        BtnNewReview = new javax.swing.JButton();
        BtnDeleteUser = new javax.swing.JButton();
        BtnLogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrator Home Page");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setMinimumSize(new Dimension(PatientManagementSystem.getSCREEN_SIZE().width,PatientManagementSystem.getSCREEN_SIZE().height));
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

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
        RatingsContainer.setMaximumSize(new java.awt.Dimension(600, 10000));
        RatingsContainer.setMinimumSize(new Dimension(600,PatientManagementSystem.getSCREEN_SIZE().height-100));
        RatingsContainer.setName(""); // NOI18N
        RatingsContainer.setPreferredSize(new Dimension(600,PatientManagementSystem.getSCREEN_SIZE().height-100));
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

        BtnMakeNewUser.setFont(PatientManagementSystem.getTextFont());
        BtnMakeNewUser.setText("Make new user");
        BtnMakeNewUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BtnMakeNewUser.setMaximumSize(new java.awt.Dimension(125, 25));
        BtnMakeNewUser.setMinimumSize(new java.awt.Dimension(125, 25));
        BtnMakeNewUser.setPreferredSize(new java.awt.Dimension(125, 25));
        BtnMakeNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnMakeNewUser(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 15, 15);
        getContentPane().add(BtnMakeNewUser, gridBagConstraints);

        SclUsers.setBackground(new java.awt.Color(255, 102, 102));
        SclUsers.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SclUsers.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        SclUsers.setAlignmentX(0.0F);
        SclUsers.setAlignmentY(0.0F);
        SclUsers.setMaximumSize(new Dimension(600,PatientManagementSystem.getSCREEN_SIZE().height-250));
        SclUsers.setMinimumSize(new Dimension(600,PatientManagementSystem.getSCREEN_SIZE().height-250));
        SclUsers.setPreferredSize(new Dimension(600,PatientManagementSystem.getSCREEN_SIZE().height-250));

        UsersContainer.setBackground(new java.awt.Color(247, 247, 247));
        UsersContainer.setAutoscrolls(true);
        UsersContainer.setMaximumSize(new java.awt.Dimension(600, 10000));
        UsersContainer.setMinimumSize(new Dimension(600,PatientManagementSystem.getSCREEN_SIZE().height-100));
        UsersContainer.setName(""); // NOI18N
        UsersContainer.setPreferredSize(new Dimension(600,PatientManagementSystem.getSCREEN_SIZE().height-100));
        UsersContainer.setLayout(new javax.swing.BoxLayout(UsersContainer, javax.swing.BoxLayout.PAGE_AXIS));
        SclUsers.setViewportView(UsersContainer);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        getContentPane().add(SclUsers, gridBagConstraints);

        LblUsers.setFont(PatientManagementSystem.getTextFont());
        LblUsers.setText("Users:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 10);
        getContentPane().add(LblUsers, gridBagConstraints);

        LblSelectUser.setFont(PatientManagementSystem.getTextFont());
        LblSelectUser.setText("Selected User: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 15, 15, 10);
        getContentPane().add(LblSelectUser, gridBagConstraints);

        CbxUser.setFont(PatientManagementSystem.getTextFont());
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 10);
        getContentPane().add(CbxUser, gridBagConstraints);

        BtnNewReview.setFont(PatientManagementSystem.getTextFont());
        BtnNewReview.setText("Provide Feedback");
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

        BtnDeleteUser.setFont(PatientManagementSystem.getTextFont());
        BtnDeleteUser.setText("Delete User");
        BtnDeleteUser.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BtnDeleteUser.setMaximumSize(new java.awt.Dimension(150, 50));
        BtnDeleteUser.setMinimumSize(new java.awt.Dimension(150, 50));
        BtnDeleteUser.setPreferredSize(new java.awt.Dimension(150, 50));
        BtnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteUser(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 15, 15);
        getContentPane().add(BtnDeleteUser, gridBagConstraints);

        BtnLogOut.setFont(PatientManagementSystem.getTextFont());
        BtnLogOut.setText("Log Out");
        BtnLogOut.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        BtnLogOut.setMaximumSize(new java.awt.Dimension(100, 25));
        BtnLogOut.setMinimumSize(new java.awt.Dimension(100, 25));
        BtnLogOut.setPreferredSize(new java.awt.Dimension(100, 25));
        BtnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLogOutActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHEAST;
        gridBagConstraints.insets = new java.awt.Insets(15, 10, 15, 15);
        getContentPane().add(BtnLogOut, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CbxDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbxDoctorActionPerformed
        updateDoctor();
        updateRatingsList();
    }//GEN-LAST:event_CbxDoctorActionPerformed

    private void BtnMakeNewUser(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnMakeNewUser
        new MakeASDAccountsPage(this).setVisible(true);
    }//GEN-LAST:event_BtnMakeNewUser

    private void BtnNewReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNewReviewActionPerformed
        new FeedbackMakerPage(this.selectedDoctor,this.ADMIN).setVisible(true);
    }//GEN-LAST:event_BtnNewReviewActionPerformed

    private void BtnDeleteUser(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteUser
        int res = JOptionPane.showConfirmDialog(null,"Are you sure you want to delete this user?\n"+this.CbxUser.getSelectedItem().toString());
        if(res == 0) {
            User.removeUser(PatientManagementSystem.getUsers(), this.CbxUser.getSelectedItem().toString());
            PatientManagementSystem.saveInformation(PatientManagementSystem.getFile());
            loadUsers();
            updateDoctor();
        }
    }//GEN-LAST:event_BtnDeleteUser

    private void BtnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLogOutActionPerformed
        PatientManagementSystem.saveInformation(PatientManagementSystem.getFile());
        new StartPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BtnLogOutActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDeleteUser;
    private javax.swing.JButton BtnLogOut;
    private javax.swing.JButton BtnMakeNewUser;
    private javax.swing.JButton BtnNewReview;
    private javax.swing.JComboBox<String> CbxDoctor;
    private javax.swing.JComboBox<String> CbxUser;
    private javax.swing.JLabel LblDoctor;
    private javax.swing.JLabel LblDoctorRating;
    private javax.swing.JLabel LblSelectUser;
    private javax.swing.JLabel LblUsers;
    private javax.swing.JPanel RatingsContainer;
    private javax.swing.JScrollPane SclRatings;
    private javax.swing.JScrollPane SclUsers;
    private javax.swing.JPanel UsersContainer;
    // End of variables declaration//GEN-END:variables

    public void updateDoctor() {
        ArrayList<User> users = PatientManagementSystem.getUsers();
        for(User user: users){
            if(user.getUniqueID().contains("D") && this.CbxDoctor.getSelectedItem() != null){
                if(this.CbxDoctor.getSelectedItem().toString().contains(user.getFirstName()) &&
                    this.CbxDoctor.getSelectedItem().toString().contains(user.getLastName())){
                    this.selectedDoctor = ((Doctor) user);
                    break;
                }
            }
        }
        if(this.selectedDoctor!=null)this.LblDoctorRating.setText("Rating: "+this.selectedDoctor.getAverageRating()+"/5");
    }
    
    private void updateRatingsList() {
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
    
    private void resizeRatingContainerToFit(){
        int componentHeight = 100*(this.selectedDoctor.getRatings().size());
        this.RatingsContainer.setPreferredSize(new Dimension(600, componentHeight));
    }
    
    private void resizeUsersContainerToFit(){
        int SpecifiedUsers = 0;
        for(User user: PatientManagementSystem.getUsers()){
            if(user.getUniqueID().contains("D") || user.getUniqueID().contains("S"))SpecifiedUsers++;
        }
        int componentHeight = 100*(SpecifiedUsers);
        this.UsersContainer.setPreferredSize(new Dimension(600, componentHeight));
    }

    public void loadUsers() {
        loadUsersToCombo();
        loadUsersToContainer();
        resizeUsersContainerToFit();
        this.CbxDoctor.setSelectedIndex(0);
        updateDoctor();
    }

    private void loadUsersToCombo() {
        this.CbxDoctor.removeAllItems();
        this.CbxUser.removeAllItems();
        ArrayList<User> users = PatientManagementSystem.getUsers();
         for (int i = 0; i < users.size(); i++) {
            String userID = users.get(i).getUniqueID();
            if(userID.contains("D")){
                this.CbxUser.addItem(users.get(i).getUniqueID());
                this.CbxDoctor.addItem(users.get(i).displayUser());
            }
            else if(userID.contains("S")) this.CbxUser.addItem(users.get(i).getUniqueID());
        }
        if(this.CbxDoctor.getItemCount() == 0) this.CbxUser.addItem("No Users Loaded");
        try{
            this.CbxUser.setSelectedIndex(0);
            this.CbxDoctor.setSelectedIndex(0);
        } catch(Exception e){
        }
    }

    private void loadUsersToContainer() {
        UsersContainer.removeAll();
        ArrayList<User> users = PatientManagementSystem.getUsers();
        for(User user : users){
            if(user.getUniqueID().contains("D") || user.getUniqueID().contains("S")){
            UserPanel UP = new UserPanel(user);
            UP.setAlignmentX(Component.CENTER_ALIGNMENT);
            UP.setVisible(true);
            UsersContainer.add(UP);
            }
        }
        resizeUsersContainerToFit();
        validate();
        repaint();
    }
}
