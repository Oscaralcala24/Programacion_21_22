package U3.T3;

// Implementar una función sinRepetidos() con el prototipo:
//
//int[] sinRepetidos(int t[])
//
//que construye y devuelve una tabla del tamaño apropiado, con los elementos de t, donde se han eliminado los datos repetidos.

import java.util.Arrays;

public class Ejercicio6 {
    public static void main(String[] args) {
        int [] sinRepetidos = {2,2,5,6,9,9,8};
        ;
        System.out.println(Arrays.toString(sinRepetidos(sinRepetidos)));
    }

    private static int[] sinRepetidos(int[] sinRepetidos) {
        int contadorNumeros = 0;
        int [] arrayDevuelto = new int[contadorNumeros];
        for (int i = 0; i < 10; i++) {
            boolean repetido = false;
            int contadorRepeticion = 0;
            for (int j = 0; j < sinRepetidos.length; j++) {
                if (i == sinRepetidos[j] && contadorRepeticion<1){
                    contadorRepeticion++;
                    contadorNumeros++;
                    arrayDevuelto = Arrays.copyOf(arrayDevuelto,contadorNumeros);
                    arrayDevuelto[contadorNumeros-1] = i;
                }
            }
        }
        return arrayDevuelto;
    }
}
