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
public class YourLifeInMovies {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int yearOfUser = userInput.nextInt();
        
        if(yearOfUser < 2005 && yearOfUser > 1995) {
            System.out.println("Pixar's 'Up' came out over a decade ago.");
        } else if(yearOfUser < 1995 && yearOfUser > 1985) {
            System.out.println("the first Harry Potter came out over 15 years ago.");
            System.out.println("Pixar's 'Up' came out over a decade ago.");
        } else if(yearOfUser < 1985 && yearOfUser > 1975) {
            System.out.println("Space Jam came out not last decade, but the one before THAT.");
            System.out.println("the first Harry Potter came out over 15 years ago.");
            System.out.println("Pixar's 'Up' came out over a decade ago.");
        }else if(yearOfUser < 1975 && yearOfUser > 1965) {
            System.out.println(" the original Jurassic Park release is closer to the first lunar landing than it is to today");
            System.out.println("Space Jam came out not last decade, but the one before THAT.");
            System.out.println("the first Harry Potter came out over 15 years ago.");
            System.out.println("Pixar's 'Up' came out over a decade ago.");
        } else {
            System.out.println("You are too old or too young for this!");
        }
    }
}
