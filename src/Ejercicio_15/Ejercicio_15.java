package Ejercicio_15;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Hacer un programa que muestre el siguiente menú de opciones
****** GESTION CINEMATOGRÁFICA ********
1-NUEVO ACTOR
2-BUSCAR ACTOR
3-ELIMINAR ACTOR
4-MODIFICAR ACTOR
5-VER TODOS LOS ACTORES
6- VER PELICULAS DE LOS ACTORES
7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
8-SALIR
* */
public class Ejercicio_15 {

    public static void esperar(int segundos){
        try {
            Thread.sleep(segundos * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void Practica_15(){

        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        int input;

        while (!exit){

            System.out.println("CYMETOGRAPHIC MANAGEMENT");
            System.out.println("Please Choose a Option Below.");
            System.out.println("------------------------------------------");
            System.out.println("1. NEW ACTOR" );
            System.out.println("2. SEARCH ACTOR" );
            System.out.println("3. DELETE ACTOR" );
            System.out.println("4. MODIFY ACTOR" );
            System.out.println("5. LOOK ALL ACTORS" );
            System.out.println("6. LOOK ACTOR'S MOVIES");
            System.out.println("7. LOOK ACTOR'S MOVIES CATEGORY" );
            System.out.println("8. EXIT");
            System.out.println("------------------------------------------");

            try{
                System.out.println("Introduce the number: ");
                input = sc.nextInt();

                switch (input){

                    case 1:
                        System.out.println("You select 1. NEW ACTOR ");
                        esperar(3);
                        break;

                    case 2:
                        System.out.println("You select 2. SEARCH ACTOR ");
                        esperar(3);
                        break;

                    case 3:
                        System.out.println("You select 3. DELETE ACTOR ");
                        esperar(3);
                        break;

                    case 4:
                        System.out.println("You select 4. MODIFY ACTOR ");
                        esperar(3);
                        break;

                    case 5:
                        System.out.println("You select 5. LOOK ALL ACTORS ");
                        esperar(3);
                        break;

                    case 6:
                        System.out.println("You select 6. LOOK ACTOR'S MOVIES ");
                        esperar(3);
                        break;

                    case 7:
                        System.out.println("You select 7. LOOK ACTOR'S MOVIES CATEGORY ");
                        esperar(3);
                        break;

                    case 8:
                        System.out.println("You select 8. EXIT. GOOD BYE! :) ");
                        exit = true;
                        esperar(3);
                        break;

                    default:
                        System.out.println("Please insert a valid option:  ");


                }
            } catch (InputMismatchException e){
                System.out.println("Please insert a valid option:  ");
                sc.next();

            }
        }
    }
}
