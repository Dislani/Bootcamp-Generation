programa
{
//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
//atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente.
	
	funcao inicio()
	{
		 inteiro lancamento[10],somaLancamento=0,mediaLancamento,maiorPontuacao=0,x

        para(x=0;x<10;x++)
        {
            escreva("\nJogue o dado:")
            leia(lancamento[x])
            enquanto(lancamento[x]<1 ou lancamento[x]>6)
            {
                escreva("\nJogue novamente o dado:")
                leia(lancamento[x])
            }
            somaLancamento +=lancamento[x]
            se(lancamento[x] == 6)
            {
                maiorPontuacao++
            }
        }
        mediaLancamento = somaLancamento / 10
        escreva("\nA média de  lançamento foi de : ",mediaLancamento)
        escreva("\nA  maior pontuação foi o numero : ",maiorPontuacao)


    }
}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 881; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */