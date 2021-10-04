package U1.T5_II;

//Una pastelería nos ha pedido realizar un programa que haga presupuestos de tartas.
// El programa preguntará primero de qué sabor quiere el usuario la tarta: manzana, fresa o chocolate.
//
//La tarta de manzana vale 18 euros y la de fresa 16. En caso de seleccionar la tarta de chocolate,
// el programa debe preguntar además si el chocolate es negro o blanco; la primera opción vale 14 euros y la segunda 15.
// Por último se pregunta si se añade nata y si se personaliza con un nombre;
// la nata suma 2.50 y la escritura del nombre 2.75.
//
//Ejemplo 1:
//Elija un sabor (manzana, fresa o chocolate): chocolate
//¿Qué tipo de chocolate quiere? (negro o blanco): negro
//¿Quiere nata? (si o no): si
//¿Quiere ponerle un nombre? (si o no): no
//Tarta de chocolate negro: 14,00 €
//Con nata: 2,50 €
//Total: 16,50 €
//
//
//Ejemplo 2:
//Elija un sabor (manzana, fresa o chocolate): manzana
//¿Quiere nata? (si o no): no
//
//¿Quiere ponerle un nombre? (si o no): si
//Tarta de manzana: 18,00 €
//Con nombre: 2,75 €
//Total: 20,75 €
//
//
//Ejemplo 3:
//Elija un sabor (manzana, fresa o chocolate): fresa
//¿Quiere nata? (si o no): si
//¿Quiere ponerle un nombre? (si o no): si
//Tarta de fresa: 16,00 €
//Con nata: 2,50 €
//Con nombre: 2,75 €
//Total: 21,25 €

import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Elija un sabor (manzana, fresa o chocolate): ");
        String saborTarta = teclado.next().toLowerCase();
        double precioTarta = 0;
        double precioNata = 2.5;
        double precioNombre = 2.75;
        if (saborTarta.equalsIgnoreCase("manzana")){
            precioTarta = 18;
        }else if (saborTarta.equalsIgnoreCase("fresa")){
            precioTarta = 16;
        }else {
            System.out.print("¿Qué tipo de chocolate quiere? (negro o blanco): ");
            String tipoChocolate = teclado.next().toLowerCase();
            if (tipoChocolate.equalsIgnoreCase("negro")){
                precioTarta = 14;
            }else {
                precioTarta = 15;
            }
        }
        System.out.print("¿Quiere nata? (si o no): ");
        String nata = teclado.next().toLowerCase();
        System.out.print("¿Quiere ponerle un nombre? (si o no): ");
        String nombre = teclado.next().toLowerCase();
        if (nata.equalsIgnoreCase("si")){
            if (nombre.equalsIgnoreCase("si")){
                System.out.println("Total: "+(precioTarta+precioNata+precioNombre)+" €");
            }else{
                System.out.println("Total: "+(precioTarta+precioNata)+" €");
            }
        }else{
            if (nombre.equalsIgnoreCase("si")){
                System.out.println("Total: "+(precioTarta+precioNombre)+" €");
            }else{
                System.out.println("Total: "+(precioTarta)+" €");
            }
        }
    }
}
