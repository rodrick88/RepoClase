import java.util.Scanner;

public class CadenaPersonas {

public static void main(String[] args) {
	
	Persona persona1 = new Persona();//creo objeto persona de la clase persona.
	Persona persona2 = new Persona();
	Persona persona3 = new Persona();
	Persona persona4 = new Persona();
	Persona persona5 = new Persona();
	String nombre = null;
	int numeroMenu = 0; //declaro variable para jugar con el menu
	
	//Empieza el programa mostrando el usuario diferentes opciones 
	System.out.println("Menú, pulse: ");
	System.out.println("1 Insertar 2persona ");
	System.out.println("2 Para listar persona");
	System.out.println("3 Buscar persona por nombre");
	System.out.println("4 Borrar persona");
	System.out.println("5 Salir");
	
	numeroMenu = leerNumero();// se asigna el escaner a la variable numeroMenu
		while (numeroMenu != 5)//orden al programa de salir
		{
		if (numeroMenu == 1 ){//opcion 1 insertar nombre y edad de persona
		persona1.setNombre("nombre");
		System.out.println("escribe edad primera persona");
		
		persona1.setEdad(leerNumero());
		System.out.println("escribe edad segunda persona");
		persona2.setNombre(nombre);
		persona2.setEdad(leerNumero());
		System.out.println("escribe edad tercera persona");
		persona3.setNombre(nombre);
		persona3.setEdad(leerNumero());
		System.out.println("escribe edad cuarta persona");
		persona4.setNombre(nombre);
		persona4.setEdad(leerNumero());
		System.out.println("escribe edad quinta persona");
		persona5.setNombre(nombre);
		persona5.setEdad(leerNumero());
	
		
		System.out.println("Menú, pulse: ");
		System.out.println("1 Insertar 2persona ");
		System.out.println("2 Para listar persona");
		System.out.println("3 Buscar persona por nombre");
		System.out.println("4 Borrar persona");
		System.out.println("5 Salir");
		Persona();
		
		numeroMenu = leerNumero();
		}
		if (numeroMenu == 2){//opcion 2 listar todas las personas introducidas
		System.out.println(persona1);
		System.out.println(persona2);
		System.out.println(persona3);
		System.out.println(persona4);
		System.out.println(persona5);
		
		System.out.println("Menú, pulse: ");
		System.out.println("1 Insertar 2persona ");
		System.out.println("2 Para listar persona");
		System.out.println("3 Buscar persona por nombre");
		System.out.println("4 Borrar persona");
		System.out.println("5 Salir");
		
		numeroMenu = leerNumero();
		}
		if (numeroMenu == 3){//opcion 3 buscar persona por nombre  edad
			
			System.out.println("escribe la edad de la persona" + nombre );
		}
		if (numeroMenu == 4){
			System.out.println("opcion 4 ");
		}
		if (numeroMenu == 5){// opcion para salir de el progama
			System.out.println("gracias por usar este programa");
		}
		if (numeroMenu == 0){
			System.out.println("error inicie programa ");
		}
		if (numeroMenu >5){
			System.out.println("error inicie programa");
		}
		}
}

private static void Persona() {
	

}

public static int leerNumero() //con este escaner vamos a detectar el movimiento del usuario por el menú
{
	int numeroMenu = 0;
	Scanner scanner = null;
			
		scanner = new Scanner(System.in);
		numeroMenu = scanner.nextInt();
			
	return numeroMenu;
	
	
}
public static String leerNombre() //con este escaner vamos a detectar el movimiento del usuario por el menú
{
	String nombreLeido = null;
	Scanner scanner = null;
			
		scanner = new Scanner(System.in);
		nombreLeido = scanner.next();
			
	return nombreLeido;
	
	
}
}
