package U3.Pruebas;

//Realiza un programa que rellene un array de 5 filas por 9 columnas con
//números enteros positivos comprendidos entre 100 y 1000 (ambos incluidos). A
//continuación, el programa deberá dar la posición tanto del máximo como del
//mínimo. NOTA IMPORTANTE: Los números no pueden repetirse.

public class EjercicioEntregable4_Manhana {
    public static void main(String[] args) {
        int [][] array = new int[5][9];
        rellernarArray(array);
        mostrarArray(array);
        int numeroAux = 0;
        System.out.println("El numero mas grande es: " + getMaximo(array, numeroAux));
        System.out.println("El numero mas pequeño es: " + getMinimo(array, numeroAux));
    }

    private static void mostrarArray(int[][] array) {
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(" | "+array[i][j]+" | ");
            }
            System.out.println();
        }
    }

    private static int getMinimo(int[][] array, int numeroAux) {
        numeroAux =array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j]< numeroAux){
                    numeroAux = array[i][j];
                }
            }
        }
        return numeroAux;
    }

    private static int getMaximo(int[][] array, int numeroAux) {
        numeroAux =array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > numeroAux){
                    numeroAux = array[i][j];
                }
            }
        }
        return numeroAux;
    }

    private static void rellernarArray(int[][] array) {
        int numeroAleatorio;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (100+Math.random()*901);
                numeroAleatorio = array[i][j];
                while (comprobarRepetido(numeroAleatorio,array)){
                    array[i][j] = (int) (100+Math.random()*901);
                }
            }
        }
    }

    private static boolean comprobarRepetido(int numeroAleatorio, int[][] array) {
        boolean repetido = false;
        int contadorRepetido = 0;
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == numeroAleatorio){
                    contadorRepetido++;
                }
            }
        }
        if (contadorRepetido>1){
            repetido = true;
        }
        return repetido;
    }
}
