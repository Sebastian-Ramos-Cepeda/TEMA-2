package es.studium.Cuadrados;

public class Cuadrados 
{
	public static void main(String[] args) 
	{
		//ESCRIBIR “La suma de los cuadrados de los 100 primeros números naturales es:”+SumaCuadrados()
		System.out.println("La suma de los cuadrados de los 100 primeros números naturales es: " + SumaCuadrados());
	}
	
	//FUNCION SumaCuadrados() DEVUELVE ENTERO
	public static int SumaCuadrados()
	{
		//ENTERO i, resultado=0
		int i, resultado=0;
		
		//PARA i=0 HASTA 99 HACE
		for(i=0; i<100; i++) 
		{
			//resultado=resultado+(i*i)
			resultado = resultado + (i*i);
		}
		
		//DEVOLVER resultado
		return resultado;
	}
}
