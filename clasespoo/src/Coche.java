public class Coche {
    //atributos
    public String marca;
    public String color ;
    public int km;

    // metodos

    public static void main(String[] args) {

        Coche coche1 = new Coche();
        Coche coche2   =new Coche();
        Coche coche4=new Coche("azul","ford",30000);

        coche1.color= "blanco";
        coche1.km=10000;
        coche1.marca="bmw";

        coche2.marca="Skoda";
        coche2.color="gris";
        coche2.km=200000;

        System.out.println(coche1.color);
        System.out.println(coche2.color);

    }
    //metodo constructor con parametros
    public Coche(String color,String marca,int km){
        this.color=color;
        this.marca=marca;
        if (marca.equals("Seat")){
            this.km=0;
        }else{
            this.km=km;
        }
    }
    public Coche(String color,String marca){
        this.color=color;
        this.marca=marca;
    }
    //metodo constructor por defecto, siempre van vacios con valores por defecto o sin
    public  Coche(){
        this.color="rojo";
        this.marca="Audi";
        this.km=0;
    }
    //metodo constructor copia
    public Coche(Coche c){
        this.color= c.color;
        this.marca= c.marca;;
        this.km=c.km;
    }

    //para devolver un string de los datos
    public String toString(){
        return "color: "+this.color+" marca: "+this.marca +" km: "+this.km;
    }
    // sobrecarga de metodos-- se pueden llamar igual pero distinta lista de parametros
    public void holamundo(){
        System.out.println("hola mundo");
    }
    public void holamundo(String nombre){
        System.out.println("hola mundo "+nombre);
    }
    public void holamundo(int edad){
        System.out.println("hola mundo "+edad);
    }
}
