package TareaMath;
import java.util.*;

public class Math2_4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el valor a: ");
        double a = sc.nextDouble();
        System.out.println("Ingrese el valor b: ");
        double b = sc.nextDouble();
        System.out.println("Ingrese el valor c: ");
        double c = sc.nextDouble();

        double discriminante = b * b - (4 * a * c);

        if (discriminante <0) {
            System.out.println("La raiz no tiene solucion real.");   
        } else {
            double raiz1 = (b - Math.sqrt(discriminante)) / (2 * a);
            double raiz2 = (b + Math.sqrt(discriminante)) / (2 * a);

            System.out.println("Las soluciones son: ");
            System.out.println("Raiz 1: " + raiz1);
            System.out.println("Raiz 2: " + raiz2);

        }
    }
}
