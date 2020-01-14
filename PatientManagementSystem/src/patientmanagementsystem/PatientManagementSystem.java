/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem;

import Objects.PrescribedMedicine;
import Objects.Prescription;
import Objects.Rating;
import Objects.Medicine;
import Objects.Appointment;
import Objects.Address;
import Forms.*;
import Objects.Feedback;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import patientmanagementsystem.UserTypes.*;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;
/**
 *
 * @author espow
 */
public class PatientManagementSystem {
    static Font textFont = new Font("Tahoma",0,15);
    static ArrayList<User> users = new ArrayList();
    static ArrayList<Medicine> medicines = new ArrayList();
    static ArrayList<Appointment> appointments = new ArrayList();
    static ArrayList<Prescription> prescriptions = new ArrayList();
    static final String FILENAME = "test//Data.txt";
    static final SimpleDateFormat FORMAT = new SimpleDateFormat("dd/MM/yyyy HH:mm");
    static final Dimension SCREEN_SIZE = Toolkit.getDefaultToolkit().getScreenSize();
    public static void main(String[] args) {
        loadInformation(FILENAME);
        runPMS();
    }
    
    private static void runPMS(){
        for(int i = 0;i<users.size();i++){
            System.out.println(users.get(i).getUniqueID());
        }
        for (int i = 0; i < medicines.size(); i++) {
            System.out.println(medicines.get(i).getMedicineName()+" "+
                    medicines.get(i).getStock());
        }
        for (int i = 0; i < appointments.size(); i++) {
            System.out.println(FORMAT.format(appointments.get(i).getDateTime()));
        }
        StartPage test = new StartPage();
        test.setVisible(true);
        saveInformation(FILENAME);
    }

    //Getters
    public static ArrayList<User> getUsers(){
        return users;
    }

    public static Font getTextFont() {
        return textFont;
    }
    
    public static ArrayList<Appointment> getAppointments(){
        return appointments;
    }

    public static SimpleDateFormat getFormat() {
        return FORMAT;
    }

    public static ArrayList<Medicine> getMedicines() {
        return medicines;
    }

    public static ArrayList<Prescription> getPrescriptions() {
        return prescriptions;
    }

    public static Dimension getSCREEN_SIZE() {
        return SCREEN_SIZE;
    }
    
    public static String getFile(){
        return FILENAME;
    }
    
    //Setters
    public static void setAppointments(ArrayList<Appointment> appointments){
        PatientManagementSystem.appointments = appointments;
    }
    
    //Loaders
    private static void loadUsers(Scanner sc){
        String userType = sc.nextLine();
        String uniqueID,firstName,lastName,password,status;
        Address address;
        while(userType != null && !(userType.equals("") || userType.equals("MEDICINES")))
        {
            User user = null;
            uniqueID = sc.nextLine();
            firstName = sc.nextLine();
            lastName = sc.nextLine();
            password = sc.nextLine();
            address = loadAddress(sc);
            switch(userType){
                case "DOCTOR" :                
                    ArrayList<Rating> ratings;
                    if(sc.nextLine().contains("NO")){
                        ratings = new ArrayList<>();
                    } else ratings = loadRatings(sc);
                    
                    ArrayList<Feedback> feedbacks;
                    if(sc.nextLine().contains("NO")){
                        feedbacks = new ArrayList<>();
                    } else feedbacks = loadFeedback(sc);
                    
                    user = new Doctor(uniqueID,firstName,lastName,password,address,ratings,feedbacks);
                    break;
                case "PATIENT" :
                    String gender = sc.nextLine();
                    Date dob = new Date(sc.nextLine());
                    status = sc.nextLine();
                    user = new Patient(uniqueID,firstName,lastName,password,gender,dob,address,status);
                    break;
                case "ADMINISTRATOR" :
                    user = new Administrator(uniqueID,firstName,lastName,password,address);
                    break;
                case "SECRETARY" :
                    user = new Secretary(uniqueID,firstName,lastName,password,address);
                    break;
            }
            users.add(user);
            try{
            userType = sc.nextLine();
            }catch(Exception e){
                userType = null;
            }
        }
    }
    
    private static Address loadAddress(Scanner sc) {
        String roadNum = sc.nextLine();
        String roadName = sc.nextLine();
        String area = sc.nextLine();
        String city = sc.nextLine();
        String postcode = sc.nextLine();
        return new Address(roadNum,roadName,area,city,postcode);
    } 
    
    private static ArrayList<Rating> loadRatings(Scanner sc) {
        ArrayList<Rating> ratings = new ArrayList<>();
        int length = Integer.parseInt(sc.nextLine());
        for(int i = 0;i<length;i++){
            String line = sc.nextLine();
            if(line.equals("RATING")){
            int stars = sc.nextInt();
            sc.nextLine();//Clear buffer
            String feedback = sc.nextLine();
            ratings.add(new Rating(stars,feedback));
            }
        }
        return ratings;
    } 
    
    private static void loadInformation(String FILENAME) {
        File file = new File(FILENAME);
        try{
        Scanner sc = new Scanner(file);
        loadUsers(sc);
        loadMedicine(sc);
        loadAppointments(sc);
        sc.close();
        } catch (FileNotFoundException e){
            System.out.println("Error loading file");
        } catch (NoSuchElementException e){
        }catch (Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }  
    
    private static void loadMedicine(Scanner sc) {
        String medicineName = sc.nextLine();
        while(medicineName != null &&
                !(medicineName.equals("") || medicineName.equals("APPOINTMENTS")))
        {
            int stock = Integer.parseInt(sc.nextLine());
            medicines.add(new Medicine(medicineName,stock));
            medicineName = sc.nextLine();
        }
    }
    
    private static void loadAppointments(Scanner sc) {
        String patientID = sc.nextLine();
        while(patientID !=null && !(patientID.equals(""))){
            Patient patient = (Patient) User.getUser(getUsers(),patientID);
            String doctorID = sc.nextLine();
            Doctor doctor = (Doctor) User.getUser(getUsers(),doctorID);
            String status = sc.nextLine();
            String date = sc.nextLine();
            Date dateTime = new Date(date);
            Appointment appointment = new Appointment(patient,doctor,status,dateTime);
            String notes = sc.nextLine();
            if(!(notes.contains("NO ")))appointment.setDoctorNotes(sc.nextLine());
            if(!(sc.nextLine().contains("NO ")))appointment.setPrescription(
                    loadPrescriptions(sc,patient,doctor));
            if(appointment.getPrescription() != null)prescriptions.add(appointment.getPrescription());
            appointments.add(appointment);
            patientID = sc.nextLine();
        }   
    }
    
    private static Prescription loadPrescriptions(Scanner sc,Patient patient,Doctor doctor) {
        int length =Integer.parseInt(sc.nextLine());
        ArrayList<PrescribedMedicine> prescribedMedicines = new ArrayList<>();
        for(int i = 0;i<length;i++){
            String medicineName = sc.nextLine();
            Medicine medicine = Medicine.getMedicine(medicines,medicineName);
            String quantity = sc.nextLine();
            String dosage = sc.nextLine();
            prescribedMedicines.add(new PrescribedMedicine(medicine,Integer.parseInt(quantity),dosage));
        }
        String prescriptionNote = sc.nextLine();
        Prescription prescription = new Prescription(doctor,patient,prescribedMedicines,prescriptionNote);
        return prescription;
    }
    
    private static ArrayList<Feedback> loadFeedback(Scanner sc) {
        ArrayList<Feedback> feedbacks = new ArrayList<>();
        int length = Integer.parseInt(sc.nextLine());
        for(int i = 0;i<length;i++){
            String line = sc.nextLine();
            if(line.equals("RATING")){
            String feedbackBy = sc.nextLine();
            String feedback = sc.nextLine();
            feedbacks.add(new Feedback(feedbackBy,feedback));
            }
        }
        return feedbacks;
    }

    //Writers
    public static void saveInformation(String fileName){
        try {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        saveUsers(writer,getUsers());
        writeMedicines(writer,getMedicines());
        writeAppointments(writer,getAppointments());
        writer.close();
        } catch (IOException e){
            
        }
    }
    
    private static void saveUsers(BufferedWriter writer,ArrayList<User> users) throws IOException{
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
        for (int i = 0; i < users.size(); i++) {
            char type = users.get(i).getUniqueID().charAt(0);
            switch(type){
                case 'D':
                    Doctor doctor = (Doctor) users.get(i);
                    writer.write("DOCTOR\n");
                    writer.write(doctor.getUniqueID()+"\n");
                    writer.write(doctor.getFirstName()+"\n");
                    writer.write(doctor.getLastName()+"\n");
                    writer.write(doctor.getPassword()+"\n");
                    writeAddress(writer,doctor.getAddress());
                    if(doctor.getRatings()== null || doctor.getRatings().isEmpty()){
                        writer.write("NO RATINGS"+"\n");
                    } else 
                    {
                        writer.write("RATINGS"+"\n");
                        writeRatings(writer,doctor.getRatings());
                    }
                    if(doctor.getFeedback() == null || doctor.getFeedback().isEmpty()){
                        writer.write("NO FEEDBACK"+"\n");
                    } else {
                        writer.write("FEEDBACKS"+"\n");
                        writeFeedbacks(writer,doctor.getFeedback());
                    }
                    break;
                case 'P':
                    Patient patient = (Patient) users.get(i);
                    writer.write("PATIENT\n");
                    writer.write(patient.getUniqueID()+"\n");
                    writer.write(patient.getFirstName()+"\n");
                    writer.write(patient.getLastName()+"\n");
                    writer.write(patient.getPassword()+"\n");
                    writeAddress(writer,patient.getAddress());
                    writer.write(patient.getGender()+"\n");
                    writer.write(sdf.format(patient.getDOB())+"\n");
                    writer.write(patient.getStatus() +"\n");
                    break;
                case 'A':
                    Administrator admin = (Administrator) users.get(i);
                    writer.write("ADMINISTRATOR\n");
                    writer.write(admin.getUniqueID()+"\n");
                    writer.write(admin.getFirstName()+"\n");
                    writer.write(admin.getLastName()+"\n");
                    writer.write(admin.getPassword()+"\n");
                    writeAddress(writer,admin.getAddress());
                    break;
                case 'S':
                    Secretary secretary = (Secretary) users.get(i);
                    writer.write("SECRETARY\n");
                    writer.write(secretary.getUniqueID()+"\n");
                    writer.write(secretary.getFirstName()+"\n");
                    writer.write(secretary.getLastName()+"\n");
                    writer.write(secretary.getPassword()+"\n");
                    writeAddress(writer,secretary.getAddress());
                    break;
            }
        }
    }

    private static void writeAddress(BufferedWriter writer, Address address) throws IOException {
        writer.write(address.getRoadNum()+"\n");
        writer.write(address.getRoadName()+"\n");
        writer.write(address.getArea()+"\n");
        writer.write(address.getCity()+"\n");
        writer.write(address.getPostCode()+"\n");
    }

    private static void writeRatings(BufferedWriter writer, ArrayList<Rating> ratings) throws IOException {
        writer.write(Integer.toString(ratings.size())+"\n");
        for (Rating rating : ratings) {
            writer.write("RATING\n");
            writer.write(rating.getStars()+"\n");
            writer.write(rating.getFeedback()+"\n");
        }
    }

    private static void writeMedicines(BufferedWriter writer, ArrayList<Medicine> medicines) throws IOException {
        writer.write("MEDICINES\n");
        for (int i = 0; i <medicines.size(); i++) {
            writer.write(medicines.get(i).getMedicineName()+"\n");
            writer.write(Integer.toString(medicines.get(i).getStock())+"\n");
        }
    }

    private static void writeAppointments(BufferedWriter writer, ArrayList<Appointment> appointments) throws IOException {
        writer.write("APPOINTMENTS\n");
        for (int i = 0; i < appointments.size(); i++) {
            writer.write(appointments.get(i).getPatient().getUniqueID()+"\n");
            writer.write(appointments.get(i).getDoctor().getUniqueID()+"\n");
            writer.write(appointments.get(i).getStatus()+"\n");
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm");
            writer.write(sdf.format(appointments.get(i).getDateTime())+"\n");
            if(appointments.get(i).getDoctorNotes() != null){
                writer.write("NOTES\n");
                writer.write(appointments.get(i).getDoctorNotes()+"\n");
            } else writer.write("NO NOTES\n");
            if(appointments.get(i).getPrescription() != null){
                writePrescription(writer,appointments.get(i).getPrescription());
            } else writer.write("NO PRESCRIPTION\n");
            
        }
    }

    private static void writePrescription(BufferedWriter writer, Prescription prescription) throws IOException {
        writer.write("PRESCRIPTION\n");
        writer.write(Integer.toString(prescription.getPrescribedMedicine().size())+"\n");
        for(PrescribedMedicine prescribedMed : prescription.getPrescribedMedicine()){
            writer.write(prescribedMed.getMedicine().getMedicineName()+"\n");
            writer.write(prescribedMed.getQuantity()+"\n");
            writer.write(prescribedMed.getDosage()+"\n");
        }
        writer.write(prescription.getNotes()+"\n");
    }

    private static void writeFeedbacks(BufferedWriter writer, ArrayList<Feedback> feedbacks) throws IOException {
        writer.write(Integer.toString(feedbacks.size())+"\n");
        for (Feedback feedback : feedbacks) {
            writer.write("FEEDBACK\n");
            writer.write(feedback.getFeedbackBy()+"\n");
            writer.write(feedback.getFeedback()+"\n");
        }
    }
}
