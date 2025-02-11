import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int num;
        System.out.println("Introduce el numero");
        num= scn.nextInt();
        invertido(num);
    }
    static void invertido(int n){
        if(n<10){
            System.out.print(n);
        }else{
            System.out.print(n%10);
            invertido(n/10);
        }
    }
}