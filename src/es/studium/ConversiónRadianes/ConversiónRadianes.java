package es.studium.Conversi�nRadianes;

import java.util.Scanner;

public class Conversi�nRadianes 
{
	private static final double PI = 3.14159265359;

	public static void main(String[] args) 
	{
		int opcion;
		double cantidad;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
				
		//ESCRIBIR �Indique el n�mero correspondiente a una opci�n del siguiente men�:
		System.out.println("Indique el n�mero correspondiente a una opci�n del siguiente men�:\n *MEN�* \n 1-Pasar de Grados a Radianes \n 2�Pasar de Radianes a Grados \n 3.Salir");
				
		//LEER OPCI�N
		opcion = teclado.nextInt();
		
		//SI opcion=1 O opcion=2 ENTONCES
		if((opcion==1) || (opcion==2)) 
		{
			//ESCRIBIR �Indique la cantidad de grados a convertir:
			System.out.println("Indique la cantidad a convertir:");
					
			//LEER cantidad
			cantidad = teclado.nextDouble();
				
			//SI opcion=1 ENTONCES
			if(opcion==1) 
			{
				//ESCRIBIR �La cantidad indicada equivale a� + ConversionAr(cantidad)+ �Radianes�
				System.out.println("La cantidad indicada equivale a " + ConversionAr(cantidad) + " Radianes");
			}
					
			//SI opcion=2 ENTONCES
			if(opcion==2) 
			{
				//ESCRIBIR �La cantidad indicada equivale a� + ConversionAc(cantidad)+ �Grados�
				System.out.println("La cantidad indicada equivale a " + ConversionAg(cantidad) + " Grados");
			}
		}
		teclado.close();
	}
	
	public static double ConversionAr(double cantidad) 
	{
		double resultado;
		
		resultado = (PI*cantidad)/180.0;
		return resultado;
	}
	
	public static double ConversionAg(double cantidad) 
	{
		double resultado;
		
		resultado = (cantidad*180.0)/PI;
		return resultado;
	}
}
