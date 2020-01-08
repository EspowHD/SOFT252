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
    PrescribedMedicine[] medicines;
    String notes;

    public Prescription(Doctor prescribedBy, Patient issueTo, PrescribedMedicine[] medicines, String notes) {
        this.prescribedBy = prescribedBy;
        this.issueTo = issueTo;
        this.medicines= medicines;
        this.notes = notes;
    }

    public Doctor getPrescribedBy() {
        return prescribedBy;
    }

    public Patient getIssueTo() {
        return issueTo;
    }

    public PrescribedMedicine[] getPrescribedMedicine() {
        return medicines;
    }

    public String getNotes() {
        return notes;
    }
}
