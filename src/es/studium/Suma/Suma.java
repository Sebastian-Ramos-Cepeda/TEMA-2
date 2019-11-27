package es.studium.Suma;

import java.util.Scanner;

public class Suma
{

	public static void main(String[] args) 
	{
		int numero1, numero2, suma;
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
		//suma=numero1+numero2
		suma = numero1 + numero2;
		//ESCRIBIR “La suma es” + suma 
		System.out.println("La suma es:" + suma);
		teclado.close();
	}

}