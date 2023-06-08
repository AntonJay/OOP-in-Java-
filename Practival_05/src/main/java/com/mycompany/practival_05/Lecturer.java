/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practival_05;

/**
 *
 * @author L106 LAB
 */
public class Lecturer implements Speaker {
        @Override
        public void speak(String phrase) {
        System.out.println("Lecturer: " + phrase);
    }

}
