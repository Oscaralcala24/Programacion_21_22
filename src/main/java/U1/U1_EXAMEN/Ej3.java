package U1.U1_EXAMEN;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        long numeroIntroducido = sc.nextLong();
        long numAux = 0;
        int resto = 0;
        long claveCriptografica = 0;
        int restoCripto = 0;
        while (numeroIntroducido>0){
            resto = (int) (numeroIntroducido % 10);
            numeroIntroducido /= 10;
            numAux = (numAux + resto) *10;
        }
        numAux /=10;
        while (numAux>0){
            int sumaCriptografia = 0;
            resto = (int) (numAux % 10);
            numAux /= 10;
            numeroIntroducido = (numeroIntroducido + resto) *10;
            claveCriptografica= (long) (Math.random()*8999+1000);
            System.out.println("La clave criptográfica generada para "+ resto+ " es: " + claveCriptografica);
            while (claveCriptografica>0){
                restoCripto = (int) (claveCriptografica %10);
                claveCriptografica /=10;
                sumaCriptografia=sumaCriptografia+restoCripto;
            }
            System.out.println("La suma de las cifras totales para "+ resto + " es: "+ sumaCriptografia);
        }
    }
}
