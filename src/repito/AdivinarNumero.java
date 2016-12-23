import java.util.Scanner;

import edu.femxa.val.herencia.main;

public class AdivinarNumero {
	
	public static void generarNumero()
	{
		int contador = 0;
		int valorAleatorio  = (int) (100* Math.random() + 1 );//genera un valor aleatorio
				
				do	{ 	//bucle comparativo del numero introducido con e numero generado
					int numeroIntroducido = pedirNumero();
					
					if( numeroIntroducido == valorAleatorio )
						
					System.out.println("has acertado, CAMPEON!!!!!");
					else if (numeroIntroducido < valorAleatorio)		
				
					System.out.println("busca un numero mayor");
					
					if (numeroIntroducido > valorAleatorio)
						System.out.println("busca un numero menor");
						
							contador ++;	
					}
			
					while (contador < 5);// si es menor vuelve a entrar al do.
			
						System.out.println("insert coin");
	}
	public static int pedirNumero()// pido un numero
	{
			int num_leido = 0;
			Scanner scanner = null;
				
				scanner = new Scanner(System.in); //preparo para leer de la entrada estándar (teclado)
				System.out.println("introduce numero del 1 al 100");
				num_leido = scanner.nextInt(); //leo y asigno
			
			return num_leido;
	
	}
	
	public static void main(String[] args) 	
	{
	
			generarNumero();//llamo al metodo generar numero.
	
	}
	}

