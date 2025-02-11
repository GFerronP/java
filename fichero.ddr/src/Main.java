import java.io.*;

public class Main {
    public static void main(String[] args) {
        File f =new File("ejemplo.ddr");
        FileOutputStream fos=null;
        FileInputStream fis=null;
        DataInputStream dis=null;
        DataOutputStream dos=null;
        try {
            fos= new FileOutputStream(f);
            fis=new FileInputStream(f);
            dos= new DataOutputStream(fos);
            dis= new DataInputStream(fis);
            dos.writeInt(69);
            dos.writeUTF("hola");
            dos.writeInt(12);




            System.out.println(dis.readInt());
            System.out.println(dis.readUTF());
            System.out.println(dis.readInt());

            String  texto = "Esto es un ejemplo con ficheros binarios";
            byte [] bytes =texto.getBytes();
            fos.write(bytes);

            int valor= fis.read();
            while (valor!= -1){
                System.out.print((char)valor);
                valor= fis.read();
            }


        } catch (FileNotFoundException e) {
            System.out.println("Error no encuentra el fichero");
        } catch (IOException e) {
            System.out.println("Error E/S");
        }
        finally {
            if (dos!=null) {
                try {
                    dos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if (fos!=null){
                try {
                    fos.flush();
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}