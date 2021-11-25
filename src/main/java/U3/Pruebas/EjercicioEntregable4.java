package U3.Pruebas;

//Juego del buscaminas
//
//Solicitando al usuario una dimensión N crear una vector bidimensional que tenga N filas y N columnas.
//
//A continuación rellenar de forma aleatoria.
//
//O bien un carácter X que significa que hay una bomba.
//O bien un carácter - que significa que esa casilla no nada.
//A continuación solicitar al jugador una posición hasta que el usuario encuentre una bomba.
//
//En caso de que la casilla del usuario solicitada al usuario no sea una bomba se debe mostrar
// por pantalla la cantidad de bombas que hay en las casillas de alrededor.
//
//Para comprobar que el juego está correcto se mostrar el tablero del juego cada vez
// (hasta que el usuario encuentre una bomba).
//
//NOTA: Podemos hacer la lectura de la posición como consideremos más oportuno.

import java.util.Scanner;

public class EjercicioEntregable4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la dimension: ");
        int N = sc.nextInt();
        Character [][] buscaminas = new Character[N][N];
        rellenarAleatorio(buscaminas);
        boolean explota = false;
        while (!explota){
            mostrarTablero(buscaminas);
            System.out.print("Introduce una posicion: ");
            String posicion = sc.next();
            System.out.println();
            int fila = Integer.parseInt(posicion.substring(0,1)) -1;
            int columna = Integer.parseInt(posicion.substring(2,3))-1;
            if (buscaminas[fila][columna].equals('X')){
                explota = true;
                System.out.println("La posicion "+posicion+" tiene una bomba. Estas muerto");
            }else {
                System.out.println(comprobarBombas(fila,columna,buscaminas));
            }
        }

    }

    private static int comprobarBombas(int fila, int columna, Character[][] buscaminas) {
        int contadorBombas = 0;
        for (int i = 0; i < buscaminas.length; i++) {
            for (int j = 0; j < buscaminas[i].length; j++) {
                if ((i == fila-1 && j == columna-1) || (i == fila-1 && j == columna) || (i == fila-1 && j == columna+1)
                        || (i == fila && j == columna-1) || (i == fila && j == columna+1)|| (i == fila+1 && j == columna-1)
                        || (i == fila+1 && j == columna) || (i == fila+1 && j == columna+1)) {
                    if (buscaminas[i][j].equals('X')){
                        contadorBombas++;

                    }

                }
            }
        }
        return contadorBombas;
    }

    private static void mostrarTablero(Character[][] buscaminas) {
        for (int i = 0; i < buscaminas.length; i++) {
            for (int j = 0; j < buscaminas.length; j++) {
                System.out.print(" | "+buscaminas[i][j]+" | ");
            }
            System.out.println();
        }
    }

    private static void rellenarAleatorio(Character[][] buscaminas) {
        for (int i = 0; i < buscaminas.length; i++) {
            for (int j = 0; j < buscaminas[i].length; j++) {
                buscaminas [i][j] = conversorCaracter((int) (Math.random() * 2) +1);
            }
        }
    }

    private static char conversorCaracter(int random) {
        if (random == 1){
            return 'X';
        }else {
            return '-';
        }
    }
}








