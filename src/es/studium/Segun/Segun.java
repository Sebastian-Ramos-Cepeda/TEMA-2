package es.studium.Segun;

import java.util.Scanner;

public class Segun 
{
	public static void main(String[] args) 
	{
		int a, b, resultado;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR �Dame un n�mero:�
		System.out.println("Dame un n�mero:");
				
		//LEER a
		a = teclado.nextInt();
				
		//ESCRIBIR �Dame otro n�mero:�
		System.out.println("Dame otro n�mero:");
				
		//LEER b
		b = teclado.nextInt();
		
		teclado.close();
		
		if (a<b) 
		{			
			resultado = a + b;
			//ESCRIBIR �La suma del n�mero1 y el n�mero2 es:� + resultado 
			System.out.println("La suma de a y b es: " + resultado);
		}
		else 
		{
			resultado = a * b;
			//ESCRIBIR �La suma del n�mero1 y el n�mero2 es:� + resultado 
			System.out.println("El producto de a y b es: " + resultado);
		}
	}
}
