package U9.Docker.Tarea2;

public class Oficina {
    private String codigoOficina;
    private String ciudad;
    private String telefono;
    private String direccion1;
    private String direccion2;
    private String estadoCiudad;
    private String pais;
    private String codigoPostal;
    private String territorio;



    public Oficina(String officeCode, String city, String phone, String addressLine1, String addressLine2, String state, String country, String postalCode, String territory) {
        this.codigoOficina = officeCode;
        this.ciudad = city;
        this.telefono = phone;
        this.direccion1 = addressLine1;
        this.direccion2 = addressLine2;
        this.estadoCiudad = state;
        this.pais = country;
        this.codigoPostal = postalCode;
        this.territorio = territory;
    }

    @Override
    public String toString() {
        return  "codigoOficina=" + codigoOficina +
                ", ciudad='" + ciudad + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion1='" + direccion1 + '\'' +
                ", direccion2='" + direccion2 + '\'' +
                ", estadoCiudad='" + estadoCiudad + '\'' +
                ", pais='" + pais + '\'' +
                ", codigoPostal='" + codigoPostal + '\'' +
                ", territorio='" + territorio + '\'' +
                "\n";
    }
}
