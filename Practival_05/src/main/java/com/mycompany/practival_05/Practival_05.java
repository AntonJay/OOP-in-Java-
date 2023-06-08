/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practival_05;

/**
 *
 * @author L106 LAB
 */
public class Practival_05 {

    public static void main(String[] args) {
       
        
       Speaker speaker1 = new Priest();
        speaker1.speak("Bless you!");
 
        Speaker speaker2 = new Politician();
        speaker2.speak("Vote me!");
 
        Speaker speaker3 = new Lecturer();
        speaker3.speak("Today we are going to learn Java programming.");

        
    }
}
