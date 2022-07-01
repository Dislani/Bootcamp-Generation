programa
{
	//Questão 7. Um sistema de equações lineares do tipo: Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y.
	inclua biblioteca Matematica --> math
	
	funcao inicio()
	{
		real  a, b, c, d, o, f, x, y 
		escreva("\nDigite o valor que deseja atribuir a cada coeficiente: a, b, c, d, o, f, x, y: \n")
		leia(a, b, c, d, o, f)
		
		x = (c*o - b*f)/(a*o - b*d)
		y = (a*f - c*d)/(a*o - b*d)

		escreva("Valor X: ", math.arredondar(x, 2), "\nValor Y: ", math.arredondar(y, 2))
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 144; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */