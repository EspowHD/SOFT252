/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem;

import java.util.ArrayList;

/**
 *
 * @author espow
 */
public class Medicine {
    String medicineName;
    int stock;//Number of that medicine in stock

    public Medicine(String medicineName, int stock) {
        this.medicineName = medicineName;
        this.stock = stock;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if(stock>-1)this.stock = stock;
    }
    
    public Medicine getMedicine(ArrayList<Medicine> medicines,String medicineName){
        Medicine medicine = null;
        for(int i = 0;i<medicines.size();i++)
        {
            if(medicines.get(i).medicineName.equals(medicineName))medicine  = medicines.get(i);
        }
        return medicine;
    }
}
