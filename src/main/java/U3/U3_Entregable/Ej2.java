package U3.U3_Entregable;

//Desarrollar una función que se denomine insertarEnVector con el siguiente prototipo:
//
//public static int[] insertarEnVector(int[] v1, int [] v2, int pos)
//Recibirá como parámetros dos vectores de enteros y una posición.
// Devolverá un vector de enteros que contenga el primer array con el segundo array insertado de manera completa a partir de la posición dada. Si la posición es menor que 0, el vector devuelto deberá contener el primer array. Si la posición es mayor que la longitud del primer array, el vector devuelto deberá contener el segundo array. Si la posición es igual a la longitud del primer array, el vector devuelto deberá contener
// el primer array con el segundo array insertado al final. Probar dicha función en el método Main.

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int[] v1 = {2,6,4,7,3,3};
        int [] v2 = {6,4,7,8,4,2};
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una posicion: ");
        int pos = sc.nextInt();
        System.out.println(Arrays.toString(insertarEnVector(v1,v2,pos)));
    }

    private static int[] insertarEnVector(int[] v1, int[] v2, int pos) {
        int[] arrayAux = new int[v1.length+ v2.length];
        if (pos<0){
            return v1;
        }else if (pos> v1.length){
            return v2;
        }else if (pos == v1.length){
            for (int i = 0; i < v1.length; i++) {
                arrayAux[i] = v1[i];
            }
            for (int i = 0; i < v2.length; i++) {
                arrayAux[v1.length+i] = v2[i];
            }
        }else {
            for (int i = 0; i < pos; i++) {
                arrayAux[i] = v1[i];
            }
            for (int i = 0; i < v2.length; i++) {
                arrayAux[i+pos] = v2[i];
            }
            for (int i = 0; i < v1.length-pos; i++) {
                arrayAux[v2.length+pos+i] = v1[i+pos];
            }
        }
        return arrayAux;
    }
}
