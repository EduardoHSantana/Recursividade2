package controller;

public class FatorialImparController {

	public FatorialImparController() {
		super();
	}
    public int fatorialImpar(int n) {
        if(n == 1) {
        	return 1;
        } else {
        	int valor = n;
        	n = n - 2;
        	return valor * fatorialImpar(n);
        }
}
}