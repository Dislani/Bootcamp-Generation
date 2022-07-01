programa
{
	//8. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem do distribuidor e dos impostos (aplicados ao custo de fábrica).
	//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, escrever um sistema que leia o custo de fábrica de um carro e escreva o custo ao consumidor.
	
	inclua biblioteca Matematica --> math
	
	funcao inicio()
	{
		real Fabrica, Distribuidor, imposto, carro

		escreva("Simule aqui o custo de fabrica de um carro: ")
		leia(Fabrica)
		
		Distribuidor = Fabrica * 0.28
		imposto = Fabrica * 0.45
		carro = Fabrica + Distribuidor + imposto

		escreva("\nO valor simulado do carro, com os impostos aplicados foi de: ", math.arredondar(carro, 2))
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 737; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */