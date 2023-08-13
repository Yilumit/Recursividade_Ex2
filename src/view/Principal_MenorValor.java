package view;

import controller.MenorValorController;

public class Principal_MenorValor {

	public static void main(String[] args) {
		int[] vet = {5,-5,7,1,4,3};
		int tamanho = vet.length-1;
		MenorValorController chamaMenor = new MenorValorController();
		
		System.out.println("O menor valor do vetor é: "+chamaMenor.encontrarMenor(vet, tamanho, vet[tamanho]));
	}

}
