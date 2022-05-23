package U9.U9_Entregable;

public class Main {
    public static void main(String[] args) {
        Consultas.FiltroPrecio();
        System.out.println("----------------------------------------");
        Consultas.InfoPagos();
        System.out.println("----------------------------------------");
        Consultas.informeCategoria();
        Transacciones.insertarEmpleadoCliente();
        Transacciones.insertarNuevaOficina();
        ConexionDB.closeConnection();
    }
}
