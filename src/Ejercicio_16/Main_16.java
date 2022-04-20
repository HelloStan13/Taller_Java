package Ejercicio_16;

import java.util.Scanner;

public class Main_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("**********************************************************");
        System.out.println("********************* Cálculo de IMC *********************");
        System.out.println("**********************************************************");

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

        //objeto 1 --> obtendrá las anteriores variables pedidas por teclado
        Persona persona_1 = new Persona();
        persona_1.setName(nombre);
        persona_1.setAge(edad);
        persona_1.setWeight(peso);
        persona_1.setHeight(altura);
        persona_1.calcIMC();
        persona_1.comprobarSexo(sexo);
        persona_1.esMayorDeEdad();
        System.out.println(persona_1.toString());


        System.out.println("Ingresa tu nombre:");
        String nombre1 = sc.nextLine();
        System.out.println("Ingresa tu edad:");
        int edad1 = sc.nextInt();
        System.out.println("Ingresa tu sexo(H o M):");
        char sexo1 = sc.next().charAt(0);
        System.out.println("**********************************************************");
        System.out.println("Espera tus resultados:");
        System.out.println("**********************************************************");

        //objeto 2 --> obtendrá todos los anteriores menos el peso y la altura y el último por defecto
        Persona persona_2 = new Persona();
        persona_2.setName(nombre1);
        persona_2.setAge(edad1);
        persona_2.setSex(sexo1);
        persona_2.setWeight(80.2);
        persona_2.setHeight(1.70);
        persona_2.calcIMC();
        persona_2.comprobarSexo(sexo);
        persona_2.esMayorDeEdad();
        System.out.println(persona_2.toString());

        System.out.println("**********************************************************");
        System.out.println("Espera tus resultados:");
        System.out.println("**********************************************************");

        //objeto 3 --> por defecto
        Persona persona_3 = new Persona();

        persona_3.setName("Manuel");
        persona_3.setAge(25);
        persona_3.setWeight(70.2);
        persona_3.setHeight(1.70);
        persona_3.calcIMC();
        persona_3.comprobarSexo(sexo);
        persona_3.esMayorDeEdad();
        System.out.println(persona_3.toString());

    }
}
