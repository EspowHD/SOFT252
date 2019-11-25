/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem.UserTypes;

import java.util.ArrayList;
import patientmanagementsystem.Address;
import patientmanagementsystem.PatientManagementSystem;

public abstract class User {
    String firstName;
    String lastName;
    Address address;
    String uniqueID;
    String password;
    
    protected String getNextID(String type){
        int maxID = 0;
        ArrayList<User> users = PatientManagementSystem.getUsers();
        for(int i = 0;i < users.size();i++){
            if(users.get(i).uniqueID.contains(type)){
                int inInt = Integer.parseInt(users.get(i).uniqueID.substring(1));
                if(maxID < inInt) maxID = inInt;
            }
        }
        return String.format("%04d", maxID);
    }
    
    public static User getUser(ArrayList<User> users,String userID){
        User user = null;
        for(int i = 0;i<users.size();i++){
            if(users.get(i).uniqueID.equals(userID)){
                user = users.get(i);
                i = users.size();
            }
        }
        return user;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return address;
    }

    public String getUniqueID() {
        return uniqueID;
    }

    public String getPassword() {
        return password;
    }
    
    public String displayUser(){
        return "Name: "+this.firstName+" "+this.lastName;
    }
}
