package view;

import controller.FatorialImparController;

public class Principal {

	public static void main(String[] args) {
		FatorialImparController fatcontr = new FatorialImparController();
		int n = 7;
		int resultado = fatcontr.fatorialImpar(n);
		System.out.println(resultado);

	}

}