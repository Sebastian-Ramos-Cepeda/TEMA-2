package es.studium.Descuentos;

import java.util.Scanner;

public class Descuentos 
{
	public static void main(String[] args) 
	{
		double precio,subtotal,total = 0,descuento = 0;
		int codigo,unidades;
		
		//Creamos el objeto que nos permite leer por teclado
		Scanner teclado = new Scanner(System.in);
		
		//ESCRIBIR “Indicar el código del artículo:”
		System.out.println("Indicar el código del artículo:");
		//LEER codigo
		codigo = teclado.nextInt();
		//ESCRIBIR “Indicar el precio del artículo:”
		System.out.println("Indicar el precio del artículo:");
		//LEER precio
		precio = teclado.nextDouble();
		//ESCRIBIR “Indicar la cantidad de unidades:”
		System.out.println("Indicar la cantidad de unidades:");
		//LEER unidades
		unidades = teclado.nextInt();
		//subtotal=unidades*precio
		subtotal = unidades*precio;
		
		if(unidades>100) 
		{
			descuento=40;
			total = unidades*0.60*precio;
		}
		
		else if(unidades>=25&&unidades<=100) 
		{
			descuento=20;
			total = unidades*0.80*precio;
		}
		else if(unidades>=10&&unidades<=24) 
		{
			descuento=10;
			total = unidades*0.90*precio;
		}
		else if(unidades<10) 
		{
			descuento=0;
			total = unidades*precio;
		}
		//ESCRIBIR “********************RESUMEN COMPRA********************”
		System.out.println("********************RESUMEN COMPRA********************");
		//ESCRIBIR “Código Subtotal Descuento Total”
		System.out.println("Código Subtotal Descuento Total");
		//ESCRIBIR codigo+” “+ subtotal+” “+descuento+” “+total
		System.out.println(codigo+ "   +   " +subtotal+ "   +   " +descuento+ "   +   " +total);
		
		teclado.close();
	}
}
