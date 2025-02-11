package Ejercicio3;

public class Enano extends Personaje{
    public Enano(String nombre){
        super(nombre,"Enano");
    }

    @Override
    public void habEspecial() {
        System.out.println(nombre+ " sube su resistencia a los golpes");
    }
}
