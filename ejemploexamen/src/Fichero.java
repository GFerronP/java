import java.io.File;
import java.util.Scanner;

public class Fichero {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        String ruta="";
        System.out.println("Introduce la direccion que quieres consultar");
        ruta= scn.findInLine();

        File f =new File(ruta);
        if (f.exists()){
            System.out.println("La ruta existe");
            if (f.isDirectory()){
                System.out.println("Es un directorio");
            } else if (f.isFile()) {

            }

        }else {
            System.out.println("ruta no valida");
        }


    }
    public void archivo(String ruta){
        File f=new File(ruta);
        String nombre=f.getName();
        int tamano= f.length();
        boolean lectura=f.canRead();
        boolean escritura=f.canWrite();

        System.out.println("El nombre del fichero es: "+nombre);
        System.out.println("El tamaño del fichero es"+tamano);
        if(lectura==true){
            System.out.println("tiene permisos de lectura");
        }else{
            System.out.println("no tiene permisos de lectura");
        }
        if(escritura== true){
            System.out.println("tiene permisos de escritura");
        }else{
            System.out.println("no tiene permisos de escritura");
        }
    }
}
