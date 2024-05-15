package Buquealtoque;

public class Reserva 
{
	private int id;
	private EstadoReserva estado;
	private Pago pago;
//	private Cliente cliente;
//	private Producto producto;
	
	//metodos....
	
	
//	Reserva(Cliente c)
//	{
//		estado = EstadoReserva.ENEDICION;
//		cliente=c;
//	}
	
	public void setEstado(EstadoReserva er)
	{
		
		estado=er;
	}
	public void mostrarEstado()
	{
		System.out.println("el estado de la reserva es: " + estado);
	}
	
	
	
}
