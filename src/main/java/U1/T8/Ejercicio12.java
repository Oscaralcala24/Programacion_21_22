package U1.T8;

//Pedir 5 calificaciones de alumnos.
// El programa debe decir, al final, si hay algún suspenso o no lo hay.
// Nota: cuidado, si hay 2 suspensos, no debe decirlo dos veces.

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        boolean suspenso = false;
        for (int i = 1; i <= 5; i++) {
            System.out.println("Introduce nota "+i+":");
            double nota = teclado.nextDouble();
            if (nota<5){
                suspenso = true;
            }
        }
        if (suspenso==true){
            System.out.println("Ha suspendido algun alumno");
        } else{
            System.out.println("No ha suspendido ningun alumno");
        }
    }
}
