package U1.T4;

//El tipo short permite almacenar valores comprendidos entre -32768 y 32767.
// Realiza un programa que muestre si el rango de valores de un tipo se comporta de forma cíclica.
// Es decir, que muestre el valor máximo de una variable de tipo short,
// y muestre también qué ocurre si sumamos 1 a esa variable.

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero 32767, correspondiente al numero maximo de tipo short: ");
        short numero = teclado.nextShort();
        if (numero == 32767) {
            System.out.println("El numero que has introducido es: "+numero);
            numero +=1;
            System.out.println("Si le sumamos 1 al numero introducido, el resultado es : "+numero);
        }
    }
}
