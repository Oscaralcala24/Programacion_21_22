package U1.T5_II;

//Realiza un programa que, dado un día de la semana (de lunes a viernes) y una hora (horas y minutos),
// calcule cuántos minutos faltan para el fin de semana. Se considerará que el fin de semana comienza el
// viernes a las 15:00h.
// Se da por hecho que el usuario introducirá un día y hora correctos, anterior al viernes a las 15:00h

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un dia de la semana: ");
        String dia = teclado.next().toLowerCase();
        System.out.print("Introduce hora: ");
        int hora = teclado.nextInt();
        System.out.print("Introduce minutos: ");
        int minutos = teclado.nextInt();
        int sumaMinutos=0;
        int minutosTotales=6660;
        switch (dia){
            case "lunes":
                sumaMinutos=(hora*60)+(minutos);
                System.out.println("Quedan "+(minutosTotales-sumaMinutos)+" para el fin de semana");break;
            case "martes":
                sumaMinutos=(24)+(hora*60)+(minutos);
                System.out.println("Quedan "+(minutosTotales-sumaMinutos)+" para el fin de semana");break;
            case "miercoles":
                sumaMinutos=(48)+(hora*60)+(minutos);
                System.out.println("Quedan "+(minutosTotales-sumaMinutos)+" para el fin de semana");break;
            case "jueves":
                sumaMinutos=(72)+(hora*60)+(minutos);
                System.out.println("Quedan "+(minutosTotales-sumaMinutos)+" para el fin de semana");break;
            case "viernes":
                sumaMinutos=(96)+(hora*60)+(minutos);
                System.out.println("Quedan "+(minutosTotales-sumaMinutos)+" para el fin de semana");break;

        }
    }
}
