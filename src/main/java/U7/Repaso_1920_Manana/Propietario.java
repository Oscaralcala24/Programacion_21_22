package U7.Repaso_1920_Manana;

import java.io.Serializable;
import java.util.Objects;

public class Propietario implements Serializable {
    private String nombrePropietario;
    private String apellidosPropietario;
    private int numeroSocio;
    private static int contador = 1;
    private String paisOrigen;

    public Propietario(String nombrePropietario, String apellidosPropietario, String paisOrigen) {
        setNombrePropietario(nombrePropietario);
        setApellidosPropietario(apellidosPropietario);
        setPaisOrigen(paisOrigen);
        this.numeroSocio = contador++;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getApellidosPropietario() {
        return apellidosPropietario;
    }

    public void setApellidosPropietario(String apellidosPropietario) {
        this.apellidosPropietario = apellidosPropietario;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public int getNumeroSocio() {
        return numeroSocio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroSocio);
    }

    @Override
    public String toString() {
        return "Propietario{" +
                "nombrePropietario='" + nombrePropietario + '\'' +
                ", numeroSocio=" + numeroSocio +
                '}';
    }
}
