package TareaMath;
import java.util.*
;
public class Math2_1 {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;

        System.out.println("Ingrese el valor del radio: ");
        double radio = sc.nextDouble();

        double Area = pi * Math.pow(radio, 2);

        double redondeado = Math.round(Area);

        System.out.println("El area de un circulo con radio " + radio + " es " + redondeado + ".");

    }
}