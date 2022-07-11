package Exerciciosrepeticao;

import java.util.Scanner;

public class Exer3 
{

	public static void main(String[] args) 
	{
      /* Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
      21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
      idade for =-99. (WHILE)*/
		
		int menos18=0, mais50=0, idade=0;
		
		while(idade!= -99)
		{
			Scanner ler= new Scanner(System.in);
			System.out.println("\nDigite aqui sua idade: ");
			idade= ler.nextInt();
			
			if (idade<21)
			{
				menos18++;
			}
			
			else if (idade>50) 
			{
				mais50++;
			}
		}
		  System.out.println("O numero de pessoas com MENOS de 21 anos e," +menos18+ " pessoas");
		  System.out.println("O numero de pessoas com MAIS de 50 anos e," +mais50+ " pessoas");
	}

}


