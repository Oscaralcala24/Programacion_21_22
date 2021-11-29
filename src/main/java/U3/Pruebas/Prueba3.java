package U3.Pruebas;

//Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga
//lo que se especifica en los comentarios:
//
//public int[] filtraCon7(int x[]) // Devuelve un array con todos los números
//                                 // que contienen el 7 (por ej. 7, 27, 782)
//                                 // que se encuentren en otro array que se
//                                 // pasa como parámetro. El tamaño del array
//                                 // que se devuelve será menor o igual al
//                                // que se pasa como parámetro.
//
//Utiliza esta función en un programa para comprobar que funcionan bien. Para
//que el ejercicio resulte más fácil, las repeticiones de números que contienen
//7 se conservan; es decir, si en el array x el número 875 se repite 3 veces, en
//el array devuelto también estará repetido 3 veces. Si no existe ningún número
//que contiene 7 en el array x, se devuelve un array con el número -1 como único
//elemento.

import java.util.Arrays;

public class Prueba3 {
    public static void main(String[] args) {
        int [] array = {7,8,12,17,5,37,745,2};
        System.out.println(Arrays.toString(filtraCon7(array)));
    }

    private static int[] filtraCon7(int[] x) {
        int [] arrayConSietes = new int[0];
        for (int i = 0; i < x.length; i++) {
            int numeroComprobar = x[i];
            if (comprobar7(numeroComprobar)){
                arrayConSietes = Arrays.copyOf(arrayConSietes, arrayConSietes.length+1);
                arrayConSietes[arrayConSietes.length-1] = x[i];
            }
            if (arrayConSietes.length==0){
                arrayConSietes = Arrays.copyOf(arrayConSietes, arrayConSietes.length+1);
                arrayConSietes[arrayConSietes.length-1] = -1;
            }
        }
        return arrayConSietes;
    }

    private static boolean comprobar7(int numeroComprobar) {

        boolean tiene7 = false;
        int resto = 0;
        while (numeroComprobar>0){
            resto = numeroComprobar % 10;
            if (resto==7){
                tiene7=true;
                break;
            }else {
                numeroComprobar/=10;
            }
        }
        return tiene7;
    }
}
