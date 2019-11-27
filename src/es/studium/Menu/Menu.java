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
			//ESCRIBIR �Indique el n�mero correspondiente a una opci�n del siguiente men�:
			System.out.println("Indique el n�mero correspondiente a una opci�n del siguiente men�:\n *MEN�* \n 1.Abrir \n 2.Cerrar \n 3.Modificar \n 4.Salir");
		
			opcion = teclado.nextInt();
		
				switch(opcion) 
				{
					//CASO 1:
					case 1:
						//ESCRIBIR �La opci�n elegida es ABRIR�
						System.out.println("La opci�n elegida es ABRIR");
						break;
					//CASO 2:
					case 2:
						//ESCRIBIR �La opci�n elegida es CERRAR�
						System.out.println("La opci�n elegida es CERRAR");
						break;
					//CASO 3:
					case 3:
						//ESCRIBIR �La opci�n elegida es MODIFICAR�
						System.out.println("La opci�n elegida es MODIFICAR");
						break;
					//CASO 4:
					case 4:
						//ESCRIBIR �La opci�n elegida es SALIR�
						System.out.println("La opci�n elegida es SALIR");
						break;
					//DEFECTO:
					default:
						//ESCRIBIR �La opci�n elegida no es v�lida�
						System.out.println("La opci�n elegida no es v�lida");
				}
		}
		while (opcion!=4);
		
		teclado.close();
	}
}
