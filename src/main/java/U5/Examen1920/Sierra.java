package U5.Examen1920;

public class Sierra extends Herramientas{
    private double diametroSierra;

    public Sierra(String nombre, long masa, int capQuemar, int capDiluir, boolean movible, double diametroSierra) {
        super(nombre, masa, capQuemar, capDiluir, movible);
        this.diametroSierra = diametroSierra;
    }
}
