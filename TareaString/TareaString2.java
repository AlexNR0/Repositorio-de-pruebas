import java.util.*;

public class TareaString2 {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);
       
        System.out.println("Escribe una frase de dos o tres palabras porfavor: ");
        String respuesta = obj.nextLine();

        String str = respuesta;
        String result = "";

        for(int i = str.length()-1; i>=0; i--)
            result+= str.charAt(i);
        
        System.out.println("La frase alreves quedaria asi : " + result);

        String frase = respuesta;
        int contador = 0;

        for(int i = 0; i < frase.length(); i++)
        {
            if ((frase.charAt(i)) == 'a' || (frase.charAt(i)) == 'e' || (frase.charAt(i)) == 'i' || (frase.charAt(i)) == 'o' || (frase.charAt(i)) == 'u')

            {
                contador++;
            }
        }
        
        System.out.println("La cantidad de vocales es: " + contador);

        if (respuesta.length() % 2 == 0) {
            respuesta.substring(0, respuesta.length() / 2);
            System.out.println("La primera mitad de la frase es: ");System.out.println(respuesta.substring(0, respuesta.length() / 2));
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, para ver la frase separada por guiones ingresela otra vez: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] words = input.split(" ");
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                char character = word.charAt(j);
                output.append(character);
                if (j != word.length() - 1) {
                    output.append("-");
                }
            }
            if (i != words.length - 1) {
                output.append(" ");
            }
        }

        System.out.println("La frase ingresada es: " + input);
        System.out.println("La frase impresa con guiones es: " + output);
 
    }  
}
