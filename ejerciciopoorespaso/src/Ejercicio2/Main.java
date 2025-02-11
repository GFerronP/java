package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Mago mago= new Mago("Harry");
        Bruja bruja=new Bruja("Hermione");
        mago.lanzaHechizo("Spelliarmus");
        bruja.lanzaHechizo("Lumux maxima");
        mago.moverse();
        bruja.moverse();
    }
}
