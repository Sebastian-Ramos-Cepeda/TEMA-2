package es.studium.Conversi�nTemperatura;

import java.util.Scanner;

public class Conversi�nTemperatura 
{
	public static void main(String[] args) 
	{
		int opcion;
		double cantidad;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR �Indique el n�mero correspondiente a una opci�n del siguiente men�:
		System.out.println("Indique el n�mero correspondiente a una opci�n del siguiente men�:\n *MEN�* \n 1-Pasar de Cent�grado a Fahrenheit \n 2�Pasar de Fahrenheit a Cent�grado \n 3.Salir");
		
		//LEER OPCI�N
		opcion = teclado.nextInt();
		
		//SI opcion=1 O opcion=2 ENTONCES
		if((opcion==1) || (opcion==2)) 
		{
			//ESCRIBIR �Indique la cantidad de grados a convertir:
			System.out.println("Indique la cantidad de grados a convertir:");
			
			//LEER cantidad
			cantidad = teclado.nextDouble();
			
			//SI opcion=1 ENTONCES
			if(opcion==1) 
			{
				//ESCRIBIR �La cantidad indicada equivale a� + ConversionAf(cantidad)+ �grados Fahrenheit�
				System.out.println("La cantidad indicada equivale a " + ConversionAf(cantidad) + " grados Fahrenheit");
			}
			
			//SI opcion=2 ENTONCES
			if(opcion==2) 
			{
				//ESCRIBIR �La cantidad indicada equivale a� + ConversionAc(cantidad)+ �grados Centigrados�
				System.out.println("La cantidad indicada equivale a " + ConversionAc(cantidad) + " grados Centigrados");
			}
		}
		teclado.close();
	}
	
	public static double ConversionAf(double grados) 
	{
		double resultado;
		resultado = ((9.0/5.0)*grados)+32.0;
		return resultado;
	}
	
	public static double ConversionAc(double grados) 
	{
		double resultado;
		resultado = (grados-32.0)*(5.0/9.0);
		return resultado;
	}
}
