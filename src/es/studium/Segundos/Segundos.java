package es.studium.Segundos;

import java.util.Scanner;

public class Segundos 
{
	public static void main(String[] args) 
	{
		long edad, segundos;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR “Indique su edad en años:”
		System.out.println("Indique su edad en años:");
		//LEER edad
		edad=teclado.nextLong();
		//segundos = FuncionSeg(edad)
		segundos = FuncionSeg(edad);
		//ESCRIBIR “Su edad en segundos es:”+segundos
		System.out.println("Su edad en segundos es: " + segundos);
		teclado.close();
	}
	
	public static long FuncionSeg(long edad) 
	{
		return (edad*31536000);
	}
}
