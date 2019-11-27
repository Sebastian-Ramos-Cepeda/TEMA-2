package es.studium.Intercambio;

import java.util.Scanner;

public class Intercambio 
{
	public static void main(String[] args) 
	{
		int numero1, numero2, comodin;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR “Dame el número 1:”
		System.out.println("Dame el número 1:");
		
		//LEER numero1
		numero1 = teclado.nextInt();
		
		//ESCRIBIR “Dame el número 2:”
		System.out.println("Dame el número 2:");
		
		//LEER numero2
		numero2 = teclado.nextInt();
		
		comodin = numero2;
		numero2 = numero1;
		numero1 = comodin;
		
		teclado.close();
		
		System.out.println(comodin);
		System.out.println(numero1);
		System.out.println(numero2);
	}
}
