package Buquealtoque;

import java.util.Scanner;

public class Menu {
    public void mostrarMenu() {
        System.out.println("[1] Alta de reserva");
        System.out.println("[2] Alta de cliente");
        System.out.println("[3] Pagar reserva");
        System.out.println("[4] Mostrar todos los paquetes");
        System.out.println("[5] Buscar paquete por ID");
        System.out.println("[6] Ver mis reservas");
        System.out.println("[7] Salir");
        System.out.println("Ingrese la opción deseada:");
    }

    public int leerOpcion() {
        Scanner opcion = new Scanner(System.in);
        return opcion.nextInt();
    }
}
