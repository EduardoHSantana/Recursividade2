package controller;

public class MDCController {

	public MDCController() {
		super();
	}
    public int mdc(int a, int b, int i) {
    	if( i == a) {
    		return 1;
    	} else {
    		if(a % i == 0 & b % i == 0) {
    			int valor = i;
    			i = i + 1;  			
    			return valor * mdc(a, b, i);
    		} else {
    			i = i + 1;
    			return mdc(a, b, i);
    		}
    	}
    }
}