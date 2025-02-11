import java.util.ArrayList;

public class Carton {

    private ArrayList<Integer> listaNumeros;
    private int numaciertos;

    public Carton(){
        listaNumeros=new ArrayList<>();
        int num = (int) (Math.random() * 50) + 1;
        for (int i=0;i<10;i++){
           do {
               if (listaNumeros.contains(num)) {
                   num = (int) (Math.random() * 50) + 1;
               } else {
                   listaNumeros.add(num);
               }
           }while (listaNumeros.contains(num));
        }

    }
    public void comprobarNumero(int n){
        for (int i=0;i<listaNumeros.size();i++){
            if (listaNumeros.get(i)==n){
                numaciertos=(numaciertos+1);

            }
        }
    }
    public void verNumeros(){
        for (int i=0;i<listaNumeros.size();i++){
            System.out.print(listaNumeros.get(i)+" ");
        }
    }

    public int getNumaciertos() {
        return numaciertos;
    }

    public ArrayList<Integer> getListaNumeros() {
        return listaNumeros;
    }

    public void setListaNumeros(ArrayList<Integer> listaNumeros) {
        this.listaNumeros = listaNumeros;
    }

    public void setNumaciertos(int numaciertos) {
        this.numaciertos = numaciertos;
    }
}
