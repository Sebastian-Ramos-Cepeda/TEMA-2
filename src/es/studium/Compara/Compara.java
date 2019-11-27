package es.studium.Compara;

import java.util.Scanner;

public class Compara 
{
	public static void main(String[] args) 
	{
		int numero1, numero2;
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR “Dame un número:”
		System.out.println("Dame un número:");
		
		//LEER numero1
		numero1 = teclado.nextInt();
		
		//ESCRIBIR “Dame otro número:”
		System.out.println("Dame otro un número:");
		
		//LEER numero2
		numero2 = teclado.nextInt();
		
		teclado.close();
		
		if (numero1==numero2) 
		{
			//ESCRIBIR “Los números son iguales”
			System.out.println("Los numero son iguales");
		}
		else 
		{
			if (numero1>numero2) 
			{
				//ESCRIBIR "el numero 1 es mayor que el número 2”
				System.out.println("El primer número es mayor que el segundo");
			}
			else 
			{
				//ESCRIBIR "el numero 2 es mayor que el número 1”
				System.out.println("El segundo número es mayor que el primero");
			}
		}
	}
}
