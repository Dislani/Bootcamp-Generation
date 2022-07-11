package familia55;

import java.util.Scanner;

public class Exer3 {

	public static void main(String[] args) {
/*Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto*/
		
		int idade; 
		
		Scanner leia = new Scanner(System.in);
		System.out.println("\nDigite sua idade: ");
		idade = leia.nextInt();
		
		if(idade <=10 && idade <=14 )
		{
			System.out.println("\n\t\tVoce tem " +idade+ " anos de idade, voce esta na fase infantil");
		}
		if (idade >=15 && idade <=17 ) 
		{
			System.out.println("\n\t\tVoce tem " +idade+ " anos de idade, voce esta na fase juvenil");
		}
		if (idade >=18 && idade <=25 ) 
		{
			System.out.println("\n\t\tVoce tem " +idade+ " anos de idade, voce esta na fase adulta");
		}
	}

}
