import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.complicarlo con escaner*/
        Scanner scn=new Scanner(System.in);
        int num,tope;
        System.out.println("Introduce desde que numero quieres empezar");
        num=scn.nextInt();
        System.out.println("introduce el valor tope hasta el que quieres mostrar");
        tope=scn.nextInt();
        while (num<=tope) {
            System.out.println("Numero " + num);
            num++;
        }
    }
}