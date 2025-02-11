public class Main {
    public static void main(String[] args) {

        int[] num={50,75,46,22,80,65,8};
        int mayor=0;
        int menor=num[0];
        for (int i=0;i< num.length;i++){
            if (num[i]>mayor){
                mayor=num[i];
            }
            if (num[i]<menor){
                menor=num[i];
            }


        }
        System.out.println("El numero mayor es "+mayor+ " y el menor es "+menor);
    }
}