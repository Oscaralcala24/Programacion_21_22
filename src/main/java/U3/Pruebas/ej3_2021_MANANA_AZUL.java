package U3.Pruebas;

//Utilizando vectores bidimensionales enla función,realizar la siguiente función para un juego de ajedrez:
//
//public static boolean jaque(String posRey,String posReina)
//
//Y nos devuelva si reina está en posición de jaque al rey.
//
//La posiciones que recibe la función son posiciones de ajedrez: a5, h4,c8
//
//Para recordar una imagen de un tablero con las posiciones:

import java.util.Scanner;

public class ej3_2021_MANANA_AZUL {
    public static void main(String[] args) {
        String [][] ajedrez = new String[8][8];
        rellenarAjedrez(ajedrez);
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la posicion del rey: ");
        String posRey = sc.nextLine();
        System.out.print("Introduzca la posicion de la reina: ");
        String posReina = sc.nextLine();
        if (jaque(posRey,posReina)){
            System.out.println("Es jaque");
        }else {
            System.out.println("No es jaque");
        }

    }

    private static boolean jaque(String posRey, String posReina) {
        boolean esJaque = false;
        int numeroFilaReina = Integer.parseInt(String.valueOf(posReina.substring(0,1)));
        int numeroColumnaReina = Integer.parseInt((posReina.substring(1,2)));
        int numeroFilaRey = Integer.parseInt(String.valueOf(posRey.substring(0,1)));
        int numeroColumnaRey = Integer.parseInt((posRey.substring(1,2)));
        int jaque = 0;
        comprobarMovimiento(numeroFilaReina,numeroColumnaReina,numeroColumnaRey,numeroFilaRey,jaque))

    }

    private static int comprobarMovimiento(int numeroFilaReina, int numeroColumnaReina, int numeroColumnaRey, int numeroFilaRey, int jaque) {
        if (co)
    }

    private static void rellenarAjedrez(String[][] ajedrez) {
        String letras = "abcdefgh";
        for (int i = 0; i < ajedrez.length; i++) {
            for (int j = 0; j < ajedrez[i].length; j++) {
                ajedrez[i][j] = String.valueOf((ajedrez.length-i)+""+letras.charAt(j));
            }
        }
    }
}
