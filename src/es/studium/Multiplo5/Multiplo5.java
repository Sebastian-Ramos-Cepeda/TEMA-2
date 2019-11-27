package es.studium.Multiplo5;

import java.util.Scanner;

public class Multiplo5 
{
	public static void main(String[] args) 
	{
		int a, b, i;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR “Indique el valor del número 1:”
		System.out.println("Indique el valor del número 1:");
		
		//LEER a
		a = teclado.nextInt();
		
		//ESCRIBIR “Indique el valor del número 2:”
		System.out.println("Indique el valor del número 2:");
		
		//LEER b
		b = teclado.nextInt();
		
		//SI a<b ENTONCES
		if(a<b) 
		{
			//PARA i=a HASTA b HACER
			for (i=a; i<=b; i++) 
			{
				//SI i%5=0 ENTONCES
				if(i%5==0) 
				{
					//ESCRIBIR i
					System.out.println(i);
				}
			}
		}
		//SI NO
		else 
		{
			//ESCRIBIR “ERROR”
			System.out.println("ERROR");
		}
		
		teclado.close();
	}
}
