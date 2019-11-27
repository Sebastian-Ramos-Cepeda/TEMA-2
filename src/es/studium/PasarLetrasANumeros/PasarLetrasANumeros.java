package es.studium.PasarLetrasANumeros;

import java.util.Scanner;

public class PasarLetrasANumeros 
{
	public static void main(String[] args) 
	{
		char letra;
		int numero = 0;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//HACER
		do 
		{
			//ESCRIBIR “Indicar una letra:”
			System.out.println("Indicar una letra:");
			//LEER letra
			letra = teclado.next().charAt(0);
		
		
			if(letra!='*') 
			{
				switch (letra)
				{
					case 'a':
						numero=1;
					break;
					case 'b':
						numero=2;
					break;
					case 'c':
						numero=3;
					break;
					case 'd':
						numero=4;
					break;
					case 'e':
						numero=5;
					break;
					case 'f':
						numero=6;
					break;
					case 'g':
						numero=7;
					break;
					case 'h':
						numero=8;
					break;
					case 'i':
						numero=9;
					break;
					case 'j':
						numero=10;
					break;
					case 'k':
						numero=11;
					break;
					case 'l':
						numero=12;
					break;
					case 'm':
						numero=13;
					break;
					case 'n':
						numero=14;
					break;
					case 'ñ':
						numero=15;
					break;
					case 'o':
						numero=16;
					break;
					case 'p':
						numero=17;
					break;
					case 'q':
						numero=18;
					break;
					case 'r':
						numero=19;
					break;
					case 's':
						numero=20;
					break;
					case 't':
						numero=21;
						break;
					case 'u':
						numero=22;
					break;
					case 'v':
						numero=23;
					break;
					case 'w':
						numero=24;
					break;
					case 'x':
						numero=25;
					break;
					case 'y':
						numero=26;
					break;
					case 'z':
						numero=27;
					break;
				}
				//ESCRIBIR “La letra indicada corresponde al número:” + numero
				System.out.println("La letra indicada corresponde al número: " + numero);
			}
		}
		
		//MIENTRAS
		while (letra!='*');
		System.out.println("Adios");
		
		teclado.close();
	}
}