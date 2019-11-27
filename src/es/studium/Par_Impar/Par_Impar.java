package es.studium.Par_Impar;

import java.util.Scanner;

public class Par_Impar
{

	public static void main(String[] args) 
	{
		int numero;
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		//ESCRIBIR “Dame un número:”
		System.out.println("Dame un número:");
		//LEER numero
		numero = teclado.nextInt();
		//SI numero%2=0 ENTONCES
		if (numero%2==0) 
		//ESCRIBIR “El número es PAR”
		{
			System.out.println("El número es PAR");
		}
		//SINO
		else
		//ESCRIBIR “El número es IMPAR”
		{
			System.out.println("El número es IMPAR");
		}
		teclado.close();
	}

}
