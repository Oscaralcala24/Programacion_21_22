package U1.Pruebas;

public class Rombo {
    public static void main(String[] args) {
        int altura = 7;
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura*2; j++) {
                if ((j >= altura-i) && (j <= altura+i)){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
