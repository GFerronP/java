public class Cuenta {
    private String nomcliente;
    private String numcuenta;
    private double interes;
    private double saldo;

    public Cuenta(){

    }
    public Cuenta(String nomcliente,String numcuenta,double interes, double saldo){
        this.nomcliente=nomcliente;
        this.numcuenta=numcuenta;
        this.interes=interes;
        this.saldo=saldo;
    }
    public Cuenta(Cuenta c){
        nomcliente=c.nomcliente;
        numcuenta=c.numcuenta;
        interes=c.interes;
        saldo=c.saldo;
    }

    public boolean ingreso(double n){
        boolean ingresocorrecto=true;
        if (n<0){
            ingresocorrecto=false;
        }else {
            saldo +=n;
        }
        return ingresocorrecto;
    }

    public boolean reintegro(double n){
        boolean reintegrocorrecto=true;
        if (n<0){
            reintegrocorrecto=false;
        } else if (saldo>=n) {
            saldo-=n;
        }else{
            reintegrocorrecto=false;
        }
        return reintegrocorrecto;
    }

    public boolean transferencia(Cuenta destino,double n){
        boolean transferenciacorrecta=true;
        if (n<0){
            transferenciacorrecta=false;
        } else if (saldo>=n) {
            reintegro(n);
            destino.ingreso(n);
        }else{
            transferenciacorrecta=false;
        }
        return transferenciacorrecta;
    }
}
