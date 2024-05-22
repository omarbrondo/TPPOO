package Buquealtoque;

public class Producto {
	int id;
	String descripcion;
	double valor;
	
	public Producto() {}
	
	public Producto(int id, String descripcion, double valor) {
		this.id=id;
		this.descripcion=descripcion;
		this.valor=valor;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion=descripcion;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setValor(double valor) {
		this.valor=valor;
	}
	
	public double getValor() {
		return valor;
	}
	
	@Override
    public String toString() {
        return "Producto [id=" + id + ", descripcion=" + descripcion + ", valor=" + valor + "]";
    }
	
	public void mostrarProductos(Producto[] productosArray) {
		if (productosArray == null || productosArray.length == 0) {
            System.out.println("No hay productos disponibles.");
        } else {
            for (Producto producto : productosArray) {
                System.out.println(producto.toString());
            }
        }
    }
	
	
    
    

	
}

