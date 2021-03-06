/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem.UserTypes;
import Objects.Prescription;
import Objects.Appointment;
import Objects.Address;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import patientmanagementsystem.*;
import patientmanagementsystem.PatientManagementSystem;
/**
 *
 * @author espow
 */
public class Patient extends User {
    Date DOB;
    String gender;
    String status;
    final String uniqueIdentifier = "P";
    
    public Patient(String uniqueID, String firstName, String lastName, String password, String gender, Date DOB, Address address, String status) {
        this.uniqueID = uniqueID;
        this.DOB = DOB;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.password = password;
        this.status = status;
    }
    
    /**
     *
     * @param firstName
     * @param lastName
     * @param password
     * @param gender
     * @param DOB
     * @param address
     * @param status
     */
    public Patient(String firstName, String lastName, String password, String gender, Date DOB, Address address, String status) {
        this.uniqueID = uniqueIdentifier+getNextID(uniqueIdentifier,PatientManagementSystem.getUsers());
        this.DOB = DOB;
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.password = password;
        this.status = status;
    }
    
    /**
     *
     * @return "Name: FN LN DOB: dd/yy/mm
     */
    @Override
    public String displayUser(){
        return "Name: "+this.firstName+" "+this.lastName+" DOB: "+PatientManagementSystem.getFormat().format(this.DOB).replace(" 00:00", "");
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

    public String getGender() {
        return gender;
    }

    public Date getDOB() {
        return DOB;
    }
    
    public int getAge(){
        Date birthDate = this.getDOB();
        Date secondDate = new Date();
        long diffInMillies = Math.abs(secondDate.getTime() - birthDate.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        int age = (int) (diff/365.24);
        return age;
    }
    public ArrayList<Prescription> getPrescriptions(){
        ArrayList<Prescription> prescriptions = new ArrayList<>();
        for(int i = 0;i<PatientManagementSystem.getPrescriptions().size();i++){
            if(PatientManagementSystem.getPrescriptions().get(i).getIssueTo().getUniqueID().equals(this.uniqueID)){
                prescriptions.add(PatientManagementSystem.getPrescriptions().get(i));
            }
        }
        return prescriptions;
    }
    
    public void setStatus(String status){
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
    
    public static ArrayList<Patient> getPatients(ArrayList<User> users){
        ArrayList<Patient> patients = new ArrayList<>();
        for(User user : users){
            if(user.getUniqueID().contains("P")) patients.add((Patient) user);
        }
        return patients;
    }
    
    public static void removePatient(Patient patient){
        for(int i = PatientManagementSystem.getUsers().size();i>0;i--){
            if(PatientManagementSystem.getUsers().get(i-1).uniqueID.equals(patient.getUniqueID())){
                PatientManagementSystem.getUsers().remove(PatientManagementSystem.getUsers().get(i-1));
            }
        }
        for(int i = PatientManagementSystem.getAppointments().size();i>0;i--){
            if(PatientManagementSystem.getAppointments().get(i-1).getPatient().equals(patient)){
                PatientManagementSystem.getAppointments().remove(PatientManagementSystem.getAppointments().get(i-1));
            }
        }
        for(int i = PatientManagementSystem.getPrescriptions().size();i>0;i--){
            if(PatientManagementSystem.getPrescriptions().get(i-1).getIssueTo().equals(patient))
                PatientManagementSystem.getPrescriptions().remove(PatientManagementSystem.getPrescriptions().get(i-1));
        }
    }
}
