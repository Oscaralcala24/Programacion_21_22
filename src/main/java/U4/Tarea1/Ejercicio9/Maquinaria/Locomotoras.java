package U4.Tarea1.Ejercicio9.Maquinaria;

import U4.Tarea1.Ejercicio9.Personal.Mecanicos;

import java.io.Serializable;

public class Locomotoras implements Serializable {
    private String matricula;
    private int potencia;
    private int anoFabricacion;
    private Mecanicos mecanico;

    public Locomotoras(String matricula, int potencia, int anoFabricacion, Mecanicos mecanico) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.anoFabricacion = anoFabricacion;
        this.mecanico = mecanico;
    }

    @Override
    public String toString() {
        return "Locomotoras{" +
                "matricula='" + matricula + '\'' +
                ", potencia=" + potencia +
                ", anoFabricacion=" + anoFabricacion +
                ", mecanico=" + mecanico +
                '}';
    }
}
