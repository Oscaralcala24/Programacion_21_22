package U3.Pruebas;

//Crea una función con la siguiente cabecera:
//public String convierteEnPalabras(int n)
//Esta función convierte los dígitos del número n en las correspondientes palabras y lo devuelve todo en
//una cadena de caracteres. Por ejemplo, el 470213 convertido a palabras sería:
//cuatro, siete, cero, dos, uno, tres
//Utiliza esta función en un programa para comprobar que funciona bien. Desde la función no se debe
//mostrar nada por pantalla, solo se debe usar print desde el programa principal. Fíjate que hay una coma
//detrás de cada palabra salvo al final.

import java.util.Scanner;

public class EjercicioFuncionString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        long n = sc.nextLong();
        String n1 = "hola";
        n1 = "aaa";
        System.out.println(n1);
        String numeroString = String.valueOf(n);
        int anchuraNumero = numeroString.length();
        convierteEnPalabras( numeroString, anchuraNumero);

    }

    static void convierteEnPalabras(String numero, int anchuraNumero){
        for (int i = 0; i < anchuraNumero; i++) {
            String numeroSuelto = String.valueOf(numero.charAt(i));
            switch (numeroSuelto){
                case "0" :
                    System.out.print("cero" + ",");break;
                case "1":
                    System.out.print("uno" + ",");break;
                case "2":
                    System.out.print("dos" + ",");break;
                case "3":
                    System.out.print("tres" + ",");break;
                case "4":
                    System.out.print("cuatro" + ",");break;
                case "5":
                    System.out.print("cinco" + ",");break;
                case "6":
                    System.out.print("seis" + ",");break;
                case "7":
                    System.out.print("siete" + ",");break;
                case "8":
                    System.out.print("ocho" + ",");break;
                case "9":
                    System.out.print("nueve" + ",");break;
            }
        }
    }
}
