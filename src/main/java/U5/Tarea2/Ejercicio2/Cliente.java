package U5.Tarea2.Ejercicio2;

import java.util.Arrays;
import java.util.Objects;

public class Cliente {


    private String dni, nombre;
    private int edad;
    private long saldo;
    public static Cliente [] arrayCliente = new Cliente[5];


    public Cliente(String dni, String nombre, int edad, long saldo) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return dni.equals(cliente.dni);
    }


    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

    public static Cliente[] getArrayCliente() {
        return arrayCliente;
    }

}
