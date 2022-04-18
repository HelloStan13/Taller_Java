package Ejercicio1;

import java.util.Scanner;

//Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.
//Al ejercicio anterior agregar entrada por consola de dos valores e indicar si son mayores, menores o iguales.

//Respuesta de ejercicio 1 y 2

public class Ejercicio1 {

    public void Practica1() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, input first number: ");
        int number1 = sc.nextInt();

        System.out.println("Please, input second number: ");
        int number2 = sc.nextInt();

        if (number1 > number2) {
            System.out.println(number1 + " is bigger than " + number2);
        } else if (number2 > number1) {
            System.out.println(number2 + " is bigger than " + number1);

        } else if (number1 == number2) {
            System.out.println(number2 + " and " + number1 + " are equals.");

        }
    }
}
