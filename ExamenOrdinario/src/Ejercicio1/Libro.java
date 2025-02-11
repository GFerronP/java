package Ejercicio1;

public class Libro extends Producto {
    private int anioFabricacion;
    private String tipo;

    public Libro(String nombre, String marca, int anioFabricacion, String tipo) {
        super(nombre, marca);
        this.anioFabricacion = anioFabricacion;
        this.tipo = tipo;

    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void setMarca(String marca) {
        super.setMarca(marca);
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }


    @Override
    public void mostrarDetalle() {
        System.out.println("Nombre:" + getNombre() + " Marca: " + getMarca() + " Año de fabricacion: " + getAnioFabricacion() + " Tipo: " + getTipo());

    }
}
