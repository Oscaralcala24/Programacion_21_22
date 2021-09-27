package U1.T8;

//Pedir un número n y dibujar un triángulo rectángulo de n elementos de lado, utilizando para ello asteriscos (*). Por ejemplo, para n=4:
//
//* * * *
//
//* * *
//
//* *
//
//*

import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce altura del triangulo: ");
        int alturaTriangulo = teclado.nextInt();
        for (int i = 0; i <= alturaTriangulo; i++) {
            System.out.println();
            for (int j = 0; j < alturaTriangulo-i; j++) {
                System.out.print("*");
            }
        }
    }
}
