public class Main {
    public static void main(String[] args) {
        int []precios ={11,22,3,55,66,88,41};
        int mayor=precios[0];
        int menor=precios[0];
        for (int i=0;i< precios.length;i++){
            if (precios[i]>mayor){
                mayor=precios[i];
            }
        }
        for (int i=0;i< precios.length;i++){
            if (precios[i]<menor){
                menor=precios[i];
            }
        }
        System.out.println("El mayor es "+mayor);
        System.out.println("El menor es "+menor);
    }
}