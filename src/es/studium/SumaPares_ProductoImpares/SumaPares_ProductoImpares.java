package es.studium.SumaPares_ProductoImpares;

public class SumaPares_ProductoImpares 
{
	public static void main(String[] args) 
	{
		int suma, producto, i;
		suma = 0;
		producto = 1;
		for (i=1; i<=40; i++) 
		{
			if (i%2==0) 
			{
				suma = suma + i;
			}
			else 
			{
				producto = producto * i;
			}
		}
		System.out.println("La suma de los pares es: " + suma);
		System.out.println("El producto de los pares es: " + producto);
	}
}
