package U3.T1;

//Realizar una función que calcule y muestre el área o el volumen de un cilindro, según se especifique.
// Para distinguir un caso de otro se le pasará un número 1 (para área) o 2 (para volumen).
// Además, hemos de pasarle a la función el radio de la base y la altura.

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que desea averiguar?\n1. Area.\n2. Volumen.");
        int eleccion = sc.nextInt();
        System.out.print("Introduce radio de la base: ");
        double radioBase = sc.nextDouble();
        System.out.print("Introduce altura:  ");
        double altura = sc.nextDouble();
        calcularAreaVolumen(eleccion,radioBase,altura);
    }
    static void calcularAreaVolumen(int eleccion,double radio, double altura){
        if (eleccion==1){
            System.out.println((2*Math.PI*radio*(altura+radio)));
        }else {
            System.out.println(Math.PI*Math.pow(radio,2)*altura);
        }
    }
}
