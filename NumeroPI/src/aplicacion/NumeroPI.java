package aplicacion;
import java.util.Random;
import java.util.Scanner;

public class NumeroPI{

     public static void main(String[] args){
        
    System.out.println("Dardos a lanzar: ");
    Scanner sc = new Scanner(System.in);
    long dardosLanzados = sc.nextInt();
    sc.close();

    int aciertos = 0;

    Random random = new Random();

    for(int i = 0; i < dardosLanzados; i++){

        double x = random.nextDouble();

        double y = random.nextDouble();

        if(Math.sqrt(Math.pow(x - 0.5, 2) + Math.pow(y - 0.5, 2)) <= 0.5){
            aciertos++;
        }
    }

    double proporcion = (double)aciertos / (double)dardosLanzados;
    double pi = 4 * proporcion;

    System.out.println("El valor de pi es: " + pi);
}
}




