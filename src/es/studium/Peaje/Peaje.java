package es.studium.Peaje;

import java.util.Scanner;

public class Peaje 
{
	public static void main(String[] args) 
	{
		double km,td;
		String vehiculo;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR “Indicar el tipo de vehículo:”
		System.out.println("Indicar el tipo de vehículo:");
		//LEER vehiculo
		vehiculo = teclado.next();
		//ESCRIBIR “Indicar los km recorridos:”
		System.out.println("Indicar los km recorridos:");
		//LEER km
		km = teclado.nextDouble();
		
		//SEGUN vehiculo HACER
		switch (vehiculo) 
		{
			case "moto":
				//ESCRIBIR “La cantidad a pagar es 3,2 €”
				System.out.println("La cantidad a pagar es 3,2 €");
				break;
			case "coche":
				//ESCRIBIR “La cantidad a pagar es”+0,1*km+”€”
				System.out.println("La cantidad a pagar es " + 0.1 * km + "€");
				break;
			case "camion":
				//ESCRIBIR “Indicar las toneladas transportadas:”
				System.out.println("Indicar las toneladas transportadas:");
				//LEER td
				td = teclado.nextDouble();
				//ESCRIBIR “La cantidad a pagar es”+((0,1*km)+(0,1*td))+”€”
				System.out.println("La cantidad a pagar es " + ((0.1*km)+(0.1*td))+"€");
				break;
			case "autobus":
				//ESCRIBIR “La cantidad a pagar es”+((0,1*km)+(0,1*td))+”€”
				System.out.println("La cantidad a pagar es " + (0.2*km) +"€");
				break;
			default:
				//ESCRIBIR “Los datos indicados no son correctos”
				System.out.println("Los datos indicados no son correctos");
		}
		teclado.close();
	}
}
