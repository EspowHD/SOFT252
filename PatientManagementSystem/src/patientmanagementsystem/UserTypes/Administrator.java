/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem.UserTypes;

import Objects.Address;
import patientmanagementsystem.PatientManagementSystem;

/**
 *
 * @author espow
 */
public class Administrator extends User{
    final String uniqueIdentifier = "A";

    public Administrator(String uniqueID, String firstName, String lastName, String password, Address address) {
        this.uniqueID = uniqueID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.address = address;
    }
    
    public Administrator(String firstName, String lastName, String password, Address address) {
        this.uniqueID = this.uniqueIdentifier+getNextID(uniqueIdentifier,PatientManagementSystem.getUsers());
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.address = address;
    }
}
