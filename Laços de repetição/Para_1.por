programa
{
 //PARA
//1:A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:  
//a) média do salário da população;
//b) média do número de filhos;
//c) maior salário;
//d) percentual de pessoas com salário até R$100,00.

	funcao inicio()
	{
		inteiro cont, filhos, pessoas100=0
		real salario=0.0, mediaSalario=0.0, somaSalario=0.0, mediaFilhos=0.0, somaFilhos=0.0, maiorSalario=0.0, percent 
		
		para (cont=1; cont<=4; cont= cont +1 )
		{
			 escreva("\nSalario: ")
			 leia(salario)
			 escreva("\nQuantos filhos você tem: ")
			 leia(filhos)
			 somaSalario= somaSalario + salario
			 somaFilhos= somaFilhos + filhos

			 se (salario<=100)
			 {
			 	pessoas100= pessoas100 + 1
			 }

			se(salario > maiorSalario) 
			{
				maiorSalario = salario  
			}
		}
		mediaSalario= somaSalario/cont-1
		mediaFilhos= somaFilhos/cont-1
		percent= (pessoas100*100)/(cont-1)
		escreva("\nA media salario foi de: R$ ", mediaSalario )
		escreva("\nA media de filhos foi de: ", mediaFilhos )
		escreva("\nO maior salario foi de: R$", maiorSalario ) 
		escreva("\nPercentual de pessoas com salário até R$100,00 foi de: ", percent, "%")
	}         
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 26; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */