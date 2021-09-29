package U1.T8b;

//Escribe un programa que muestre los n primeros términos de la serie de Fibonacci.
// El primer término de la serie de Fibonacci es 0, el segundo es 1 y el resto se calcula sumando los dos anteriores,
// por lo que tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144...
// El número n se debe introducir por teclado.


import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int numeroIntroducido = teclado.nextInt();
        int actual = 0;
        int anterior = 1;
        int copia = 0;
        for (int i = 0; i < numeroIntroducido; i++) {
            System.out.println(actual);
            copia = actual;
            actual = actual+anterior;
            anterior=copia;

        }
    }
}



