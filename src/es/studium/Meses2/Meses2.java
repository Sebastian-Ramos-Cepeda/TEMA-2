package es.studium.Meses2;

import java.util.Scanner;

public class Meses2 
{
	public static void main(String[] args) 
	{
		int mes, anyo;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR �Indique el n�mero perteneciente al mes:�
		System.out.println("Indique el n�mero perteneciente al mes:");
		
		//LEER mes
		mes = teclado.nextInt();
				
		//ESCRIBIR �Indique el n�mero perteneciente al a�o:�
		System.out.println("Indique el n�mero perteneciente al a�o:");
		
		//LEER anyo
		anyo = teclado.nextInt();
				
		teclado.close();
		
		if((mes>0)&&(mes<13)) 
		{
			switch (mes) 
			{
				case 2:
					if((anyo%4==0)&&(anyo%100==0)||(anyo%400==0)) 
					{
						//ESCRIBIR �El mes indicado tiene 29 d�as
						System.out.println("El mes indicado tiene 29 d�as");
					}
					else
					{
						//ESCRIBIR �El mes indicado tiene 28 d�as�
						System.out.println("El mes indicado tiene 28 d�as");
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					//ESCRIBIR �El mes indicado tiene 30 d�as�
					System.out.println("El mes indicado tiene 30 d�as");
					break;
				default:
					//ESCRIBIR �El mes indicado tiene 31 d�as�
					System.out.println("El mes indicado tiene 31 d�as");
			}
		}
		else 
		{
			//ESCRIBIR �El mes introducido no es correcto"
			System.out.println("El mes introducido no es correcto");
		}
	}
}
