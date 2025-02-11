package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        Autor autor1=new Autor("Ramiro Ramal","ramerito@gmail.com",'m');
        Libro libro1=new Libro("Barbaridades acuaticas", autor1,19.90);
        libro1.mostrarDetalles();
    }
}
