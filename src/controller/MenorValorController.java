package controller;

public class MenorValorController {

	public MenorValorController() {
		super();
	}
	
	public int encontrarMenor(int vetor[], int tamanho, int menorValor) {
		//A funçao percorrerá o vetor a partir do maior índice até o menor
		
		if(tamanho <= 0) { /*	A condiçao de parada da funçao foi definida quando 'tamanho' (índice do vetor) for = 0,
		 					*	a condiçao '<' (menor) é necessária porque caso o tamanho seja menor que 0, a funçao pode nunca retornar um valor para a classe principal. 				
							*	Não há como um vetor ter índice negativo, mas é necessário que todas as excessões sejam cumpridas para a funçao funcionar	*/
			
			return menorValor; //Retorna o menor valor encontrado
			
		}
		//Se o índice do vetor não for igual a zero
		if (menorValor > vetor[tamanho-1]) { 	//Quando o menor valor até o momento for maior que o próximo valor do vetor
			menorValor = vetor[tamanho-1];		//Este valor será atribuído à variável 'menorValor'
			
		}
			
		menorValor = encontrarMenor(vetor, tamanho-1, menorValor); // Chama a funçao novamente, diminuindo 1 índice do vetor e atribuindo o valor retornado para a variável 'menorValor'
		return menorValor;	
	}

}
