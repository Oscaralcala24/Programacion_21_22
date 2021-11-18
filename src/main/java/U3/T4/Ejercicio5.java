package U3.T4;

//Realiza un programa que muestre por pantalla un array de 10 filas por 10 columnas relleno
// con números aleatorios entre 200 y 300. A continuación, el programa debe mostrar los números
// de la diagonal que va desde la esquinas superior izquierda a la esquina inferior derecha,
// así como el máximo, el mínimo y la media de los números que hay en esa diagonal.

import java.util.Arrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int [][] tablaAleatorios = new int[10][10];
        System.out.println("La tabla de numeros aleatorios entre 200 y 300 es: \n");
        rellenaMuestraArray(tablaAleatorios);
        int [] arrayAux = Arrays.copyOf(mostrarDiagonal(tablaAleatorios),10);
        Arrays.sort(arrayAux);
        System.out.println("El numero mas pequeño de la diagonal es: "+arrayAux[0]+"\n");
        System.out.println("El numero mas grande de la diagonal es: "+arrayAux[arrayAux.length-1]+"\n");
        System.out.println("La media de la diagonal es: "+calcularMedia(arrayAux));

    }

    private static double calcularMedia(int[] arrayAux) {
        double resultado = 0;
        for (int i = 0; i < arrayAux.length; i++) {
            resultado = resultado + arrayAux[i];
        }
        return resultado/arrayAux.length;
    }

    private static int[] mostrarDiagonal(int[][] tablaAleatorios) {
        int contador = 0;
        int [] arrayDiagonal = new int[10];
        for (int i = 0; i < tablaAleatorios.length; i++) {
            for (int j = 0; j < tablaAleatorios[i].length; j++) {
                if (tablaAleatorios[contador][contador] == tablaAleatorios[i][j]){
                    arrayDiagonal[contador] = tablaAleatorios [i][j];
                }
            }
            contador++;
        }
        System.out.println();
        System.out.println("Los numeros de la diagonal son: \n");
        System.out.println(Arrays.toString(arrayDiagonal)+"\n");
        return arrayDiagonal;
    }

    private static void rellenaMuestraArray(int[][] tablaAleatorios) {
        for (int i = 0; i < tablaAleatorios.length; i++) {
            for (int j = 0; j < tablaAleatorios[i].length; j++) {
                tablaAleatorios[i][j] = (int) (200 + Math.random()*101);
                System.out.print(" | "+tablaAleatorios[i][j]+" | ");
            }
            System.out.println("\n-------------------------------------------------------------------------------------------");
        }
    }
}
