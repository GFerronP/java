import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num[] =new int[10];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Introduce el numero " + (i + 1));
            num[i] = scn.nextInt();
        }
        inverso(num);
        imprimir(num);
        System.out.println("Introduce el numero de la tabla");
        int x=scn.nextInt();
        multiplicar(x);
    }
    static void inverso (int n1[]){
        for (int i= n1.length-1;i>=0;i--){
            System.out.println(n1[i]+" ");
        }

    }
    static void imprimir(int n1[]){
        for (int i=0;i< n1.length;i++)
            System.out.print(n1[i]+" ");
    }
    static void multiplicar (int n1){
        int multi=0;
        for (int i=0;i<=10;i++)  {
            multi=i*n1;
            System.out.println(i+ " X "+n1 +"= "+multi);
        }

    }
}