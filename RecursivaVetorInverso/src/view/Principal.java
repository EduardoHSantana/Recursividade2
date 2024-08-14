package view;

import controller.VetorInversoController;

public class Principal {

	public static void main(String[] args) {
		VetorInversoController vetcontr = new VetorInversoController();
		 // Testando com um vetor de 10 posições
        int[] vetor10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Vetor original de 10 posições: ");
        for (int i = 0; i < vetor10.length; i++) {
            System.out.print(vetor10[i] + " ");
        }
        System.out.println();

        vetcontr.vetorInverso(vetor10, 0, vetor10.length - 1);
        System.out.println("Vetor invertido de 10 posições: ");
        for (int i = 0; i < vetor10.length; i++) {
            System.out.print(vetor10[i] + " ");
        }
        System.out.println();

        // Testando com um vetor de 11 posições
        int[] vetor11 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        System.out.println("\nVetor original de 11 posições: ");
        for (int i = 0; i < vetor11.length; i++) {
            System.out.print(vetor11[i] + " ");
        }
        System.out.println();

        vetcontr.vetorInverso(vetor11, 0, vetor11.length - 1);
        System.out.println("Vetor invertido de 11 posições: ");
        for (int i = 0; i < vetor11.length; i++) {
            System.out.print(vetor11[i] + " ");
        }
        System.out.println();
    }
}
		

	


