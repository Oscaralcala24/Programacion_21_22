package U1.T6;

//Crea un programa que pida un número entero al usuario
// y dé a una variable par el valor 1 si ese número es par o el valor 0 si no es par.
// Hazlo primero con un "if" y luego con un "operador condicional".

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int numero = teclado.nextInt();
        boolean par = true;
        if (numero%2==0){
            par=true;
            System.out.println(par+", es par");
        } else {
            par=false;
            System.out.println(par+", es impar");
        }
    }
}
