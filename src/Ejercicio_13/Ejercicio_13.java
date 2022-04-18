package Ejercicio_13;

//Realizar un algoritmo que permita consulta la fecha y hora actual en el formato (AAAA/MM/DD) (HH:MM:SS)

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ejercicio_13 {
    public void Practica_13(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to know the current date? Y/N: ");
        String answer = sc.nextLine();

        switch (answer) {
            case "Y":
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
                System.out.println("Year/Month/Day (HH:mm:ss)-> " + dtf.format(LocalDateTime.now()));
                break;
            case "N":
                System.out.println("You select /no, GOOD BYE");
                break;
            default:
                System.out.println("Please insert a valid option");
        }
    }
}
