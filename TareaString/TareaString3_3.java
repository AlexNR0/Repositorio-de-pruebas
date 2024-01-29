
import java.util.Scanner;

public class TareaString3_3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.println("Introduzca su email porfavor: ");
        String email = input.nextLine();

        int arroba = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                arroba++;
            }
        }

        if (arroba == 1 && email.length() <= 20 && email.toLowerCase().equals(email)) {
            System.out.println("El email introducido es correcto.");
        } else {
            System.out.println("El email introducido no es correcto.");
        }
    }
}
