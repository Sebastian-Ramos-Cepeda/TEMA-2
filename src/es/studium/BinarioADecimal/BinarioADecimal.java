package es.studium.BinarioADecimal;

import java.util.Scanner;

public class BinarioADecimal 
{
	public static void main(String[] args) 
	{
		int a, b, c, d, e, resultado;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
	
		//ESCRIBIR �Indique el valor de la primera cifra del n�mero binario:�
		System.out.println("Indique el valor de la primera cifra del n�mero binario:");
		
		//LEER e
		e = teclado.nextInt();
		
		//ESCRIBIR �Indique el valor de la segunda cifra del n�mero binario:�
		System.out.println("Indique el valor de la segunda cifra del n�mero binario:");

		//LEER d
		d = teclado.nextInt();
		
		//ESCRIBIR �Indique el valor de la tercera cifra del n�mero binario:�
		System.out.println("Indique el valor de la tercera cifra del n�mero binario:");

		//LEER c
		c = teclado.nextInt();
		
		//ESCRIBIR �Indique el valor de la cuarta cifra del n�mero binario:�
		System.out.println("Indique el valor de la cuarta cifra del n�mero binario:");

		//LEER b
		b = teclado.nextInt();
		
		//ESCRIBIR �Indique el valor de la quinta cifra del n�mero binario:�
		System.out.println("Indique el valor de la quinta cifra del n�mero binario:");

		//LEER a
		a = teclado.nextInt();
		
		teclado.close();
		
		//resultado = Conversion(e,d,c,b,a)
		resultado = conversion(e, d, c, b, a);
		
		//ESCRIBIR �El n�mero decimal equivalente es:�+resultado
		System.out.println("El n�mero decimal equivalente es: " + resultado);
	}
	
	public static int conversion(int e, int d, int c, int b, int a) 
	{
		return ((e*16)+(d*8)+(c*4)+(b*2)+(a*1));
	}
}
