package Buquealtoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorReserva {
    private static List<Buque> buques = new ArrayList<>();
    private static List<Reserva> reservas = new ArrayList<>();

    static {
        // Crear algunos buques
        buques.add(new Buque("B001", 1)); // 1 es Argentina
        buques.add(new Buque("B002", 2)); // 2 es Uruguay
    }

    public static void mostrarAsientosBuque() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el ID del buque:");
        String buqueId = scanner.nextLine();

        Buque buque = encontrarBuque(buqueId);
        if (buque != null) {
            buque.mostrarAsientos();
        } else {
            System.out.println("Buque no encontrado.");
        }
    }

    public static void gestionarReserva() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el DNI del cliente:");
        String dni = scanner.nextLine();

        System.out.println("¿A qué destino desea viajar?\n");
        System.out.println("[1] Argentina\n");
        System.out.println("[2] Uruguay\n");
        int destino = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        Buque buque = encontrarBuquePorDestino(destino);
        if (buque != null) {
            buque.mostrarAsientos();

            System.out.println("Ingrese el asiento (por ejemplo, 1A, 2B):");
            String asientoId = scanner.nextLine();

            int[] filaColumna = buque.getFilaColumnaFromId(asientoId);
            if (filaColumna == null) {
                System.out.println("Asiento incorrecto. Seleccione un asiento correcto.");
                return;
            }

            int fila = filaColumna[0];
            int columna = filaColumna[1];

            if (!buque.getAsientos()[fila][columna]) {
                buque.getAsientos()[fila][columna] = true;
                reservas.add(new Reserva(dni, buque.getId(), fila, columna));
                System.out.println("Reserva realizada exitosamente.");
            } else {
                System.out.println("Asiento ya está ocupado.");
            }
        } else {
            System.out.println("Destino no disponible.");
        }
    }

    private static Buque encontrarBuque(String id) {
        for (Buque buque : buques) {
            if (buque.getId().equals(id)) {
                return buque;
            }
        }
        return null;
    }

    private static Buque encontrarBuquePorDestino(int destino) {
        for (Buque buque : buques) {
            if (buque.getDestino() == destino) {
                return buque;
            }
        }
        return null;
    }
}
