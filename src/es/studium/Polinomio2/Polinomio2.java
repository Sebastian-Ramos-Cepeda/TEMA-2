package es.studium.Polinomio2;

import java.util.Scanner;

public class Polinomio2 
{

	public static void main(String[] args) 
	{
		int x,a, b, c, d, e, f, g, h, i, j, k;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR “Indique el valor del coeficiente de x elevado a 10:”
		System.out.println("Indique el valor del coeficiente de x elevado a 10:");
		//LEER a
		a = teclado.nextInt();
		//ESCRIBIR “Indique el valor del coeficiente de x elevado a 9:”
		System.out.println("Indique el valor del coeficiente de x elevado a 9:");
		//LEER b
		b = teclado.nextInt();
		//ESCRIBIR “Indique el valor del coeficiente de x elevado a 8:”
		System.out.println("Indique el valor del coeficiente de x elevado a 8:");
		//LEER c
		c = teclado.nextInt();
		//ESCRIBIR “Indique el valor del coeficiente de x elevado a 7:”
		System.out.println("Indique el valor del coeficiente de x elevado a 7:");
		//LEER d
		d = teclado.nextInt();
		//ESCRIBIR “Indique el valor del coeficiente de x elevado a 6:”
		System.out.println("Indique el valor del coeficiente de x elevado a 6:");
		//LEER e
		e = teclado.nextInt();
		//ESCRIBIR “Indique el valor del coeficiente de x elevado a 5:”
		System.out.println("Indique el valor del coeficiente de x elevado a 5:");
		//LEER f
		f = teclado.nextInt();
		//ESCRIBIR “Indique el valor del coeficiente de x elevado a 4:”
		System.out.println("Indique el valor del coeficiente de x elevado a 4:");
		//LEER g
		g = teclado.nextInt();
		//ESCRIBIR “Indique el valor del coeficiente de x elevado a 3:”
		System.out.println("Indique el valor del coeficiente de x elevado a 3:");
		//LEER h
		h = teclado.nextInt();
		//ESCRIBIR “Indique el valor del coeficiente de x elevado a 2:”
		System.out.println("Indique el valor del coeficiente de x elevado a 2:");
		//LEER i
		i = teclado.nextInt();
		//ESCRIBIR “Indique el valor del coeficiente de x elevado a 1:”
		System.out.println("Indique el valor del coeficiente de x elevado a 1:");
		//LEER j
		j = teclado.nextInt();
		//ESCRIBIR “Indique el valor del término independiente:”
		System.out.println("Indique el valor del término independiente:");
		//LEER k
		k = teclado.nextInt();
		//ESCRIBIR “Indique el valor de x:”
		System.out.println("Indique el valor de x:");
		//LEER x
		x = teclado.nextInt();
		//ESCRIBIR “El resultado del polinomio es:” + ((a*POTENCIA(X,10)) + (b*POTENCIA(X,9)) + (c*POTENCIA(X,8)) + (d*POTENCIA(X,7)) + (e*POTENCIA(X,6)) + (f*POTENCIA(X,5)) + (g*POTENCIA(X,4)) + (h*POTENCIA(X,3)) + (i*POTENCIA(X,2)) + (j*X)) + k)
		System.out.println("El resultado del polinomio es: " + ((a*Math.pow(x,10)) + (b*Math.pow(x,9)) + (c*Math.pow(x,8)) + (d*Math.pow(x,7)) + (e*Math.pow(x,6)) + (f*Math.pow(x,5)) + (g*Math.pow(x,4)) + (h*Math.pow(x,3)) + (i*Math.pow(x,2)) + (j*x)) + k);
	
		teclado.close();
	}
}
