package U8.Tarea1Json;

import java.util.Arrays;

public class Futbolista {
    private int dorsal;
    private String nombre;
    private String[] posicionesPosibles;
    private String equipo;

    public Futbolista(int dorsal, String nombre, String[] posicionesPosibles, String equipo) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.posicionesPosibles = posicionesPosibles;
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Futbolista{" +
                "dorsal=" + dorsal +
                ", nombre='" + nombre + '\'' +
                ", posicionesPosibles=" + Arrays.toString(posicionesPosibles) +
                ", equipo='" + equipo + '\'' +
                '}';
    }

    public String[] getPosicionesPosibles() {
        return posicionesPosibles;
    }

    public void setPosicionesPosibles(String[] posicionesPosibles) {
        this.posicionesPosibles = posicionesPosibles;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
}
