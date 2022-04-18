package Ejercicio_14;

//Crear un programa que pida un numero por teclado y que imprima por pantalla los números desde el numero
// introducido hasta 1000 con saldos de 2 en 2.

import java.util.Scanner;

public class Ejercicio_14 {
    public void  Practica_14(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Would you like to introduce the number: ");
        int input = sc.nextInt();

        for(int i= input; i<=1000;i=i+2){
            System.out.println(i);
        }
    }
}
