/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.util.Date;
import patientmanagementsystem.PatientManagementSystem;
import patientmanagementsystem.UserTypes.Administrator;
import patientmanagementsystem.UserTypes.User;

public class Feedback {
    private final Administrator feedbackBy; 
    private final Date date;
    private final String feedback;
    public Feedback(String feedbackBy, String feedback) {
        this.feedbackBy = (Administrator) User.getUser(PatientManagementSystem.getUsers(),feedbackBy);
        this.date = new Date();
        this.feedback = feedback;
    }

    public Administrator getFeedbackBy() {
        return feedbackBy;
    }

    public Date getDate() {
        return date;
    }

    public String getFeedback() {
        return feedback;
    }
    
    
}
