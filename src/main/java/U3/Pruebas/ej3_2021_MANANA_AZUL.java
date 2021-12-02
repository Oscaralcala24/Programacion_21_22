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

public class ej3_2021_MANANA_AZUL<posiciones> {
    public static void main(String[] args) {
        String [][] ajedrez = new String[8][8];
        rellenarAjedrez(ajedrez);
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la posicion del rey: ");
        String posRey = sc.nextLine();
        System.out.print("Introduzca la posicion de la reina: ");
        String posReina = sc.nextLine();
        if (jaque(posRey,posReina)) {
            System.out.println("Es jaque");
        }else {
            System.out.println("No es jaque");
        }


    }

    private static boolean jaque(String posRey, String posReina) {
        boolean esJaque = false;
        String letras = "abcdefgh";
        int numeroFilaReina = Integer.parseInt(posReina.substring(1));
        int numeroColumnaReina = letras.indexOf(posReina.charAt(0)+1);
        int numeroFilaRey = Integer.parseInt(posRey.substring(1));
        int numeroColumnaRey = letras.indexOf(posRey.charAt(0)+1);
        if (numeroFilaReina == numeroFilaRey || numeroColumnaReina == numeroColumnaRey){
            esJaque = true;
        }else if (ComprobarArribaDerecha( numeroFilaReina, numeroColumnaReina, numeroFilaRey, numeroColumnaRey)
        || ComprobarArribaIzquierda( numeroFilaReina, numeroColumnaReina, numeroFilaRey, numeroColumnaRey)
        || ComprobarAbajoIzquierda( numeroFilaReina, numeroColumnaReina, numeroFilaRey, numeroColumnaRey)
        || ComprobarAbajoDerecha( numeroFilaReina, numeroColumnaReina, numeroFilaRey, numeroColumnaRey)) {
            esJaque = true;
        };
        return esJaque;
    }

    private static boolean ComprobarAbajoDerecha( int numeroFilaReina, int numeroColumnaReina, int numeroFilaRey, int numeroColumnaRey) {
        boolean jaque = false;
        while (numeroFilaReina >0 && numeroFilaReina <9 && numeroColumnaReina >0 && numeroColumnaReina <9 && !jaque){
            if (numeroFilaReina == numeroFilaRey && numeroColumnaReina == numeroColumnaRey){
                jaque = true;
            }
            numeroFilaReina--;
            numeroColumnaReina++;
        }
        return jaque;
    }

    private static boolean ComprobarAbajoIzquierda( int numeroFilaReina, int numeroColumnaReina, int numeroFilaRey, int numeroColumnaRey) {
        boolean jaque = false;
        while (numeroFilaReina >0 && numeroFilaReina <9 && numeroColumnaReina >0 && numeroColumnaReina <9 && !jaque){
            if (numeroFilaReina == numeroFilaRey && numeroColumnaReina == numeroColumnaRey){
                jaque = true;
            }
            numeroFilaReina--;
            numeroColumnaReina--;
        }
        return jaque;
    }

    private static boolean ComprobarArribaIzquierda( int numeroFilaReina, int numeroColumnaReina, int numeroFilaRey, int numeroColumnaRey) {
        boolean jaque = false;
        while (numeroFilaReina >0 && numeroFilaReina <9 && numeroColumnaReina >0 && numeroColumnaReina <9 && !jaque){
            if (numeroFilaReina == numeroFilaRey && numeroColumnaReina == numeroColumnaRey){
                jaque = true;
            }
            numeroFilaReina++;
            numeroColumnaReina--;
        }
        return jaque;
    }

    private static boolean ComprobarArribaDerecha( int numeroFilaReina, int numeroColumnaReina, int numeroFilaRey, int numeroColumnaRey) {
        boolean jaque = false;
        while (numeroFilaReina >0 && numeroFilaReina <9 && numeroColumnaReina >0 && numeroColumnaReina <9 && !jaque){
            if (numeroFilaReina == numeroFilaRey && numeroColumnaReina == numeroColumnaRey){
                jaque = true;
            }
            numeroFilaReina++;
            numeroColumnaReina++;
        }
        return jaque;
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


//    public static void main(String[] args) {
//        String [][] ajedrez = new String[8][8];
//        rellenarAjedrez(ajedrez);
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Introduzca la posicion del rey: ");
//        String posRey = sc.nextLine();
//        System.out.print("Introduzca la posicion de la reina: ");
//        String posReina = sc.nextLine();
//        if (jaque(posRey,posReina)){
//            System.out.println("Es jaque");
//        }else {
//            System.out.println("No es jaque");
//        }
//
//    }

//    private static boolean jaque(String posRey, String posReina) {
//        boolean esJaque = false;
//        String letras = "abcdefgh";
//        int numeroFilaReina = Integer.parseInt(posReina.substring(1));
//        int numeroColumnaReina = letras.indexOf(posReina.charAt(0)+1);
//        int numeroFilaRey = Integer.parseInt(posRey.substring(1));
//        int numeroColumnaRey = letras.indexOf(posRey.charAt(0)+1);
//        if (numeroFilaReina == numeroFilaRey || numeroColumnaReina == numeroColumnaRey ||
//                comprobarArribaIzquierda(numeroFilaReina,numeroFilaRey, numeroColumnaRey, numeroColumnaReina) ||
//                comprobarArribaDerecha(numeroFilaReina,numeroFilaRey, numeroColumnaRey, numeroColumnaReina)  ||
//                comprobarAbajoIzquierda(numeroFilaReina,numeroFilaRey, numeroColumnaRey, numeroColumnaReina) ||
//                comprobarAbajoDerecha(numeroFilaReina,numeroFilaRey, numeroColumnaRey, numeroColumnaReina)
//        ){
//            esJaque = true;
//        }
//        return esJaque;
//    }

//    private static boolean comprobarAbajoDerecha(int numeroFilaReina, int numeroFilaRey, int numeroColumnaRey, int numeroColumnaReina) {
//        boolean jaque = false;
//        if (numeroFilaReina>0 && numeroFilaReina<9 && numeroColumnaReina>0 && numeroColumnaReina<9){
//            if (numeroFilaReina == numeroFilaRey && numeroColumnaReina == numeroColumnaRey){
//                jaque = true;
//            }else if (comprobarArribaIzquierda(numeroFilaReina-1,numeroFilaRey, numeroColumnaRey, numeroColumnaReina+1)){
//                jaque = true;
//            }
//        }
//        return jaque;
//    }
//
//    private static boolean comprobarAbajoIzquierda(int numeroFilaReina, int numeroFilaRey, int numeroColumnaRey, int numeroColumnaReina) {
//        boolean jaque = false;
//        if (numeroFilaReina>0 && numeroFilaReina<9 && numeroColumnaReina>0 && numeroColumnaReina<9){
//            if (numeroFilaReina == numeroFilaRey && numeroColumnaReina == numeroColumnaRey){
//                jaque = true;
//            }else if (comprobarArribaIzquierda(numeroFilaReina-1,numeroFilaRey, numeroColumnaRey, numeroColumnaReina-1)){
//                jaque = true;            }
//        }
//        return jaque;
//    }
//
//    private static boolean comprobarArribaDerecha(int numeroFilaReina, int numeroFilaRey, int numeroColumnaRey, int numeroColumnaReina) {
//        boolean jaque = false;
//        if (numeroFilaReina>0 && numeroFilaReina<9 && numeroColumnaReina>0 && numeroColumnaReina<9){
//            if (numeroFilaReina == numeroFilaRey && numeroColumnaReina == numeroColumnaRey){
//                jaque = true;
//            }else if (comprobarArribaIzquierda(numeroFilaReina+1,numeroFilaRey, numeroColumnaRey, numeroColumnaReina+1)){
//                jaque = true;
//            }
//        }
//        return jaque;
//    }
//
//    private static boolean comprobarArribaIzquierda(int numeroFilaReina, int numeroFilaRey, int numeroColumnaRey, int numeroColumnaReina) {
//        boolean jaque = false;
//        if (numeroFilaReina>0 && numeroFilaReina<9 && numeroColumnaReina>0 && numeroColumnaReina<9){
//            if (numeroFilaReina == numeroFilaRey && numeroColumnaReina == numeroColumnaRey){
//                jaque = true;
//            }else if (comprobarArribaIzquierda(numeroFilaReina+1,numeroFilaRey, numeroColumnaRey, numeroColumnaReina-1)){
//                jaque = true;
//            }
//        }
//        return jaque;
//    }
//
//
//    private static void rellenarAjedrez(String[][] ajedrez) {
//        String letras = "abcdefgh";
//        for (int i = 0; i < ajedrez.length; i++) {
//            for (int j = 0; j < ajedrez[i].length; j++) {
//                ajedrez[i][j] = String.valueOf((ajedrez.length-i)+""+letras.charAt(j));
//            }
//        }
//    }