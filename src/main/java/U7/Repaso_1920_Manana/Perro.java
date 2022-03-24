package U7.Repaso_1920_Manana;

import java.io.Serializable;
import java.util.Objects;

public class Perro implements Serializable {
    private String nombrePerro;
    private Integer edad;
    private double pesoPerro;
    private boolean vacunas;
    private Propietario propietario;
    private Raza raza;

    public Perro(String nombrePerro, Integer edad, double pesoPerro, boolean vacunas, Propietario propietario, Raza raza) {
        setNombrePerro(nombrePerro);
        setEdad(edad);
        setPesoPerro(pesoPerro);
        setVacunas(vacunas);
        this.propietario = propietario;
        this.raza = raza;
    }

    enum Raza{
        BULLDOG,
        LABRADOR,
        PASTOR_ALEMAN,
        CANICHE,
        HUSKY,
        BOXER;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Perro perro = (Perro) o;
        return Double.compare(perro.pesoPerro, pesoPerro) == 0 && vacunas == perro.vacunas && Objects.equals(nombrePerro, perro.nombrePerro) && Objects.equals(edad, perro.edad) && Objects.equals(propietario, perro.propietario) && raza == perro.raza;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombrePerro, edad, pesoPerro, vacunas, propietario, raza);
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public double getPesoPerro() {
        return pesoPerro;
    }

    public void setPesoPerro(double pesoPerro) {
        this.pesoPerro = pesoPerro;
    }

    public boolean isVacunas() {
        return vacunas;
    }

    public void setVacunas(boolean vacunas) {
        this.vacunas = vacunas;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public Raza getRaza() {
        return raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nombrePerro='" + nombrePerro + '\'' +
                ", edad=" + edad +
                ", pesoPerro=" + pesoPerro +
                ", vacunas=" + vacunas +
                ", propietario=" + propietario +
                ", raza=" + raza +
                '}';
    }
}
