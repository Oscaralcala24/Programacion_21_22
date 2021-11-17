package U3.T3;

//Escribir la función rellenaPares() a la que se le pasa como parámetro una tabla unidimensional que debe rellenar de la siguiente forma:
// se leerá por teclado una serie de números, guardando en la tabla los pares hasta que esté llena, e ignorando los impares.
// La función tiene que devolver la cantidad de impares desechados.

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int [] arrayPares = new int[5];
        System.out.println("El numero de impares desechados es: " + rellenaPares(arrayPares));
    }

    private static int rellenaPares(int[] arrayPares) {
        int contadorImpares = 0;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrayPares.length; i++) {
            System.out.print("Introduce un numero: ");
            int numeroIntroducido = sc.nextInt();
            if (numeroIntroducido%2==0){
                arrayPares[i]=numeroIntroducido;
            }else {
                i--;
                contadorImpares++;
            }
        }
        return contadorImpares;
    }
}
