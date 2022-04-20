package Ejercicio_17;

public class Television extends Electrodomestico {
    public int resolucion = 20;
    public boolean sintonizadorTDT = false;

    //CONSTRUCTORES
    // 1 --> por defecto
    public Television(){
        super();
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
        super.consumoEnergetico = consumoEnergetico;
        super.basePrice = basePrice;
        super.peso=peso;
    }
    // 2 --> con el precio y peso. El resto por defecto.
    public Television(double basePrice, double peso){
        super();
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
        super.consumoEnergetico = consumoEnergetico;
        super.basePrice = basePrice;
        super.peso=peso;
    }

    // 3 --> con la resolución, sintonizador TDT y el resto de atributos heredados.
    public Television(int resolucion, boolean sintonizadorTDT){
        super();
        this.resolucion = resolucion;
        this.sintonizadorTDT = sintonizadorTDT;
    }
    //Método get de resolución y sintonizador TDT.
    public int getResolucion() {
        return resolucion;
    }
    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }
    @Override
    public double precioFinal() {
        double aumentoResolucion = 0;
        double aumentoSintonizador = 0;
        if (resolucion>40){

            super.basePrice = basePrice;
            aumentoResolucion = basePrice*1.3;
        }
        else if(resolucion<=40) {

            super.basePrice = basePrice;
            aumentoResolucion=basePrice;
        }
        else if(sintonizadorTDT = true){

            aumentoSintonizador=basePrice+50;
        }

        double temp1 = super.precioFinal();

        double aumentoLocal = super.basePrice+aumentoResolucion+aumentoSintonizador+temp1;

        System.out.println(aumentoLocal);

        return aumentoLocal;

    }
}
