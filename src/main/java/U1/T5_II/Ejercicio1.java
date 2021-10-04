package U1.T5_II;

//Escribe un programa que pida por teclado un día de la semana
// y que diga qué asignatura toca a primera hora ese día.

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce dia de la semana: ");
        String dia = teclado.next();
        switch (dia){
            case "Lunes": System.out.print("Toca Programacion"); break;
            case "Martes": System.out.print("Toca Base de Datos"); break;
            case "Miercoles": System.out.print("Toca Lenguaje de Marca"); break;
            case "Jueves": System.out.print("Toca Sistemas Informaticos"); break;
            case "Viernes": System.out.print("Toca FOL"); break;
            case "Sabado": System.out.print("Dia libre");break;
            case "Domingo": System.out.print("Dia libre");break;
        }
    }
}
