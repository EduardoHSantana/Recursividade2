package view;

import controller.RestoDivisaoController;

public class Principal {

	public static void main(String[] args) {
		RestoDivisaoController divcontr = new RestoDivisaoController();
		 int dividendo = 40;
		 int divisor = 9;
		 int resultado = divcontr.restoDivisao(divisor, dividendo);
		 System.out.println(resultado);
	}

}