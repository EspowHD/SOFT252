/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem;

import Forms.*;
import Panels.*;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
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
    static final String FILENAME = "test//Data.txt";
    static final SimpleDateFormat FORMAT = new SimpleDateFormat("dd/mm/yyyy HH:mm");
    public static void main(String[] args) {
        loadInformation(FILENAME);
        /**
        java.awt.EventQueue.invokeLater(() -> {
            PatientHomePage PHP = new PatientHomePage((Patient)users.get(4));
            test.add(new AppointmentPanel(new Appointment(new Patient("Bob","Bob",new Address(),"Bob",new Date(),"bob"),new Doctor("FirstName","LastName",new Address(),"bob",new Rating[]{new Rating(4,"")}),new Date())));
            test.setVisible(true);
        });*/
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
    
    private static void loadUsers(Scanner sc){
        String userType = sc.nextLine();
        String uniqueID,firstName,lastName,password;
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
                    user = new Patient(uniqueID,firstName,lastName,password,gender,dob,address);
            }
            users.add(user);
            try{
            userType = sc.nextLine();
            }catch(Exception e){
                userType = null;
            }
        }
    }
    
    private static void saveUsers(String fileName,ArrayList<User> users){
        File file = new File(fileName);
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
        } catch (FileNotFoundException e){
            System.out.println("Error loading file");
        } catch (Exception e){
            System.out.println("Some other error has occured");
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
            String date = sc.nextLine();
            Date dateTime = new Date(date);
            Appointment appointment = new Appointment(patient,doctor,dateTime);
            if(!(sc.nextLine().contains("No ")))appointment.setDoctorNotes(sc.nextLine());
            if(!(sc.nextLine().contains("No ")))appointment.setPrescription(
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
}
