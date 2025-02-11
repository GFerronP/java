public class Libro {
    public String ISBN;
    public String autor;
    public String titulo;
    public int numpaginas;

    public Libro(String ISBN, String autor,String titulo,int numpaginas){
        this.ISBN=ISBN;
        this.autor=autor;
        this.titulo=titulo;
        this.numpaginas=numpaginas;
    }
    public String toString(){
        return "El libro "+this.titulo +" con ISBN "+this.ISBN+" creado por el autor "+this.autor+" tiene "+this.numpaginas+" páginas";
    }
    static String numpaginas(libro1, libro2){
        if (libro1.numpaginas>libro2.numpaginas){
            System.out.println("El libro 1 tiene mas paginas");
        }else if (libro1.numpaginas<libro2.numpaginas){
            System.out.println("Libro dos tiene mas paginas");
        } else{
            System.out.println("Tienen las mismas paginas");
        }
    }
}
