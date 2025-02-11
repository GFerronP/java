import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        //File -> apunta a un fichero
        //FileReader-> lee una linea
        //BufferedReader -> lee todo
        //FileWriter -> escribe en un fichero
        //BufferedWriter-> escribir ficheros con saltos de liinea
        //PrintWriter -> mejora clase con saltos de linea
        //FICHEROS BINARIOS
        //FileInputStream -> leer
        //FileInputStream -> escribir
        System.out.println("Hello world!");


        //LEER
        File f1= new File("tex.txt");
        BufferedReader br=null;
        try {
            FileReader fr = new FileReader(f1);
            br = new BufferedReader(fr);
            String lectura=null;
            while (true){
                if ((lectura=br.readLine())==null){
                    break;
                }
                System.out.println(lectura);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally {
            try {
                br.close();
            }
           catch (IOException e){
                throw new RuntimeException(e);
           }
        }

        //ESCRIBIR

        FileWriter fw =null;
        try  {
            fw=new FileWriter(f1,true);
            if (f1.length()>0){
                fw.write("\n");
            }
            fw.write(String.valueOf(69+"\n"));
            fw.write("toma jeroma");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if (fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
            }
        //BufferedWriter
        File f2=new File("texto.txt");
        BufferedWriter bw=null;
        try {
           bw=new BufferedWriter(new FileWriter(f2,true));
           if (bw != null){
               bw.newLine();
           }
           bw.write("Esto es un ejemplo");
           bw.newLine();
           bw.write("linea dos");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }



        /*File f = new File("ejemplo.ddr");
        FileOutputStream fos=null;
        try {
            fos=new FileOutputStream(f);
            String texto= "Esto es una prueba de ficheros binarios";
            byte[] bytes=texto.getBytes();
            fos.write(bytes);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            fos.close();

        }*/
    }
}