package es.studium.Polinomio;

import java.util.Scanner;

public class Polinomio 
{

	public static void main(String[] args) 
	{
		int x;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR “Indique el valor de x:”
		System.out.println("Indique el valor de x:");
		
		//LEER x
		x = teclado.nextInt();
		
		//ESCRIBIR “El resultado del polinomio es:” + ((3*POTENCIA(X,5))–(5*POTENCIA(X,3))+(2* POTENCIA(X,1)) – 7)
		System.out.println("El resultado del polinomio es: " + ((3*(x*x*x*x*x)) - (5*(x*x*x)) + (2*x) - 7));
		
		teclado.close();
	}
}
