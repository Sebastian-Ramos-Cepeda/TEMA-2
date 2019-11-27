package es.studium.Operaciones2;

import java.util.Scanner;

public class Operaciones2 
{
	public static void main(String[] args) 
	{
		int a, b;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR �Dame un n�mero:�
		System.out.println("Dame un n�mero:");
		
		//LEER a
		a = teclado.nextInt();
		
		//ESCRIBIR �Dame otro n�mero:�
		System.out.println("Dame otro n�mero:");
		
		//LEER num2
		b = teclado.nextInt();
		
		//ESCRIBIR �La suma de los n�meros es:� + suma(num1,num2)
		System.out.println("La suma de los n�meros es: " + suma(a, b));
		
		//ESCRIBIR �El n�mero 1 menos el n�mero 2 es:� + resta(num1,num2)
		System.out.println("La resta de los n�meros es: " + resta(a, b));
		
		//ESCRIBIR �La multiplicaci�n de los n�meros es:� + producto(num1,num2)
		System.out.println("La multiplicaci�n de los n�meros es: " + producto(a, b));
		
		teclado.close();
		
		if (b==0) 
		{
			//ESCRIBIR �La divisi�n no es posible. El n�mero 2 no puede tener valor cero�
			System.out.println("La dicvisi�n no es posible. El n�mero 2 no puede tener valor cero (0)");	
		}
		else 
		{
			//ESCRIBIR �El cociente del n�mero 1 dividido por el n�mero 2 es:� + cociente
			System.out.println("La divisi�n vale: " + division(a, b));
		}
	}
	
	public static int suma(int a, int b) 
	{
		return(a+b);
	}
	
	public static int resta(int a, int b) 
	{
		return(a-b);
	}
	
	public static int producto(int a, int b) 
	{
		return(a*b);
	}
	
	public static double division(int a, int b) 
	{
		return((double)a/(double)b);
	}
}
