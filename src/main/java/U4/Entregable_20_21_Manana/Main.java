package U4.Entregable_20_21_Manana;

public class Main {
    public static void main(String[] args) {
        Departamento depart1 = new Departamento("Departamento1","Bormujos",34);
        Departamento depart2 = new Departamento("Departamento2",34);
        Empresa empresa1 = new Empresa("Endesa");
        Departamento depart3 = new Departamento("Departamento3",34);
        Departamento depart4 = new Departamento("Departamento4",34);
        Empleado emple1 = new Empleado("Juan Luis Hernandez Terron","215698742365","603215487", Empleado.tipoEmpleado.ADMINISTRATIVO);
        Empleado emple2 = new Empleado("Pedro José Arroyo Carvajal","215698743265","603645487");
        Empleado emple3 = new Empleado("Antonio Manuel Perejón","215788742365","610215487", Empleado.tipoEmpleado.DIRECTIVO);
        empresa1.anadirDepartamento(depart3);
        empresa1.anadirDepartamento(depart4);
        empresa1.mostrarListaDepartamentos();
        System.out.println();
        depart1.anadirEmpleado(emple1);
        depart1.anadirEmpleado(emple2);
        depart1.anadirEmpleado(emple3);
        depart1.mostrarListaEmpleados();
    }
}
