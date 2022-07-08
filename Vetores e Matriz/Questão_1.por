
programa
{
	inclua biblioteca Matematica --> math
	
	funcao inicio()
	{
		inteiro ativi [5], pont, maiorPontuacao = 0, x
		

		para(x=0;x<=4;x++)
		{
			escreva("\nEntre com o numero ", x+1, ": ")
			leia(pont)
			ativi[x] = pont
			se(x == 0){
				maiorPontuacao = pont
			}
			se(pont > maiorPontuacao)
			{
				maiorPontuacao = pont
			}
		}
		para(x=0;x<=4;x++)
		{
			escreva("\nPontos : ", x+1,  ativi[x])
		}
		escreva("\n\nA maior pontuação encontrada foi de: ", maiorPontuacao)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 336; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */