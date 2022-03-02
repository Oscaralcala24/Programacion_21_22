package U4.Tarea1.Ejercicio9.Personal;

import java.io.Serializable;

public class Maquinistas implements Serializable {
    private String nombreMaquinista;
    private String DNIMaquinista;
    private double sueldoMensual;
    private int rango;

    public Maquinistas(String nombreMaquinista,String DNI,double sueldoMensual,int rango){
        this.nombreMaquinista = nombreMaquinista;
        this.DNIMaquinista = DNI;
        this.sueldoMensual = sueldoMensual;
        this.rango = rango;
    }

    @Override
    public String toString() {
        return "Maquinistas{" +
                "nombreMaquinista='" + nombreMaquinista + '\'' +
                ", DNIMaquinista='" + DNIMaquinista + '\'' +
                ", sueldoMensual=" + sueldoMensual +
                ", rango=" + rango +
                '}';
    }
}
