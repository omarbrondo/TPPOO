package Buquealtoque;
import java.util.Scanner;
//public class Persona {
	
	 /*private String nombre;
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

}*/
	
	import java.util.ArrayList;
	import java.util.List;

	public class Persona {
	    private String email;
	    private String nombre;
	    private String apellido;
	    private String dni;
	    private String password;
	    private String tipo;

	    // Constructor
	    public Persona(String email, String nombre, String apellido, String dni, String password, String tipo) {
	        this.email = email;
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.dni = dni;
	        this.password = password;
	        this.tipo = tipo;
	    }

	    // Getters
	    public String getEmail() {
	        return email;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public String getApellido() {
	        return apellido;
	    }

	    public String getTipo() {
	        return tipo;
	    }

	    // Lista de usuarios predefinidos
	    private static List<Persona> usuarios = new ArrayList<>();

	    static {
	        usuarios.add(new Persona("omarbrondo@gmail.com", "Omar", "Brondo", "31895218", "felicitas", "Cliente"));
	        usuarios.add(new Persona("barby@outlook.com", "Barby", "Carrizo", "33037264", "gordo", "Empleado"));
	        // Puedes agregar más usuarios aquí
	    }

	    // Método para validar usuario
	    public static Persona validarUsuario(String email, String password) {
	        for (Persona usuario : usuarios) {
	            if (usuario.getEmail().equals(email) && usuario.getPassword().equals(password)) {
	                return usuario;
	            }
	        }
	        return null;
	    }

	    // Método para agregar un nuevo usuario
	    public static void agregarUsuario(String email, String nombre, String apellido, String dni, String password, String tipo) {
	        usuarios.add(new Persona(email, nombre, apellido, dni, password, tipo));
	    }
	}

