package U1.T5_II;

//Escribe un programa que calcule el precio final de un producto según su base imponible (precio antes de impuestos),
// el tipo de IVA aplicado (general, reducido o superreducido) y el código promocional.
// Los tipos de IVA general, reducido y superreducido son del 21%, 10% y 4% respectivamente.
// Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan respectivamente
// que no se aplica promoción, el precio se reduce a la mitad, se descuentan 5 euros o se descuenta el 5%.
// El ejercicio se da por bueno si se muestran los valores correctos, aunque los números no estén  tabulados.
//
//
//Ejemplo:
//Introduzca la base imponible: 25
//Introduzca el tipo de IVA (general, reducido o superreducido): reducido
//Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
//Base imponible
//IVA (10%)
//Precio con IVA
//25.00
//2.50
//27.50
//Cód. promo. (mitad): -13.75
//TOTAL
//13.75

import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca la base imponible: ");
        double baseImponible = teclado.nextDouble();
        System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
        String tipoIVA = teclado.next().toLowerCase();
        System.out.print("Introduzca el código promocional (nopro, mitad, meno5 o 5porc): ");
        String promocion = teclado.next().toLowerCase();
        double IVA = 0;
        double descuentoPromo = 0;
        if (tipoIVA.equalsIgnoreCase("general")){
            IVA=0.21;
            if (promocion.equalsIgnoreCase("nopro")){
                descuentoPromo = 0;
                System.out.println("Base imponible: "+baseImponible);
                System.out.println("IVA - 21%: "+(baseImponible*IVA));
                System.out.println("Precio con IVA: "+(baseImponible+baseImponible*IVA));
                System.out.println("Codigo promocional (nopro): "+descuentoPromo);
                System.out.println("Total: "+(baseImponible+(baseImponible*IVA)));
            }else if (promocion.equalsIgnoreCase("mitad")){
                descuentoPromo = 0.5;
                System.out.println("Base imponible: "+baseImponible);
                System.out.println("IVA - 21%: "+(baseImponible*IVA));
                System.out.println("Precio con IVA: "+(baseImponible+(baseImponible*IVA)));
                System.out.println("Codigo promocional (mitad): "+((baseImponible+(baseImponible*IVA))*descuentoPromo));
                System.out.println("Total: "+((baseImponible+baseImponible*IVA)-((baseImponible+baseImponible*IVA)*descuentoPromo)));
            }else if (promocion.equalsIgnoreCase("meno5")){
                descuentoPromo = 5;
                System.out.println("Base imponible: "+baseImponible);
                System.out.println("IVA - 21%: "+baseImponible*IVA);
                System.out.println("Precio con IVA: "+baseImponible+(baseImponible*IVA));
                System.out.println("Codigo promocional (meno5): "+descuentoPromo);
                System.out.println("Total: "+(baseImponible+(baseImponible*IVA)-descuentoPromo));
            }else if (promocion.equalsIgnoreCase("5porc")){
                descuentoPromo = 0.05;
                System.out.println("Base imponible: "+baseImponible);
                System.out.println("IVA - 21%: "+baseImponible*0.21);
                System.out.println("Precio con IVA: "+baseImponible+(baseImponible*IVA));
                System.out.println("Codigo promocional (5porc): "+((baseImponible+(baseImponible*IVA))*descuentoPromo));
                System.out.println("Total: "+((baseImponible+baseImponible*IVA)-((baseImponible+(baseImponible*IVA))*descuentoPromo)));
            }
        }else if (tipoIVA.equalsIgnoreCase("reducido")){
            IVA=0.10;
            if (promocion.equalsIgnoreCase("nopro")){
                descuentoPromo = 0;
                System.out.println("Base imponible: "+baseImponible);
                System.out.println("IVA - 21%: "+(baseImponible*IVA));
                System.out.println("Precio con IVA: "+(baseImponible+baseImponible*IVA));
                System.out.println("Codigo promocional (nopro): "+descuentoPromo);
                System.out.println("Total: "+(baseImponible+(baseImponible*IVA)));
            }else if (promocion.equalsIgnoreCase("mitad")){
                descuentoPromo = 0.5;
                System.out.println("Base imponible: "+baseImponible);
                System.out.println("IVA - 21%: "+(baseImponible*IVA));
                System.out.println("Precio con IVA: "+(baseImponible+(baseImponible*IVA)));
                System.out.println("Codigo promocional (mitad): "+((baseImponible+(baseImponible*IVA))*descuentoPromo));
                System.out.println("Total: "+((baseImponible+baseImponible*IVA)-((baseImponible+baseImponible*IVA)*descuentoPromo)));
            }else if (promocion.equalsIgnoreCase("meno5")){
                descuentoPromo = 5;
                System.out.println("Base imponible: "+baseImponible);
                System.out.println("IVA - 21%: "+baseImponible*IVA);
                System.out.println("Precio con IVA: "+baseImponible+(baseImponible*IVA));
                System.out.println("Codigo promocional (meno5): "+descuentoPromo);
                System.out.println("Total: "+(baseImponible+(baseImponible*IVA)-descuentoPromo));
            }else if (promocion.equalsIgnoreCase("5porc")){
                descuentoPromo = 0.05;
                System.out.println("Base imponible: "+baseImponible);
                System.out.println("IVA - 21%: "+baseImponible*0.21);
                System.out.println("Precio con IVA: "+baseImponible+(baseImponible*IVA));
                System.out.println("Codigo promocional (5porc): "+((baseImponible+(baseImponible*IVA))*descuentoPromo));
                System.out.println("Total: "+((baseImponible+baseImponible*IVA)-((baseImponible+(baseImponible*IVA))*descuentoPromo)));
            }
        }else if (tipoIVA.equalsIgnoreCase("superreducido")){
            IVA=0.04;
            if (promocion.equalsIgnoreCase("nopro")){
                descuentoPromo = 0;
                System.out.println("Base imponible: "+baseImponible);
                System.out.println("IVA - 21%: "+(baseImponible*IVA));
                System.out.println("Precio con IVA: "+(baseImponible+baseImponible*IVA));
                System.out.println("Codigo promocional (nopro): "+descuentoPromo);
                System.out.println("Total: "+(baseImponible+(baseImponible*IVA)));
            }else if (promocion.equalsIgnoreCase("mitad")){
                descuentoPromo = 0.5;
                System.out.println("Base imponible: "+baseImponible);
                System.out.println("IVA - 21%: "+(baseImponible*IVA));
                System.out.println("Precio con IVA: "+(baseImponible+(baseImponible*IVA)));
                System.out.println("Codigo promocional (mitad): "+((baseImponible+(baseImponible*IVA))*descuentoPromo));
                System.out.println("Total: "+((baseImponible+baseImponible*IVA)-((baseImponible+baseImponible*IVA)*descuentoPromo)));
            }else if (promocion.equalsIgnoreCase("meno5")){
                descuentoPromo = 5;
                System.out.println("Base imponible: "+baseImponible);
                System.out.println("IVA - 21%: "+baseImponible*IVA);
                System.out.println("Precio con IVA: "+baseImponible+(baseImponible*IVA));
                System.out.println("Codigo promocional (meno5): "+descuentoPromo);
                System.out.println("Total: "+(baseImponible+(baseImponible*IVA)-descuentoPromo));
            }else if (promocion.equalsIgnoreCase("5porc")){
                descuentoPromo = 0.05;
                System.out.println("Base imponible: "+baseImponible);
                System.out.println("IVA - 21%: "+baseImponible*0.21);
                System.out.println("Precio con IVA: "+baseImponible+(baseImponible*IVA));
                System.out.println("Codigo promocional (5porc): "+((baseImponible+(baseImponible*IVA))*descuentoPromo));
                System.out.println("Total: "+((baseImponible+baseImponible*IVA)-((baseImponible+(baseImponible*IVA))*descuentoPromo)));
            }
        }
    }
}

