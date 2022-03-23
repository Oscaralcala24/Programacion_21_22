package U7.Tarea5;

import java.io.Serializable;

public class Aspirante implements Comparable,Serializable {
    private String nombre;
    private String dni;
    private String telefono;
    private Double media;

    public Aspirante(String nombre, String dni, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    @Override
    public int compareTo(Object o) {
        Aspirante e =  (Aspirante) o;
        return this.nombre.compareTo(e.getNombre());
    }
}
