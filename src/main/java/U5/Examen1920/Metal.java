package U5.Examen1920;

public class Metal extends Material implements Mezclar{
    private boolean imantable;

    public Metal(String nombre, long masa, int capQuemar, int capDiluir, boolean movible, boolean imantable) {
        super(nombre, masa, capQuemar, capDiluir, movible);
        this.imantable = imantable;
    }

    @Override
    public void MezclarConMaterial(Material materialMezclar) {
        System.out.println("Metal de "+materialMezclar);
    }
}
