public class Main {
    public static void main(String[] args) {

        /*
        *  Crear una clase Libro que contenga los siguientes atributos:

        – ISBN

        – Titulo

        – Autor

        – Número de páginas

        Crear el método toString() para mostrar la información relativa al libro con el siguiente formato:

        «El libro con ISBN creado por el autor tiene páginas»

        En el fichero main, crear 2 objetos Libro (los valores que se quieran) y mostrarlos por pantalla.

        Por último, indicar cuál de los 2 tiene más páginas.
        *
        * */
        Libro libro1=new Libro("6516-51","Fernando Gonzalez","Soplador",456);
        Libro libro2=new Libro("6515-61","Lola Romero","Peregrino",560);

        //Mostrar objetos por pantalla llamando al método toString()
        System.out.println(libro1);
        System.out.println(libro2);

        libro1.calnumpaginas(libro2);

        if (libro1.getNumpaginas()<libro2.getNumpaginas()){
            System.out.println("El libro1 tiene mas paginas");
        } else if (libro1.getNumpaginas()> libro2.getNumpaginas()) {
            System.out.println("El libro2 tiene mas paginas");
        }else{
            System.out.println("tienen las mismas paginas");
        }

    }
}