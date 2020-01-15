/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import java.util.ArrayList;

/**
 *
 * @author espow
 */
public class Medicine {
    private final String medicineName;
    private int stock;//Number of that medicine in stock
    private int ordered;//Number of that medicine ordered
    private int requestedOrders;//Number of that medicine requested to be ordered by doctors
    
    public Medicine(String medicineName, int stock,int ordered,int requestedOrders) {
        this.medicineName = medicineName;
        this.stock = stock;
        this.ordered = ordered;
        this.requestedOrders = requestedOrders;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public int getStock() {
        return stock;
    }
    
    public int getOrdered() {
        return ordered;
    }
    
    public int getRequestedOrdered() {
        return requestedOrders;
    }
    
    public void setRequestedOrdered(int requestedOrders) {
        if(requestedOrders<=0) this.requestedOrders = requestedOrders;
    }
    
    public void setOrdered(int ordered){
        if(ordered<=0) this.ordered = ordered;
    }

    public void setStock(int stock) {
        if(stock<=0)this.stock = stock;
    }
    
    public void orderArrived(int amountArrived){
        ordered -= amountArrived;
        stock += amountArrived;
    }
    
    public static Medicine getMedicine(ArrayList<Medicine> medicines,String medicineName){
        Medicine medicine = null;
        for(int i = 0;i<medicines.size();i++)
        {
            if(medicines.get(i).medicineName.equals(medicineName))medicine  = medicines.get(i);
        }
        return medicine;
    }
}
