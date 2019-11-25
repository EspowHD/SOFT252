/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem;
import patientmanagementsystem.UserTypes.Patient;
import patientmanagementsystem.UserTypes.Doctor;
import java.util.Date;
/**
 *
 * @author espow
 */
public class Appointment {
    Patient patient;
    Doctor doctor;
    Date dateTime;
    String doctorNotes = null;
    Prescription prescription = null;
    public Appointment(Patient patient, Doctor doctor, Date dateTime) {
        this.patient = patient;
        this.doctor = doctor;
        this.dateTime = dateTime;
    }

    public void setDoctorNotes(String doctorNotes) {
        this.doctorNotes = doctorNotes;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }
    
    public Patient getPatient() {
        return patient;
    }

    public Date getDateTime() {
        return dateTime;
    }
    
    public Doctor getDoctor() {
        return doctor;
    }

    public Prescription getPrescription() {
        return prescription;
    }
}
