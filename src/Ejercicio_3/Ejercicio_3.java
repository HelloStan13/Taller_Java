package Ejercicio_3;


//Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado
// (recuerda pasar de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.


import java.util.Scanner;

public class Ejercicio_3 {
    public void Practica_3() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, input Radius: ");
        String radius = sc.nextLine();
        double doble = Double.parseDouble(radius);

        double area = Math.PI*Math.pow(doble, 2);

        System.out.println("You choose Radius: "+ radius);
        System.out.println("Your Area is: "+ area);
    }
}
