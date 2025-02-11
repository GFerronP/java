import java.io.File;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String ruta = "";

        System.out.println("Introduce la ruta absoluta que quieres consultar");
        ruta = scn.nextLine();
        File directorio = new File(ruta);
        listarDir(directorio);
    }

    static void listarDir(File f) {
        File[] fichero = f.listFiles();
        System.out.println(f.getAbsolutePath());
        for (File item : fichero) {
            System.out.println("\n" + item.getAbsolutePath());
            if (item.isDirectory()) {
                listarDir(item);
            }

        }

    }
}