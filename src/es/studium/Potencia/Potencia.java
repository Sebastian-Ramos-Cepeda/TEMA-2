package es.studium.Potencia;

import java.util.Scanner;

public class Potencia 
{
	public static void main(String[] args) 
	{
		int base, exp, resultado, i;
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//resultado=1
		resultado = 1;
		
		//ESCRIBIR �Dame un n�mero para la base:�
		System.out.println("Dame un n�mero para la base:");
		
		//LEER base
		base = teclado.nextInt();
		
		//ESCRIBIR �Dame un n�mero para el exponente:�
		System.out.println("Dame un n�mero para el exponente:");
		
		//LEER exponente
		exp = teclado.nextInt();
		
		teclado.close();
		
		//PARA i=1 HASTA exp HACER
		for (i = 1; i <= exp; i++) 
		{
			//resultado=resultado*base
			resultado = resultado*base;
		}
		//ESCRIBIR �El n�mero� + base + �elevado a� + exp + �es� + resultado 
		System.out.println("El n�mero " + base + " elevado a " + exp + " es " + resultado);
	}		
}

