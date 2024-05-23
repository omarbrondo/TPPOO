package Buquealtoque;

import java.util.Scanner;

public class GestorPersona {
	
	 public static void registrarNuevoUsuario() {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese el correo electrónico: ");
	        String email = scanner.nextLine();

	        System.out.print("Ingrese el nombre: ");
	        String nombre = scanner.nextLine();

	        System.out.print("Ingrese el apellido: ");
	        String apellido = scanner.nextLine();

	        System.out.print("Ingrese el DNI: ");
	        String dni = scanner.nextLine();

	        System.out.print("Ingrese la contraseña: ");
	        String password = scanner.nextLine();

	        System.out.print("Ingrese el tipo de usuario (Cliente/Empleado): ");
	        String tipo = scanner.nextLine();

	        Persona.agregarUsuario(email, nombre, apellido, dni, password, tipo);
	        System.out.println("Usuario registrado con éxito.");
	    }
	
	
	
	
   /* private static final int CAPACIDAD_INICIAL = 10; 
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

        Persona nuevaPersona = new Persona(nombre, apellido, domicilio, dni, fechaNacimiento, tarjetaCredito, email, contraseña);


        if (contadorPersonas >= personas.length) {
       
            Persona[] newArray = new Persona[personas.length * 2];

            System.arraycopy(personas, 0, newArray, 0, personas.length);
            personas = newArray;
        }

        personas[contadorPersonas++] = nuevaPersona;

        
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
    }*/
}
