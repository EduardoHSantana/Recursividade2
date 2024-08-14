package controller;

public class MultiplicaController {

	public MultiplicaController() {
		super();
		
	}
    public int multiplicacao(int a, int b) {
    	if (a == 0) {
    		return 0;
    	} else {
    		a = a - 1;
    		return b + multiplicacao(a, b); 
    	}
    }
}