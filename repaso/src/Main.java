import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Main main=new Main();
        int n;

        do {
            System.out.println("introduce el exponente");
            n = scn.nextInt();
        } while (n < 0);
        System.out.println("2 ^ " + n + " es= " + main.potencia(n));



    }

     public int potencia(int n) {
        int resultado;
        if (n == 0) {
            resultado = 1;

        } else {
            resultado=2*potencia(n-1);
            System.out.println("Potencia de 2 * "+n+" es " +resultado);
        }
        return resultado;
    }
}

