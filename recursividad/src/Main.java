import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int opcion;
        int base;
        int exponencial;
        int raiz;
        int factorial;
        System.out.println("Introduce una de las opciones");
        System.out.println("opcion 1: Potencia");
        System.out.println("opcion 2: raiz cuadrada");
        System.out.println("opcion 3: factorial recursividad");
        opcion= scn.nextInt();

        switch (opcion){
            case 1:
                System.out.println("introduzca el numero base");
                base=scn.nextInt();
                System.out.println("introduce exponencial");
                exponencial=scn.nextInt();
                potencia(base,exponencial);
                break;

            case 2:
                System.out.println("introduzca el numero para la raiz cuadrada");
                raiz=scn.nextInt();
                raiz(raiz);
                break;

            case 3:
                System.out.println("numero para factorial");
                factorial=scn.nextInt();
                System.out.println(recursivo(factorial));
                break;

        }



    }
    static void potencia(int base, int exponencial){
        int resultado=(int) Math.pow(base, exponencial);
        System.out.println("el exponencial es: "+resultado);

    }
    static void raiz(int n){
        int resultado;
        resultado=(int) Math.sqrt(n);
        System.out.println("la raiz cuadrada es: "+ resultado);
    }
    static int recursivo(int n){
        int resultado;
        if (n==1){
            resultado=1;
        }else {
            resultado=n+recursivo(n-1);
        }
        return resultado;
    }
}