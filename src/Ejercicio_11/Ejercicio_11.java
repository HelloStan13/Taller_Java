package Ejercicio_11;

//Realizar la construcción de un algoritmo que permita de acuerdo a una frase pasada por consola,
// indicar cual es la longitud de esta frase, adicionalmente cuantas vocales tiene de “a,e,i,o,u”.

import java.util.Scanner;

public class Ejercicio_11 {

    public void Practica_11(){
        Scanner sc = new Scanner(System.in);
    //Solicito frase
        System.out.println("Please, input your Phrase making sense with the example: ");
        String phrase = sc.nextLine();
    //declaro contador de vocales
        int contadorA = 0;
        int contadorE = 0;
        int contadorI = 0;
        int contadorO = 0;
        int contadorU = 0;
    //recorrido para contar vocales en frase
        for (int i = 0; i <phrase.length();i++ ){
            if (phrase.charAt(i)=='a') {
                contadorA++;
            }else if(phrase.charAt(i)=='e') {
                contadorE++;
            }else if(phrase.charAt(i)=='i') {
                contadorI++;
            }else if(phrase.charAt(i)=='o') {
                contadorO++;
            }else if(phrase.charAt(i)=='u') {
                contadorU++;
            }
        }
        //impresión de recorrido contando vocales
        System.out.println("The Phrase " + phrase + " contains " + contadorA + " As");
        System.out.println("The Phrase " + phrase + " contains " + contadorE + " Es");
        System.out.println("The Phrase " + phrase + " contains " + contadorI + " Is");
        System.out.println("The Phrase " + phrase + " contains " + contadorO + " Os");
        System.out.println("The Phrase " + phrase + " contains " + contadorU + " Us");
    }
}
