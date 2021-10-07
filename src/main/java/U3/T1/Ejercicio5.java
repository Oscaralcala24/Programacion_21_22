package U3.T1;

//Repetir el ejercicio anterior con una versión que calcule el máximo de 3 números.
// Piensa un poco, no hagas el algoritmo de comparación de los 3 números desde cero.

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce primer numero: ");
        int numeroIntroducido1 = sc.nextInt();
        System.out.print("Introduce segundo numero: ");
        int numeroIntroducido2 = sc.nextInt();
        System.out.print("Introduce tercer numero: ");
        int numeroIntroducido3 = sc.nextInt();
        int numeroAux = numeroMayor(numeroIntroducido2,numeroIntroducido3);
        System.out.println(numeroMayor(numeroIntroducido1,numeroAux));
    }
    static int numeroMayor(int numero1, int numero2){
        if (numero1>numero2){
            return numero1;
        }else {
            return numero2;
        }
    }
}
