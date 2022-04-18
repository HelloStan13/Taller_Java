package Ejercicio_12;

//Pedir dos palabras por teclado, indicar si son iguales, sino son iguales mostrar sus diferencias.

import java.util.Scanner;

public class Ejercicio_12 {

    Scanner sc = new Scanner(System.in);

    public void Practica_12() {

        System.out.println("Please, input your first word: ");
        String first = sc.nextLine();

        System.out.println("Please, input your second word: ");
        String second = sc.nextLine();

        if (first.equalsIgnoreCase(second)) {

            System.out.println("Are Equals");

        } else
            System.out.println(" Are Not Equals");

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) == second.charAt(i)) {
                System.out.println("ok");
            }else if (first.charAt(i) != second.charAt(i)){
                System.out.println("letra diferente");
            }
        }
    }
}

//cómo saco la letra que no concuerda  o sea diferente de la primera palabra????
