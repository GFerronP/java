import java.io.*;

public class Main {
    public static void main(String[] args) {

        File f1=new File("ejemplo.ddr");

        FileInputStream fis=null;
        FileOutputStream fos=null;
        DataOutputStream dos=null;
        DataInputStream dis=null;
        try {
            fis=new FileInputStream(f1);
            fos=new FileOutputStream(f1,true);
            dos=new DataOutputStream(fos);
            dis=new DataInputStream(fis);

            /*String texto="estp es una prueba de ficheros binarios";
            byte[]bytes=texto.getBytes();
            fos.write(bytes);*/

            dos.writeInt(32);
            dos.writeUTF("pandero");


            /*int valor=fis.read();
            while(valor!=-1){
                System.out.print((char) valor);
                valor=fis.read();
            }*/
            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fos.close();
                dos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}