package U9.Docker.Tarea2;

public class Empleado {
    private int numeroEmpleado;
    private String apellido;
    private String nombre;
    private String extension;
    private String email;
    private String codigoOficina;
    private String puesto;
    private int jefeDe;

    public Empleado(int employeeNumber, String lastName, String firstName, String extension, String email, String officeCode, String jobTitle, int reportsTo) {
        this.numeroEmpleado=employeeNumber;
        this.apellido = lastName;
        this.nombre = firstName;
        this.extension = extension;
        this.email = email;
        this.codigoOficina = officeCode;
        this.puesto = jobTitle;
        this.jefeDe = reportsTo;
    }

    @Override
    public String toString() {
        return  "numeroEmpleado=" + numeroEmpleado +
                ", apellido='" + apellido + '\'' +
                ", nombre='" + nombre + '\'' +
                ", extension='" + extension + '\'' +
                ", email='" + email + '\'' +
                ", codigoOficina=" + codigoOficina +
                ", puesto='" + puesto + '\'' +
                ", jefeDe=" + jefeDe +
                "\n";
    }
}
