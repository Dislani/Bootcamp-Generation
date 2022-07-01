programa
{
	//Questão3: Faça um sistema que leia o tempo de duração de um evento em uma fábrica expressa em segundos e mostre-o expresso em horas, minutos e segundos.

	funcao inicio()
	{
		inteiro duracao,  hora, minutos, segundos

		escreva("\nEscreva a duração de tempo expresso em segundos: ")
		leia (duracao)
		hora= duracao/3600
		minutos= (duracao % 3600) / 60
		segundos = (duracao % 3600) % 60

		escreva("\nA duração do evento em segundos convertido em horas é de, ", hora," : horas ", minutos, ": minutos e, ", segundos, ": segundos")
		

	

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 479; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */