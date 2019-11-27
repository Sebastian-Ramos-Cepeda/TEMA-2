package es.studium.Salto_n;

import java.util.Scanner;

public class Salto_n 
{
	public static void main(String[] args) 
	{
		int salto, i;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR “Indique el valor del salto entre números:”
		System.out.println("Indique el valor del salto entre números:");
		//LEER salto
		salto=teclado.nextInt();
		//PARA i=0 HASTA 1000 HACER
		for (i=0; i<=1000; i++) 
		{
			//SI i%salto=0 ENTONCES
			if(i%salto==0) 
			{	
				//ESCRIBIR i
				System.out.println(i);
			}
		}
		teclado.close();
	}
}
