package Ejercicio1;

public abstract class Producto {
    private String nombre;
    private String marca;

    public Producto() {

    }

    public Producto(String nombre, String marca) {
        this.nombre = nombre;
        this.marca = marca;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public abstract void mostrarDetalle();
}
