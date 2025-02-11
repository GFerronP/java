package Ejercicio3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Elfo legolas=new Elfo("Legolas");
        Enano gimli =new Enano("Gimli");
        Humano aragon =new Humano("Aragon");

        ArrayList<Personaje> companiaAnillo=new ArrayList<>();
        companiaAnillo.add(legolas);
        companiaAnillo.add(gimli);
        companiaAnillo.add(aragon);

        System.out.println("Miembros compañia del anillo"   );
        for(Personaje personaje:companiaAnillo){
            System.out.println(" - "+personaje.toString());
            personaje.habEspecial();
        }

        companiaAnillo.remove(1);
        System.out.println("Miembros vivos");
        for (Personaje personaje:companiaAnillo){
            System.out.println(" - "+personaje.toString());
        }
    }
}
