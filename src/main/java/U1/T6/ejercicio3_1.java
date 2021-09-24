package U1.T6;

import java.util.Scanner;

public class ejercicio3_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero entero: ");
        int numero = teclado.nextInt();
        boolean par = (numero%2==0)?true:false;
        System.out.println("Par es: "+par);
    }
}
