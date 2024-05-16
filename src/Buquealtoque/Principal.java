package Buquealtoque;

public class Principal {

    public static void main(String[] args) {
        Menu menu = new Menu();
        boolean continuar = true;

        while (continuar) {
            menu.mostrarMenu();
            int opcion = menu.leerOpcion();

            switch (opcion) {
                case 1:
                    // Alta de reserva
                    break;
                case 2:
                    GestorPersona.altaPersona();
                    break;
                case 3:
                    GestorPersona.imprimirPersonas();
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        }
    }
}
