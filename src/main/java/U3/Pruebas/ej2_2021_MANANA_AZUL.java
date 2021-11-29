package U3.Pruebas;

/*Crear una función insertarValor que:

        Reciba como parámetros un vector de enteros, un valor y una posición
        Devuelva como resultado un vector en el que habremos insertado el valor que le hemos pasado en la posición indicada. De esta manera el vector resultado tendrá un elemento más.
        En caso de que la posición exceda los límites del vector deberá mostrar un error por pantalla y devolver el mismo vector recibido.
        Realizar una llamada a la función mostrando el vector resultado.

        Ejemplo:

        v = { 1 , 2 , 3 , 4 , 5 }

        v1 = invertarValor(v,8,3)

        Entonces v1 será {1,2,3,8,4,5}*/

import java.util.Arrays;
import java.util.Scanner;

public class ej2_2021_MANANA_AZUL {
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
        boolean introducido = false;
        if (posicion<=v.length){
            int [] arrayAux = Arrays.copyOf(v,v.length+1);
            for (int i = 0; i < arrayAux.length; i++) {
                if (posicion!=i){
                    if (introducido){
                        arrayAux[i] = v[i-1];
                    }else {
                        arrayAux[i] = v[i];
                    }

                }else {
                    arrayAux[i] = valor;
                    introducido = true;
                }
            }
            return arrayAux;
        }else {
            System.out.println("Error");
            return v;
        }
    }
}
