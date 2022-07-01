programa
{
	//questão 4: Escreva um sistema que leia três números inteiros e positivos (A, B, C) e calcule a seguinte expressão:
	inclua biblioteca Matematica-->mat
	
	funcao inicio()
	{
	 inteiro a,b,c
	 real r,s,d 

	 escreva("\nDigite o valor de A:")
	 leia(a)
	 escreva("\nDigite o valor de B:")
	 leia(b)
	 escreva("\nDigite o valor de C:")
	 leia(c)
	 r=mat.potencia((a+b),2.0)
	 s=mat.potencia((b+c),2.0)
	 d=(mat.potencia((a+b),2.0) + mat.potencia((b+c),2.0)) / 2
			//r                    //s
	 escreva("\nO valor de D foi:", d)
                                   //D vai ser r+s dividido por 2


	 	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 333; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */