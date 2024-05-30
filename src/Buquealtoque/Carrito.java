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

        List<Reserva> reservas = new ArrayList<>();
        List<Producto> productos = new ArrayList<>();

        // Separar las reservas de los productos
        for (Object item : carritoCompras) {
            if (item instanceof Reserva) {
                reservas.add((Reserva) item);
            } else if (item instanceof Producto) {
                productos.add((Producto) item);
            }
        }

        // Mostrar las reservas de viaje
        if (!reservas.isEmpty()) {
            System.out.println("Reservas de Viaje:");
            System.out.printf("%-12s %-10s %-10s %-10s %-10s\n", "ID", "Buque", "Destino", "Asiento", "Pagado");
            System.out.println("------------------------------------------------------------");
            for (Reserva reserva : reservas) {
                String destino = reserva.getDestino() == 1 ? "Argentina" : "Uruguay";
                String asiento = convertirAsiento(reserva.getFila(), reserva.getColumna());
                String pagado = reserva.isPagada() ? "Sí" : "No";
                System.out.printf("%-12d %-10s %-10s %-10s %-10s\n", reserva.getId(), reserva.getBuqueId(), destino, asiento, pagado);
            }
        } else {
            System.out.println("No hay reservas de viaje en el carrito.");
        }

        // Mostrar los productos de experiencias
        if (!productos.isEmpty()) {
            System.out.println("\nProductos de Experiencias:");
            System.out.printf("%-12s %-30s %-10s\n", "ID", "Descripción", "Valor");
            System.out.println("------------------------------------------------------------");
            for (Producto producto : productos) {
                System.out.printf("%-12d %-30s %-10.2f\n", producto.getId(), producto.getDescripcion(), producto.getValor());
            }
        } else {
            System.out.println("\nNo hay productos de experiencias en el carrito.");
        }
    }
}
