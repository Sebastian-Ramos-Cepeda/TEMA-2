package es.studium.Menu;

import java.util.Scanner;

public class Menu 
{

	public static void main(String[] args) 
	{
		int opcion;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		do
		{
			//ESCRIBIR “Indique el número correspondiente a una opción del siguiente menú:
			System.out.println("Indique el número correspondiente a una opción del siguiente menú:\n *MENÚ* \n 1.Abrir \n 2.Cerrar \n 3.Modificar \n 4.Salir");
		
			opcion = teclado.nextInt();
		
				switch(opcion) 
				{
					//CASO 1:
					case 1:
						//ESCRIBIR “La opción elegida es ABRIR”
						System.out.println("La opción elegida es ABRIR");
						break;
					//CASO 2:
					case 2:
						//ESCRIBIR “La opción elegida es CERRAR”
						System.out.println("La opción elegida es CERRAR");
						break;
					//CASO 3:
					case 3:
						//ESCRIBIR “La opción elegida es MODIFICAR”
						System.out.println("La opción elegida es MODIFICAR");
						break;
					//CASO 4:
					case 4:
						//ESCRIBIR “La opción elegida es SALIR”
						System.out.println("La opción elegida es SALIR");
						break;
					//DEFECTO:
					default:
						//ESCRIBIR “La opción elegida no es válida”
						System.out.println("La opción elegida no es válida");
				}
		}
		while (opcion!=4);
		
		teclado.close();
	}
}
