package U5.Examen1920;

public class Metal extends Material{
    private boolean imantable;

    public Metal(String nombre, long masa, int capQuemar, int capDiluir, boolean movible, boolean imantable) {
        super(nombre, masa, capQuemar, capDiluir, movible);
        this.imantable = imantable;
    }
}
