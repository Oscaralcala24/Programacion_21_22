package U4.Tarea1.Ejercicio9.Maquinaria;

import U4.Tarea1.Ejercicio9.Personal.Mecanicos;

public class Locomotoras {
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
}
