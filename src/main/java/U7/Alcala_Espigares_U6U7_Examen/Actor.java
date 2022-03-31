package U7.Alcala_Espigares_U6U7_Examen;

import java.io.Serializable;
import java.util.Objects;

public class Actor implements Comparable<Actor>, Serializable {

    private String nombre;
    private String apellido;
    private String nacionalidad;
    private int idActor;
    private static int contador = 0;

    public Actor(String nombre, String apellido, String nacionalidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.idActor = contador++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return nombre.equals(actor.nombre) && apellido.equals(actor.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, apellido);
    }

    public int getIdActor() {
        return idActor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }

    @Override
    public int compareTo(Actor o) {
        return getApellido().compareTo(o.apellido);
    }
}
