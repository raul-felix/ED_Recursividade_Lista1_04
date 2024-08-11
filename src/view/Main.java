package view;

import controller.VetorController;

public class Main {
	
	public static void main(String[] args) {
		int[] vetor = { -10, 45, 28, -54, 0, 89, -65 };
		int tamanho = vetor.length;
		VetorController vetorController = new VetorController();
		
		int resultado = vetorController.totalNegativos(vetor, tamanho, 0);
		System.out.println(resultado);
	}

}
