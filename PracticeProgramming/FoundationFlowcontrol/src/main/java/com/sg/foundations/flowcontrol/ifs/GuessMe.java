/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sg.foundations.flowcontrol.ifs;

import java.util.Scanner;

/**
 *
 * @author Sasha
 */
public class GuessMe {
    public static void main(String[] args) {
        int myNumber = 7;
        
        System.out.println("Input here...");
        Scanner userInput = new Scanner(System.in);
        int userNumber = userInput.nextInt();
        
        if(myNumber == userNumber) {
            System.out.println("Wow, nice guess! That was it!");
        } else if (userNumber < myNumber) {
            System.out.println("Ha, nice try - too low! I chose " + myNumber);
        } else if(userNumber > myNumber) {
            System.out.println("Too bad, way too high. I chose " + myNumber);
        } else {
            System.out.println("This is not an integer.");
        }
        
        }
    }

