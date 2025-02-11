public class Main {
    public static void main(String[] args) {
        Coche coche3= new Coche("rojo","seat",10000);
        Coche coche6=new Coche();
        Coche coche7=new Coche(coche3);

        coche3.holamundo();
        coche3.holamundo("pepe");
        coche3.holamundo(12);
        System.out.println(coche6.marca);
        //para llamar al metodo toString
        System.out.println(coche7);
    }
}