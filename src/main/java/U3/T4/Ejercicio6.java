package U3.T4;

//Realiza un programa que rellene un array de 6 filas por 10 columnas con números enteros positivos
// comprendidos entre 0 y 1000 (ambos incluidos). A continuación, el programa deberá dar la posición
// tanto del máximo como del mínimo.
//
//NOTA IMPORTANTE: Los números no pueden repetirse.

public class Ejercicio6 {
    public static void main(String[] args) {
        int [][] tablaAleatorios = new int[6][10];
        rellenaMuestraArray(tablaAleatorios);
        int numAux = 0;

        saberPosicionMax(tablaAleatorios, numAux);
        saberPosicionMin(tablaAleatorios, numAux );
    }

    private static void saberPosicionMin(int[][] tablaAleatorios, int numAux) {
        int fila = 0;
        int columna = 0;
        numAux = tablaAleatorios[0][0];
        for (int i = 0; i < tablaAleatorios.length; i++) {
            for (int j = 0; j < tablaAleatorios[i].length; j++) {
                if (numAux>tablaAleatorios[i][j]){
                    numAux = tablaAleatorios[i][j];
                    fila = i+1;
                    columna = j+1;
                }
            }
        }
        System.out.println("El numero mas pequeño es "+numAux+" , esta en la fila "+fila+ " y en la columna "+columna);
    }

    private static void saberPosicionMax(int[][] tablaAleatorios, int numAux) {
        int fila = 0;
        int columna = 0;
        numAux = tablaAleatorios[0][0];
        for (int i = 0; i < tablaAleatorios.length; i++) {
            for (int j = 0; j < tablaAleatorios[i].length; j++) {
                if (numAux<tablaAleatorios[i][j]){
                    numAux = tablaAleatorios[i][j];
                    fila = i+1;
                    columna = j+1;
                }
            }
        }
        System.out.println("El numero mas grande es "+numAux+" , esta en la fila "+fila+ " y en la columna "+columna);
    }

    private static void rellenaMuestraArray(int[][] tablaAleatorios) {
        for (int i = 0; i < tablaAleatorios.length; i++) {
            for (int j = 0; j < tablaAleatorios[i].length; j++) {
                tablaAleatorios[i][j] = (int) (Math.random()*1001);
                int numeroAleatorio = tablaAleatorios[i][j];
                while (!comprobarRepetido(tablaAleatorios, numeroAleatorio, i, j)){
                    tablaAleatorios[i][j] = (int) (Math.random()*1001);
                }
                System.out.print(" | "+tablaAleatorios[i][j]+" | ");
            }
            System.out.println("\n-------------------------------------------------------------------------------------------");
        }
    }

    private static boolean comprobarRepetido(int[][] tablaAleatorios, int aleatorio, int i, int j) {
        int contador = 0;
        for (int k = 0; k < tablaAleatorios.length; k++) {
            for (int l = 0; l < tablaAleatorios[i].length; l++) {
                if (aleatorio == tablaAleatorios[k][l]){
                    contador++;
                }
            }
        }
        if (contador == 1){
            return false;
        }else {
            return true;
        }
    }
}
