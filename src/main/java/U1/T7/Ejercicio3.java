package U1.T7;

//Realiza un programa que genere una letra minúscula de forma aleatoria.
// Investiga el uso de la función Math.random(). Investiga también sobre el sistema de codificación ASCII
// y ten en cuenta que las letras minúsculas se corresponden con los números del 97 al 122.

public class Ejercicio3 {
    public static void main(String[] args) {
        char letra = (char) (Math.random()*25+97);
        System.out.println(letra);
    }
}
