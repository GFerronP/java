import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int  [] num=new int[10];
        int [] pares= new int[10];
        int contpares=0;

        for (int i=0;i<num.length;i++){
            System.out.println("Introduce el valor del numero "+(i+1));
            num[i]=scn.nextInt();
            if (num[i]%2==0){
                pares[i]= num[i];
                contpares++;
            }
        }
            for(int i=0;i<pares.length;i++){
                if (pares[i]>0) {
                    System.out.println(pares[i]);
                }
            }
                System.out.println("En total hay "+contpares+" numeros pares");
            }
        }


