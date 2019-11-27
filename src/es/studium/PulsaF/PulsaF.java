package es.studium.PulsaF;

import java.util.Scanner;

public class PulsaF 
{
	public static void main(String[] args) 
	{
		char letra;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR “Escriba una letra:”
		System.out.println("Escriba una letra:");
		//LEER letra
		letra = teclado.next().charAt(0);
		//MIENTRAS letra!=’f’ HACER
		while (letra!='f') 
		{
			//ESCRIBIR “La letra indicada es”+letra
			System.out.println("La letra indicada es: " + letra);
			//ESCRIBIR “Escriba una letra:”
			System.out.println("Escriba una letra:");
			//LEER letra
			letra = teclado.next().charAt(0);
		}
		teclado.close();
	}
}
