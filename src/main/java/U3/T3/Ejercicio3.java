package U3.T3;

//Introducir por teclado un número n; a continuación solicitar al usuario que teclee n números.
// Realizar la media de los números positivos, la media de los negativos, y contar el número de ceros introducidos.

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos numeros desea introducir: ");
        int numerosAIntroducir = sc.nextInt();
        int[] numerosIntroducidos = new int[numerosAIntroducir];
        double mediaPositivos = 0;
        int positivos = 0;
        double mediaNegativos = 0;
        int negativos = 0;
        int ceros = 0;
        for (int i = 0; i < numerosAIntroducir; i++) {
            System.out.print("Introduce un numero: ");
            numerosIntroducidos[i] = sc.nextInt();
            if (numerosIntroducidos[i]>0){
                mediaPositivos = mediaPositivos + numerosIntroducidos[i];
                positivos++;
            }else if (numerosIntroducidos[i]<0){
                mediaNegativos = mediaNegativos + numerosIntroducidos[i];
                negativos++;
            }else {
                ceros++;
            }

        }
        System.out.println("La media de los positivos es: "+mediaPositivos/positivos);
        System.out.println("La media de los negativos es: "+mediaNegativos/negativos);
        System.out.println("El numero de ceros es: "+ceros);
    }
}
