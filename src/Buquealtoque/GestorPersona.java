package Buquealtoque;

import java.util.Scanner;

public class GestorPersona {
    private static final int CAPACIDAD_INICIAL = 10; // Capacidad inicial del array
    private static Persona[] personas = new Persona[CAPACIDAD_INICIAL];
    private static int contadorPersonas = 0;

    public static void altaPersona() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del cliente:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el apellido del cliente:");
        String apellido = scanner.nextLine();

        System.out.println("Ingrese el domicilio del cliente:");
        String domicilio = scanner.nextLine();

        System.out.println("Ingrese el DNI del cliente:");
        String dni = scanner.nextLine();

        System.out.println("Ingrese la Fecha de nacimiento del cliente:");
        String fechaNacimiento = scanner.nextLine();

        System.out.println("Ingrese el número de la tarjeta de Crédito:");
        String tarjetaCredito = scanner.nextLine();

        System.out.println("Ingrese el Email:");
        String email = scanner.nextLine();

        System.out.println("Ingrese la Password:");
        String contraseña = scanner.nextLine();

        // Crear la nueva persona
        Persona nuevaPersona = new Persona(nombre, apellido, domicilio, dni, fechaNacimiento, tarjetaCredito, email, contraseña);

        // Asegurar que el array tenga suficiente capacidad
        if (contadorPersonas >= personas.length) {
            // Redimensionar el array
            Persona[] newArray = new Persona[personas.length * 2];
            // Copiar elementos al nuevo array
            System.arraycopy(personas, 0, newArray, 0, personas.length);
            personas = newArray;
        }

        // Agregar la nueva persona al array y actualizar el contador
        personas[contadorPersonas++] = nuevaPersona;

        // Retornar al método llamante
        imprimirPersonas();
    }

    public static void imprimirPersonas() {
        System.out.println("Lista de personas:");
        for (int i = 0; i < contadorPersonas; i++) {
            System.out.println("Persona " + (i + 1) + ":");
            System.out.println("Nombre: " + personas[i].getNombre());
            System.out.println("Apellido: " + personas[i].getApellido());
            System.out.println("Domicilio: " + personas[i].getDomicilio());
            System.out.println("DNI: " + personas[i].getDni());
            System.out.println("Fecha de nacimiento: " + personas[i].getFechaNacimiento());
            System.out.println("Tarjeta de Crédito: " + personas[i].getTarjetaCredito());
            System.out.println("Email: " + personas[i].getEmail());
            System.out.println("Contraseña: " + personas[i].getContraseña());
            System.out.println();
        }
    }
}
