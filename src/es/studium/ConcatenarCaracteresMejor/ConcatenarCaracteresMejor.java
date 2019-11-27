package es.studium.ConcatenarCaracteresMejor;

import java.util.Scanner;

public class ConcatenarCaracteresMejor 
{
	public static void main(String[] args) 
	{
		char letra1, letra2;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR “Dame un carácter:”
		System.out.println("Dame un caracter:");
				
		//LEER letra1
		letra1 = teclado.next().charAt(0);
				
		//ESCRIBIR “Dame otro carácter:”
		System.out.println("Dame otro caracter:");
				
		//LEER letra2
		letra2 = teclado.next().charAt(0);
		
		//ESCRIBIR letra1 + letra2
		System.out.println(letra1+""+letra2);
		
		teclado.close();
	}
}
