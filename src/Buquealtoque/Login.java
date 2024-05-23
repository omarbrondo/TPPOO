package Buquealtoque;
import java.util.Scanner;

public class Login {
    public static Persona iniciarSesion() {
        Scanner scanner = new Scanner(System.in);
        Persona usuarioAutenticado = null;

        while (usuarioAutenticado == null) {
            System.out.print("Ingrese su correo electrónico: ");
            String email = scanner.nextLine();

            System.out.print("Ingrese su contraseña: ");
            String password = scanner.nextLine();

            usuarioAutenticado = Persona.validarUsuario(email, password);

            if (usuarioAutenticado == null) {
                System.out.println("Usuario o contraseña inválida. Intente nuevamente.");
            } else {
                System.out.println("Bienvenido, " + usuarioAutenticado.getNombre() + " " + usuarioAutenticado.getApellido() + " (" + usuarioAutenticado.getTipo() + ")!");
            }
        }

        return usuarioAutenticado;
    }

}
