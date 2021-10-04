package U1.T5_II;

//Amplía el programa anterior para que diga la nota del boletín (insuficiente, suficiente, bien, notable o sobresaliente).

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double media = 0;
        double sumaNotas=0;
        for (int i = 1; i <= 3; i++) {
            System.out.print("Introduce nota: ");
            double nota = teclado.nextDouble();
            sumaNotas=sumaNotas+nota;
            media=sumaNotas/i;
        }
        if (media<5){
            System.out.println("Insuficiente");
        }else if (media<6){
            System.out.println("Suficiente");
        }else if (media<7){
            System.out.println("Bien");
        }else if (media<9){
            System.out.println("Notable");
        }else if (media<=10){
            System.out.println("Sobresaliente");
        }
    }
}
