import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n;
        float media=0;
        int altos=0;
        int bajos=0;
        System.out.println("Introduce el numero de personas");
        n=scn.nextInt();
        float[] altura= new float[n];
        for (int i=0;i<altura.length;i++){
            System.out.println("Introduce la altura de la "+(i+1)+" persona");
            altura[i]=scn.nextFloat();
            media=altura[i]+media;
        }
        media=media/n;
        System.out.printf("La altura media es %.2f%n",media);
        for (int i=0;i<altura.length;i++){
            if (altura[i]>media){
                altos++;
            } else if (altura[i]<media) {
                bajos++;
            }

        }
        System.out.println(altos+" son mas altas que la media");
        System.out.println(bajos+" son mas bajos que la media");
    }
}