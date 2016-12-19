package repito;


public class Persona {
	
	private int edad;
	private String nombre;
	
	//metodos de acceso:
	public int getEdad() { //Leer el nombre
			return edad;
	}
	public void setEdad(int edad) {//Escribir el nombre
			this.edad = edad;
	}
	public String getNombre() {
			return nombre;
	}
	public void setNombre(String nombre) {
			this.nombre = nombre;// "This" seria el objeto llamador.
	}
	public Persona(int edad, String nombre) {
		super();
		this.edad = edad;
		this.nombre = nombre;
	}
	public Persona ()
	{
		//me crea una persona vacía
	}
	
	public void mostarPersona ()
	{
		System.out.println("Nombre = " + this.nombre);
		System.out.println("Edad = " + this.edad);
	}
	
	

}
