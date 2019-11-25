/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem.UserTypes;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Date;
import patientmanagementsystem.*;
import patientmanagementsystem.PatientManagementSystem;
/**
 *
 * @author espow
 */
public class Patient extends User {
    Date DOB;
    String gender;
    final String uniqueIdentifier = "P";
    
    public Patient(String uniqueID, String firstName, String lastName, String password, String gender, Date DOB, Address address) {
        this.uniqueID = uniqueID;
        this.DOB = DOB;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.password = password;
    }
    
    public Patient(String firstName, String lastName, String password, String gender, Date DOB, Address address) {
        this.uniqueID = uniqueIdentifier+getNextID(uniqueIdentifier);
        this.DOB = DOB;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.password = password;
    }
    
    @Override
    public String displayUser(){
        return "Name: "+this.firstName+" "+this.lastName+" Date of Birth: "+PatientManagementSystem.getFormat().format(this.DOB);
    }
    
    public ArrayList<Appointment> getAppointments(){
        ArrayList<Appointment> appointments = new ArrayList<Appointment>();
        for(int i = 0;i<PatientManagementSystem.getAppointments().size();i++){
            if(PatientManagementSystem.getAppointments().get(i).getPatient().getUniqueID().equals(this.uniqueID)){
                appointments.add(PatientManagementSystem.getAppointments().get(i));
            }
        }
        return appointments;
    }

    public String getgender() {
        return gender;
    }

    public Date getDOB() {
        return DOB;
    }
}
