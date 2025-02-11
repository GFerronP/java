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

        numpaginas(libro1,libro2);
    }
}