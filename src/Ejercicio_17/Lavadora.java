package Ejercicio_17;

public class Lavadora  extends Electrodomestico{
    public int Carga = 5;

    //CONSTRUCTORES
    // 1  -->por defecto
    public Lavadora(){
        super();
        String colore=this.comprobarColor("");
        this.Carga = Carga;
        super.basePrice = basePrice;
        this.color= colore;
        super.consumoEnergetico = consumoEnergetico;
        super.peso = peso;
    }
    // 2 ->con el precio y peso. El resto por defecto.
    public Lavadora(double basePrice, int peso){
        super();
        this.Carga = Carga;
        super.basePrice = basePrice;
        super.peso = peso;
    }
    // 3 -->con la carga y el resto de atributos heredados.
    public Lavadora(double basePrice, String color, char consumoEnergetico, int peso){
        super();
        this.Carga = Carga;
        super.basePrice = basePrice;
        super.color= color;
        super.consumoEnergetico = consumoEnergetico;
        super.peso = peso;
    }
    //Método get de carga.
    public int getCarga() {
        return Carga;
    }

    @Override
    public double precioFinal() {

        double incremento1=0;
        double incremento2=0;
        double incrementos = incremento1+incremento2;

        if (Carga>30){
            super.basePrice = basePrice + 50;
            incremento1 = basePrice + 50;
        }
        else {
            super.basePrice = basePrice;
            incremento2 = basePrice;
        }

        double temp = super.precioFinal();
        incrementos = super.basePrice+incremento1+incremento2+temp;
        System.out.println(incrementos);
        return incrementos;
    }
        public String toString(){

        return "basePrice "+basePrice+" color "+ color+" consumoEnergetico "+ consumoEnergetico+" peso "+peso+" CARGA "+ Carga ;
    }
}
