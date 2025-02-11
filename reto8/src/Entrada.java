
public class Entrada {
    public static void main(String[] args) {

        Coche coche1=new Coche("2342GFS","Skoda",110);
        Coche coche2=new Coche();
        Coche cochevacio=null;

        //Mostrar
        System.out.println(coche1);
        System.out.println(coche2);


        //Modificar
        coche1.setVelocidad(20);
        coche1.setMatricula("5487JHT");
        coche2.setMarca("Audi");
        coche2.setMatricula("2145HGT");
        coche2.setCv(120);

        //Mostrar
        System.out.println(coche1);
        System.out.println(coche2);

        //reseteardatos

        coche1.reset();
        coche2.reset();

        //acelerar

        coche1.acelerar((int)(Math.random()*21));
        coche2.acelerar((int)(Math.random()*21));

        //Mostrar
        System.out.println(coche1);
        System.out.println(coche2);

        //Coche ganador
        if (coche1.getKm()>coche2.getKm()){
            cochevacio=coche1;
            System.out.println("Gano el coche1 con "+cochevacio.getKm()+"kms");
        } else if (coche1.getKm()<coche2.getKm()) {
            cochevacio=coche2;
            System.out.println("Gano el coche2 con "+cochevacio.getKm()+"kms");
        }else{
            System.out.println("Empate");
        }
        //Mostrar
        System.out.println(coche1);
        System.out.println(coche2);
        System.out.println(cochevacio);
    }
}