import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int [] num= {1,2,3,4,5,6,7,8,9,10};
        String coma=",";
        for (int i= num.length-1;i>=0;i--)
            System.out.print(num[i]+coma);
    }
}