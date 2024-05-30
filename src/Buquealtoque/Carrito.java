package Buquealtoque;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Carrito extends GestorReserva {

    public static List<Object> carritoCompras = new ArrayList<>();

    public static void gestionarCarrito() {

        Menu menuCarrito = new Menu();
        menuCarrito.mostrarMenuCarrito();

        int opcion = menuCarrito.leerOpcion();

        switch (opcion) {
            case 1:
                // Lógica para alta de reserva
                GestorReserva.gestionarReserva();
                break;
            case 2:
                // Lógica para alta de Experiencias
                // Mostrar paquetes disponibles y permitir al usuario elegir uno
                GestorPaquetes.mostrarPaquetes();
                GestorPaquetes.seleccionarPaquete();
                break;
            case 3:
                // Lógica para ver carrito
                verCarrito();
                break;
            case 4:
                // Lógica para pagar (implementación futura)
                System.out.println("Pagar (implementación futura)");
                // carritoCompras.clear();
                break;
            case 5:
                // Limpiar carrito y Salir
                System.out.println("Saliendo del carrito...");
                carritoCompras.clear();
                return;
            default:
                System.out.println("Opción inválida");
        }
    }

    private static void verCarrito() {
        Menu menuCarrito = new Menu();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Carrito de compras:");

        boolean found = false;
        for (Object item : carritoCompras) {
            if (item instanceof Reserva) {
                Reserva reserva = (Reserva) item;
                System.out.println("ID de reserva: " + reserva.getId());
                System.out.println("Buque: " + reserva.getBuqueId());
                System.out.println("Destino: " + (reserva.getDestino() == 1 ? "Argentina" : "Uruguay"));
                System.out.println("Asiento: " + convertirAsiento(reserva.getFila(), reserva.getColumna()));
                System.out.println("Pagado: " + reserva.isPagada());
                System.out.println("\n");
                found = true;
            } else if (item instanceof Producto) {
                Producto producto = (Producto) item;
                System.out.println(producto);
                found = true;
            }
        }

        if (!found) {
            System.out.println("El carrito está vacío.");
        }
    }

}
