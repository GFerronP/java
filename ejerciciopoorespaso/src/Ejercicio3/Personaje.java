package Ejercicio3;

public abstract class Personaje {
    protected String nombre;
    protected String raza;
    public Personaje(String nombre,String raza){
        this.nombre=nombre;
        this.raza=raza;
    }
    public abstract void habEspecial();

    @Override
    public String toString(){
        return nombre+" es de la raza "+raza;
    }

}
