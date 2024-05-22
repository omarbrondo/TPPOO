package Buquealtoque;

public class Principal {

    public static void main(String[] args) {
        Menu menu = new Menu();
        while (true) {
            menu.mostrarMenu();
            int opcion = menu.leerOpcion();

            switch (opcion) {
                case 1:
                    // Lógica para alta de reserva
                    GestorReserva.gestionarReserva();
                    break;
                case 2:
                    // Lógica para alta de cliente
                    GestorPersona.altaPersona();
                    break;
                case 3:
                    // Lógica para pagar reserva (implementación futura)
                    System.out.println("Pagar reserva (implementación futura)");
                    break;
                case 4:
                    // Mostrar todos los paquetes
                    GestorPaquetes.mostrarPaquetes();
                    break;
                case 5:
                    // Buscar paquete por ID
                    GestorPaquetes.mostrarPaquetePorId();
                    break;
                case 6:
                    // Ver mis reservas
                    GestorReserva.verMisReservas();
                    break;
                case 7:
                    System.out.println("Saliendo del sistema...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}
