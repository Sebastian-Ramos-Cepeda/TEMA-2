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
		
		//ESCRIBIR “Indique su nombre:”
		System.out.println("Indique su nombre:");
		
		//LEER nombre
		nombre = teclado.next();
		
		//ESCRIBIR “Indique el año de su nacimiento:”
		System.out.println("Indique el año de su nacimiento:");
		
		//LEER anyo
		anyo = teclado.nextInt();
		
		//ESCRIBIR “Hola” + nombre + “, en el año 2030 tendrás” + 2030-anyo + “años”
		System.out.println("Hola " + nombre + ", en el año 2030 tendrás " + (2030-anyo) + " años" );
	
		teclado.close();
	}
}
