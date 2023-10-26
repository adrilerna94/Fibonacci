
// siempre importar librería java.util.Scanner antes de utilizar Scanner

import java.util.Scanner; 

public class Fibonacci
{

	// Se inicia el programa

	public static void main (String []args) 
	{
			
	    //Imprimimos por consola mensaje
		
		System.out.println("Introduce un número");
		
		// Instanciamos el objeto scanner para poder Entrar Datos por Teclado
		Scanner scanner = new Scanner(System.in); 
		
		// Asignamos a una variable Entrada datos + convertimos String a Int con ""Integer.parseInt()""
		int num = Integer.parseInt(scanner.nextLine());
		
		// Declaración múltiple siempre y cuando sean variables con = tipado
		int sum = 1, num1=0, num2= 1; 
		
		// BUCLE if/else si queremos poner expresiones booleanas
		
		if (num == 0)  // Caso base
		{
			System.out.println("0");
		}
		
		else if (num < 0)System.out.println("Escriba un numero mayor o igual a 0"); // Excepción
		
		else  // caso por defecto
		{
			for(int x = 0; x < num; x++) // bucle for porque conocemos numero de iteraciones
			{
				System.out.println("numero \t" +(x+1)+ "\t" +sum);
				sum = num1 + num2;
				num1= num2; // conseguimos iterar las posiciones en la serie de n1  y n2
				num2= sum;
				
			}
		}
		
		
		//--------------------------------------------------------------------------------------------------
		
		
		// switch solo funcionan literales o constantes no podemos poner un booleano
		/*switch(num)
		{
			case 0:
				{
					System.out.println("0");
					break;
				}
			default:
			{
				for(int x = 0; x < num; x++)
				{
					System.out.println("numero \t" +(x+1)+ "\t" +sum);
					sum = num1 + num2;
					num1= num2;
					num2= sum;
					
				}
			}
		}*/
		
		
	}

}