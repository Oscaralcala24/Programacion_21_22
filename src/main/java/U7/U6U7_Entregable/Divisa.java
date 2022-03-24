package U7.U6U7_Entregable;

import java.io.Serializable;

public abstract class Divisa implements Serializable {
    private int id;
    private static int contador = 1;
    private String nombre;
    private String simbolo;

    public Divisa(String nombre, String simbolo) {
        this.nombre = nombre;
        this.simbolo = simbolo;
        this.id = contador++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    @Override
    public String toString() {
        return "Divisa{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", simbolo='" + simbolo + '\'' +
                '}';
    }
}
