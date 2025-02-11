public class Libro {
    private String titulo;
    private String autor;
    private int ejemplares;
    private int prestados;

    public Libro(){

    }
    public Libro(String titulo,String autor, int ejemplares, int prestados){
        this.titulo=titulo;
        this.autor=autor;
        this.ejemplares=ejemplares;
        this.prestados=prestados;
    }

    //get
    public String getAutor() {
        return autor;
    }
    public String getTitulo() {
        return titulo;
    }
    public int getEjemplares() {
        return ejemplares;
    }
    public int getPrestados() {
        return prestados;
    }

    //Set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setEjemplares(int ejemplares) {
        this.ejemplares = ejemplares;
    }
    public void setPrestados(int prestados) {
        this.prestados = prestados;
    }

    public boolean prestamo(){
        boolean prestado=true;
        if (prestados<ejemplares){
            prestados++;
        }else{
            prestado=false;
        }
        return prestado;
    }
    public boolean devolucion(){
        boolean devuelto=true;
        if (prestados == 0) {
            devuelto=false;
        }else{
            prestados--;
        }
        return devuelto;
    }

    public String toString(){
        return "Titulo "+titulo+"\nAutor "+autor+"\nEjemplares: "+ejemplares+"\nPrestados: "+prestados;
    }
}
