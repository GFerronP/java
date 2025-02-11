package Ejercicio2;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String ruta;
        System.out.println("intrdoce ruta");
        ruta=scn.next();

        File f =new File(ruta);
        if (f.exists()){
            System.out.println("Existe");
            if (f.isFile()){
                System.out.println("es un fichero");
                System.out.println("nombre"+f.getName());
                System.out.println(" longitud"+f.length());

            } else if (f.isDirectory()) {
                System.out.println("directorio");

            }
        }else {
            System.out.println("No existe");
        }

    }
}
