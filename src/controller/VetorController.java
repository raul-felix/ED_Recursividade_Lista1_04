package controller;

public class VetorController {
	
	public VetorController() {
		super();
	}
	
	public int totalNegativos(int[] vet, int tamanho, int total) {
		
		int ultimoValor = vet[tamanho - 1];
		if (ultimoValor < 0) {
			total++;
		}
		
		if (tamanho <= 1) {
			// se o tamanho for igual a 1, chegamos na primeira posição do vetor e retornamos o total de elementos negativos encontrado
			return total;
		} else {
			// se não, retornamos a função recursiva com o tamanho do vetor subtraído por 1
			return totalNegativos(vet, tamanho - 1, total);
		}
	}

}
