import java.util.Scanner;

public class TareaString1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String password;
        boolean isPasswordCorrect = false;
        char firstLetter = ' ';

        System.out.println("Crea aquí tu contraseña nueva (máximo 25 caracteres sin caracteres especiales):");

        while (!isPasswordCorrect) {

            password = scanner.nextLine();

            if (password.length() > 25) {

                System.out.println("La contraseña no puede tener más de 25 caracteres.");

            } else if (!password.matches("[a-zA-Z0-9]+")) {

                System.out.println("La contraseña no puede contener caracteres especiales.");

            } else {

                isPasswordCorrect = true;
                firstLetter = password.toUpperCase().charAt(0);
                System.out.println("Contraseña creada con éxito. La primera letra de la contraseña es " + "**" + firstLetter + "**" + ".");

            }
        }

        System.out.println("Introduce tu contraseña:");
        String inputPassword = scanner.nextLine();

        if (inputPassword.charAt(0) == firstLetter) {

            System.out.println("¡Contraseña correcta! ¡Que tengas un buen día!");

        } else {

            System.out.println("Contraseña incorrecta.");
        }
    }
}



