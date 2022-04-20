package Ejercicio_17;

public class Electrodomestico {
    public double basePrice = 100;
    public String color = "blanco";
    public char consumoEnergetico='f';
    public double peso = 5;

    //CONSTRUCTORES

    // 1 --> constructor por defecto.
    public Electrodomestico(){
        this.basePrice = getBasePrice();
        this.color = "blanco";
        this.consumoEnergetico = consumoEnergetico;
        this.peso = 5;
    }
    // 2 --> con el precio y peso. El resto por defecto.
    public Electrodomestico(double basePrice, int peso){
        this.basePrice = basePrice;
        this.peso = peso;
    }
    // 3 --> con todos los atributos
    public Electrodomestico(double basePrice, String color, char consumoEnergetico, int peso){
        this.basePrice = basePrice;
        this.color= color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;

    }
    //Get de todos los atributos
    public double getBasePrice() {
        return basePrice;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void comprobarConsumoEnergetico(char consumoEnergetico) {

        if (consumoEnergetico == 'f') {
            consumoEnergetico = 'f';
        } else if (consumoEnergetico == 'a') {
            consumoEnergetico = 'a';

        } else if (consumoEnergetico == 'b') {
            consumoEnergetico = 'b';

        } else if (consumoEnergetico == 'c') {
            consumoEnergetico = 'c';

        } else if (consumoEnergetico == 'd') {
            consumoEnergetico = 'd';

        } else if (consumoEnergetico == 'e') {
            consumoEnergetico = 'e';
        } else {
            consumoEnergetico = 'f';

        }
    }

        public String comprobarColor (String color){
            color = color.toLowerCase();
            switch (color) {
                case "Blanco":
                    color = "Blanco";
                    break;
                case "Negro":
                    color = "Negro";
                    break;
                case "Rojo":
                    color = "Rojo";
                    break;
                case "Azul":
                    color = "Azul";
                    break;
                case "Gris":
                    color = "Gris";
                    break;
                default:
                    color = "Blanco";
            }
            return color;
        }

    public double precioFinal(){

        this.basePrice = basePrice;
        this.comprobarConsumoEnergetico('u');
        double aumentoConsumo = 0;
        double aumentoPeso =0;
        int finalPrice=0;
        this.peso = peso;

        if(consumoEnergetico == 'f'){
            aumentoConsumo = 10;
        }
        else if(consumoEnergetico == 'a'){
            aumentoConsumo = 100;
        }
        else if(consumoEnergetico == 'b'){
            aumentoConsumo=80;
        }
        else if(consumoEnergetico == 'c'){
            aumentoConsumo = 60;

        }
        else if(consumoEnergetico == 'd'){
            aumentoConsumo = 50;
        }
        else if(consumoEnergetico == 'e'){
            aumentoConsumo = 30;
        }
        else {
            consumoEnergetico = 10;
        }
        for (int peso=0;peso<=19;peso++){
            aumentoPeso=10;
        }
        for (int peso=20;peso<=49;peso++){
            aumentoPeso=50;
        }
        for (int peso=50;peso<=79;peso++){
            aumentoPeso=80;
        }
        for (int peso=80;peso>80;peso++){
            aumentoPeso=100;
        }
        double precioFinal = basePrice+aumentoConsumo+aumentoPeso;
        return precioFinal;
    }

}
