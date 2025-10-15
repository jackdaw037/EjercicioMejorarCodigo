import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dinero = 50;          // Dinero disponible
        int ganancias = 0;        // Ganancias acumuladas
        int productoA = 0;        // Contador de productos tipo A
        int productoB = 0;        // Contador de productos tipo B
        int productoC = 0;        // Contador de productos tipo C
        boolean ejecutando = true;

        System.out.println("=== Simulador de Compras ===");
        System.out.println("Tienes $" + dinero + " disponibles.\n");

        while (ejecutando) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Comprar producto A (cuesta $10, gana $5)");
            System.out.println("2. Comprar producto B (cuesta $7, gana $3)");
            System.out.println("3. Comprar producto C (cuesta $20, gana $10)");
            System.out.println("4. Ver estado actual");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    if (dinero >= 10) {
                        dinero -= 10;
                        ganancias += 5;
                        productoA++;
                        System.out.println("Compraste producto A.");
                    } else {
                        System.out.println("No tienes suficiente dinero.");
                    }
                    break;

                case 2:
                    if (dinero >= 7) {
                        dinero -= 7;
                        ganancias += 3;
                        productoB++;
                        System.out.println("Compraste producto B.");
                    } else {
                        System.out.println("No tienes suficiente dinero.");
                    }
                    break;

                case 3:
                    if (dinero >= 20) {
                        dinero -= 20;
                        ganancias += 10;
                        productoC++;
                        System.out.println("Compraste producto C.");
                    } else {
                        System.out.println("No tienes suficiente dinero.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Estado Actual ---");
                    System.out.println("Dinero restante: $" + dinero);
                    System.out.println("Ganancias acumuladas: $" + ganancias);
                    System.out.println("Productos comprados:");
                    System.out.println("A: " + productoA);
                    System.out.println("B: " + productoB);
                    System.out.println("C: " + productoC);
                    break;

                case 5:
                    System.out.println("Te quedaste sin dinero ");
                    ejecutando = false;
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }

            // Si el dinero se acaba, termina el programa
            if (dinero <= 0 && ejecutando) {
                System.out.println("Te has quedado sin dinero. Fin del programa.");
                ejecutando = false;
            }
        }

        scanner.close();
    }
}
