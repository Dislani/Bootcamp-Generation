package Exerciciosrepeticao;

import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) 
	{
		
		/*2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR) */
		
		int num, numimpar=0, numpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		for (int x=1; x<=10; x++ )  
		{
			System.out.println("\n Digite o numero: ");
			num=leia.nextInt();
			
			    if(num%2==0) 
			    {
			    	numpar++;
			    }
			    else 
			    {
			    	numimpar++;	
			    }
			    
					
				 
		
	  } System.out.println("\n os valores pares sao" +numpar+ ".");
        System.out.println("\n os valores impares sao" +numimpar+ ".");
	
}
}	