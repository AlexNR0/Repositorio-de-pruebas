package TareaMath;

//Enunciado: Crea un codigo Java que aleatoriamente haga enfrentarse a dos jugadores asignandoles un numero aleatorio y
//quien saque el numero mas alto sea el ganador .

public class Math2_5 {
    public static void main(String[] args) {
     
        //Primero hacemos que nos imprima un mensaje indicando quien empieza la tirada.
        System.out.println("Se presentan los participantes. A continuacion, hara su lanzamiento el jugador 1");

        //Creamos las variables tanto para el jugador 1 como para el dos, y hacemos que con la funcion Math.random genere un numero aleatorio entre (0 y 1).
        //Luego lo multiplicamos  por seis para que el rango de entre (0 y 1) pase a ser entre (0 y 6).
        //Por ultimo le sumamos al resultado de la funcion (Math.ramdom()*6) el 0,5 para que los rangos de aleatoriedad sea entre (0,5 y 6,5).
        double aux1 = (Math.random()*6) + 0.5;
        double aux2 = (Math.random()*6) + 0.5;

        //Como el numero sera decimal ya que el rango es entre (0,5 y 6,5), se crea la variable intento1 y 2 con la funcion Math.round() para redondear el resultado.
        double intento1 = Math.round(aux1);
        double intento2 = Math.round(aux2);

        //Luego se crea una variable tipo INT para que el numero con decimales pasado a entero se guarde en dicha variable.
        int jugador1 = (int)intento1;
        int jugador2 = (int)intento2;

        System.out.println("El jugador 1 ha sacado " + jugador1 + " y el jugador 2 ha sacado " + jugador2 + ".");

        //Con la funcion Math.max() se esta creando otra variable que hace que se seleccione el resultado mas alto de los dos generados aleatoriamente.
        int ganador = Math.max(jugador1, jugador2);

        System.out.println("Quien saco " + ganador + " es el ganador.");

    }
}
    