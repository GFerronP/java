package Ejercicio2;

public abstract class Personaje {
    protected String nombre;
    public Personaje(String nombre){
        this.nombre=nombre;

    }
    public abstract void moverse();

    public String getNombre() {
        return nombre;
    }
}
