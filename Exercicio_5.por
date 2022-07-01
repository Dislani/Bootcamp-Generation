programa
{
	
	//Questão 5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
//aluno Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
//respectivamente.
	funcao inicio()
	{
		cadeia nome 
		inteiro nota1, nota2, nota3, mediaFinal
		
		escreva("\nEscreva seu nome: ")
		leia(nome)
		
		escreva("\n",nome,", Digite sua primeira nota: ")
		leia(nota1)
		
		escreva("\n",nome,", Digite sua segunda nota: ")
		leia(nota2)
		
		escreva("\n",nome,", Digite sua terceira nota: ")
		leia(nota3)
		
		mediaFinal = (nota1+nota2+nota3) / 3
		escreva("\n",nome," sua media ponderada foi de: ", mediaFinal )

		 se (mediaFinal >= 6.0 e mediaFinal <=10) {

		 	escreva("\n Você foi aprovado")
		 }
		 senao se (mediaFinal<6.0 e mediaFinal <10) {
		 	escreva("\nVocê foi resprovado")
		 }
		 	
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 826; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */