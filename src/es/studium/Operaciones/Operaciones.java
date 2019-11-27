package es.studium.Operaciones;

import java.util.Scanner;

public class Operaciones 
{
	public static void main(String[] args) 
	{
		int num1, num2, suma, resta, producto;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR �Dame un n�mero:�
		System.out.println("Dame un n�mero:");
		
		//LEER num1
		num1 = teclado.nextInt();
		
		//ESCRIBIR �Dame otro n�mero:�
		System.out.println("Dame un n�mero:");
		
		//LEER num2
		num2 = teclado.nextInt();
		
		teclado.close();
		
		//suma=num1+num2
		suma = num1+num2;
		
		//resta=num1-num2
		resta = num1-num2;
		
		//producto=num1*num2
		producto = num1*num2;
		
		//ESCRIBIR �La suma de los n�meros es:� + suma
		System.out.println("La suma de los n�meros es: " + suma);
		
		//ESCRIBIR �El n�mero1 menos el n�mero2 es:� + resta
		System.out.println("La resta de los n�meros es: " + resta);
		
		//ESCRIBIR �La multiplicaci�n de los n�meros es:� + producto
		System.out.println("El producto de los n�meros es: " + producto);
		
		if (num2==0) 
		{
			//ESCRIBIR �La divisi�n no es posible. El n�mero 2 no puede tener valor cero�
			System.out.println("La dicvisi�n no es posible. El n�mero 2 no puede tener valor cero (0)");	
		}
		else 
		{
			//ESCRIBIR �El cociente del n�mero 1 dividido por el n�mero 2 es:� + cociente
			System.out.println("El cociente del numero " + num1 + " dividido entre el n�mero " + num2 + " es: " + (num1/num2));
		}
	}
}
