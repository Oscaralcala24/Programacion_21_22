package U7.Repaso_1920_Tarde;

import java.io.Serializable;

public class Medico implements Serializable {
    private String nombreMedico;
    private String apellidoMedico;
    private int numeroColegiado;
    private static int contador=1;
    private String hospital;

    public Medico(String nombreMedico, String apellidoMedico, String hospital) {
        setNombreMedico(nombreMedico);
        setApellidoMedico(apellidoMedico);
        setHospital(hospital);
        this.numeroColegiado = contador++;
    }

    public String getNombreMedico() {
        return nombreMedico;
    }

    public void setNombreMedico(String nombreMedico) {
        this.nombreMedico = nombreMedico;
    }

    public String getApellidoMedico() {
        return apellidoMedico;
    }

    public void setApellidoMedico(String apellidoMedico) {
        this.apellidoMedico = apellidoMedico;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getNumeroColegiado() {
        return numeroColegiado;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nombreMedico='" + nombreMedico + '\'' +
                ", apellidoMedico='" + apellidoMedico + '\'' +
                ", numeroColegiado=" + numeroColegiado +
                ", hospital='" + hospital + '\'' +
                '}';
    }
}
