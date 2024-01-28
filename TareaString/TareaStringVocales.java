import java.util.Scanner;

public class TareaStringVocales {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String frase;
        int contador = 0;
     
       
        System.out.println("Ingresa una frase de maximo 3 palabras: ");
        frase = sc.nextLine();

        for(int i = 0; i < frase.length(); i++)
        {
            if ((frase.charAt(i)) == 'a' || (frase.charAt(i)) == 'e' || (frase.charAt(i)) == 'i' || (frase.charAt(i)) == 'o' || (frase.charAt(i)) == 'u')

            {
                contador++;
            }
        }
        
        System.out.println("La cantidad de vocales es: " + contador);
    }
}
