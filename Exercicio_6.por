programa
{
	inclua biblioteca Matematica-->mat
	
 	//6. Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2), 
 	//escreva a distância entre eles. A fórmula que efetua tal cálculo é: d= raiz quadrada da ((x2-x1)^2 + (y2-y1)^2.
 	
	
	funcao inicio()
	{


		inteiro x1, y1, x2, y2, d

		

	escreva("\nDigite A distancia do ponto x1 ao ponto x2: ")
	leia(x1)
	
	escreva("\nDigite A distancia do ponto y1 ao ponto y2: ")
	leia(y1)

	escreva("\nDigite A distancia do ponto x2 ao ponto x1: ")
	leia(x2)

	escreva("\nDigite A distancia do ponto y2 ao ponto y1: ")
	leia(y2)

	d =((x2-x1)^2) + (y2-y1)^2

 	escreva("\nO valor da distancia entre o P1 e o P2 é de: ", d)


	}



}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 313; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */