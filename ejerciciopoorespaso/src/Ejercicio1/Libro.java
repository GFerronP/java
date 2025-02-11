package Ejercicio1;

public class Libro {
    private String titulo;
    private Autor autor;
    private double precio;

    public Libro(String titulo,Autor autor, double precio){
        this.titulo=titulo;
        this.autor=autor;
        this.precio=precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public double getPrecio() {
        return precio;
    }
    public void mostrarDetalles(){
        System.out.println("Titulo del libro: "+titulo);
        System.out.println("Autor: "+autor.getNombre());
        System.out.println("Email: "+autor.getEmail());
        System.out.println("Genero autor: "+autor.getGenero());
        System.out.println("Precio: "+getPrecio()+"€");
    }
}
