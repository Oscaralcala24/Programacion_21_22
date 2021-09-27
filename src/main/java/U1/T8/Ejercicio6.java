package U1.T8;

//Escribir todos los múltiplos de 7 menores que 100.

public class Ejercicio6 {
    public static void main(String[] args) {
        for (int i = 7; i < 100 ; i++) {
            if (i%7==0){
                System.out.println(i);
            }
        }
    }
}
