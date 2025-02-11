import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String [] asignatura = new String[4];
        int [] nota= new int[4];

        for (int i=0;i< asignatura.length;i++) {
            System.out.println("Introduce la asignatura "+(i+1));
            asignatura[i]= scn.next();
            System.out.println("Introduce la nota de "+asignatura[i]);
            nota[i]= scn.nextInt();
        }
        for (int i=0;i< asignatura.length;i++) {
            System.out.println("Yo estudio "+asignatura[i]+" y he sacado un "+nota[i]);
        }
    }
}
