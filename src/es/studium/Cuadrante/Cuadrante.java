package es.studium.Cuadrante;

import java.util.Scanner;

public class Cuadrante 
{
	public static void main(String[] args) 
	{
		double x, y;
		int cuadrante;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR “Indique el valor de la coordenada x:”
		System.out.println("Indique el valor de la coordenada x:");
		//LEER x
		x = teclado.nextDouble();
		//ESCRIBIR “Indique el valor de la coordenada y:”
		System.out.println("Indique el valor de la coordenada y:");
		//LEER y
		y = teclado.nextDouble();
		//cuadrante = FuncionCuadrante (x,y)
		cuadrante = (int) FuncionCuadrante(x, y);
		//ESCRIBIR “El punto dado pertenece al cuadrante nº:”+cuadrante
		System.out.println("El punto dado pertenece al cuadrante nº: " + cuadrante);
		teclado.close();
	}
	
	public static double FuncionCuadrante(double x, double y) 
	{
		int c = 0;
		
		if(x>=0&&y>=0)
		{
			c=1;
		}
		if(x<0&&y>=0)
		{
			c=2;
		}
		if(x<0&&y<0)
		{
			c=3;
		}
		if(x>=0&&y<0)
		{
			c=4;
		}
		
		return c; 
	}
}
