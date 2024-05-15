package Buquealtoque;

public class ReservacionBT 
{

	public static void main(String[] args) 
	{
		Menu menu = new Menu();
		Reserva reserva=new Reserva();
		
		menu.mostrarMenu();
		int opcion=menu.leerOpcion();
		
		if(opcion==1)
		{
			
		}
	
		if(opcion==3)
		{
			reserva.setEstado(EstadoReserva.PAGADA);
			reserva.mostrarEstado();
		}
		

	}

}
