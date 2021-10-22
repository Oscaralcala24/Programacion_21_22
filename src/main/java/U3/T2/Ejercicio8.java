package U3.T2;

//Los habitantes de Javalandia tienen un idioma algo extraño; cuando hablan siempre comienzan sus frases con
// "Javalín, javalón", para después hacer una pausa más o menos larga (la pausa se representa mediante espacios en blanco)
// y a continuación expresan el mensaje. Existe un dialecto que no comienza sus frases con la muletilla anterior,
// pero siempre las terminan con un silencio, más o menos prolongado y la coletilla "javalén, len, len".
// Se pide diseñar un traductor que, en primer lugar,nos diga si la frase está escrita en el idioma de Javalandia
// (en cualquiera de sus dialectos), y en caso afirmativo, nos muestre el mensaje sin muletillas.

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca una frase: ");
        String fraseIntroducida = sc.nextLine();
        String dialecto1 = "Javalín, javalón";
        String dialecto2 = "javalén, len, len";
        int anchuraDialecto1 = dialecto1.length();
        int anchuraDialecto2 = dialecto2.length();
        int anchuraFraseIntroducida = fraseIntroducida.length();
        if ((anchuraFraseIntroducida>anchuraDialecto2) || (anchuraFraseIntroducida>anchuraDialecto1)){
            if (dialecto1.equalsIgnoreCase(fraseIntroducida.substring(0,anchuraDialecto1))){
                System.out.println("Esta escrito en idioma de javalandia");
                System.out.println(fraseIntroducida.substring(anchuraDialecto1,anchuraFraseIntroducida).trim());
            }else if (dialecto2.equalsIgnoreCase(fraseIntroducida.substring(anchuraFraseIntroducida-anchuraDialecto2,anchuraFraseIntroducida))){
                System.out.println("Esta escrito en idioma de javalandia");
                System.out.println(fraseIntroducida.substring(0,anchuraFraseIntroducida-anchuraDialecto2).trim());
            }else {
                System.out.println("No esta escrito en idioma de javalandia");
                System.out.println(fraseIntroducida);
            }
        }else {
            System.out.println("No esta escrito en idioma de javalandia");
            System.out.println(fraseIntroducida);
        }
    }
}
