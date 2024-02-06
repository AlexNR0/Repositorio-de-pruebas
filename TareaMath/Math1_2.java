package TareaMath;
import java.util.*;

public class Math1_2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud a: ");
        double a = sc.nextDouble();
        System.out.println("Introduce la longitud b: ");
        double b = sc.nextDouble();
        System.out.println("Introduce la longitud c: ");
        double c = sc.nextDouble();

        double p = (a+b+c) / 2;
        double area = Math.sqrt(p * (p-a) * (p-b) * (p-c));

        System.out.println("El area del triangulo es " + area + ".");

    }
}
