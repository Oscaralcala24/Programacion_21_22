package U1.T5;

//Crea un programa que contenga una constante llamada gravedad=9,8, solicite al usuario
// el valor de "tiempo", y calcule y muestre la velocidad (velocidad=gravedad x tiempo).
// Nota: si el valor del tiempo es negativo o 0, se mostrará el mensaje "Tiempo incorrecto"

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el valor de tiempo: ");
        double tiempo = teclado.nextDouble();
        double gravedad = 9.8;
        double velocidad = gravedad*tiempo;
        if (velocidad>0){
            System.out.println("El resultado es :"+velocidad);
        } else {
            System.out.println("Tiempo incorrecto");
        }

    }
}
