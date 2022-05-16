package U8.DOM;

import java.util.ArrayList;

public class Comida {
        private String nombre;
        private double precio;
        private String descripcion;
        private int calorias;
        private int id;
        static ArrayList<Comida> arrayComida = new ArrayList<>();

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public double getPrecio() {
            return precio;
        }

        public void setPrecio(double precio) {
            this.precio = precio;
        }

        public String getDescripcion() {
            return descripcion;
        }

        public void setDescripcion(String descripcion) {
            this.descripcion = descripcion;
        }

        public int getCalorias() {
            return calorias;
        }

        public void setCalorias(int calorias) {
            this.calorias = calorias;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "Comida{" +
                    "nombre='" + nombre + '\'' +
                    ", precio=" + precio +
                    ", descripcion='" + descripcion + '\'' +
                    ", calorias=" + calorias +
                    ", id=" + id +
                    '}';
        }
    }
