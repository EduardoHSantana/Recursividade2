package view;

import controller.MDCController;

public class Principal {

	public static void main(String[] args) {
		int i = 2;
		MDCController mdccontr = new MDCController();
		int a = 6;
		int b = 15;
		int resultado = mdccontr.mdc(a, b, i);
		System.out.println(resultado);
		

	}

}