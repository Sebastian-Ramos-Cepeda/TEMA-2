package es.studium.TiposDeTri�ngulosMejorado;

import java.util.Scanner;

public class TiposDeTri�ngulosMejorado 
{
	public static void main(String[] args) 
	{
		double lado1, lado2, lado3;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
				
		//ESCRIBIR �Dame la longitud del lado 1:�
		System.out.println("Dame la longitud del lado 1:");
				
		//LEER lado1
		lado1 = teclado.nextDouble();
				
		//ESCRIBIR �Dame la longitud del lado 2:�
		System.out.println("Dame la longitud del lado 2:");
		
		//LEER lado2
		lado2 = teclado.nextDouble();
				
		//ESCRIBIR �Dame la longitud del lado 3:�
		System.out.println("Dame la longitud del lado 3:");
		
		//LEER lado3
		lado3 = teclado.nextDouble();
				
		teclado.close();
		
		//SI lado1=lado2 Y lado2=lado3 ENTONCES
		if(lado1==lado2&&lado2==lado3) 
		{
			//ESCRIBIR �El tri�ngulo formado es Equil�tero
			System.out.println("El tri�ngulo formado es Equil�tero");
		}
		else
		{
			if((lado1==lado2)||(lado2==lado3)||(lado1==lado3)) 
			{
				//ESCRIBIR �El tri�ngulo formado es Is�sceles�
				System.out.println("El tri�ngulo formado es Is�sceles");
			}
			else
			{
				//ESCRIBIR �El tri�ngulo formado es Escaleno�
				System.out.println("El tri�ngulo formado es Escaleno");
			}
		}
	}
}
