import java.util.Scanner;

public class TareaString3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese tres palabras:");
        String palabra1 = scanner.next();
        String palabra2 = scanner.next();
        String palabra3 = scanner.next();
        
        System.out.println(palabra1 + "\n" + palabra2 + "\n" + palabra3);
    }
}
