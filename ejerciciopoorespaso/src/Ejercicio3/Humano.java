package Ejercicio3;

public class Humano extends Personaje{
    public Humano(String nombre){
        super(nombre,"Humano");
    }

    @Override
    public void habEspecial() {
        System.out.println(nombre+" no tiene hab especial");

    }
}
