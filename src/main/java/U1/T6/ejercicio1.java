package U1.T6;

//Crea un programa que pida al usuario el número de un mes y escriba el nombre de ese mes.
// Por ejemplo, si el usuario introduce 9, deberá escribir "septiembre".

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero del 1 al 12 para saber el mes correspondiente: ");
        int mes = teclado.nextInt();
        switch (mes){
            case 1: System.out.println("El mes correspondiente es Enero"); break;
            case 2: System.out.println("El mes correspondiente es Febrero"); break;
            case 3: System.out.println("El mes correspondiente es Marco"); break;
            case 4: System.out.println("El mes correspondiente es Abril"); break;
            case 5: System.out.println("El mes correspondiente es Mayo"); break;
            case 6: System.out.println("El mes correspondiente es Junio"); break;
            case 7: System.out.println("El mes correspondiente es Julio"); break;
            case 8: System.out.println("El mes correspondiente es Agosto"); break;
            case 9: System.out.println("El mes correspondiente es Septiembre"); break;
            case 10: System.out.println("El mes correspondiente es Octubre"); break;
            case 11: System.out.println("El mes correspondiente es Noviembre"); break;
            case 12: System.out.println("El mes correspondiente es Diciembre"); break;
        }
    }
}
