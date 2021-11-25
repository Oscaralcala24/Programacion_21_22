package U3.Pruebas;

//Implementa una función con nombre corteza que sea capaz de extraer la capa
//exterior de un array bidimensional. Esta capa se extrae en forma de array de
//una dimensión. La extracción de números comienza en la esquina superior
//izquierda y continúa en el sentido de las agujas del reloj. Se debe entregar
//tanto el código de la función como el código de prueba que la usa. La cabecera
//de la función es la siguiente:
//
//public static int[] corteza(int[][] n)
//
//Por ejemplo, si el array bidimensional a es el que se muestra a continuación:
//
//45 92 14 20 25 78
//35 72 24 45 42 60
//32 42 64 23 41 39
//98 45 94 11 18 48
//
//El array unidimensional generado por corteza(a) sería el siguiente:
//
//45 92 14 20 25 78 60 39 48 18 11 94 45 98 32 35


import java.util.Arrays;

public class EjercicioEntregable3_Manhana {
    public static void main(String[] args) {
        int [][] n = new int[5][5];
        rellernarArray(n);
        mostarArray(n);
        corteza(n);

    }

    private static void mostarArray(int[][] n) {
        for (int i = 0; i < n.length ; i++) {
            for (int j = 0; j < n[i].length; j++) {
                System.out.print(" | "+n[i][j]+" | ");
            }
            System.out.println();
        }
    }

    private static void corteza(int[][] n) {
        int contadorPosiciones = 0;
        int contadorAtrasJ = n[0].length-1;
        int contadorAtrasI = n.length-1;
        int [] arrayCorteza = new int[contadorPosiciones];
        for (int i = 1; i < n[0].length-2; i++) {
            contadorPosiciones++;
            arrayCorteza = Arrays.copyOf(arrayCorteza,contadorPosiciones);
            arrayCorteza[contadorPosiciones-1] = n[1][i];
        }
        for (int i = 1; i < n.length-2; i++) {
            contadorPosiciones++;
            arrayCorteza = Arrays.copyOf(arrayCorteza,contadorPosiciones);
            arrayCorteza[contadorPosiciones-1] = n[i][n[0].length-2];
        }
        for (int i = 1; i < n[i].length-2; i++) {
            contadorPosiciones++;
            arrayCorteza = Arrays.copyOf(arrayCorteza,contadorPosiciones);
            arrayCorteza[contadorPosiciones-1] = n[n.length-2][contadorAtrasJ-i];
        }
        for (int i = 1; i < n.length-1; i++) {
            contadorPosiciones++;
            arrayCorteza = Arrays.copyOf(arrayCorteza,contadorPosiciones);
            arrayCorteza[contadorPosiciones-1] = n[contadorAtrasI-i][1];
        }
        System.out.println(Arrays.toString(arrayCorteza));
    }

    private static void rellernarArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (10+Math.random()*90);
            }
        }
    }
}
