package es.studium.TablaMultiplicar;

import java.util.Scanner;

public class TablaMultiplicar 
{
	public static void main(String[] args) 
	{
		int numero, i;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR �Dame un n�mero:�
		System.out.println("Dame un n�mero:");
		
		//LEER numero
		numero = teclado.nextInt();
		
		//ESCRIBIR �La tabla de multiplicar del n�mero� + numero + �es:�
		System.out.println("La tabla de multiplicar del n�mero "+ numero + " es: ");
		
		//PARA i=0 HASTA 10 HACER
		for(i=0; i<=10; i++) 
		{
			//ESCRIBIR numero + �x� + i + �=� + numero*i
			System.out.println(numero + " x " + i + " = " + numero*i );
		}
		
		teclado.close();
	}
}
