package U3.T4;

//Escribe un programa que pida 8 palabras y las almacene en un array.
// A continuación, las palabras correspondientes a colores se deben almacenar alcomienzo
// y las que no son colores a continuación. Puedes utilizar tantos arraysauxiliares como quieras.
// Los colores que conoce el programa deben estar enotro array y son los siguientes:
// verde, rojo, azul, amarillo, naranja, rosa, negro,blanco y morado.

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] palabrasIntroducidas = new String[8];
        String [] colores = {"verde","rojo","azul","amarillo","naranja","rosa","negro","blanco","morado"};
        String [] resultado = new String[8];
        int contadorPalabras = 0;

        for (int i = 0; i < palabrasIntroducidas.length; i++) {
            System.out.println("Introduce palabra "+(i+1)+": ");
            palabrasIntroducidas[i]= sc.nextLine();
         }

        System.out.println(Arrays.toString(palabrasIntroducidas));

        for (int i = 0; i < colores.length; i++) {
            for (int j = 0; j < palabrasIntroducidas.length; j++) {
                if (colores[i].equals(palabrasIntroducidas[j])){
                    resultado[contadorPalabras] = colores[i];
                    contadorPalabras++;
                }
            }
        }

        for (int i = 0; i < palabrasIntroducidas.length; i++) {
            boolean esColor = false;
            for (int j = 0; j < colores.length; j++) {
                if (palabrasIntroducidas[i].equals(colores[j])){
                    esColor = true;
                }
            }
            if (!esColor){
                resultado[contadorPalabras] = palabrasIntroducidas[i];
                contadorPalabras++;

            }
        }
        System.out.println(Arrays.toString(resultado));

    }
}
