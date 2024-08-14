package controller;

public class VetorInversoController {

	public VetorInversoController() {
		super();
		
	}
    public int vetorInverso(int[] vetor, int começo, int fim) {
    	if (começo >= fim) {
    		return 1;
    	} else {
    		int aux = vetor[começo];
    		vetor[começo] = vetor[fim];
    		vetor[fim] = aux;
    		return 1 + vetorInverso(vetor, começo + 1, fim - 1);
    		
    	}
    }
}
