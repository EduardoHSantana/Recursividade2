package controller;

public class RestoDivisaoController {

	public RestoDivisaoController() {
		super();
	}
    public int restoDivisao(int divisor, int dividendo) {
    	if(divisor > dividendo) {
    		return dividendo;
    	} else {
    		dividendo = dividendo - divisor;
    		return restoDivisao(divisor, dividendo);
    	}
    }
         
}