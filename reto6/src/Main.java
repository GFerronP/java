import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        File f=new File("file.txt");
        BufferedReader br;
        BufferedWriter bw=null;
        Scanner scn=new Scanner(System.in);

        int numale=(int) (Math.random()*21);
        int num;
        int cont=0;
        String lectura;
        int record;


        try {
            br=new BufferedReader(new FileReader(f));
            lectura=br.readLine();
            record =Integer.parseInt(lectura);
            System.out.println("El record actual es "+record);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        do{
            System.out.println("Introduce el valor:");
            num=scn.nextInt();
            cont++;

        }while (num!=numale);

        System.out.println("Acertaste en el intento: "+cont);
        if (cont<record){
            System.out.println("Felicidades hiciste un record");
            try {
                String nuerec=Integer.toString(cont);
                bw=new BufferedWriter(new FileWriter(f,false));
                bw.write(nuerec);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }finally {
                if (bw!=null) {
                    try {
                        bw.close();
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }
            }

        }

    }
}