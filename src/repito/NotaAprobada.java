package repito;


import java.util.Scanner;

/**
 * progrma que pide una nota entera
 * hasta que sea mayor que 5 (aprobada)
 * @author Administrador
 *
 */
public class NotaAprobada {
	
	private static  boolean aprobado (int n)
	{
		return (n>=5);// se puede hacer usando el if.
		
	}

	
	public static int pedirNota ()
	{
		int num_leido = 0;
		Scanner scanner = null;
			
			System.out.println("Pedir nota");
			scanner = new Scanner(System.in); //preparo para leer de la entrada est�ndar (teclado)
			num_leido = scanner.nextInt(); //leo y asigno
			
		
		return num_leido;
	}
	public static void main(String[] args) {
		
		int nota = 0;
		
		
		do
		{
			nota = pedirNota();
			
			
		} while (!aprobado(nota));// seria lo mismo que (aprobado 00 false)
		
		
		System.out.println("APROBASTE");
		
	}
}
