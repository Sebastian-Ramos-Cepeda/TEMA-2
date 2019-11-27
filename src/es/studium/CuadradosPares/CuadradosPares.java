package es.studium.CuadradosPares;

public class CuadradosPares 
{

	public static void main(String[] args) 
	{
		//ENTERO i, resultado
		int i, resultado;
		
		//PARA i = 1 HASTA 100 HACER
		for(i=1; i<=100; i++) 
		{	
			//SI i%2 = 0 ENTONCES
			if(i%2==0) 
			{
				//resultado = calcular(i)
				resultado = calcular(i);
				
				//ESCRIBIR resultado
				System.out.println(resultado);
			}
		}
	}
	
	//FUNCION calcular(ENTERO i) DEVUELVE ENTERO
	public static int calcular(int i)
	{
		//DEVOLVER i*i
		return (i*i);
	}
}
