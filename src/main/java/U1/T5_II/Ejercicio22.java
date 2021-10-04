package U1.T5_II;

//La tienda online BanderaDeEspaña.es vende banderas personalizadas de la máxima calidad y nos ha pedido hacer
// un configurador que calcule el precio según el alto y el ancho. El precio base de una bandera es de un céntimo de
//euro el centímetro cuadrado. Si la queremos con un escudo bordado, el precio se incrementa en 2.50 €
// independientemente del tamaño. Los gastos de envío son 3.25 €. El IVA ya está incluido en todas las tarifas.
//
//Ejemplo 1:
//Introduzca la altura de la bandera en cm: 20
//Ahora introduzca la anchura: 35
//¿Quiere escudo bordado? (s/n): n
//Gracias. Aquí tiene el desglose de su compra.
//Bandera de 700 cm2: 7,00 €
//Sin escudo: 0,00 €
//Gastos de envío: 3,25 €
//Total: 10,25 €
//
//
//Ejemplo 2:
//Introduzca la altura de la bandera en cm: 10
//Ahora introduzca la anchura: 15
//¿Quiere escudo bordado? (s/n): s
//Gracias. Aquí tiene el desglose de su compra.
//Bandera de 150 cm2: 1,50 €
//Con escudo:2,50 €
//Gastos de envío:3,25 €
//Total:7,25

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca la altura de la bandera en cm: ");
        int alturaBandera = teclado.nextInt();
        System.out.print("Ahora introduzca la anchura: ");
        int anchuraBandera = teclado.nextInt();
        System.out.print("¿Quiere escudo bordado? (s/n): ");
        String bordado = teclado.next().toLowerCase();
        boolean bordadoboolean = (bordado.equalsIgnoreCase("s")?true:false);
        double envio = 3.25;
        double precioFinal = alturaBandera*anchuraBandera;
        precioFinal = precioFinal/100;
        precioFinal = precioFinal+envio;
        if (bordadoboolean==true){
            precioFinal = precioFinal+2.5;
        }
        System.out.println("Total: "+precioFinal);
    }
}
