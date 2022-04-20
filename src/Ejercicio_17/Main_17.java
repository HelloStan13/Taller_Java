package Ejercicio_17;

public class Main_17 {
    public static void main(String[] args){
        Electrodomestico arrayObjetos[] = new Electrodomestico[10];
        arrayObjetos[0] = new Television(1300000, 30);
        arrayObjetos[1] = new Lavadora(990000, 15);
        arrayObjetos[2] = new Television(1190000, 40);
        arrayObjetos[3] = new Lavadora(600000,18);
        arrayObjetos[4] = new Television(900000, 20);
        arrayObjetos[5] = new Lavadora(1650000, 16);
        arrayObjetos[6] = new Television(1560000, 21);
        arrayObjetos[7] = new Lavadora(460000,17);
        arrayObjetos[8] = new Television(1650000,14);
        arrayObjetos[9] = new Lavadora(890000, 16);

        int totalLavadoras=0;
        int totalTelevisores=0;
        int totalElectrodomesticos=0;
        for (int i=0;i<arrayObjetos.length;i++){

            if (arrayObjetos[i] instanceof Lavadora){
                totalLavadoras+=arrayObjetos[i].precioFinal();

            } else if(arrayObjetos[i] instanceof Television){
                totalTelevisores+=arrayObjetos[i].precioFinal();
            }
            totalElectrodomesticos = totalLavadoras+totalTelevisores;
        }
        System.out.println("La suma de los precios de Lavadoras son: "+totalLavadoras);
        System.out.println("La suma de los precios Televisores son: "+totalTelevisores);
        System.out.println("La suma de los precios Totales  son: "+totalElectrodomesticos);

    }
}
