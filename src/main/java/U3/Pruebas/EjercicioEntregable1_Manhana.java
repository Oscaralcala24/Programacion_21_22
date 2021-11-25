package U3.Pruebas;

//Define la función mezcla con la siguiente cabecera:
//
//public static int[] mezcla(int[] a, int[] b)
//
//Esta función toma dos vectores como parámetros y devuelve un array que es el resultado de mezclar los números de ambos de forma alterna,
// se coge unnúmero de a, luego de b, luego de a, etc. Los vectores y b pueden tener longitudes diferentes; por tanto, si se terminan
// los números de un array se terminan de coger todos los que quedan del otro.
//
//Ejemplos:
//
//Si a = {8, 9, 0} y b = {1, 2, 3}, mezcla(a, b) devuelve {8, 1, 9, 2, 0, 3 }
//
//Si a = {4, 3} y b = {7, 8, 9, 10}, mezcla(a, b) devuelve {4, 7, 3, 8, 9, 10}
//
//Si a = {8, 9, 0, 3} y b = {1}, mezcla(a, b) devuelve {8, 1, 9, 0, 3}
//
//Si a = { } y b = {1, 2, 3}, mezcla(a, b) devuelve {1, 2, 3}

import java.util.Arrays;

public class EjercicioEntregable1_Manhana {
    public static void main(String[] args) {
        int [] a = {8, 9, 0, 3};
        int [] b = {1,4,7,3,9,10};
        System.out.println(Arrays.toString(mezcla(a,b)));
    }

    private static int[] mezcla(int[] a, int[] b) {
        int contadorPosiciones = 0;
        int indice_a = 0;
        int indice_b = 0;
        int[] mezcla = new int[0];
        for (int i = 0; i < a.length+b.length; i++) {
            if (indice_a<a.length && indice_b < b.length){
                contadorPosiciones += 2;
                mezcla = Arrays.copyOf(mezcla,contadorPosiciones);
                mezcla [contadorPosiciones-2] = a[indice_a];
                indice_a++;
                mezcla [contadorPosiciones-1] = b[indice_b];
                indice_b++;
            }else if (indice_a < a.length && indice_b == b.length){
                contadorPosiciones++;
                mezcla = Arrays.copyOf(mezcla,contadorPosiciones);
                mezcla [contadorPosiciones-1] = a[indice_a];
                indice_a++;
            }else if (indice_a == a.length && indice_b < b.length){
                contadorPosiciones++;
                mezcla = Arrays.copyOf(mezcla,contadorPosiciones);
                mezcla [contadorPosiciones-1] = b[indice_b];
                indice_b++;
            }
        }
        return mezcla;
    }
}
