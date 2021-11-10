package U3.T3;

//Juego: La cámara secreta. El jugador especifica el número de dígitos de la clave secreta.
// La aplicación genera de forma aleatoria, una combinación secreta de n dígitos del 1 al 5
// (siendo n la longitud indicada anteriormente por el usuario).
// El jugador introduce ahora una combinación de prueba. En cada intento se mostrará como pista, para cada dígito,
// si es mayor menor o igual que el correspondiente de la combinación secreta.
//
//Ejemplo:
//
//-Introduzca longitud de la clave
//
//-3
//
//(se genera la clave secreta, por ejemplo 152)
//
//-Intente acertarla
//
//-351
//
//-3 es mayor,
//
// 5 es igual,
//
// 1 es menor
//
//- Intente acertarla de nuevo

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce longitud de la clave: ");
        int longitudClave = sc.nextInt();
        int [] clave = new int[longitudClave];
        int intento = 0;
        int [] claveIntento = new int[longitudClave];
        boolean acierto = true;

        for (int i = 0; i < longitudClave; i++) {
            clave [i] = (int) (Math.random()*5+1);
        }
        do {
            acierto = true;
            for (int i = 0; i < longitudClave; i++) {
                System.out.println("Introduzca numero a numero la clave: ");
                claveIntento[i] = sc.nextInt();
            }
            for (int i = 0; i < longitudClave; i++) {

                if (clave[i]==claveIntento[i]){
                    System.out.println(clave[i] + " " +claveIntento[i] +" son iguales");
                }else if (clave[i]<=claveIntento[i]){
                    System.out.println(claveIntento[i] + " Es mayor");
                    acierto = false;
                }else {
                    System.out.println(claveIntento[i] + " Es menor");
                    acierto = false;
                }
            }
            if (!acierto){
                System.out.println("Intentalo de nuevo");
            }
        }while (!acierto);
        System.out.println("Has acertado");
    }
}









