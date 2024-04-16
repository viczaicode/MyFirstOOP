package main;


public class JatekIndito {


    public static void main(String[] args) {
        /* Referencia nélkül példányosítjuk az objektumot és hívjuk egy metódusát */ 
        //new Jatek().start();
        
        /* referencián keresztül hívjuk  az objektum metódusát */
        //Jatek referencia = new Jatek();
        //referencia.start();
        
        /* Referencia nélkül csak a konstruktort hívjuk, azaz példányosítjuk - hivatkozás nélkül - az objektumot: */
        new Jatek();
        new Jatekos().tippel();
    }
    
}
