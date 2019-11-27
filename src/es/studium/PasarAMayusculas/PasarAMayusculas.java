package es.studium.PasarAMayusculas;

import java.util.Scanner;

public class PasarAMayusculas 
{
	public static void main(String[] args) 
	{
		char letra;
		int x, y;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR “Indicar una letra:”
		System.out.println("Indicar una letra:");
		//LEER letra
		letra = teclado.next().charAt(0);
		//x = letra
		x = letra;
		//y = x-32
		y = x-32;
		//ESCRIBIR “La letra indicada corresponde al número:” +y
		System.out.println("La letra indicada "+ letra + " en mayúsculas es "+ (char)y);
		teclado.close();
		
	}
}
