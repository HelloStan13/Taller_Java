package Ejercicio_16;

public class Persona {

    private String name = "";
    private int age = 0;
    private int DNI = 0;
    private char sex = 'H';
    private double weight = 0;
    private double height = 0;


    public Persona() {

        int randomDNI;
        double eightDigits = 10000000 + Math.random() * 90000000;
        randomDNI = (int) eightDigits;


        this.name = "";
        this.age = 0;
        this.DNI = randomDNI;
        this.sex = 'H';
        this.weight = 0;
        this.height = 0;

        System.out.println("Constructor 1");
    }

    public Persona(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;

        System.out.println("Constructor 2");
    }

    public Persona(String name, int age, char sex, int DNI, double weight, double height) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.DNI = DNI;
        this.weight = weight;
        this.height = height;
        System.out.println("Constructor 3");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(int age) {
        return this.age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return this.sex;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return this.weight;
    }

    public void setHeight(double height) {
        this.height = height;

    }

    public double getHeight() {
        return this.height;
    }

    public int calcIMC() {

        double temp = height * height;
        double imc1 = weight / temp;
        int imc = (int) Math.round(imc1);

        System.out.println("El valor de IMC es: " + imc);

        int RET;
        if (imc < 20) {

            System.out.println("Eres delgado/a");

            RET = -1;
        } else if (imc > 25) {

            System.out.println("Adelgacemos un poco");
            RET = 1;
        } else {
            System.out.println("Tu peso es el ideal");
            RET = 0;
        }
        return RET;
    }

    public boolean esMayorDeEdad() {

        boolean value = false;
        if (age < 18) {
            System.out.println("Con " + age + ", eres muy joven.");
            value = false;
        } else {
            System.out.println("Con " + age + " eres todo un adulto.");
            value = true;
        }
        return value;
    }


    public void comprobarSexo(char sex) {
        if (sex == 'F') {
            System.out.println("Resultado correcto");
        } else {
            sex = 'H';
        }
        System.out.println("Tu sexo es: " + sex);
    }

    public void generarDNI() {
        int randomDNI;
        double eightDigits = 10000000 + Math.random() * 90000000;
        randomDNI = (int) eightDigits;
        System.out.println(randomDNI);
    }

    public String toString() {
        return "Name " + name + " age " + age + " DNI " + DNI + " sex " + sex + " weight " + weight + " height " + height;
    }
}
