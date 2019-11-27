package es.studium.Operaciones2;

import java.util.Scanner;

public class Operaciones2 
{
	public static void main(String[] args) 
	{
		int a, b;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR “Dame un número:”
		System.out.println("Dame un número:");
		
		//LEER a
		a = teclado.nextInt();
		
		//ESCRIBIR “Dame otro número:”
		System.out.println("Dame otro número:");
		
		//LEER num2
		b = teclado.nextInt();
		
		//ESCRIBIR “La suma de los números es:” + suma(num1,num2)
		System.out.println("La suma de los números es: " + suma(a, b));
		
		//ESCRIBIR “El número 1 menos el número 2 es:” + resta(num1,num2)
		System.out.println("La resta de los números es: " + resta(a, b));
		
		//ESCRIBIR “La multiplicación de los números es:” + producto(num1,num2)
		System.out.println("La multiplicación de los números es: " + producto(a, b));
		
		teclado.close();
		
		if (b==0) 
		{
			//ESCRIBIR “La división no es posible. El número 2 no puede tener valor cero”
			System.out.println("La dicvisión no es posible. El número 2 no puede tener valor cero (0)");	
		}
		else 
		{
			//ESCRIBIR “El cociente del número 1 dividido por el número 2 es:” + cociente
			System.out.println("La división vale: " + division(a, b));
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
