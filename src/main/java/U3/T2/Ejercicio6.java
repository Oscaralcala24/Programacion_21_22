package U3.T2;

//Diseñar el juego "Acierta la contraseña". El primer jugador introduce una contraseña, el segundo,
// debe insertar otra intentando acertarla con las pistas que le dará el programa: número de caracteres, primera y última letra.
// El programa debe escribir "Acertaste" o "Fallaste".

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jugador 1- Introduce una contraseña: ");
        String contrasena = sc.nextLine();
        int anchuraContrasena = contrasena.length();
        char primeraLetra = contrasena.charAt(0);
        char ultimaLetra = contrasena.charAt(anchuraContrasena-1);
        System.out.println("Pistas:\n\nLongitud de contraseña: "+anchuraContrasena+"\nPrimera letra: "+primeraLetra+"\nUltima letra: "+ultimaLetra+"\n");

        System.out.print("Jugador 2- Adivina contraseña: ");
        String intentoAdivinar = sc.nextLine();
        if (contrasena.equals(intentoAdivinar)){
            System.out.println("Acertaste");
        }else{
            System.out.println("La cagaahte mi niño la cagahtee");
        }
    }
}
