package Buquealtoque;



public class Principal {

	public static void main(String[] args) {
		
		Menu menu = new Menu();
		
		menu.mostrarMenu();
		
		int opcion = menu.leerOpcion();
		
		switch(opcion) {
		case 1:
			break;
		case 2:
			GestorPersona.altaPersona();
			break;
		case 3:
			
			break;
		default:
			System.out.println("Opciòn invalida");
			break;
				
		}
		
	}

}
