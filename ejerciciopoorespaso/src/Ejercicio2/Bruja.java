package Ejercicio2;

public class Bruja extends Personaje implements Magico{

    public Bruja(String nombre){
        super(nombre);
    }
    @Override
    public void lanzaHechizo(String hechizo) {
        System.out.println(nombre + " lanza el hechizo "+hechizo);

    }

    @Override
    public void moverse() {
        System.out.println(nombre+" se teletransporta");

    }
}
