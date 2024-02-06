package TareaMath;
import java.util.Scanner;


public class Math1 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce la longitud del area: : ");
        double radio = input.nextDouble();
        
        double  volumen = (4.0/3.0)*Math.PI*Math.pow(radio, 3);

        System.out.println("El volumen de tu esfera es " + volumen + " con un radio de " + radio + ".");

    }
}
