package U1.U1_Entregable;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        long numeroIntroducido = sc.nextLong();
        System.out.print("Introduzca el salto:");
        long salto = sc.nextLong();
        long numeroAux = 0;
        int resto;
        int contador = 0 ;

        while (numeroIntroducido>0){
            resto = (int) (numeroIntroducido % 10);
            numeroIntroducido= numeroIntroducido/10;
            numeroAux= (numeroAux+resto)*10;
        }
        numeroAux/=10;
        while (numeroAux>0){
            resto = (int) (numeroAux % 10);
            numeroAux = numeroAux / 10;
            if (contador == salto){
                contador = 0;
            }else {
                numeroIntroducido = (numeroIntroducido+resto) * 10;
                contador++;
            }
        }
        numeroIntroducido/=10;
        System.out.println("Resultado: " + numeroIntroducido);
    }
}
