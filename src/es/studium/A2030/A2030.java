package es.studium.A2030;

import java.util.Scanner;

public class A2030 
{
	public static void main(String[] args) 
	{
		int anyo;
		String nombre;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR �Indique su nombre:�
		System.out.println("Indique su nombre:");
		
		//LEER nombre
		nombre = teclado.next();
		
		//ESCRIBIR �Indique el a�o de su nacimiento:�
		System.out.println("Indique el a�o de su nacimiento:");
		
		//LEER anyo
		anyo = teclado.nextInt();
		
		//ESCRIBIR �Hola� + nombre + �, en el a�o 2030 tendr�s� + 2030-anyo + �a�os�
		System.out.println("Hola " + nombre + ", en el a�o 2030 tendr�s " + (2030-anyo) + " a�os" );
	
		teclado.close();
	}
}
