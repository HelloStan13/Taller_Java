package Ejercicio_16;

import java.util.Scanner;

public class Main_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa tu nombre:");
        String nombre = sc.nextLine();
        System.out.println("Ingresa tu edad:");
        int edad = sc.nextInt();
        System.out.println("Ingresa tu sexo(H o M):");
        char sexo = sc.next().charAt(0);
        System.out.println("Ingresa tu peso:");
        String peso1 = sc.nextLine();
        double peso = Double.parseDouble(sc.nextLine());
        System.out.println("Ingresa tu altura (1.67):");
        String altura1 = sc.nextLine();
        double altura = Double.parseDouble(altura1);
        System.out.println("**********************************************************");
        System.out.println("Espera tus resultados:");
        System.out.println("**********************************************************");

        Persona objeto_1 = new Persona();
        objeto_1.setName(nombre);
        objeto_1.setAge(edad);
        objeto_1.setWeight(peso);
        objeto_1.setHeight(altura);
        objeto_1.calcIMC();
        objeto_1.comprobarSexo(sexo);
        objeto_1.esMayorDeEdad();
        System.out.println(objeto_1.toString());

        System.out.println("Ingresa tu nombre:");
        String nombre1 = sc.nextLine();
        System.out.println("Ingresa tu edad:");
        int edad1 = sc.nextInt();
        System.out.println("Ingresa tu sexo(H o M):");
        char sexo1 = sc.next().charAt(0);
        System.out.println("Ingresa tu peso:");
        String peso3 = sc.nextLine();
        double peso2 = Double.parseDouble(sc.nextLine());
        System.out.println("Ingresa tu altura (1.67):");
        String altura3 = sc.nextLine();
        double altura2 = Double.parseDouble(altura3);
        System.out.println("**********************************************************");
        System.out.println("Espera tus resultados:");
        System.out.println("**********************************************************");

        Persona objeto_2 = new Persona();

        objeto_2.setName(nombre1);
        objeto_2.setAge(edad1);
        objeto_2.setSex(sexo1);
        objeto_2.calcIMC();
        objeto_2.comprobarSexo(sexo);
        objeto_2.esMayorDeEdad();
        System.out.println(objeto_2.toString());

        System.out.println("**********************************************************");
        System.out.println("Espera tus resultados:");
        System.out.println("**********************************************************");

        Persona objeto_3 = new Persona();

        objeto_3.setName("Manuel");
        objeto_3.setAge(25);
        objeto_3.setWeight(70.2);
        objeto_3.setHeight(1.6);
        objeto_3.calcIMC();
        objeto_3.comprobarSexo(sexo);
        objeto_3.esMayorDeEdad();
        System.out.println(objeto_3.toString());

    }
}
