package es.studium.Expresi�n;

import java.util.Scanner;

public class Expresi�n 
{
	public static void main(String[] args) 
	{
		int a, b, c;
		double r;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR �Dame el n�mero equivalente a la letra a:�
		System.out.println("Dame el n�mero equivalente a la letra a:");
		
		//LEER a
		a = teclado.nextInt();
		
		//ESCRIBIR �Dame el n�mero equivalente a la letra b:�
		System.out.println("Dame el n�mero equivalente a la letra b:");
		
		//LEER b
		b = teclado.nextInt();
		
		//ESCRIBIR �Dame el n�mero equivalente a la letra c:�
		System.out.println("Dame el n�mero equivalente a la letra c:");
		
		//LEER c
		c = teclado.nextInt();
		
		teclado.close();
		
		r = expresion (a, b, c);
		
		//ESCRIBIR �El resultado de aplicar la expresi�n los n�meros dados es:� + r
		System.out.println("El resultado de aplicar la expresi�n los n�meros dados es: " + r);
	}
	
	private static double expresion (int a, int b, int c) 
	{
				return (((double)(b*b)-(4*a*c))/(double)2*a);
	}
}
