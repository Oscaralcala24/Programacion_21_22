package U8.T2;

public class Equipo {
    private String nombre;
    private String presidente;
    private String estadio;
    private Integer puesto;

    public Equipo(String nombre, String presidente, String estadio, Integer puesto) {
        this.nombre = nombre;
        this.presidente = presidente;
        this.estadio = estadio;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public Integer getPuesto() {
        return puesto;
    }

    public void setPuesto(Integer puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "nombre='" + nombre + '\'' +
                ", presidente='" + presidente + '\'' +
                ", estadio='" + estadio + '\'' +
                ", puesto=" + puesto +
                '}';
    }
}
