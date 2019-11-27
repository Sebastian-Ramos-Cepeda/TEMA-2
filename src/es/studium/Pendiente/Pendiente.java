package es.studium.Pendiente;

import java.util.Scanner;

public class Pendiente 
{
	public static void main(String[] args) 
	{
		int x1, x2, y1, y2;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR “Indique el valor de x1:”
		System.out.println("Indique el valor de x1:");
		
		//LEER x1
		x1 = teclado.nextInt();
		
		//ESCRIBIR “Indique el valor de x2:”
		System.out.println("Indique el valor de x2:");
		
		//LEER x2
		x2 = teclado.nextInt();
		
		//ESCRIBIR “Indique el valor de y1:”
		System.out.println("Indique el valor de y1:");
		
		//LEER y1
		y1 = teclado.nextInt();
		
		//ESCRIBIR “Indique el valor de y2:”
		System.out.println("Indique el valor de y2:");
		
		//LEER y2
		y2 = teclado.nextInt();
		
		teclado.close();
		
		//pendiente(x1, x2, y1, y2)
		pendiente(x1, x2, y1, y2);
	}
	
	//PROCEDIMIENTO pendiente(ENTERO x1, x2, y1, y2)
	public static void pendiente(int x1, int x2, int y1, int y2) 
	{
		//REAL m
		double m;
		
		//m=(y2-y1)/(x2-x1)
		m = ((double)(y2-y1)/(double)(x2-x1));
		
		//ESCRIBIR “La pendiente entre los dos puntos indicados es:”+m
		System.out.println("La pendiente entre los dos puntos indicados es: " + m);
	}
}
