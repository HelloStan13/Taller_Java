package Ejercicio_5y6;

//5.  Muestra los números impares y pares del 1 al 100 (ambos incluidos). Usa un bucle while.
//6.  Realiza el ejercicio anterior usando un ciclo for.

import java.util.Scanner;

public class Ejercicio_5y6 {

    public void Practica_5(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Please, input 0: ");
        int number1 = sc.nextInt();



        System.out.println("-----------------------------------------------");
        System.out.println("CYCLE WHILE");
        System.out.println("-----------------------------------------------");
        int i=1;
        while(i<=100){
            if(i % 2 == 0){
                System.out.println("The "+i+" is Pair.");

            }else if(i % 2 != 0){
                System.out.println("The "+i+" is NOT Pair.");
            }
            i++;

        }
        System.out.println("-----------------------------------------------");
        System.out.println("CYCLE FOR");
        System.out.println("-----------------------------------------------");

    }

    public void Practica_6(){
        int j;
        for (j=1;j<=100;j++){
            if(j % 2 == 0){
                System.out.println("The "+j+" is Pair.");

            }else if(j % 2 != 0){
                System.out.println("The "+j+" is NOT Pair.");
            }
        }
    }
}
