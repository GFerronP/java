import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String frase;
        System.out.println("introduce la frase");
        frase=scn.nextLine();
        char [] caracteres=new char[frase.length()];

        for (int i=0;i<frase.length();i++){
            caracteres[i]=frase.charAt(i);
            System.out.println(caracteres[i]);
        }
    }
}