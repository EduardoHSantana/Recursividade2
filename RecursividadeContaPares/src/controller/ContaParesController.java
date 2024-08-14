package controller;

public class ContaParesController {

	public ContaParesController() {
		super();
	}
    public int contaPares(int[]vetor, int tamanho) {
    	if(tamanho == 0) {
    		return 0;
    	} else {
    		int ultimaPosicao = tamanho - 1;
    		int valor = vetor[ultimaPosicao];
    		tamanho = tamanho - 1;
    		if(valor % 2 == 0) {
    		return 1 + contaPares(vetor, tamanho);	
    		} else {
    			return contaPares(vetor, tamanho);
    		}
    		}
    }
}