package U4.Entregable_20_21_Manana;

import java.util.Arrays;

public class Empresa {

    private String nombreEmpresa;
    private Departamento[] listaDepartamentos = new Departamento[0];
    private int contadorDepartamentoAnadido = 0;

    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;

    }

    void anadirDepartamento(Departamento departamentoanadir) {
        this.listaDepartamentos = Arrays.copyOf(this.listaDepartamentos, this.listaDepartamentos.length + 1);
        listaDepartamentos[contadorDepartamentoAnadido++] = departamentoanadir;
    }


    public void mostrarListaDepartamentos() {
        for (int i = 0; i < listaDepartamentos.length; i++) {
            System.out.println(listaDepartamentos[i].getNombreDepartamento());
        }
    }
}
