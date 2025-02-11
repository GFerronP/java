package Ejercicio2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f = new File("texto.txt");


        BufferedReader br = null;
        FileWriter fw = null;
        PrintWriter pw = null;
        String lectura;
        try {
            fw = new FileWriter(f);
            pw = new PrintWriter(fw, true);
            pw.println("Pascual");
            pw.println("Gomez Ferron");
            pw.println("Dam");


            br = new BufferedReader(new FileReader(f));
            while ((lectura = br.readLine()) != null) {
                System.out.println(lectura);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            pw.close();
        }


    }

}
