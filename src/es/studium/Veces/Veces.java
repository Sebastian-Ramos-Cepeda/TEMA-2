package es.studium.Veces;

import java.util.Scanner;

public class Veces
{
	public static void main(String[] args) 
	{
		int numero, veces, i;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR �Indicar un n�mero:�
		System.out.println("Indicar un n�mero:");
		
		//LEER veces
		veces = teclado.nextInt();
		
		//ESCRIBIR �Indicar otro n�mero:�
		System.out.println("Indicar otro n�mero:");
		
		//LEER numero
		numero = teclado.nextInt();
		
		teclado.close();
		
		//PARA i=1 HASTA veces HACER 
		for (i=1; i<=veces; i++)
		{
			//ESCRIBIR numero
			System.out.println(numero);
		}
	}
}
