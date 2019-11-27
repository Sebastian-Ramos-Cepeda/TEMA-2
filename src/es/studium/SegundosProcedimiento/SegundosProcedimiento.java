package es.studium.SegundosProcedimiento;

import java.util.Scanner;

public class SegundosProcedimiento 
{
	public static void main(String[] args) 
	{
		int edad;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR “Indique su edad en años:”
		System.out.println("Indique su edad en años:");
		//LEER edad
		edad=teclado.nextInt();
		ProcedimientoSeg(edad);
		teclado.close();
	}
	
	public static void ProcedimientoSeg(int edad) 
	{
		//ESCRIBIR “Su edad en segundos es:”+s
		System.out.println("Su edad en segundos es: " + (edad*31536000));
	}
}
