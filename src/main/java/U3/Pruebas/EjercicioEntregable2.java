package U3.Pruebas;

import java.util.Scanner;

public class EjercicioEntregable2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero para pasarlo a morse: ");
        int n = sc.nextInt();
        System.out.println("El codigo morse es : "+convierteEnMorse(n));
    }

    private static String convierteEnMorse(int n) {
        String numero = String.valueOf(n);
        String morse = "";
        for (int i = 0; i < numero.length(); i++) {
            if (numero.charAt(i) == '0'){
                morse = morse+"_____ ";
            }else if (numero.charAt(i) == '1'){
                morse = morse+".____ ";
            }else if (numero.charAt(i) == '2'){
                morse = morse+"..___ ";
            }else if (numero.charAt(i) == '3'){
                morse = morse+"...__ ";
            }else if (numero.charAt(i) == '4'){
                morse = morse+"...._  ";
            }else if (numero.charAt(i) == '5'){
                morse = morse+"..... ";
            }else if (numero.charAt(i) == '6'){
                morse = morse+"_.... ";
            }else if (numero.charAt(i) == '7'){
                morse = morse+"__... ";
            }else if (numero.charAt(i) == '8'){
                morse = morse+"___.. ";
            }else if (numero.charAt(i) == '9'){
                morse = morse+"____. ";
            }
        }
        return morse;
    }
}
