package es.studium.Dividir;

import java.util.Scanner;

public class Dividir 
{
	public static void main(String[] args) 
	{
		int numerador, denominador;
		double resultado;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR “Indicar el numerador:”
		System.out.println("Indica el numerador");
		
		//LEER numerador
		numerador = teclado.nextInt();
		
		//ESCRIBIR “Indicar el denominador:”
		System.out.println("Indica el denominador");
		
		//LEER denominador
		denominador = teclado.nextInt();
		
		//resultado=dividir(numerador, denominador)
		resultado = dividir(numerador, denominador);
		
		//ESCRIBIR resultado 
		System.out.println("El resultado es: " + resultado);
		teclado.close();
	}
	//FUNCION dividir (ENTERO a, ENTERO b) DEVUELVE REAL
	public static double dividir(int a, int b) 
	{
		//INICIO
		double resultado;
		
		//resultado=a/b
		resultado = (double) a / (double) b;
				
		//DEVOLVER resultado 
		return(resultado);
	}
}
