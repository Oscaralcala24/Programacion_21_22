package U4.Tarea1.Ejercicio9.Maquinaria;

class Vagones {
    private final long cargaMaxima;
    private long cargaActual;
    private tipoMercancia tipo;

    Vagones(long cargaMaxima, long cargaActual, tipoMercancia tipo) {
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = cargaActual;
        this.tipo = tipo;
    }
    public void mostrarInformacion(){
        System.out.println(cargaActual+" "+ cargaMaxima+" "+tipo);
    }

    public enum tipoMercancia{
        ALIMENTACION,
        MAQUINARIA,
        LIQUIDOS
    }
}
