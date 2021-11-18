package U1.T8b;

//Realiza una programa que calcule las horas transcurridas entre dos horas de dos días de la semana.
// No se tendrán en cuenta los minutos ni los segundos. El día de la semana se puede pedir como un número (del 1 al 7)
// o como una cadena (de lunes a domingo).
// Se debe comprobar que el usuario introduce los datos correctamente y que el segundo día es posterior al primero.


import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int diaSemana1 = 0;
        int horaDia1 = 0;
        int diaSemana2 = 0;
        int horaDia2 = 0;
        while ((diaSemana1<1) || (diaSemana1>7) || (diaSemana2<1) || (diaSemana2>7) || (diaSemana1>diaSemana2)){
            System.out.println("Introduce dia de la semana: ");
            diaSemana1 = teclado.nextInt();
            System.out.println("Introduce hora: ");
            horaDia1 = teclado.nextInt();
            System.out.println("Introduce dia de la semana: ");
            diaSemana2 = teclado.nextInt();
            System.out.println("Introduce hora: ");
            horaDia2 = teclado.nextInt();
        }
        int diferenciaDias= diaSemana2-diaSemana1;
        int horasDiaDiferencia = diferenciaDias*24;
        if (horaDia1>horaDia2){
            horasDiaDiferencia= horasDiaDiferencia-(horaDia1-horaDia2);
        } else if (horaDia2>horaDia1){
            horasDiaDiferencia= horasDiaDiferencia+(horaDia1-horaDia2);
        }
        System.out.println(horasDiaDiferencia+" Horas de diferencia");
    }
}

