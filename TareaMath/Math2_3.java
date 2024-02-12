package TareaMath;
import java.util.*;

public class Math2_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numero minimo: ");
        int min = sc.nextInt();
        System.out.println("Ingrese el numero maximo: ");
        int max = sc.nextInt();

        int numeroaleatorio = (int) (Math.random() * (max - min + 1)+ min);

        System.out.println("El numero aleatorio entre el minimo "+ min + " y el maximo " + max + " es " + numeroaleatorio + ".");
    }
}
