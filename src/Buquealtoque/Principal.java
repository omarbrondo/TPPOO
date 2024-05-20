package Buquealtoque;

public class Principal {
    public static void main(String[] args) {
        Menu menu = new Menu();
        GestorReserva gestorReserva = new GestorReserva(); // Crear una instancia de GestorReserva

        int opcion;
        do {
            menu.mostrarMenu();
            opcion = menu.leerOpcion();

            switch (opcion) {
                case 1:
                    gestorReserva.gestionarReserva();
                    break;
                case 2:
                    GestorPersona.altaPersona();
                    break;
                case 3:
                    // Lógica para pagar reserva
                    break;
                case 4:
                    gestorReserva.verMisReservas(); // Llamar al método para ver las reservas
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (opcion != 5);
    }
}
