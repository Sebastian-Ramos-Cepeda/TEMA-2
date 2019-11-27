package es.studium.Pares;

import java.util.Scanner;

public class Pares 
{

	public static void main(String[] args) 
	{
		int numero1, numero2, i;
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		//ESCRIBIR "Dame un numero entero"
		System.out.println("Dame un número entero:");
		//LEER numero1
		numero1 = teclado.nextInt();
		//ESCRIBIR "Dame otro numero entero"
		System.out.println("Dame otro número entero:");
		//LEER numero2
		numero2 = teclado.nextInt();
		//PARA i=numero1 HASTA numero2 HACER
		for(i = numero1; i <= numero2; i++) 
		{
			//SI i%2=0 ENTONCES
			if (i%2==0) 
			{
				//ESCRIBIR i
				System.out.println(i);
			}
		}
		teclado.close();

	}

}
