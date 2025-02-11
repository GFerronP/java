import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n;
        do {
            System.out.println("Introduce el numero del que quieres averiguar la pontencia");
            n = scn.nextInt();
        }while (n<0);
        System.out.println("Potencia de "+ n +" = "+potencia(n));

    }
    public static int potencia(int n){
        int resultado;
        if (n==0){
            resultado=1;
        }else{
            resultado=2 * potencia(n-1);
            System.out.println("resultado "+n+" * 2 es "+resultado);
        }
        return resultado;
    }
}