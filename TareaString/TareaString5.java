import java.util.Scanner;

public class TareaString5 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca su frase:");
        String frase = scanner.nextLine();

        System.out.println("Tu frase es:" );
        
        String[] palabras = frase.split(" ");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
