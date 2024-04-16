package main;

import java.util.Random;
import java.util.Scanner;


public class Jatek {
    
    Random rnd = new Random();
    
    void start() {
        System.out.println("Gondoltam egy számra 0 és 9 között...");
        int randomszam = rnd.nextInt(10);
        System.out.println("A kiírandó szám: " + randomszam);
    }
    
    public Jatek() {
        start();
    }
    
    
}
