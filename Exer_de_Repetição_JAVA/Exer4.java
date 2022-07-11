package Exerciciosrepeticao;

import java.util.Scanner;

public class Exer4 {

	public static void main(String[] args) {
		/* 4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre:
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos.*/
		
		int ler=0,idade, sexo, persona, contCalma=0,contMNerv=0,contHAgre=0,outrosCalm=0, nerv40=0, calm18=0;
		
		Scanner leia = new Scanner(System.in);
		
		while (ler!=4)
		{
			ler++;
			
		 System.out.println("\nDigite sua idade: ");
		 idade= leia.nextInt();
		 System.out.println("\nDigite a opcao: ");
		  System.out.println("1- Feminino");
		  System.out.println("2- Masculino");
		  System.out.println("3- Outros");
		  sexo= leia.nextInt();
		  
		  System.out.println("\nDigite a opcao: ");
		  System.out.println("1-Pessoa era calma");
		  System.out.println("2-Pessoa era nervosa");
		  System.out.println("3- Pessoa agressiva");
		  persona= leia.nextInt();
		  
		  if(persona==1) {
			  contCalma++;
		  }
		  
		  if(sexo==1) {
			  
			if(persona==2) {
				contMNerv++;
			}
		  }
		  if(persona==3) {
			  
			if(sexo==2) {
				contHAgre++;
			}
			  
		  }
		  if(sexo==3) {
		    if(persona==1) {
		    	outrosCalm++;
		    }
		  }
		  if(persona==2) {
			 if(idade>=40) {
				 nerv40++;
			 }
		  }
		  if(persona==1) {
			  if(idade < 18) {
				  calm18++;
			  }
		  }
		  
		  
		} System.out.println("numero de pessoas calmas: " + contCalma);
		  System.out.println("numero de mulheres nervosas: " + contMNerv);
		  System.out.println("numero de homens agressivos: " +contHAgre);
		  System.out.println("numero de outros calmos: " + outrosCalm);
		  System.out.println("numero de pessoas nervosas com mais de 40 anos: " + nerv40);
		  System.out.println("numero de pessoas calmas com menos de 18 anos: " + calm18);
		
		
		
		
		
		
		

	}

}
