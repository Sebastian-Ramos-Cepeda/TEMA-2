package es.studium.Operaciones3;

import java.util.Scanner;

public class Operaciones3 
{
	public static void main(String[] args) 
	{
		int num1, num2, num3;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR “Dame un número:”
		System.out.println("Dame un número:");
		
		//LEER num1
		num1 = teclado.nextInt();
		
		//ESCRIBIR “Dame otro número:”
		System.out.println("Dame otro número:");
		
		//LEER num2
		num2 = teclado.nextInt();
		
		//ESCRIBIR “Dame otro número:”
		System.out.println("Dame otro número:");
		
		//LEER num3
		num3 = teclado.nextInt();
		
		//ESCRIBIR “La suma de los tres números es igual a:”+Suma (num1,num2,num3)
		System.out.println("La suma de los tres números es igual a: "+ suma(num1,num2,num3));
		
		//ESCRIBIR “El producto de los tres números es igual a:”+Producto (num1,num2,num3)
		System.out.println("El producto de los tres números es igual a: "+ producto(num1,num2,num3));
		
		//ESCRIBIR “La media de los tres números es igual a:”+Media (num1,num2,num3)
		System.out.println("La media de los tres números es igual a: "+ media(num1,num2,num3));
	
		teclado.close();
	}
	
	public static int suma(int num1, int num2, int num3) 
	{
		return(num1 + num2 + num3);
	}
	
	public static int producto(int num1, int num2, int num3) 
	{
		return(num1 * num2 * num3);
	}
	
	public static double media(double num1, double num2, double num3) 
	{
		return ((num1 + num2 + num3)/3);
	}
}

