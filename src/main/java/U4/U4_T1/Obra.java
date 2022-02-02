package U4.U4_T1;

import java.time.LocalDate;
import java.util.Arrays;

public class Obra {
    private Vivienda viviendaObra;
    private Material[] materialesUsados = new Material[0];
    private ManoDeObra manoDeObraUsada;
    private Vivienda.estanciasVivienda estanciaObra;
    private LocalDate fechaObra = LocalDate.now();

    public Obra(Vivienda viviendaObra, ManoDeObra manoDeObraUsada, Vivienda.estanciasVivienda estanciaObra) {
        this.viviendaObra = viviendaObra;
        this.manoDeObraUsada = manoDeObraUsada;
        this.estanciaObra = estanciaObra;
    }

    void anadirMaterial(Material materialAnadir){
        this.materialesUsados = Arrays.copyOf(this.materialesUsados, this.materialesUsados.length+1);
        this.materialesUsados[this.materialesUsados.length-1] = materialAnadir;

    }

    void eliminarMaterial(int posicion){
        for (int i = 0; i < this.materialesUsados.length-1; i++) {
            if (i >= posicion){
                this.materialesUsados[i] = this.materialesUsados[i+1];
            }
        }
        this.materialesUsados = Arrays.copyOf(this.materialesUsados, this.materialesUsados.length-1);
    }

    void mostrar_informacion(){
        viviendaObra.mostrar_informacion();
        System.out.println();
        for (int i = 0; i < materialesUsados.length; i++) {
            materialesUsados[i].mostrar_informacion();
            System.out.println();
        }
        System.out.println();
        manoDeObraUsada.mostrar_informacion();
        System.out.println();
        System.out.println("La estancia sobre la cual se realiza la obra es: "+ getEstanciaObra());
        System.out.println("La fecha de comienzo de la obra es: "+ getFechaObra());
    }

    public Vivienda getViviendaObra() {
        return viviendaObra;
    }

    public void setViviendaObra(Vivienda viviendaObra) {
        this.viviendaObra = viviendaObra;
    }

    public Material[] getMaterialesUsados() {
        return materialesUsados;
    }

    public void setMaterialesUsados(Material[] materialesUsados) {
        this.materialesUsados = materialesUsados;
    }

    public ManoDeObra getManoDeObraUsada() {
        return manoDeObraUsada;
    }

    public void setManoDeObraUsada(ManoDeObra manoDeObraUsada) {
        this.manoDeObraUsada = manoDeObraUsada;
    }

    public Vivienda.estanciasVivienda getEstanciaObra() {
        return estanciaObra;
    }

    public void setEstanciaObra(Vivienda.estanciasVivienda estanciaObra) {
        this.estanciaObra = estanciaObra;
    }

    public LocalDate getFechaObra() {
        return fechaObra;
    }

    public void setFechaObra(LocalDate fechaObra) {
        this.fechaObra = fechaObra;
    }


}
