package U3.T4;

//Escribe un programa que rellene un array de 100 elementos con números enteros aleatorios comprendidos entre 0 y 500 (ambos incluidos).
// A continuación el programa mostrará el array y preguntará si el usuario quiere destacar el máximo o el mínimo.
// Seguidamente se volverá a mostrar el array escribiendo el número destacado entre dobles asteriscos.
//
//Ejemplo:
//
//459 204 20 250 178 90 353 32 229 357 224 454 260 310 140 249 332 426 423 413 96447 465 298 459 411 118 480 302 417 42 82 126 82
// 474 362 76 190 104 21 257 88 21251 6 383 47 78 392 394 244 494 87 253 376 379 98 364 237 13 299 228 409 402 225426 267 330 243 209
// 426 435 309 356 173 130 416 15 477 34 28 377 193 481 368 466262 422 275 384 399 397 87 218 84 312 480 207 68 108
//
//¿Qué quiere destacar? (1 – mínimo, 2 – máximo): 1
//
//459 204 20 250 178 90 353 32 229 357 224 454 260 310 140 249 332 426 423 413 96447 465 298 459 411 118 480 302 417 42 82 126
// 82 474 362 76 190 104 21 257 88 21251 **6** 383 47 78 392 394 244 494 87 253 376 379 98 364 237 13 299 228 409 402 225 426 267
// 330 243 209 426 435 309 356 173 130 416 15 477 34 28 377 193 481 368 466 262 422 275 384 399 397 87 218 84 312 480 207 68 10

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int [] array500 = new int[100];

        rellenarArray(array500);
        System.out.println(Arrays.toString(array500));

        Scanner sc = new Scanner(System.in);
        System.out.println("¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
        int numeroDestacar = sc.nextInt();

        int numAux = getMaximoMinimo(array500, numeroDestacar);

        String arrayAsteriscos = getStringAsteriscos(array500, numAux);
        System.out.println(arrayAsteriscos);
    }

    private static void rellenarArray(int[] array500) {
        for (int i = 0; i < array500.length; i++) {
            array500[i] = (int) (Math.random()*501);
        }
    }

    private static int getMaximoMinimo(int[] array500, int numeroDestacar) {
        int numeroMayorMenor = 0;
        if (numeroDestacar ==1){
            for (int i = 0; i < array500.length-1; i++) {
                if (array500[i] > array500[i+1]){
                    numeroMayorMenor = array500[i+1];
                }
            }
        }else {
            for (int i = 0; i < array500.length-1; i++) {
                if (array500[i] < array500[i+1]){
                    numeroMayorMenor = array500[i+1];
                }
            }
        }
        return numeroMayorMenor;
    }

    private static String getStringAsteriscos(int[] array500, int numAux) {
        String arrayAsteriscos = "[";
        for (int j : array500) {
            if (j == numAux) {
                arrayAsteriscos = arrayAsteriscos + "**" + j + "**" + ", ";
            } else {
                arrayAsteriscos = arrayAsteriscos + j + ", ";
            }
        }
        return arrayAsteriscos + "]";
    }
}
