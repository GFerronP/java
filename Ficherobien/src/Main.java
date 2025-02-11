import java.io.*;

public class Main {
    public static void main(String[] args) {

        File f1 = new File("texto.txt");

        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw=null;
        BufferedWriter bw=null;


        try {
            fr = new FileReader(f1);
            br = new BufferedReader(fr);
            fw= new FileWriter(f1, true);
            bw=new BufferedWriter(new FileWriter(f1,true));
            String lectura = null;
            if(f1.length()>0){
                fw.write("\n");
            }
            fw.write(String.valueOf(69));
            fw.write("\nholamundo");
            bw.newLine();
            bw.write("chanquete a muerto");

            while (true) {
                if ((lectura = br.readLine()) == null) {
                    break;
                }
                System.out.println(lectura);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(fw!=null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            if(bw!=null){
                try {
                    bw.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}