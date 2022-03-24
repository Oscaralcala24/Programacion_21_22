package U7.Repaso_1920_Tarde;

import java.io.Serializable;

public class Paciente implements Serializable {
    private String nombrePaciente;
    private int edad;
    private double peso;
    private boolean vacunas;
    private Medico medicoAsociado;
    private int numeroCepa;

    public Paciente(String nombrePaciente, int edad, double peso, boolean vacunas, Medico medicoAsociado, int numeroCepa) {
        this.nombrePaciente = nombrePaciente;
        this.edad = edad;
        this.peso = peso;
        this.vacunas = vacunas;
        this.medicoAsociado = medicoAsociado;
        this.numeroCepa = numeroCepa;
    }

    public String getNombrePaciente() {
        return nombrePaciente;
    }

    public void setNombrePaciente(String nombrePaciente) {
        this.nombrePaciente = nombrePaciente;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isVacunas() {
        return vacunas;
    }

    public void setVacunas(boolean vacunas) {
        this.vacunas = vacunas;
    }

    public Medico getMedicoAsociado() {
        return medicoAsociado;
    }

    public void setMedicoAsociado(Medico medicoAsociado) {
        this.medicoAsociado = medicoAsociado;
    }

    public int getNumeroCepa() {
        return numeroCepa;
    }

    public void setNumeroCepa(int numeroCepa) {
        this.numeroCepa = numeroCepa;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombrePaciente='" + nombrePaciente + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vacunas=" + vacunas +
                ", medicoAsociado=" + medicoAsociado +
                ", numeroCepa=" + numeroCepa +
                '}';
    }
}



