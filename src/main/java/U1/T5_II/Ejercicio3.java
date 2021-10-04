package U1.T5_II;

//Escribe un programa en que dado un número del 1 a 7 escriba el correspondiente nombre del día de la semana.

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce dia de la semana: ");
        int dia = teclado.nextInt();
        switch (dia){
            case 1: System.out.print("Lunes"); break;
            case 2: System.out.print("Martes"); break;
            case 3: System.out.print("Miercoles"); break;
            case 4: System.out.print("Jueves"); break;
            case 5: System.out.print("Viernes"); break;
            case 6: System.out.print("Sabado");break;
            case 7: System.out.print("Domingo");break;
        }
    }
}
