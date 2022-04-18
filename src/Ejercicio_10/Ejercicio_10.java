package Ejercicio_10;

//Realizar una aplicación de consola, que al ingresar una frase por teclado elimine los espacios que esta contenga.

import java.util.Scanner;

public class Ejercicio_10 {

    Scanner sc = new Scanner(System.in);
    public void Practica_10(){

        System.out.println("Please, input your Phrase making sense with the example: ");
        String phrase = sc.nextLine();

        System.out.println("-----REPLACE CHARACTERS-----");
        System.out.println(phrase.replace(" ", ""));


    }
}
