package es.studium.Segun;

import java.util.Scanner;

public class Segun 
{
	public static void main(String[] args) 
	{
		int a, b, resultado;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR “Dame un número:”
		System.out.println("Dame un número:");
				
		//LEER a
		a = teclado.nextInt();
				
		//ESCRIBIR “Dame otro número:”
		System.out.println("Dame otro número:");
				
		//LEER b
		b = teclado.nextInt();
		
		teclado.close();
		
		if (a<b) 
		{			
			resultado = a + b;
			//ESCRIBIR “La suma del número1 y el número2 es:” + resultado 
			System.out.println("La suma de a y b es: " + resultado);
		}
		else 
		{
			resultado = a * b;
			//ESCRIBIR “La suma del número1 y el número2 es:” + resultado 
			System.out.println("El producto de a y b es: " + resultado);
		}
	}
}
