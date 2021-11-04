package U1.U1_EXAMEN;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        long numeroIntroducido = sc.nextLong();
        long numeroRepetido = numeroIntroducido;
        boolean aparecen;;
        int resto = 0;

        System.out.println("Dígitos que aparecen en el número: ");
        for (int i = 0; i < 10; i++) {
            boolean aparece = false;
            numeroIntroducido = numeroRepetido;
            while (numeroIntroducido>0){
                resto = (int) (numeroIntroducido%10);
                numeroIntroducido = numeroIntroducido/10;
                if (resto == i){
                    aparece=true;
                    break;
                }
            }
            if (aparece){
                System.out.print(i +" ");
            }
        }
        System.out.println();
        System.out.println("Dígitos que no aparecen en el número: ");
        for (int i = 0; i < 10; i++) {
            boolean aparece = false;
            numeroIntroducido = numeroRepetido;
            while (numeroIntroducido>0){
                resto = (int) (numeroIntroducido%10);
                numeroIntroducido = numeroIntroducido/10;
                if (resto == i){
                    aparece=true;
                    break;
                }
            }
            if (!aparece){
                System.out.print(i +" ");
            }
        }
    }
}
