package es.studium.SumaFuncion;

import java.util.Scanner;

public class SumaFuncion 
{
	public static void main(String[] args) 
	{
		int numero1, numero2, r;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR �Dame un n�mero:�
		System.out.println("Dame un n�mero:");
		
		//LEER numero1
		numero1 = teclado.nextInt();
		
		//ESCRIBIR �Dame otro n�mero:�
		System.out.println("Dame otro n�mero:");
		
		//LEER numero2
		numero2 = teclado.nextInt();
		
		teclado.close();
		
		//r = suma(numero1, numero2)
		r = suma(numero1, numero2);
		
		//ESCRIBIR �La suma de los dos n�meros es:�+r 
		System.out.println("La suma de los dos n�meros es: " + r);
	}

	private static int suma(int a, int b) 
	{
		return (a + b);
	}
}
