package es.studium.Caracter;

import java.util.Scanner;

public class Caracter 
{
	public static void main(String[] args) 
	{
		char caracter;
		int x;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR �Indique un car�cter�
		System.out.println("Indique un car�cter");
		
		//LEER caracter
		caracter = teclado.next().charAt(0);
		
		//x=caracter
		x = caracter;
		
		teclado.close();
		
		//SI ((x>=48)Y(<=57)) ENTONCES
		if ((x>=48)&&(x<=57)) 
		{
			//ESCRIBIR �El car�cter indicado es un n�mero�
			System.out.println("El car�cter indicado es un n�mero");
		}
		//SI ((x>=65)Y(<=90)) ENTONCES
		if ((x>=65)&&(x<=90)) 
		{
			//ESCRIBIR �El car�cter indicado es una letra may�scula�
			System.out.println("El car�cter indicado es una letra may�scula");
		}
		//SI ((x>=97)Y(<=122)) ENTONCES
		if ((x>=97)&&(x<=122)) 
		{
			//ESCRIBIR �El car�cter indicado es una letra min�scula�
			System.out.println("El car�cter indicado es una letra min�scula");
		}
		//SI ((x>=)Y(<=122)) ENTONCES
		if ((x>=33)&&(x<=47)||(x>=58)&&(x<=64)||(x>=91)&&(x<=96)||(x>=123)&&(x<=126)) 
		{
			//ESCRIBIR �El car�cter indicado es un s�mbolo�
			System.out.println("El car�cter indicado es un s�mbolo");
		}
	}
}
