public class EntradaCarrera {
    public static void main(String[] args) {
        Coche coche1=new Coche("2658JHF","Skoda",50);
        Coche coche2=new Coche("1478FDR","Seat",50);
        Coche cocheGanador=null;
        int etapa=100000;
        int cont1=1;
        int cont2=1;

        do {
            System.out.println("Coche1");
            coche1.acelerar((int)(Math.random()*21));
            if (coche1.getKm()<=etapa){
                cont1++;
            }
            System.out.println("Coche2");
            coche2.acelerar((int)(Math.random()*21));
            if (coche2.getKm()<=etapa){
                cont2++;
            }
        }while (coche1.getKm()<=etapa||coche2.getKm()<=etapa);
        /*En esta parte encontre dos formas de solucionarlo puesto que al llegar a 100000km uno el otro tambien tenia
        * que llegar disparando la cantidad de km entre uno y otro. y uno de los metodos podria ser comparando el que mas
        * km tiene de los dos pero comprobe que no siempre era valido este metodo. por eso añadi dos contadores al bucle para que
        * al llegar a la etapa dejen de contar y de esa forma saber cual llego antes y el empate dependa de que el contador
        * sea igual*/
        if (cont1<cont2){
            cocheGanador=coche1;
            System.out.println("Gana el coche1 "+ cocheGanador);
        } else if (cont1>cont2) {
            cocheGanador=coche2;
            System.out.println("Gana el coche2 "+ cocheGanador);
        }else{
            System.out.println("Empataron");
        }
    }
}
