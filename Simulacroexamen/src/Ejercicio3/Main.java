package Ejercicio3;

import java.util.Scanner;

public class Main   {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        Main recursivo=new Main();
        System.out.println("Introduce el numero al que quieres elevar 2");
        int num= scn.nextInt();
        System.out.println(recursivo.recursivo(num));
    }
    public int recursivo(int num){
        int resultado;
        if (num==0){
            return 1;
        }else{
            resultado=2*recursivo(num-1);
            return resultado;
        }
    }
}
