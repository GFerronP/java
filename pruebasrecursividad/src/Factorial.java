public class Factorial {
    public static void main(String[] args) {
        Factorial operar=new Factorial();
        int factorial=operar.calculoFactorial(200);
        System.out.println("factorial= "+factorial);
    }

  public int calculoFactorial(int num){
        int resultado;
        if (num==1){
            return 1;
        }else (num>1){
            resultado = num * calculoFactorial(num - 1);
            System.out.println("resultado" +resultado);
        }
      return resultado;
  }
}
