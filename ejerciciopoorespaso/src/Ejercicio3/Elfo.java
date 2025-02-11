package Ejercicio3;

public class Elfo extends Personaje {
    public Elfo(String nombre){
        super(nombre,"Elfo");
    }

    @Override
    public void habEspecial() {
        System.out.println(nombre+" utiliza vision lejana");
    }
}
