package Ejercicio_18;

public class Main {

    public static void main(String[] args) {
        Serie arregloSeries[] = new Serie[5];
        arregloSeries[0] = new Serie();
        arregloSeries[1] = new Serie();
        arregloSeries[2] = new Serie();
        arregloSeries[3] = new Serie();
        arregloSeries[4] = new Serie();


        Videojuego arregloVideojuegos[] = new Videojuego[5];
        arregloVideojuegos[0] = new Videojuego();
        arregloVideojuegos[1] = new Videojuego();
        arregloVideojuegos[2] = new Videojuego();
        arregloVideojuegos[3] = new Videojuego();
        arregloVideojuegos[4] = new Videojuego();

        arregloSeries[1].entregar();

        arregloSeries[2].entregar();

        arregloSeries[3].entregar();

        arregloVideojuegos[1].entregar();

        arregloVideojuegos[0].entregar();

        int contadorEntregas = 0;

        for (int i = 0; i < arregloSeries.length; i++) {

            System.out.println(arregloSeries[i]);
            if (arregloSeries[i].isEntregado() == true) {

                contadorEntregas = contadorEntregas + 1;

            }
        }
        System.out.println("Contador para las entregas: " + contadorEntregas);

        int contadorEntregas2 = 0;
        for (int i = 0; i < arregloVideojuegos.length; i++) {

            System.out.println(arregloVideojuegos[i]);
            if (arregloVideojuegos[i].isEntregado() == true) {

                contadorEntregas2 = contadorEntregas2 + 1;

            }

        }
        int contadores = contadorEntregas + contadorEntregas2;

        System.out.println("Contador para las entregas : " + contadorEntregas2);

        Serie serieTemporadaMayor = arregloSeries[0];
        Videojuego videojuegoHorasMayor = arregloVideojuegos[0];

        for (int i = 1; i < 5; i++) {
            if (arregloSeries[i].compareTo(serieTemporadaMayor).equals(Serie.MAYOR)) {
                serieTemporadaMayor = arregloSeries[i];
            }
            if (arregloVideojuegos[i].compareTo(videojuegoHorasMayor).equals(Serie.MAYOR)) {
                videojuegoHorasMayor = arregloVideojuegos[i];
            }
        }
        System.out.println("Total de entregas: " + contadores);
        System.out.println(videojuegoHorasMayor);
        System.out.println(serieTemporadaMayor);

    }
}
