package br.fai.ex02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.start();

	}

	private void start() {

		Double soma = 0.0;
		int i = 0;
		boolean emExecucao = true;
		while (emExecucao) {

			System.out.print("Valor " + i + " :");
			Scanner scanner = new Scanner(System.in);
			Double valor = scanner.nextDouble();
			System.out.println();

			if (i >= 4) {
				if (valor == -1) {
					emExecucao = false;
				}

			}

			if (emExecucao) {
				soma += valor;
				i += 1;
			}
		}

		System.out.println("Soma total dos itens: " + soma);
		calcularMedia(soma, i);

	}

	private void calcularMedia(Double soma, int numeroDeItensInseridos) {

		Double media = soma / numeroDeItensInseridos;
		System.out.println("Média: " + media);
	}

}