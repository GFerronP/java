import java.io.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        final String RUTA="texto.txt";
        File f1=new File(RUTA);
        BufferedWriter bw=null;
        try {
            bw=new BufferedWriter(new FileWriter(f1,false));
            bw.write("hola salchicha");
            bw.newLine();
            bw.write("12");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        try {

            FileReader fr=new FileReader(f1);
            int valor=fr.read();
            while (valor!=-1){
                if (valor!= 32) {
                    System.out.print((char) valor);
                }
                valor= fr.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}