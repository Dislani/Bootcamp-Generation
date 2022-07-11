package familia55;

import java.util.Scanner;

public class Exer1 {

	public static void main(String[] args) {
		/*Faça um programa que receba três inteiros e diga qual deles é o maior.*/
		
		
		int num1,num2, num3 = 0 ;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com o primeiro numero: ");
		num1= leia.nextInt();
		
		System.out.println("\nEntre com o primeiro numero: ");
		num2 = leia.nextInt();
		
		System.out.println("\nEntre com o primeiro numero: ");
		num3 = leia.nextInt();
		
		if (num1 > num2 && num1 > num3 )
		{
	    	 System.out.println("\nO PRIMEIRO numero digitado foi maior que o segundo e o terceiro numero digitado: ");
		}
		
	     if (num2 > num1 && num2 > num3 )
	     {
	    	 System.out.println("\nO SEGUNDO numero digitado foi maior que o primeiro e o terceiro numero digitado: ");
	     }
	     if (num3 > num1 && num3 > num2 )
	     {
	    	 System.out.println("\nO TERCEIRO numero digitado foi maior que o primeiro e o segundo numero digitado: ");
	     }
	      
	    	 
	}

}
