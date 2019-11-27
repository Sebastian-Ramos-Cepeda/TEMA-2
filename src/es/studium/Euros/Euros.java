package es.studium.Euros;

import java.util.Scanner;

public class Euros 
{
	public static void main(String[] args) 
	{
		int opcion;
		double cantidad;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
						
		//ESCRIBIR “Indique el número correspondiente a una opción del siguiente menú:
		System.out.println("Indique el número correspondiente a una opción del siguiente menú:\n *MENÚ* \n 1-Pasar de Pesetas a Euros \n 2–Pasar de Euros a Pesetas \n 3.Salir");
						
		//LEER OPCIÓN
		opcion = teclado.nextInt();
				
		//SI opcion=1 O opcion=2 ENTONCES
		if((opcion==1) || (opcion==2)) 
		{
			//ESCRIBIR “Indique la cantidad de grados a convertir:
			System.out.println("Indique la cantidad de grados a convertir:");
							
			//LEER cantidad
			cantidad = teclado.nextDouble();
						
			//SI opcion=1 ENTONCES
			if(opcion==1) 
			{
				//ESCRIBIR “La cantidad indicada equivale a” + ConversionAeuros(cantidad)+ “euros”
				System.out.println("La cantidad indicada equivale a " + ConversionAeuros(cantidad) + " Euros");
			}
							
			//SI opcion=2 ENTONCES
			if(opcion==2) 
			{
				//ESCRIBIR “La cantidad indicada equivale a” + ConversionApesetas(cantidad)+ “pesetas”
				System.out.println("La cantidad indicada equivale a " + ConversionApesetas(cantidad) + " Pesetas");
			}
		}
		teclado.close();
	}
	
	private static final double € = 166.386;
	
	public static double ConversionAeuros(double cantidad)
	{
		double resultado;
		
		resultado = cantidad/€;
		return resultado;
	}
	
	public static double ConversionApesetas(double cantidad)
	{
		double resultado;
		
		resultado = cantidad*€;
		return resultado;
	}
}
