package Ejercicio2;

public class Mago extends Personaje implements Magico{

    public Mago(String nombre){
        super(nombre);
    }
    @Override
    public void lanzaHechizo(String hechizo) {
        System.out.println(nombre + " lanza el hechizo "+hechizo);

    }

    @Override
    public void moverse() {
        System.out.println(nombre+" se mueve rapido");

    }
}
