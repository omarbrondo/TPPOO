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

        String password;
        while (true) {
            System.out.print("Ingrese la contraseña (mínimo 8 caracteres, al menos 1 número): ");
            password = scanner.nextLine();

            if (isValidPassword(password)) {
                break;
            } else {
                System.out.println("La contraseña no cumple con los requisitos. Inténtelo de nuevo.");
            }
        }

        System.out.print("Ingrese el tipo de usuario (Cliente/Empleado): ");
        String tipo = scanner.nextLine();

        Persona.agregarUsuario(email, nombre, apellido, dni, password, tipo, false);
        System.out.println("Usuario registrado con éxito.");
    }

    private static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasNumber = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasNumber = true;
                break;
            }
        }

        return hasNumber;
    }
}
