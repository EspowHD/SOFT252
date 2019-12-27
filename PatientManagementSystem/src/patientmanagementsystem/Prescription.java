/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem;

import patientmanagementsystem.UserTypes.Patient;
import patientmanagementsystem.UserTypes.Doctor;

/**
 *
 * @author espow
 */
public class Prescription {
    Doctor prescribedBy;
    Patient issueTo;
    Medicine medicine;
    String notes;
    int quantity;
    String dosage;

    public Prescription(Doctor prescribedBy, Patient issueTo, Medicine medicine, String notes, int Quantity, String dosage) {
        this.prescribedBy = prescribedBy;
        this.issueTo = issueTo;
        this.medicine = medicine;
        this.notes = notes;
        this.quantity = Quantity;
        this.dosage = dosage;
    }

    public Doctor getPrescribedBy() {
        return prescribedBy;
    }

    public Patient getIssueTo() {
        return issueTo;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public String getNotes() {
        return notes;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDosage() {
        return dosage;
    }
    
}
