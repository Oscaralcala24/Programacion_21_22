package U4.U4_T1;

public class ManoDeObra {
    private String nombreEmpresa;
    private String descripcionTrabajo;
    private double horasRealizadas;
    private int cantidadObreros;

    public ManoDeObra(String nombreEmpresa, String descripcionTrabajo, double horasRealizadas, int cantidadObreros) {
        this.nombreEmpresa = nombreEmpresa;
        this.descripcionTrabajo = descripcionTrabajo;
        this.horasRealizadas = horasRealizadas;
        this.cantidadObreros = cantidadObreros;
    }

    void mostrar_informacion(){
        System.out.println("Esta mano de obra pertenece a la empresa: "+ getNombreEmpresa());
        System.out.println("La funcion de esta mano de obra es: "+ getDescripcionTrabajo());
        System.out.println("La cantidad de obreros de esta mano de obra es: "+ getCantidadObreros());
        System.out.println("Han realizado un total de: "+ getHorasRealizadas()+ " horas");
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDescripcionTrabajo() {
        return descripcionTrabajo;
    }

    public void setDescripcionTrabajo(String descripcionTrabajo) {
        this.descripcionTrabajo = descripcionTrabajo;
    }

    public double getHorasRealizadas() {
        return horasRealizadas;
    }

    public void setHorasRealizadas(double horasRealizadas) {
        this.horasRealizadas = horasRealizadas;
    }

    public int getCantidadObreros() {
        return cantidadObreros;
    }

    public void setCantidadObreros(int cantidadObreros) {
        this.cantidadObreros = cantidadObreros;
    }

}
