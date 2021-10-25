package U1.U1_Entregable;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de hamburguesas básicas: ");
        int numBasica = sc.nextInt();
        System.out.print("Número de hamburguesas gourmet: ");
        int numGourmet = sc.nextInt();
        System.out.print("Día de la semana:");
        String diaSemana = sc.next();
        System.out.print("¿Pertenece al club Fanegas? (s/n): ");
        String club = sc.next();

        if (club.equalsIgnoreCase("s")){
            double descuento = 0.12;
            if (diaSemana.equalsIgnoreCase("martes")){
                if (numGourmet<=1){
                    System.out.println("Total: "+  ((numGourmet*5)+(numBasica*3)));
                    System.out.println("Descuento: "+ ((numGourmet*5)+(numBasica*3)*descuento));
                    System.out.println("A pagar: "+ (((numGourmet*5)+(numBasica*3)-((((numGourmet*5)+(numBasica*3)))*descuento))));
                }else if ((numGourmet<1) && (numGourmet%2==0)){
                    numGourmet/=2;
                    System.out.println("Total: "+  ((numGourmet*9)+(numBasica*3)));
                    System.out.println("Descuento: "+ (((numGourmet*9)+(numBasica*3))*descuento));
                    System.out.println("A pagar: "+ (((numGourmet*9)+(numBasica*3)-((((numGourmet*9)+(numBasica*3)))*descuento))));
                }else {
                    numGourmet/=2;
                    System.out.println("Total: "+  ((numGourmet*9)+(9)+(numBasica*3)));
                    System.out.println("Descuento: "+ (((numGourmet*9)+(9)+(numBasica*3))*descuento));
                    System.out.println("A pagar: "+ (((numGourmet*9)+(9)+(numBasica*3)-(((numGourmet*9)+(9)+(numBasica*3))*descuento))));
                }
            } else if (diaSemana.equalsIgnoreCase("miercoles")) {
                System.out.println("Total: "+  (((numGourmet*5)+(numBasica*2))));
                System.out.println("Descuento: "+ (((numGourmet*5)+(numBasica*2))*descuento));
                System.out.println("A pagar: "+ (((numGourmet*5)+(numBasica*2)-(((numGourmet*5)+(numBasica*2))*descuento))));
            }else {
                System.out.println("Total: "+  (((numGourmet*5)+(numBasica*3))));
                System.out.println("Descuento: "+ (((numGourmet*5)+(numBasica*3))*descuento));
                System.out.println("A pagar: "+ (((numGourmet*5)+(numBasica*3)-((((numGourmet*5)+(numBasica*3)))*descuento))));
            }
        } else if (club.equalsIgnoreCase("n")) {
            if (diaSemana.equalsIgnoreCase("martes")){
                if (numGourmet<=1){
                    System.out.println("Total: "+  (((numGourmet*5)+(numBasica*3))));
                    System.out.println("Descuento: "+ 0);
                    System.out.println("A pagar: "+ (((numGourmet*5)+(numBasica*3))));
                }else if ((numGourmet<1) && (numGourmet%2==0)){
                    numGourmet/=2;
                    System.out.println("Total: "+  (((numGourmet*9)+(numBasica*3))));
                    System.out.println("Descuento: "+ 0);
                    System.out.println("A pagar: "+ (((numGourmet*9)+(numBasica*3))));
                }else {
                    numGourmet/=2;
                    System.out.println("Total: "+  (((numGourmet*9)+(9)+(numBasica*3))));
                    System.out.println("Descuento: "+ 0);
                    System.out.println("A pagar: "+ (((numGourmet*9)+(9)+(numBasica*3))));
                }
            } else if (diaSemana.equalsIgnoreCase("miercoles")) {
                System.out.println("Total: "+  (((numGourmet*5)+(numBasica*2))));
                System.out.println("Descuento: "+ 0);
                System.out.println("A pagar: "+ (((numGourmet*5)+(numBasica*2))));
            }else {
                System.out.println("Total: "+  (((numGourmet*5)+(numBasica*3))));
                System.out.println("Descuento: "+ 0);
                System.out.println("A pagar: "+ (((numGourmet*5)+(numBasica*3))));
            }
        }
    }
}
