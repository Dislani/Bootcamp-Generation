programa
{
//Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
//em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
//diagonal, ou seja, diagonal principal.
	funcao inicio()
	{
		inteiro Matriz [2][3], somaValores = 0, somaDiagonais, linha, coluna
	

		para(linha=0;linha<2;linha++)
		{
			para(coluna=0;coluna<3;coluna++)
			{
				escreva("\nDigite um numero: ")
				leia(Matriz[linha][coluna])
				somaValores = somaValores + Matriz[linha][coluna]
				
			}
		}
		escreva("\nA soma de valores total da matriz foi de: ", somaValores)
		somaDiagonais = somaValores /6
		escreva("\nA média dos números lidos foi de: ", somaDiagonais)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 520; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */