package es.studium.ConcatenarCaracteres;

import java.util.Scanner;

public class ConcatenarCaracteres 
{
	public static void main(String[] args) 
	{
		String a, b;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
	
		//ESCRIBIR �Dame un car�cter:�
		System.out.println("Dame un caracter:");
		
		//LEER s
		a = teclado.nextLine();
		
		//ESCRIBIR �Dame otro car�cter:�
		System.out.println("Dame otro caracter:");
		
		//LEER i
		b = teclado.nextLine();
		
		//ESCRIBIR a+b
		System.out.println(a + b);
		
		teclado.close();
	}
}
