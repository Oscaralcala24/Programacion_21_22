package U5.Examen1920;

public abstract class Material{


    private String nombre;
    long masa;
    private int capQuemar;
    private int capDiluir;
    private boolean movible;

    public Material(String nombre, long masa, int capQuemar, int capDiluir, boolean movible) {
        this.nombre = nombre;
        setMasa(masa);
        setCapQuemar(capQuemar);
        setCapDiluir(capDiluir);
        this.movible = movible;
    }


    public void setMasa(long masa) {
        if (masa<0 || masa >1000){
            this.masa = 0;
        }else {
            this.masa = masa;
        }
    }

    public void setCapQuemar(int capQuemar) {
        if (capQuemar<0 || capQuemar >100){
            this.capQuemar = 0;
        }else {
            this.capQuemar = capQuemar;
        }
    }

    public void setCapDiluir(int capDiluir) {
        if (capDiluir<0 || capDiluir >100){
            this.capDiluir = 0;
        }else {
            this.capDiluir = capDiluir;
        }
    }


    public long getMasa() {
        return masa;
    }
}
