package es.studium.Par_Impar;

import java.util.Scanner;

public class Par_Impar
{

	public static void main(String[] args) 
	{
		int numero;
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		//ESCRIBIR �Dame un n�mero:�
		System.out.println("Dame un n�mero:");
		//LEER numero
		numero = teclado.nextInt();
		//SI numero%2=0 ENTONCES
		if (numero%2==0) 
		//ESCRIBIR �El n�mero es PAR�
		{
			System.out.println("El n�mero es PAR");
		}
		//SINO
		else
		//ESCRIBIR �El n�mero es IMPAR�
		{
			System.out.println("El n�mero es IMPAR");
		}
		teclado.close();
	}

}
