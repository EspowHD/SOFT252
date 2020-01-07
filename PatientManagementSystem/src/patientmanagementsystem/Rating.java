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
public class Rating {
    private final int stars;// Maximum of 5 stored as int so average score can be calculated
    private final String feedback;

    public Rating(int stars, String feedback) {
        this.stars = stars;
        this.feedback = feedback;
    }
    
    public int getStars() {
        return stars;
    }

    public String getFeedback() {
        return feedback;
    }
}

