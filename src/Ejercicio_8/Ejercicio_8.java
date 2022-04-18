package Ejercicio_8;
import java.util.Scanner;

public class Ejercicio_8 {

    Scanner sc = new Scanner(System.in);

    public void Practica_8(){

        System.out.println("Please, input your Day: ");
        System.out.println("Please insert a valid day in English, Thanks. ");
        String  day = sc.nextLine();
        String selection = "";

        switch (day)
        {
            case "monday":
                System.out.println("You have work");
                break;
            case "tuesday":
                System.out.println("You have work");
                break;
            case "wednesday":
                System.out.println("You have work");
                break;
            case "thursday":
                System.out.println("You have work");
                break;
            case "friday":
                System.out.println("You have work");
                break;
            case "saturday":
                System.out.println("Rest deserved, go with your family and enjoy");
                break;
            case "sunday":
                System.out.println("Rest deserved, go with your family and enjoy");
                break;
            default:
                System.out.println("Please insert a valid day in English, Thanks. ");

                break;
        }
    }
}
