package es.studium.Ordena3N�meros;

import java.util.Scanner;

public class Ordena3N�meros 
{
	public static void main(String[] args) 
	{
		int a, b ,c;
		
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
		
		//ESCRIBIR �Dame otro n�mero:�
		System.out.println("Dame otro n�mero:");
		
		//LEER c
		c = teclado.nextInt();
		
		teclado.close();
		
		if(a>=b&&b>=c) 
		{
			System.out.println("Los n�meros ordenados de mayor a menor son:" + a + " " + b + " " + c);
		}
		
		else if(a>=c&&c>=b) 
		{
			System.out.println("Los n�meros ordenados de mayor a menor son: " + a + " " + c + " " + b);
		}
		
		else if(b>=a&&a>=c) 
		{
			System.out.println("Los n�meros ordenados de mayor a menor son: " + b + " " + a + " " + c);
		}
		
		else if(b>=c&&c>=a) 
		{
			System.out.println("Los n�meros ordenados de mayor a menor son: " + b + " " + c + " " + a);
		}
		
		else if(c>=a&&a>=b) 
		{
			System.out.println("Los n�meros ordenados de mayor a menor son: " + c + " " + a + " " + b);
		}
		
		else if(c>=b&&b>=a) 
		{
			System.out.println("Los n�meros ordenados de mayor a menor son: " + c + " " + b + " " + a);
		}
	}
}
