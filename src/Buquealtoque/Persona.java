package Buquealtoque;
import java.util.Scanner;
public class Persona {
	
	 private String nombre;
	 private String apellido;
	 private String domicilio;
	 private String dni;
	 private String fechaNacimiento;
	 private String tarjetaCredito;
	 private String email;
	 private String contraseña;
	 
	 
	 public Persona(String nombre, String apellido, String domicilio, String dni, String fechaNacimiento,String tarjetaCredito, String email, String contraseña){
     this.nombre = nombre;
     this.apellido = apellido;
     this.domicilio = domicilio;
     this.dni = dni;
     this.fechaNacimiento = fechaNacimiento;
     this.tarjetaCredito = tarjetaCredito;
     this.email = email;
     this.contraseña = contraseña;
     
 }
	 public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public String getApellido() {
	        return apellido;
	    }

	    public void setApellido(String apellido) {
	        this.apellido = apellido;
	    }

	    public String getDomicilio() {
	        return domicilio;
	    }

	    public void setDomicilio(String domicilio) {
	        this.domicilio = domicilio;
	    }

	    public String getDni() {
	        return dni;
	    }

	    public void setDni(String dni) {
	        this.dni = dni;
	    }

	    public String getFechaNacimiento() {
	        return fechaNacimiento;
	    }

	    public void setFechaNacimiento(String fechaNacimiento) {
	        this.fechaNacimiento = fechaNacimiento;
	    }

	    public String getTarjetaCredito() {
	        return tarjetaCredito;
	    }

	    public void setTarjetaCredito(String tarjetaCredito) {
	        this.tarjetaCredito = tarjetaCredito;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }
	    


	    public String getContraseña() {
	        return contraseña;
	    }

	    public void setContraseña(String contraseña) {
	        this.contraseña = contraseña;
	    }

}

