package es.studium.Operaciones;

import java.util.Scanner;

public class Operaciones 
{
	public static void main(String[] args) 
	{
		int num1, num2, suma, resta, producto;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR “Dame un número:”
		System.out.println("Dame un número:");
		
		//LEER num1
		num1 = teclado.nextInt();
		
		//ESCRIBIR “Dame otro número:”
		System.out.println("Dame un número:");
		
		//LEER num2
		num2 = teclado.nextInt();
		
		teclado.close();
		
		//suma=num1+num2
		suma = num1+num2;
		
		//resta=num1-num2
		resta = num1-num2;
		
		//producto=num1*num2
		producto = num1*num2;
		
		//ESCRIBIR “La suma de los números es:” + suma
		System.out.println("La suma de los números es: " + suma);
		
		//ESCRIBIR “El número1 menos el número2 es:” + resta
		System.out.println("La resta de los números es: " + resta);
		
		//ESCRIBIR “La multiplicación de los números es:” + producto
		System.out.println("El producto de los números es: " + producto);
		
		if (num2==0) 
		{
			//ESCRIBIR “La división no es posible. El número 2 no puede tener valor cero”
			System.out.println("La dicvisión no es posible. El número 2 no puede tener valor cero (0)");	
		}
		else 
		{
			//ESCRIBIR “El cociente del número 1 dividido por el número 2 es:” + cociente
			System.out.println("El cociente del numero " + num1 + " dividido entre el número " + num2 + " es: " + (num1/num2));
		}
	}
}
