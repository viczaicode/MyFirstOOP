package main;

import java.util.Random;


public class Jatekos {
    
    Random rnd = new Random();
    
     void tippel() {
        int tipp = rnd.nextInt(10);
        System.out.println("Tippelésem: " + tipp);
    }
}
