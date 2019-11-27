package es.studium.Potencia2;

import java.util.Scanner;

public class Potencia2 
{
	public static void main(String[] args) 
	{
		int a, b;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR �Dame un n�mero para la base:�
		System.out.println("Dame un n�mero para la base:");
		
		//LEER a
		a = teclado.nextInt();
		
		//ESCRIBIR �Dame un n�mero para el exponente:�
		System.out.println("Dame un n�mero para el exponente:");
		
		//LEER b
		b = teclado.nextInt();
				
		//ESCRIBIR �El n�mero� + a + �elevado a� + b + �es igual a:� + pot (a,b)
		System.out.println("El n�mero " + a + " elevado a " + b + " es igual a: " + potencia(a, b));
		
		teclado.close();
	}
		
	
	//FUNCION pot (ENTERO base, ENTERO exponente) DEVUELVE ENTERO
	private static double potencia(int a, int b) 
	{
		//ENTERO i, resultado=1
		double i, resultado=1;
		
		//PARA i=1 HASTA exponente HACER
		for (i=1; i<=b; i++) 
		{
			//resultado=resultado*base
			resultado *= a; 
		}
		
		return (resultado);
	}
}
