package U7.Repaso_2021_Tarde;

import java.io.Serializable;

public class Alumno implements Serializable {
    private String nombreAlumno;
    private String apellidosAlumno;
    private String dniAlumno;
    private int idAlumno;
    private static int contadorAux = 1;
    private Unidad unidad;

    public Alumno(String nombreAlumno, String apellidosAlumno, String dniAlumno, Unidad unidad) {
        this.nombreAlumno = nombreAlumno;
        this.apellidosAlumno = apellidosAlumno;
        this.dniAlumno = dniAlumno;
        this.idAlumno = contadorAux++;
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombreAlumno='" + nombreAlumno + '\'' +
                ", apellidosAlumno='" + apellidosAlumno + '\'' +
                ", dniAlumno='" + dniAlumno + '\'' +
                ", idAlumno=" + idAlumno +
                ", unidad=" + unidad +
                '}';
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellidosAlumno() {
        return apellidosAlumno;
    }

    public void setApellidosAlumno(String apellidosAlumno) {
        this.apellidosAlumno = apellidosAlumno;
    }

    public String getDniAlumno() {
        return dniAlumno;
    }

    public void setDniAlumno(String dniAlumno) {
        this.dniAlumno = dniAlumno;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public Unidad getUnidad() {
        return unidad;
    }
}
