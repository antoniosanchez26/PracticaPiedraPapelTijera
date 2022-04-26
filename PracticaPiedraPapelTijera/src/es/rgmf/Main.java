package es.rgmf;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int opcionUsuario, opcionMaquina, partidas, victoria;
        Scanner entrada = new Scanner(System.in);

        System.out.println("PIEDRA, PAPEL, TIJERA");
        partidas = pedirNumeroEnRango(entrada, 1, 5,"¿Cuántas partidas quieres jugar? [De 1 a 5] ");
        System.out.println();

        for (int i = 0; i < partidas; i++) {
            System.out.println("Partida " + (i + 1) + ":");
            System.out.println("======================================");

            opcionUsuario = pedirOpcionUsuario(entrada);
            opcionMaquina = generarOpcionMaquina();

            victoria = calcularVictoria(opcionUsuario, opcionMaquina);

            System.out.println();

            mostrarResultado(victoria, "Usuario", opcionUsuario, "Máquina", opcionMaquina);

            System.out.println();
            System.out.println("Intro para continuar...");
            entrada.nextLine();
        }

        entrada.close();
    }

    /**
     * Pide un número entero y devuelve lo que escriba el usuario tras limpiar la entrada.
     *
     * @param entrada objeto Scanner para leer de la entrada estándar.
     * @param mensaje objecto String con la información necesaria para que el usuario sepa lo que tiene que escribir.
     * @return el número entero escrito por el usuario.
     */
    // TODO escribe el método pedirNumeroEnRango para que haga lo que se indica en el comentario
    private static int pedirNumeroEnRango(Scanner entrada, int min ,int max,String mensaje) {
        int numero;
        do {
            System.out.print(mensaje);
            numero = entrada.nextInt();
        } while (numero < min || numero > max);

        return numero;
    }

    /**
     * Muestra un menú de opciones al usuario:
     * 1.- Piedra
     * 2.- Papel
     * 3.- Tijera
     *
     * Garantiza que el usuario ha elegido una opción entre 1 y 3.
     *
     * @param entrada objeto Scanner para leer por teclado.
     * @return número entero: 1 (piedra), 2 (papel), 3 (tijera).
     */
    // TODO escribe el método pedirOpcionUsuario para que haga lo que se indica en el comentario
    private static int pedirOpcionUsuario(Scanner entrada) {
        int opcion;
        System.out.println("1.- Piedra");
        System.out.println("2.- Papel");
        System.out.println("3.- Tijera");
        System.out.print("Dame una opción: ");
        opcion = entrada.nextInt();
        return opcion;
    }

    /**
     * Genera un número aleatorio entre 1 y 3 que represente la opción de la máquina.
     * @return número entero: 1 (piedra), 2 (papel), 3 (tijera).
     */
    // TODO escribe el método generarOpcionMaquina para que haga lo que se indica en el comentario
    private static int generarOpcionMaquina() {
        int numero = (int) Math.random() * 3 + 1;
        return numero;
    }

    /**
     * Calcula quién ha ganado una partida a piedra, papel o tijera.
     *
     * Considera que: 1 es piedra, 2 es papel y 3 es tijera.
     *
     * Esta función asume que tanto jugador1 como jugador2 tiene un valor
     * correcto, es decir, un valor entero entre 1 y 3.
     *
     * Si los valores de jugador1 y jugador2 están mal, el resultado
     * será inesperado.
     *
     * @param jugador1 la opción del jugador 1.
     * @param jugador2 la opción del jugador 2.
     * @return devuelve 1 si ha ganado el jugador 1.
     *         devuelve 2 si ha ganado el jugador 2.
     *         devuelve 0 si han empatado (misma opción).
     */
    // TODO escribe el método calcularVictoria para que haga lo que se indica en el comentario
    private static int calcularVictoria(int jugador1, int jugador2) {
        if (jugador1 == 1 && jugador2 == 2) {
            return 2;
        }
        if (jugador1 == 1 && jugador2 == 3) {
            return 1;
        }
        if (jugador1 == 2 && jugador2 == 1) {
            return 1;
        }
        if (jugador1 == 2 && jugador2 == 3) {
            return 2;
        }
        if (jugador1 == 3 && jugador2 == 1) {
            return 1;
        }
        if (jugador1 == 3 && jugador2 == 2) {
            return 2;
        }

        return 0;
    }

    /**
     * Muestra por pantalla el resultado de una partida.
     *
     * @param victoria indica quién ha ganado: 1 o 2.
     * @param nombre1 el nombre del jugador 1.
     * @param opcion1 la opción elegida por el jugador 1.
     * @param nombre2 el nombre del jugador 2.
     * @param opcion2 la opción elegida por el jugador 2.
     */
    // TODO escribe el método mostrarResultado para que haga lo que se indica en el comentario
    private static int mostrarResultado(int victoria,String nombre1,int opcion1,String nombre2,int opcion2) {
        if (victoria == 1) {
            System.out.print("Ha ganado el jugador 1");
        } else if (victoria == 2) {
            System.out.print("Ha ganado el jugador 2");
        }

    }

    /**
     * Asume que el parámetro opción es 1, 2 o 3, de manera que si se pasa otro número
     * el resultado será inesperado.
     *
     * @param opcion número de la opción: 1, 2 o 3.
     * @return el nombre de la opción elegida: 1 = Piedra, 2 = Papel, 3 = Tijera
     */
    // TODO escribe el método nombreOpcion para que haga lo que se indica en el comentario
    private static int nombreOpcion(int opcion) {

    }
}
