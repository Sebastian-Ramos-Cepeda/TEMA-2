package es.studium.Aleatorio3;

import java.util.Random;

public class Aleatorio3 
{
	public static void main(String[] args)
	{
	Random rnd=new Random();
	for (int i = 0; i < 10; i++)
	{
	System.out.println(rnd.nextDouble());
	}
	}

}
