package U4.U4_T1;

import java.util.Arrays;

public class Vivienda {

    private String direccion;
    private double metrosCuadrados;
    private estanciasVivienda[] estancias = new estanciasVivienda[0];


    public Vivienda(String direccion, double metrosCuadrados) {
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
    }

    void anadirEstancia(estanciasVivienda estanciaAnadir){
        this.estancias = Arrays.copyOf(this.estancias, this.estancias.length+1);
        this.estancias[this.estancias.length-1] = estanciaAnadir;
    }

    void eliminarEstancia(int posicion){
        for (int i = 0; i < this.estancias.length-1; i++) {
            if (i >= posicion){
                this.estancias[i] = this.estancias[i+1];
            }
        }
        this.estancias = Arrays.copyOf(this.estancias, this.estancias.length-1);

    }

    public static enum estanciasVivienda{
        SALON,
        COCINA,
        BANHO,
        DORMITORIO,
        TERRAZA,
        VESTIBULO,
        COMEDOR,
        BALCON
    }

    void mostrar_informacion(){
        System.out.println("La direccion de la vivienda es: " + getDireccion());
        System.out.println("La vivienda tiene: " + getMetrosCuadrados()+ " metros cuadrados");
        System.out.println("Sus estancias son: ");
        getEstancias();
    }


    public void getEstancias() {
        for (int i = 0; i < this.estancias.length; i++) {
            System.out.println(this.estancias[i]);
        }
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getMetrosCuadrados() {
        return metrosCuadrados;
    }

    public void setMetrosCuadrados(double metrosCuadrados) {
        this.metrosCuadrados = metrosCuadrados;
    }

    public void setEstancias(estanciasVivienda[] estancias) {
        this.estancias = estancias;
    }

}
