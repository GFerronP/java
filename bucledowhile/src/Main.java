import java.util.EnumMap;
import java.util.Enumeration;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es lo volverá a
         pedir (do while), después muestra ese número por consola.*/
        Scanner scn=new Scanner(System.in);
        int num;
        do {
            System.out.println("Introduce un numero");
            num=scn.nextInt();
        }
        while (num<=0);
        System.out.printf("%d ", num);
    }
}