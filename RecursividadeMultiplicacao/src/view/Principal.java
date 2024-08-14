package view;

import controller.MultiplicaController;

public class Principal {

	public static void main(String[] args) {
		MultiplicaController  multcontr = new MultiplicaController();
		int a = 5;
		int b = 4;
		int resultado = multcontr.multiplicacao(a, b);
		System.out.println(resultado);

	}

}