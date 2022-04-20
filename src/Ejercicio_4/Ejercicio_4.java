package Ejercicio_4;

import java.util.Scanner;

public class Ejercicio_4 {

    public void Practica_4() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, input price of product to calculate the IVA(with decimals) : ");
        String inputPrice = sc.nextLine();
        double price = Double.parseDouble(inputPrice);
        double IVA = 21;

        double ivaCalculation = (price*IVA)/100;
        double priceCalculation = price+ivaCalculation;

        System.out.println("Your product IVA value is: "+ ivaCalculation);
        System.out.println("Your product TOTAL price is: "+ priceCalculation);


    }
}
