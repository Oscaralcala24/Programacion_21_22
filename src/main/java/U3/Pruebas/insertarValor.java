package U3.Pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class insertarValor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] v = {3,6,7,4,2,4,5};
        System.out.print("Introduce un valor: ");
        int valor = sc.nextInt();
        System.out.print("Introduce una posicion: ");
        int posicion = sc.nextInt();
        System.out.println(Arrays.toString(insertarValor(v,valor,posicion)));
    }
    private static int[] insertarValor(int[] v, int valor, int posicion) {
        int[] arrayAux = new int[v.length + 1];
        for (int i = 0; i < arrayAux.length; i++) {
            if (i < posicion) {
                arrayAux[i] = v[i];
            } else if (i == posicion) {
                arrayAux[i] = valor;
            } else {
                arrayAux[i] = v[i - 1];
            }
        }
        return arrayAux;
    }
}
