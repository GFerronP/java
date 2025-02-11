import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        String []texto={"matematicas","lengua","ingles","quimica","fisica"};
        int []notas= new int[texto.length];


        for (int i=0;i< texto.length;i++){
            do {
                System.out.println("Que nota sacaste en " + texto[i]);
                notas[i] = scn.nextInt();
            }while (notas[i]<0 || notas[i]>10);
        }
        for (int j=0;j<texto.length;j++){
            System.out.println("En "+texto[j]+" sacaste un "+notas[j]);
        }

        int[] numeros={1,2,3,4,5,6,7,8,9};
        for (int i=numeros.length-1;i>=0;i--){
            System.out.print(numeros[i]);
            if (i>0){
                System.out.print(", ");
            }
        }
    }
}