package es.studium.RaicesDeSegundoGrado;

import java.util.Scanner;

public class RaicesDeSegundoGrado 
{
	public static void main(String[] args) 
	{
		double x1, x2;
		int a, b, c;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR “Indique el valor del coeficiente principal: “
		System.out.println("Indique el valor del coeficiente principal: ");
		//LEER a
		a = teclado.nextInt(); 
		//ESCRIBIR “Indique el valor del coeficiente secundario: “
		System.out.println("Indique el valor del coeficiente secundario: ");
		//LEER b
		b = teclado.nextInt(); 
		//ESCRIBIR “Indique el valor del término independiente: “
		System.out.println("Indique el valor del término independiente: ");
		//LEER c
		c = teclado.nextInt(); 
		//ESCRIBIR “El valor de x1 es:” + (-b+RAIZ(b*b-4*a*c))/(2*a)
		System.out.println("El valor de x1 es: " + (-b+Math.pow((b*b-4*a*c), 1/2))/(2*a));
		//ESCRIBIR “El valor de x2 es:” + (-b-RAIZ(b*b-4*a*c))/(2*a)
		System.out.println("El valor de x2 es: " + (-b-Math.pow((b*b-4*a*c), 1/2))/(2*a));
	}
}
