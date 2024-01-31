import java.util.Scanner;

public class TareaString6 {
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduce tu email porfavor: ");
        String email = scanner.nextLine();

        int arroba = 0;

         for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) =='@') {
                arroba++;
            }
        }
        int punto = 0;
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) =='.') {
                punto++;
            }
        }
        if (arroba == 1 && punto == 1 && email.length() <= 25) {
            System.out.println("Bienvenido, el email es correcto, pase un buen dia.");
        } else {
            System.err.println("El email no cumple con los caracteres minimos, pruebe otra vez.");
        }
    }
}
