package Math2_2;
import java.util.Scanner;
import java.util.Random;

public class Math2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("¿Cuántos números aleatorios deseas calcular? ");
        int cantidadNumeros = scanner.nextInt();

        // Crear un arreglo para almacenar los números generados
        int[] numerosGenerados = new int[cantidadNumeros];

        // Generar los números aleatorios sin repetir
        for (int i = 0; i < cantidadNumeros; i++) {
            int numeroAleatorio;
            boolean repetido;

            do {
                // Generar un número aleatorio entre 0 y cantidadNumeros
                numeroAleatorio = random.nextInt(cantidadNumeros);
                repetido = false;

                // Verificar si el número ya ha sido generado
                for (int j = 0; j < i; j++) {
                    if (numerosGenerados[j] == numeroAleatorio) {
                        repetido = true;
                        break;
                    }
                }
            } while (repetido);

            // Almacenar el número generado en el arreglo
            numerosGenerados[i] = numeroAleatorio;
        }

        // Mostrar los valores por pantalla
        System.out.println("Números aleatorios generados:");
        for (int numero : numerosGenerados) {
            System.out.print(numero + " ");
        }
    }
}
