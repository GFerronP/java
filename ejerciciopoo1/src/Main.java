import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);

        Libro libro1=new Libro("don quijote","Cervantes",5,5);
        Libro libro2=new Libro("perseo","pokemon",6,4);
        Libro libro3=new Libro();

        String titulo,autor;
        int ejemplares,prestados;

        System.out.println("Introduce el titulo");
        titulo= scn.nextLine();
        System.out.println("Introduce el autor");
        autor= scn.nextLine();
        System.out.println("Introduce el num de ejemplares");
        ejemplares= scn.nextInt();
        System.out.println("Introduce la cantidad prestada");
        prestados= scn.nextInt();

        libro3.setAutor(autor);
        libro3.setTitulo(titulo);
        libro3.setEjemplares(ejemplares);
        libro3.setPrestados(prestados);

        System.out.println("el titulo de libro1 es: "+libro1.getTitulo());

        System.out.println(libro3);

        if (libro2.prestamo()){
            System.out.println("el libro "+libro2.getTitulo()+" se a prestado con exito");
        }else{
            System.out.println("el libro " +libro2.getTitulo()+"no se ha podido prestar");
        }

        if (libro1.devolucion()){
            System.out.println("el libro "+libro1.getTitulo()+"se ha devuelto con exito");
        }else{
            System.out.println("no se ha podido devolver");
        }
    }
}