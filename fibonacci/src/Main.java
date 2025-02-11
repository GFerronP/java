import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int n;
        do {
            System.out.println("Introduce cuantos numeros quieres mostrar de la serie");
            n = scn.nextInt();
        }while(n<=0);
        for (int i=1;i<=n;i++) {
            System.out.print(fibonaci(i)+" ");
        }
    }
    static int fibonaci(int n){
        int res;
        if (n<2){
            res=n;
        }else{
            res=fibonaci(n-1)+fibonaci(n-2);
        }
        return res;
    }
}