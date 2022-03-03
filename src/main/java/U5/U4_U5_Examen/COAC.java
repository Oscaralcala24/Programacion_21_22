package U5.U4_U5_Examen;

import java.util.Arrays;

public class COAC {
    private AgrupacionOficial[] agrupaciones = new AgrupacionOficial[0];


    void inscribir_agrupacion(AgrupacionOficial agrupacion){
        this.agrupaciones = Arrays.copyOf(this.agrupaciones,this.agrupaciones.length+1);
        this.agrupaciones[this.agrupaciones.length-1] = agrupacion;
    }

    boolean eliminar_agrupacion(AgrupacionOficial agrupacion){
        boolean borrado = false;
        int longitudInicial = agrupaciones.length;
        int longitudFinal = 0;
        AgrupacionOficial[] arrayAux = new AgrupacionOficial[0];
        for (int i = 0; i < this.agrupaciones.length; i++) {
            if (this.agrupaciones[i] != agrupacion){
                arrayAux = Arrays.copyOf(arrayAux,arrayAux.length+1);
                arrayAux[arrayAux.length-1] = this.agrupaciones[i];
            }
        }
        this.agrupaciones = Arrays.copyOf(arrayAux,arrayAux.length);
        for (int i = 0; i < arrayAux.length; i++) {
            this.agrupaciones[i] = arrayAux[i];
        }
        longitudFinal = this.agrupaciones.length;
        if (longitudFinal != longitudInicial){
            borrado = true;
        }
        return borrado;
    }


    void ordenar_por_puntos(){
        Arrays.sort(agrupaciones, new OrdenacionPuntos());
    }

    void ordenar_por_autor(){
        Arrays.sort(agrupaciones,new OrdenacionAutor());
    }

    void mostrarArrayAgrupaciones(){
        for (int i = 0; i < this.agrupaciones.length; i++) {
            System.out.println(agrupaciones[i].getNombre());
        }
    }
}
