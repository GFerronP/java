package Ejercicio3;

import java.util.Scanner;

public class Main {
    public void main(String[] args) {


        Scanner scn = new Scanner(System.in);
        int n;

        do {
            System.out.println("introduce");
            n = scn.nextInt();
        } while (n < 0);
        System.out.println("2^" + n + "es="+potencia(n));
    }
    public static int potencia(int n){
        int resultado;
        if(n==0){
            resultado=1;

        }else{
            resultado=2*potencia(n-1);
        }
        return resultado;
    }
}
