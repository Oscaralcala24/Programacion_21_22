package U6.Tarea1.Ejercicio4;


//Realizar un programa que lea un fichero de texto llamado carta.txt,
// tenemos que contar los caracteres, las líneas y las palabras. Para facilitar
// el procesamiento supondremos que cada palabra está separada de otra por un único espacio en blanco.


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio4 {
    public static void main(String[] args) {
        int contadorCaracteres = 0;
        int contadorFilas = 0;
        int contadorPalabras = 0;
        try {
            FileReader in = new FileReader("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U6\\Tarea1\\Ejercicio4\\carta.txt");
            BufferedReader inBR = new BufferedReader(new FileReader("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U6\\Tarea1\\Ejercicio4\\carta.txt"));
            int c = in.read();
            String texto = "";
            while (c != -1){
                texto = String.valueOf((char) c);
                if(texto.equalsIgnoreCase(" ")){
                    contadorPalabras++;
                    contadorCaracteres++;
                }
                else {
                    contadorCaracteres++;
                }
                c = in.read();
            }
            String c1 = inBR.readLine();
            while (c1 != null){
                contadorFilas++;
                contadorPalabras++;
                contadorCaracteres--;
                c1 = inBR.readLine();
            }
            System.out.println("Numero de caracteres: "+(contadorCaracteres));
            System.out.println("Numero de palabras: "+(contadorPalabras));
            System.out.println("Numero de filas: "+contadorFilas);
            in.close();
            inBR.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
