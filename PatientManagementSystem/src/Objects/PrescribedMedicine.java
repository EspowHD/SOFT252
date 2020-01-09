/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import Objects.Medicine;

/**
 *
 * @author espow
 */
public class PrescribedMedicine {
    private final Medicine medicine;
    private final int quantity;
    private final String dosage;

    public PrescribedMedicine(Medicine medicine, int dosage, String notes) {
        this.medicine = medicine;
        this.quantity = dosage;
        this.dosage = notes;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getDosage() {
        return dosage;
    }
}
