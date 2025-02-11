import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int []numeros =new int[10];
        int pos=0;
        int neg=0;
        int cero=0;
        int sumapos=0;
        int sumaneg=0;
        double mediapos;
        double medianeg;
        for (int i =0;i< numeros.length;i++){
            System.out.println("Introduce el numero "+(i+1));
            numeros[i]= scn.nextInt();
        }
        for (int i=0;i<numeros.length;i++){
            if (numeros[i]<0) {
                sumaneg=sumaneg+numeros[i];
                neg++;
            } else if (numeros[i]==0) {
                cero++;
            } else if (numeros[i]>0) {
                sumapos=sumapos+numeros[i];
                pos++;
            }
        }
        mediapos=(double) sumapos/pos;
        medianeg=(double) sumaneg/neg;
        System.out.println("La media positiva es: "+mediapos);
        System.out.println("La media negativa es: "+medianeg);
        System.out.println("Numeros positivos:"+pos);
        System.out.println("Numeros negativos:"+neg);
        System.out.println("Ceros:"+cero);

    }
}