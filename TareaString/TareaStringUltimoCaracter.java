import java.util.Scanner;

public class TareaStringUltimoCaracter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese una frase de tres palabras:");
        String frase = scanner.nextLine();

        String[] palabras = frase.split(" ");
        String ultimaPalabra = palabras[palabras.length - 1];
        char ultimoCaracter = ultimaPalabra.charAt(ultimaPalabra.length() - 1);
        
        System.out.println("El último carácter de la última palabra es: " + ultimoCaracter);
    }
}


