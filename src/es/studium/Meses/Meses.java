package es.studium.Meses;

import java.util.Scanner;

public class Meses 
{
	public static void main(String[] args) 
	{
		int mes;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
	
		//ESCRIBIR “Dame el número del mes buscado:”
		System.out.println("Dame el numero del mes buscado:");
		
		//LEER mes
		mes = teclado.nextInt();
		
		teclado.close();
		
		switch (mes) 
		{
			case 1:
				// mes == 1
				System.out.println("El mes equivalente al número " + mes + " es Enero");
				break;
			case 2:
				// mes == 2
				System.out.println("El mes equivalente al número " + mes + " es Febrero");
				break;
			case 3:
				// mes == 3
				System.out.println("El mes equivalente al número " + mes + " es Marzo");
				break;
			case 4:
				// mes == 4
				System.out.println("El mes equivalente al número " + mes + " es Abril");
				break;
			case 5:
				// mes == 5
				System.out.println("El mes equivalente al número " + mes + " es Mayo");
				break;
			case 6:
				// mes == 6
				System.out.println("El mes equivalente al número " + mes + " es Junio");
				break;
			case 7:
				// mes == 7
				System.out.println("El mes equivalente al número " + mes + " es Julio");
				break;
			case 8:
				// mes == 8
				System.out.println("El mes equivalente al número " + mes + " es Agosto");
				break;
			case 9:
				// mes == 9
				System.out.println("El mes equivalente al número " + mes + " es Septiembre");
				break;
			case 10:
				// mes == 10
				System.out.println("El mes equivalente al número " + mes + " es Octubre");
				break;
			case 11:
				// mes == 11
				System.out.println("El mes equivalente al número " + mes + " es Noviembre");
				break;
			case 12:
				// mes == 12
				System.out.println("El mes equivalente al número " + mes + " es Dicciembre");
				break;
			default:
				System.out.println("No es un mes válido");
		}
		
	}
}
