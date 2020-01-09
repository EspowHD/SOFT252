/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem.UserTypes;

import java.util.ArrayList;
import Objects.Address;
import Objects.Appointment;
import Objects.Feedback;
import patientmanagementsystem.PatientManagementSystem;
import Objects.Rating;

/**
 *
 * @author espow
 */
public class Doctor extends User{
    ArrayList<Rating> ratings;
    ArrayList<Feedback> feedbacks;
    final String uniqueIdentifier = "D";

    public Doctor(String uniqueID, String firstName, String lastName, String password, Address address, ArrayList<Rating> ratings,ArrayList<Feedback> feedbacks) {
        this.uniqueID = uniqueID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.address = address;
        this.ratings = ratings;
        this.feedbacks = feedbacks;
    }

    public Doctor(String firstName, String lastName, String password, Address address, ArrayList<Rating> ratings,ArrayList<Feedback> feedbacks) {
        this.uniqueID = this.uniqueIdentifier+getNextID(uniqueIdentifier,PatientManagementSystem.getUsers());
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.address = address;
        this.ratings = ratings;
        this.feedbacks = feedbacks;
    }

    public String getAverageRating() {
        Double Average = 0.0;
        for (Rating rating : this.ratings){
            Average += rating.getStars();
        }
        Average = Average/this.ratings.size();
        return Average.toString().substring(0, 4);
    }
    
    public ArrayList<Appointment> getAppointments(){
        ArrayList<Appointment> appointments = new ArrayList<Appointment>();
        for(int i = 0;i<PatientManagementSystem.getAppointments().size();i++){
            if(PatientManagementSystem.getAppointments().get(i).getDoctor().getUniqueID().equals(this.uniqueID)){
                appointments.add(PatientManagementSystem.getAppointments().get(i));
            }
        }
        return appointments;
    }

    public void setRatings(ArrayList<Rating> ratings) {
        this.ratings = ratings;
    }

    public ArrayList<Rating> getRatings() {
        return ratings;
    }

    public ArrayList<Feedback> getFeedback() {
        return feedbacks;
    }
}
