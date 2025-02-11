import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        int []dado= new int[5];
        int opcion;

        for (int i=0;i< dado.length;i++){
            dado[i]=(int) (Math.random()*6)+1;
        }
        do {
            System.out.println("opcion 1: pares\nopcion 2: impares \nopcion 3: repetidos\nopcion 0:salir");
            opcion = scn.nextInt();
            switch (opcion) {
                case 1:
                    numpar(dado);
                    break;

                case 2:
                    numimp(dado);
                    break;

                case 3:
                    rep(dado);
                    break;
            }
        }while (opcion!=0);
    }
    static void numpar(int []dado){
        int contp=0;
        for (int i=0; i< dado.length;i++){
            if (dado[i]%2==0) {
                System.out.print(dado[i] + " ");
                contp++;
            }
        }
        System.out.println("\nNumero de pares saliidos: "+contp);

    }
    static void numimp(int []dado){
        int contimp=0;
        for (int i=0; i< dado.length;i++){
            if (dado[i]%2!=0) {
                System.out.print(dado[i] + " ");
                contimp++;
            }
        }
        System.out.println("\nNumero de impares saliidos: "+contimp);

    }
    static void rep(int []dado){
        for (int i=1;i<=6;i++){
            int repe=contrep(dado,i);
            if (repe!=0){
                System.out.println("Numero " + i + ": " + repe + " veces");
            }
        }

    }
    static int contrep(int[] array, int numero){
        int rep=0;
        for(int elemento:array){
            if (elemento==numero){
                rep++;
            }
        }
        return rep;
    }
}