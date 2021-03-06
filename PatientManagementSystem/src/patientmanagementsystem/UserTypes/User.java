/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem.UserTypes;

import java.util.ArrayList;
import Objects.Address;

public abstract class User {
    String firstName;
    String lastName;
    Address address;
    String uniqueID;
    String password;
    
    public String getNextID(String type,ArrayList<User> users){
        int maxID = -1;
        for(int i = 0;i < users.size();i++){
            if(users.get(i).uniqueID.contains(type)){
                int inInt = Integer.parseInt(users.get(i).uniqueID.substring(1));
                if(maxID < inInt) maxID = inInt;
            }
        }
        return String.format("%04d", maxID+1);
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
    
    public static void removeUser(ArrayList<User> users,String userID){
        User user = null;
        for(int i = 0;i<users.size();i++){
            if(users.get(i).uniqueID.equals(userID)){
                users.remove(i);
            }
        }
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
        if(this.uniqueID.contains("D")) return "Dr "+this.firstName+" "+this.lastName;
        else return this.firstName+" "+this.lastName;
    }
}
