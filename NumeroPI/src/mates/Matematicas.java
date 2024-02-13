package mates;

import java.util.Random;


public class Matematicas {

   
    public static double generarNumeroPiIterativo(long pasos) {
        long dentro = 0;

        Random rand = new Random();

        for (long i = 0; i < pasos; i++) {
            double x = rand.nextDouble() * 2 - 1; 
            double y = rand.nextDouble() * 2 - 1; 

            
            if (x * x + y * y <= 1) {
                dentro++;
            }
        }

        
        double proporcion = (double) dentro / pasos;

        
        return 4.0 * proporcion;
    }
}

