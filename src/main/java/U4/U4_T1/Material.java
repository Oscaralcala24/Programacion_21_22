package U4.U4_T1;

public class Material {
    private String descripcion;
    private String proveedor;
    private int unidades;
    private double precio;
    private static int IVA = 21;

    public Material(String descripcion, String proveedor, int unidades, double precio) {
        this.descripcion = descripcion;
        this.proveedor = proveedor;
        if (precio>0 && precio<100000){
            this.precio = precio;
        }else {
            this.precio = 0;
        }
        if (unidades>1 && unidades<1000){
            this.unidades = unidades;
        }else {
            this.unidades = 1;
        }
    }

    public Material(String descripcion, int unidades, double precio) {
        this.descripcion = descripcion;
        if (precio>0 && precio<100000){
            this.precio = precio;
        }else {
            this.precio = 0;
        }
        if (unidades>1 && unidades<1000){
            this.unidades = unidades;
        }else {
            this.unidades = 1;
        }
    }

    void mostrar_informacion(){
        System.out.println("Descripcion: "+ getDescripcion());
        System.out.println("Proveedor: "+ getProveedor());
        System.out.println("Numero de unidades: "+ getUnidades());
        System.out.println("Precio: "+ getPrecio());
        System.out.println("IVA: "+ getIVA());
    }

    public static int getIVA() {
        return IVA;
    }

    public static void setIVA(int IVA) {
        Material.IVA = IVA;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
