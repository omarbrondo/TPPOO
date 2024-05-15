package Buquealtoque;

import java.util.Scanner;
public class Menu 
{
	
	public void mostrarMenu()
	{
		
		System.out.println("[1] Alta de reserva");
		System.out.println("[2] Alta de cliente");
		System.out.println("[3] Pagar reserva");
		System.out.println("[4] Salir");
		System.out.println("ingrese la opcion deseada:");
	}
	
	public int leerOpcion()
	{
		Scanner opcion=new Scanner(System.in);
		
		int opcionLeida=opcion.nextInt();
		return opcionLeida;
		
	}
}
