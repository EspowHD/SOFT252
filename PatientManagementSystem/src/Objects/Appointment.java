/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;
import patientmanagementsystem.UserTypes.Patient;
import patientmanagementsystem.UserTypes.Doctor;
import java.util.Date;
/**
 *
 * @author espow
 */
public class Appointment {
    private final Patient patient;
    private final Doctor doctor;
    private final Date dateTime;
    String doctorNotes = null;
    Prescription prescription = null;
    String status;
    public Appointment(Patient patient, Doctor doctor,String status, Date dateTime) {
        this.patient = patient;
        this.doctor = doctor;
        this.status = status;
        this.dateTime = dateTime;
    }

    public void setDoctorNotes(String doctorNotes) {
        this.doctorNotes = doctorNotes;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }
    
    public void setStatus(String status) {
        this.status = status;
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

    public String getStatus() {
        return status;
    }
    
    public String getDoctorNotes() {
        return doctorNotes;
    }
}
