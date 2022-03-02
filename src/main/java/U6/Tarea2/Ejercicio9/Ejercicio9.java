package U6.Tarea2.Ejercicio9;

import U4.Tarea1.Ejercicio9.Maquinaria.Locomotoras;
import U4.Tarea1.Ejercicio9.Maquinaria.Trenes;
import U4.Tarea1.Ejercicio9.Personal.Maquinistas;
import U4.Tarea1.Ejercicio9.Personal.Mecanicos;

import java.io.*;

public class Ejercicio9 {
    public static void main(String[] args) {
        Mecanicos meca1 = new Mecanicos("Oscar", 654564355, Mecanicos.tipoEspecialidad.AERODINAMICA);
        Mecanicos meca2 = new Mecanicos("Juanlu", 65654657, Mecanicos.tipoEspecialidad.FRENOS);
        Locomotoras loco1 = new Locomotoras("kjhtr8",75,1997, meca1);
        Locomotoras loco2 = new Locomotoras("5745dsa",80,1995, meca2);
        Maquinistas maqui1 = new Maquinistas("Pepito","83649849L",1300,2);
        Maquinistas maqui2 = new Maquinistas("Jose","947856493A",1200,1);
        Trenes tren1 = new Trenes(loco1,maqui1);
        Trenes tren2 = new Trenes(loco2,maqui2);

        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U6\\Tarea2\\Ejercicio9\\Trenes.dat",false));
            out.writeObject(tren1);
            out.writeObject(tren2);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("C:\\Users\\se_os\\Escritorio\\Programacion_21_22\\src\\main\\java\\U6\\Tarea2\\Ejercicio9\\Trenes.dat"));
            Trenes tren = (Trenes) in.readObject();
            while (true){
                System.out.println(tren);
                tren = (Trenes) in.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Fin del fichero");
        }
    }
}
