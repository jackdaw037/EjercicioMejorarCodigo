import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int vida = 30;           // Vida actual del jugador
        int vidaMaxima = 30;     // Vida máxima
        int daño = 5;            // Daño base
        int experiencia = 0;     // Experiencia acumulada
        boolean jugando = true;  // Control del bucle principal

        System.out.println("=== Mini Juego  ===");
        System.out.println("Comienzas con " + vida + " de vida, daño base " + daño + ".");
        System.out.println("Escribe un número del 1 al 4 para jugar, o 0 para salir.\n");

        while (jugando) {
            mostrarEstado(vida, vidaMaxima, daño, experiencia);
            System.out.print("Acción (1: Atacar, 2: Curar, 3: Recuperar toda la vida, 4: Entrenar, 0: Salir): ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 0:
                    System.out.println("Has decidido salir del juego. ¡Hasta pronto!");
                    jugando = false;
                    break;

                case 1:
                    // Atacar
                    int dañoRecibido = 3 + random.nextInt(5); // Daño aleatorio entre 3 y 7
                    int expGanada = 5 + random.nextInt(7);    // Experiencia aleatoria entre 5 y 11

                    vida -= dañoRecibido;
                    experiencia += expGanada;

                    System.out.println("Atacaste al enemigo y ganaste " + expGanada + " XP, pero recibiste " + dañoRecibido + " de daño.");

                    // Subida de daño al alcanzar ciertos puntos de experiencia
                    if (experiencia >= 50 && experiencia % 50 < 10) {
                        daño += 2;
                        System.out.println("¡Tu daño ha aumentado! Nuevo daño: " + daño);
                    }
                    break;

                case 2:
                    // Curar parcialmente
                    vida += 10;
                    if (vida > vidaMaxima) vida = vidaMaxima;
                    System.out.println("Te has curado 10 puntos de vida.");
                    break;

                case 3:
                    // Curar completamente
                    vida = vidaMaxima;
                    System.out.println("Recuperaste toda tu vida.");
                    break;

                case 4:
                    // Entrenamiento
                    int expEntrenamiento = 5 + random.nextInt(7); // Ganas entre 5 y 11 XP
                    experiencia += expEntrenamiento;
                    daño += experiencia / 100; // Mejora de daño cada 100 XP

                    System.out.println("Entrenaste y ganaste " + expEntrenamiento + " XP.");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta nuevamente.");
            }

            // Si la vida llega a 0 o menos, termina el juego
            if (vida <= 0 && jugando) {
                System.out.println(" Has muerto en batalla. Fin del juego.");
                jugando = false;
            }
        }

        scanner.close();
    }

    // Método auxiliar para mostrar el estado actual del jugador
    private static void mostrarEstado(int vida, int vidaMaxima, int daño, int experiencia) {
        System.out.println("\n--- Estado del Jugador ---");
        System.out.println("Vida: " + vida + "/" + vidaMaxima);
        System.out.println("Daño: " + daño);
        System.out.println("Experiencia: " + experiencia);
        System.out.println("--------------------------");
    }
}
