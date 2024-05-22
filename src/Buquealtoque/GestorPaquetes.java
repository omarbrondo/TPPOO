package Buquealtoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestorPaquetes {
    private static List<Producto> paquetes = new ArrayList<>();

    static {
        // Crear algunos paquetes
        paquetes.add(new Producto(1, "Cena en Colonia", 20000)); 
        paquetes.add(new Producto(2, "Day tour", 27000)); 
        paquetes.add(new Producto(3, "Wine experience", 35000));
    }

    public static void mostrarPaquetes() {
        System.out.println("Paquetes disponibles:");
        for (Producto paquete : paquetes) {
            System.out.println(paquete);
        }
    }

    public static void mostrarPaquetePorId() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el ID del paquete: ");
        int productId = scanner.nextInt();

        Producto paquete = buscarPaquete(productId);
        if (paquete != null) {
            System.out.println(paquete);
        } else {
            System.out.println("Paquete con ID " + productId + " no encontrado.");
        }
    }

    private static Producto buscarPaquete(int id) {
        for (Producto producto : paquetes) {
            if (producto.getId() == id) {
                return producto;
            }
        }
        return null;
    }
}
