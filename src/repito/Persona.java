
public class Persona {
	
	private	int edad;
	private String nombre;
	
		public Persona ()
		{
		edad = 0;	//me crea una persona vacía
		nombre = null;
		}
		public Persona (String nombre, int edad)
		{
			this.edad = edad;
			this.nombre = nombre;
		}
		
	//generate getter and setter (para acceder)
	public String getNombre() {//leer el nombre
		return nombre;
	}
	public void setNombre(String nombre) {//leer la edad
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String toString()
	{
		String persona = "estado";
		persona = "nombre" + " "+ nombre;
		persona ="edad" + "  " +edad;
		return persona;
		}
		
	}
