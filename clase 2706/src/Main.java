import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn=new Scanner(System.in);
        ArrayList<Persona> personas=new ArrayList<>();

        int numpersonas=0;
        String nombre,apellido,genero;
        int edad;
        System.out.println("Introduce la cantidad de personas");
        numpersonas=scn.nextInt();
        for (int i=0;i<numpersonas;i++){
            System.out.println("introduce el nombre de la persona"(i+1));
            nombre= scn.next();
            System.out.println("introduce el apellido de la persona"(i+1));
            apellido= scn.next();
            System.out.println("introduce el genero de la persona"(i+1));
            genero=scn.next();
            System.out.println("introduce la edad de la persona"(i+1));
            edad= scn.nextInt();
            Persona p=new Persona(nombre,apellido,genero,edad);
            personas.add(p);
        }
    }
}