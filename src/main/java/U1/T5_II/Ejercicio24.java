package U1.T5_II;

//Implementa el juego piedra, papel y tijera. Primero, el usuario 1 introduce su jugada y luego el usuario 2.
// Si alguno de los usuarios introduce una opción incorrecta, el programa deberá mostrar un mensaje de error.
//
//
//Ejemplo 1:
//Turno del jugador 1 (introduzca piedra, papel o tijera): papel
//Turno del jugador 2 (introduzca piedra, papel o tijera): papel
//Empate
//
//
//Ejemplo 2:
//Turno del jugador 1 (introduzca piedra, papel o tijera): papel
//Turno del jugador 2 (introduzca piedra, papel o tijera): tijera
//Gana el jugador 2
//
//
//Ejemplo 3:
//Turno del jugador 1 (introduzca piedra, papel o tijera): piedra
//Turno del jugador 2 (introduzca piedra, papel o tijera): tijera
//Gana el jugador 1

import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijera): ");
        String jugadaUsuario1 = teclado.next().toLowerCase();
        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijera): ");
        String jugadaUsuario2 = teclado.next().toLowerCase();
        if (jugadaUsuario1.equalsIgnoreCase("piedra")){
            if (jugadaUsuario2.equalsIgnoreCase("piedra")){
                System.out.println("Empate");
            } else if(jugadaUsuario2.equalsIgnoreCase("papel")){
                System.out.println("Gana jugador 2.");
            }else if (jugadaUsuario2.equalsIgnoreCase("tijera")){
                System.out.println("Gana jugador 1.");
            }else {
                System.out.println("Jugada erronea");
            }
        }else if (jugadaUsuario1.equalsIgnoreCase("papel")){
            if (jugadaUsuario2.equalsIgnoreCase("piedra")){
                System.out.println("Gana jugador 1.");
            } else if(jugadaUsuario2.equalsIgnoreCase("papel")){
                System.out.println("Empate");
            }else if (jugadaUsuario2.equalsIgnoreCase("tijera")){
                System.out.println("Gana jugador 2.");
            }else {
                System.out.println("Jugada erronea");
            }
        }else if (jugadaUsuario1.equalsIgnoreCase("tijera")){
            if (jugadaUsuario2.equalsIgnoreCase("piedra")){
                System.out.println("Gana jugador 2.");
            } else if(jugadaUsuario2.equalsIgnoreCase("papel")){
                System.out.println("Gana jugador 1.");
            }else if (jugadaUsuario2.equalsIgnoreCase("tijera")){
                System.out.println("Empate");
            }else {
                System.out.println("Jugada erronea");
            }
        }else {
            System.out.println("Jugada erronea");
        }
    }
}

