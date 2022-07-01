programa
{
//questão2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias.
	
	funcao inicio()
	{
		inteiro totalDias,ano,mes,dia
		escreva("\nEntre com o total de dias vividos por você: ")
		leia(totalDias)
		
		ano= totalDias/365
		mes= (totalDias % 365)/ 30
		dia=(totalDias % 365) % 30
		escreva("\nVocê viveu: ", ano, " ano(s)", mes, " meses, e ", dia, " dias de vida")
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 349; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */