package Exerciciosrepeticao;

import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) { 
	/*Crie um programa que leia um número do teclado até que encontre um
	número igual a zero. No final, mostre a soma dos números
	digitados.(DO...WHILE)*/
		
		
		Scanner leia = new Scanner(System.in);
		int numero, soma = 0;
		
		

		System.out.println("Digite um numero: ");
		numero =leia.nextInt();
		soma += numero;
		
		
		while(numero != 0) 
		{
			System.out.println("\nDigite outro numero diferente de ZERO  e  ZERO  parar e somar os numero digitados : ");
			numero =leia.nextInt();
			soma += numero;
			
			if (numero == 0)
				
			{
				System.out.println("A soma dos numeros digitados foi: " +soma);
			}

			

		} 

	}
}

	
