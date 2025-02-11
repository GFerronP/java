import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        int num;
        System.out.println("Introduce el valor inicial");
        int inicial= scn.nextInt();
        System.out.println("Introduce el valor tope");
        int tope=scn.nextInt();
        if (inicial<tope){
                 for (num=inicial;num<=tope;num++) {
                     System.out.println("Numero " + num);
                 }
        } else if (inicial>tope) {
            System.out.println("El valor inicial es superior al tope");

        }
    }
}