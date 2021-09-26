package U1.T8;

//Realizar un aplicación que genere un número aleatorio entre 1 y 100.
// El jugador debe ir probando números tratando de acertarlo.
// El programa debe indicar "mayor" o "menor" según el número secreto sea mayor o menor que el introducido por el usuario.
// El proceso finaliza cuando el usuario acierta o cuando se rinde (introduciendo un -1).

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        int numeroAleatorio = (int) (Math.random()*100 +1);
        System.out.println(numeroAleatorio); // Para probar y saber que numero es.
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int numeroJugador = teclado.nextInt();
        while (numeroAleatorio!= numeroJugador){
            if (numeroAleatorio>numeroJugador){
                System.out.println("Es mayor. Introduce otro numero: ");
                numeroJugador = teclado.nextInt();
            } else if (numeroAleatorio<numeroJugador){
                System.out.println("Es menor. Introduce otro numero: ");
                numeroJugador = teclado.nextInt();
            } else if (numeroJugador==-1){
                break;
            }
        }
        if (numeroAleatorio==numeroJugador){
            System.out.println("Has acertado");
        }
    }
}
