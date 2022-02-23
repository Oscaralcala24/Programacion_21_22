package U5.Examen1920;

public class Cristal extends Material implements Mezclar{
    private tipoCristal tipo;

    public Cristal(String nombre, long masa, int capQuemar, int capDiluir, boolean movible,tipoCristal tipo) {
        super(nombre, masa, capQuemar, capDiluir, movible);
        this.tipo = tipo;
    }

    @Override
    public void MezclarConMaterial(Material materialMezclar) {
        System.out.println("Cristal de "+materialMezclar);
    }


    enum tipoCristal{
        TRASPARENTE,
        TRANSLUCIDO;
    }
}
