

import java.util.Scanner;

public class TareaString4 {
    private static int i;

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduzca una palabra: ");
        String palabra = scanner.nextLine();

        int longitud = palabra.length();
        int mitad = longitud / 2;

        String primeramitad = palabra.substring(0,mitad);

        System.out.println("La primera mitad de tu palbra es " + primeramitad + ". ");

        int vocales = 0;
        for (int i = 0; i < longitud; i++) {
            char letra = palabra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                vocales++;
            }
        }
        System.out.println("El numero de vocales de tu palbra es: " + vocales + " vocales.");

        String palabrainversa = "";
        for (int i = longitud -1; i >= 0; i--){
            palabrainversa += palabra.charAt(i);
        }
        System.out.println("La palabra escrita al reves seria: " + palabrainversa + ". ");

        String palabraseparada = "";
        for (int i = 0; i < longitud; i++) {
            palabraseparada += palabra.charAt(i);
            if (i != longitud - 1) {
                palabraseparada += "-";
            } 
        }
        System.out.println("Tu palabra separada por guines seria: " + palabraseparada + ". ");

        if (palabra.equals(palabrainversa)) {
            System.out.println("La palabra se lee igual de izquierda a derecha y viceversa.");
        } else {
            System.out.println("La palabra no se le igual de izquierda a derecha y viceversa.");
        }
    }
}