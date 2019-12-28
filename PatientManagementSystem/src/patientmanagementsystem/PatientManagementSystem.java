/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem;

import Forms.*;
import Forms.HomePages.AdministratorHomePage;
import Forms.HomePages.DoctorHomePage;
import Forms.HomePages.PatientHomePage;
import Forms.HomePages.SecretaryHomePage;
import Panels.*;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Toolkit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import javax.swing.JFrame;
import patientmanagementsystem.UserTypes.*;
import java.util.Date;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author espow
 */
public class PatientManagementSystem {
    static Font textFont = new Font("Tahoma",0,16);
    static ArrayList<User> users = new ArrayList();
    static ArrayList<Medicine> medicines = new ArrayList();
    static ArrayList<Appointment> appointments = new ArrayList();
    static ArrayList<Prescription> prescriptions = new ArrayList();
    static PatientHomePage php = null;
    static DoctorHomePage dhp = null;
    static SecretaryHomePage shp = null;
    static AdministratorHomePage ahp = null;
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

    /**
     *
     * @return
     */
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
    
    public static PatientHomePage getPhp() {
        return php;
    }

    public static Dimension getSCREEN_SIZE() {
        return SCREEN_SIZE;
    }
    
    public static String getFile(){
        return FILENAME;
    }

    public static void setPhp(PatientHomePage php) {
        PatientManagementSystem.php = php;
    }
    
    public static void setAppointments(ArrayList<Appointment> appointments){
        PatientManagementSystem.appointments = appointments;
    }
      
    private static void loadUsers(Scanner sc){
        String userType = sc.nextLine();
        String uniqueID,firstName,lastName,password,status;
        Address address;
        while(userType != null && !(userType.equals("") || userType.equals("MEDICINES")))
        {
            User user = null;
            switch(userType){
                case "DOCTOR" :
                    uniqueID = sc.nextLine();
                    firstName = sc.nextLine();
                    lastName = sc.nextLine();
                    password = sc.nextLine();
                    address = loadAddress(sc);
                    Rating[] ratings = loadRatings(sc);
                    user = new Doctor(uniqueID,firstName,lastName,password,address,ratings);
                    break;
                case "PATIENT" :
                    uniqueID = sc.nextLine();
                    firstName = sc.nextLine();
                    lastName = sc.nextLine();
                    password = sc.nextLine();
                    String gender = sc.nextLine();
                    Date dob = new Date(sc.nextLine());
                    address = loadAddress(sc);
                    status = sc.nextLine();
                    user = new Patient(uniqueID,firstName,lastName,password,gender,dob,address,status);
            }
            users.add(user);
            try{
            userType = sc.nextLine();
            }catch(Exception e){
                userType = null;
            }
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
                    writeRatings(writer,doctor.getRatings());
                    break;
                case 'P':
                    Patient patient = (Patient) users.get(i);
                    writer.write("PATIENT\n");
                    writer.write(patient.getUniqueID()+"\n");
                    writer.write(patient.getFirstName()+"\n");
                    writer.write(patient.getLastName()+"\n");
                    writer.write(patient.getPassword()+"\n");
                    writer.write(patient.getgender()+"\n");
                    writer.write(sdf.format(patient.getDOB())+"\n");
                    writeAddress(writer,patient.getAddress());
                    writer.write(patient.getStatus() +"\n");
                    break;
            }
        }
    }

    public static void saveInformation(String fileName){
        try {
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        saveUsers(writer,getUsers());
        saveMedicines(writer,getMedicines());
        saveAppointments(writer,getAppointments());
        writer.close();
        } catch (IOException e){
            
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
    
    private static Rating[] loadRatings(Scanner sc) {
        Rating[] ratings = new Rating[sc.nextInt()];
        sc.nextLine();//Clear buffer
        for(int i = 0;i<ratings.length;i++){
            String line = sc.nextLine();
            if(line.equals("RATING")){
            int stars = sc.nextInt();
            sc.nextLine();//Clear buffer
            String feedback = sc.nextLine();
            ratings[i] = new Rating(stars,feedback);
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
        } catch (Exception e){
            System.out.println(e.getStackTrace());
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
                    getPresciptionFromFile(sc,patient,doctor));
            if(appointment.getPrescription() != null)prescriptions.add(appointment.getPrescription());
            appointments.add(appointment);
            patientID = sc.nextLine();
        }   
    }

    private static Prescription getPresciptionFromFile(Scanner sc,Patient patient,Doctor doctor) {
        String medicineName = sc.nextLine();
        Medicine medicine = Medicine.getMedicine(medicines,medicineName);
        String prescriptionNote = sc.nextLine();
        String quantity = sc.nextLine();
        String dosage = sc.nextLine();
        Prescription prescription = new Prescription(doctor,patient,medicine,prescriptionNote,Integer.parseInt(quantity),dosage);
        return prescription;
    }

    private static void writeAddress(BufferedWriter writer, Address address) throws IOException {
        writer.write(address.roadNum+"\n");
        writer.write(address.roadName+"\n");
        writer.write(address.area+"\n");
        writer.write(address.city+"\n");
        writer.write(address.postCode+"\n");
    }

    private static void writeRatings(BufferedWriter writer, Rating[] ratings) throws IOException {
        int length = ratings.length;
        writer.write(Integer.toString(length)+"\n");
        for (Rating rating : ratings) {
            writer.write("RATING\n");
            writer.write(rating.getStars()+"\n");
            writer.write(rating.getFeedback()+"\n");
        }
    }

    private static void saveMedicines(BufferedWriter writer, ArrayList<Medicine> medicines) throws IOException {
        writer.write("MEDICINES\n");
        for (int i = 0; i <medicines.size(); i++) {
            writer.write(medicines.get(i).getMedicineName()+"\n");
            writer.write(Integer.toString(medicines.get(i).getStock())+"\n");
        }
    }

    private static void saveAppointments(BufferedWriter writer, ArrayList<Appointment> appointments) throws IOException {
        writer.write("APPOINTMENTS\n");
        for (int i = 0; i < appointments.size(); i++) {
            writer.write(appointments.get(i).patient.getUniqueID()+"\n");
            writer.write(appointments.get(i).doctor.getUniqueID()+"\n");
            writer.write(appointments.get(i).getStatus()+"\n");
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm");
            writer.write(sdf.format(appointments.get(i).dateTime)+"\n");
            if(appointments.get(i).doctorNotes != null){
                writer.write("NOTES\n");
                writer.write(appointments.get(i).doctorNotes+"\n");
            } else writer.write("NO NOTES\n");
            if(appointments.get(i).prescription != null){
                writer.write("PRESCRIPTION\n");
                writer.write(appointments.get(i).prescription.medicine.getMedicineName()+"\n");
                writer.write(appointments.get(i).prescription.notes+"\n");
                writer.write(appointments.get(i).prescription.quantity+"\n");
                writer.write(appointments.get(i).prescription.dosage+"\n");
            } else writer.write("NO PRESCRIPTION\n");
            
        }
    }
}
