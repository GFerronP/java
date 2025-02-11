package Ejercicio2;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String ruta;
        System.out.println("Introduce la ruta que quieres consultar");
        ruta= scn.next();

        File f =new File(ruta);
        if (f.exists()){
            System.out.println("El Fichero existe");
            if (f.isDirectory()){
                System.out.println("Es un directorio");
            }else if (f.isFile()){
                System.out.println("Es un fichero");
                System.out.println("Nombre: "+f.getName());
                System.out.println("Tamaño: "+f.length());
                System.out.println("Tiene permisos de lectura "+f.canRead());
                System.out.println("Tiene permisos de escritura "+f.canWrite());
            }
        }else{
            System.out.println("La ruta no corresponde con ningun fichero");
        }
    }
}
