programa
{
	//questão1:Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias.
	//originalmente a questão só pede para que fossem mostrados os dias, mas achei interessante adicionar também as horas vividas
	
	funcao inicio()
	{
		inteiro ano, mes, dia, totalDias, horas=24

		escreva("\nQual sua idade?: ")
		leia(ano)
		escreva("\n",ano," anos, e quantos meses?: ")
		leia(mes)
		escreva("\n",ano," anos, ",mes, " mes(es) e quantos dias?: ")
		leia(dia)
		escreva("\n",ano," anos, ", mes, " mes(es) ,", dia, " dias, e quantas horas?: ")
		leia(horas)
		totalDias= ano * 365 + mes * 30 + dia * 7 + horas * 24
		escreva("\nDe acordo com os meus calculos, você viveu ", totalDias, " dias e ", horas, " hrs de vida")

		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 265; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */