package U6.Tarea1.Ejercicio8;

//Disponemos de dos ficheros perso1.txt y perso2.txt con nombres de personas (ambos ordenados).
// Realizar un programa que lea ambos ficheros y que cree un tercer fichero (todos.txt)
// con todos los nombres ordenados alfabéticamente.

import java.io.*;

public class Ejercicio8 {
    public static void main(String[] args) {
        try{
            BufferedReader out1 = new BufferedReader(new FileReader("C:\\Users\\Oscar\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\Tarea1\\Ejercicio8\\perso1.txt"));
            BufferedReader out2 = new BufferedReader(new FileReader("C:\\Users\\Oscar\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\Tarea1\\Ejercicio8\\perso2.txt"));
            BufferedWriter in = new BufferedWriter(new FileWriter("C:\\Users\\Oscar\\Desktop\\Programacion_21_22\\src\\main\\java\\U6\\Tarea1\\Ejercicio8\\todos.txt",  true));
            String s1 = out1.readLine();
            String s2 = out2.readLine();
            while (s1 != null && s2 != null){
                int resultado = s1.compareTo(s2);
                if (resultado < 0){
                    in.newLine();
                    in.write(s1);
                    s1 = out1.readLine();
                }else if (resultado > 0){
                    in.newLine();
                    in.write(s2);
                    s2 = out2.readLine();
                }else {
                    in.newLine();
                    in.write(s1);
                    in.newLine();
                    in.write(s2);
                    s1 = out1.readLine();
                    s2 = out2.readLine();
                }
                if (s1 == null){
                    while (s2 != null){
                        in.newLine();
                        in.write(s2);
                        s2 = out2.readLine();
                    }
                }
                if (s2 == null){
                    while (s1 != null){
                        in.newLine();
                        in.write(s1);
                        s1 = out1.readLine();
                    }
                }
            }
            in.close();
            out1.close();
            out2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
