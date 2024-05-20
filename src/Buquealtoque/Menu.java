package Buquealtoque;

import java.util.Scanner;

public class Menu {
    public void mostrarMenu() {
        System.out.println("[1] Alta de reserva");
        System.out.println("[2] Alta de cliente");
        System.out.println("[3] Pagar reserva");
        System.out.println("[4] Ver mis reservas");
        System.out.println("[5] Salir");
        System.out.println("Ingrese la opción deseada:");
    }

    public int leerOpcion() {
        Scanner scanner = new Scanner(System.in);
        int opcionLeida = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente
        return opcionLeida;
    }
}
