programa
{
//ENQUANTO
//1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório, a média e o total de valores lidos. O programa
//deve fazer as leituras dos valores enquanto o usuário estiver fornecendo valores
//positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.
	
	funcao inicio()
	{
		inteiro num=0, cont=0
		real mediaNum=0.0, somaTotal=0.0, mediaNumeros=0.0

		 escreva("\nDigite um numero que não seja negativo: ")
		 leia(num)
		 enquanto(num >=0)
		 {
		 	somaTotal= somaTotal + num
		 	cont= cont + 1
		 	leia(num)
		 }
		 escreva("\nA soma total  dos numeros foi de: ", somaTotal)
		 mediaNumeros= somaTotal / cont
		 escreva("\nMedia de todos os numeros foi de: ", mediaNumeros )
		 escreva("\nO total de numeros lidos foi de: ", cont )
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 850; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */