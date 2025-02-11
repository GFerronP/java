public class Libro {
    /*
    encapsulacion
    1 atributos privados
    2 metodos publicos get y set //// getters y setters

     */
    private String ISBN;
    private String autor;
    private String titulo;
    private int numpaginas;

    public Libro(String ISBN, String autor,String titulo,int numpaginas){
        this.ISBN=ISBN;
        this.autor=autor;
        this.titulo=titulo;
        if (numpaginas<0){
            numpaginas=0;
        }else {
            this.numpaginas = numpaginas;
        }
    }
    public String toString(){
        return "El libro "+this.titulo +" con ISBN "+this.ISBN+" creado por el autor "+this.autor+" tiene "+this.numpaginas+" páginas";
    }

    //Get

    public String getISBN(){
        return ISBN;
    }
    public String getAutor(){
        return autor;
    }
    public String getTitulo(){
        return titulo;
    }
    public int  getNumpaginas(){
        return numpaginas;
    }

    //set

    public void setISBN(String ISBN){
        this.ISBN=ISBN;
    }
    public void setAutor(String autor){
        this.titulo=titulo;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setNumpaginas(int numpaginas){
        if (numpaginas<0){
            numpaginas=0;
        }else {
            this.numpaginas = numpaginas;
        }
    }


    public void calnumpaginas(Libro libro2){
        if (this.numpaginas<libro2.numpaginas){
            System.out.println("El libro1 tiene mas paginas");
        } else if (this.numpaginas> libro2.numpaginas) {
            System.out.println("El libro2 tiene mas paginas");
        }else{
            System.out.println("tienen las mismas paginas");
        }

    }

}

