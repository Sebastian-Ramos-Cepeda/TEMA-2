package es.studium.TiposDeTriángulos;

import java.util.Scanner;

public class TiposDeTriángulos 
{
	public static void main(String[] args) 
	{
		double lado1, lado2, lado3;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR “Dame la longitud del lado 1:”
		System.out.println("Dame la longitud del lado 1:");
		
		//LEER lado1
		lado1 = teclado.nextDouble();
		
		//ESCRIBIR “Dame la longitud del lado 2:”
		System.out.println("Dame la longitud del lado 2:");
		
		//LEER lado2
		lado2 = teclado.nextDouble();
		
		//ESCRIBIR “Dame la longitud del lado 3:”
		System.out.println("Dame la longitud del lado 3:");
		
		//LEER lado3
		lado3 = teclado.nextDouble();
		
		teclado.close();
		
		//SI lado1=lado2 Y lado2=lado3 ENTONCES
		if(lado1==lado2&&lado2==lado3) 
		{
			//ESCRIBIR “El triángulo formado es Equilátero
			System.out.println("El triángulo formado es Equilátero");
		}
		else
		{
			if((lado1==lado2&&lado2!=lado3)||(lado1!=lado2&&lado2==lado3)||(lado1==lado3&&lado2!=lado3)) 
			{
				//ESCRIBIR “El triángulo formado es Isósceles”
				System.out.println("El triángulo formado es Isósceles");
			}
			else
			{
				if(lado1!=lado2&&lado2!=lado3&&lado1!=lado3) 
				{
					//ESCRIBIR “El triángulo formado es Escaleno”
					System.out.println("El triángulo formado es Escaleno");
				}
			}
		}
	}
}