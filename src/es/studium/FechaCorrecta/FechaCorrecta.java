package es.studium.FechaCorrecta;

import java.util.Scanner;

public class FechaCorrecta 
{
	public static void main(String[] args) 
	{
		int dia, mes, anyo;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR “Indique un número correspondiente al día:”
		System.out.println("Indique un número correspondiente al día:");
		
		//LEER dia
		dia = teclado.nextInt();
		
		//ESCRIBIR “Indique un número correspondiente al mes:”
		System.out.println("Indique un número correspondiente al mes:");
		
		//LEER mes
		mes = teclado.nextInt();
		
		//ESCRIBIR “Indique un número correspondiente al año:”
		System.out.println("Indique un número correspondiente al año:");
		
		//LEER anyo
		anyo = teclado.nextInt();
		
		teclado.close();
		
		//SI dia<1 O mes<1 O anyo<1 ENTONCES
		if((dia<1)||(mes<1)||(anyo<1)) 
		{
			//ESCRIBIR “La fecha no es correcta”
			System.out.println("La fecha no es correcta");
		}
		else 
		{
			switch (mes)
			{
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					if(dia<=31) 
					{
						//ESCRIBIR “La fecha si es correcta”
						System.out.println("La fecha si es correcta");
					}
					else 
					{
						//ESCRIBIR “La fecha no es correcta”
						System.out.println("La fecha no es correcta");
					}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if(dia<=30) 
					{
						//ESCRIBIR “La fecha si es correcta”
						System.out.println("La fecha si es correcta");
					}
					else 
					{
						//ESCRIBIR “La fecha no es correcta”
						System.out.println("La fecha no es correcta");
					}
					break;
				case 2:
					if(dia>29) 
					{
						//ESCRIBIR “La fecha no es correcta”
						System.out.println("La fecha no es correcta");
					}
					if(dia==29) 
					{
						if((anyo%4==0)&&(anyo%100!=0)||(anyo%400==0)) 
						{
							//ESCRIBIR “La fecha si es correcta”
							System.out.println("La fecha si es correcta");
						}
						else 
						{
							//ESCRIBIR “La fecha no es correcta”
							System.out.println("La fecha no es correcta");
						}
					}
					if(dia<29) 
					{
						//ESCRIBIR “La fecha si es correcta”
						System.out.println("La fecha si es correcta");
					}
					break;
				default:
					//ESCRIBIR “La fecha no es correcta”
					System.out.println("La fecha no es correcta");
			}
		}
	}
}
