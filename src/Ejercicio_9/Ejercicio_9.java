package Ejercicio_9;

//Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza todas las a del String anterior por
// una e, adicionalmente concatenar a esta frase una adicional que ustedes quieran incluir por consola y
// las muestre luego unidas.

import java.util.Scanner;

public class Ejercicio_9 {
    Scanner sc = new Scanner(System.in);
    public void Practica_9(){
        String S1 = new String("La sonrisa es y será la mejor arma contra la tristeza");
        System.out.println(S1);
        System.out.println(" Please, input your Phrase making sense with the example: ");
        String S2 = sc.nextLine();

        System.out.println("-----PHRASES-----");
        System.out.println("Original String is: " + S1);
        System.out.println("String after replacing all 'a' with 'e': " + S1.replace(('a'), 'e'));
        System.out.println(S1.replace('a', 'e'));
        System.out.println(S1+" y "+S2);

    }
}
//cómo  hago para reemplezar la letra con acento??
