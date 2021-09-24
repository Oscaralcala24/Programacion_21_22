package U1.T6;

//Se nos pide hacer un programa que pida la usuario el valor del radio de una circunferencia, y a continuación muestre un pequeño menú con 3 opciones:
//
//1.Calcular diámetro
//
//2.Calcular perímetro
//
//3.Calcular área
//
//Dependiendo del número que marque el usuario, deberemos mostrar el resultado correspondiente.
// (diametro=2 x radio) (perímetro=2 x pi x radio) (area=pi x radio x radio)

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce radio de la circunferencia: ");
        double radio = teclado.nextDouble();
        double diametro = 2*radio;
        double perimetro = 2*Math.PI*radio;
        double area = Math.PI*Math.pow(radio,2);
        System.out.println("¿Que desea hacer?");
        System.out.println("1.Calcular diámetro");
        System.out.println("2.Calcular perímetro");
        System.out.println("3.Calcular área");
        int opcion = teclado.nextInt();
        switch (opcion){
            case 1: System.out.println("El resultado es: "+diametro); break;
            case 2: System.out.println("El resultado es: "+perimetro); break;
            case 3: System.out.println("El resultado es: "+area); break;
        }
    }
}
