/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patientmanagementsystem;

/**
 *
 * @author espow
 */
public class Address {
    String roadNum;
    String roadName;
    String area;
    String city;
    String postCode;
    
    public Address(){
        this.roadNum = "Road Number";
        this.roadName = "Road Name";
        this.area = "Area";
        this.city = "City";
        this.postCode = "PostCode";
    }

    public Address(String roadNum, String roadName, String area, String city, String postCode) {
        this.roadNum = roadNum;
        this.roadName = roadName;
        this.area = area;
        this.city = city;
        this.postCode = postCode;
    }

    public String getRoadNum() {
        return roadNum;
    }

    public String getRoadName() {
        return roadName;
    }

    public String getArea() {
        return area;
    }

    public String getCity() {
        return city;
    }

    public String getPostCode() {
        return postCode;
    }
    
    public String getFormattedAddress() {
        return roadNum+" "+roadName+"\n"+area+"\n"+city+"\n"+postCode;
    }
    
    public static boolean checkPostCodeValid(String postCode){
    if(postCode.matches("([Gg][Ii][Rr] 0[Aa]{2})|((([A-Za-z][0-9]{1,2})|(([A-Za-z][A-Ha-hJ-Yj-y][0-9]{1,2})|(([A-Za-z][0-9][A-Za-z])|([A-Za-z][A-Ha-hJ-Yj-y][0-9][A-Za-z]?))))\\s?[0-9][A-Za-z]{2})")) return true;
    //The regex provided by the british government
    else return false;
    }
}
