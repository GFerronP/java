import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn= new Scanner(System.in);
        int[] num= new int[10];
        int contadorpos=0;
        int contadorneg=0;
        int contadorceros=0;
        int mediapos=0;
        int medianeg=0;
        for (int i=0;i< num.length;i++){
            System.out.println("Introduce el valor "+(i+1));
            num[i]= scn.nextInt();
        }
        for (int i=0;i< num.length;i++){
            if (num[i]>0){
                mediapos=num[i]+mediapos;
                contadorpos++;
            } else if (num[i]<0) {
                medianeg=num[i]+medianeg;
                contadorneg++;
            } else if (num[i]==0) {
                contadorceros++;
            }


        }

        System.out.println("Numeros positivos "+ contadorpos);
        System.out.println("Numeros negativos "+contadorneg);
        System.out.println("Ceros "+contadorceros);

        System.out.println("La media positiva es "+(mediapos/contadorpos));
        System.out.println("La media negativa es "+(medianeg/contadorneg));
    }
}