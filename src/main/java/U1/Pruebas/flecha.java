package U1.Pruebas;

import java.util.Scanner;

public class flecha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Dime la altura: ");
        int altura = teclado.nextInt();

        while( (altura % 2 !=0) && (altura < 2)){
            System.out.print("Dime la altura: ");
            altura = teclado.nextInt();
        }

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura*2; j++) {
                if (i<=altura/2){
                    if ((j == altura/2 -i) || (j == altura/2 -i +4)){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else {
                    if ((i == altura/2 + j) || (i+4 == altura/2 + j)) {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }
    }
}
