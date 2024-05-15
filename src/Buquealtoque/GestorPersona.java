package Buquealtoque;

import java.util.Scanner;

public class GestorPersona {
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
        
        System.out.println("Ingrese el Fecha de nacimiento del cliente:");
        String fechaNacimiento = scanner.nextLine();
        
        System.out.println("Ingrese el numero de la tarjeta de Credito");
        String tarjetaCredito = scanner.nextLine();
        
        System.out.println("Ingrese Email");
        String email = scanner.nextLine();
        
        System.out.println("Ingrese Password");
        String contraseña = scanner.nextLine();
        

        Persona nuevoPersona = new Persona(nombre, apellido, domicilio, dni,fechaNacimiento,tarjetaCredito,email,contraseña);


}
}
