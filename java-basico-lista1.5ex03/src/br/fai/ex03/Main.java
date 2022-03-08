package br.fai.ex03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.start();

	}

	private void start() {

		System.out.println("Palavra ou frase: ");
		Scanner scanner = new Scanner(System.in);
		String texto = scanner.nextLine();

		System.out.println("Por caracter: ");

		char[] letras = texto.toCharArray();
		String textoCompleto = "";

		for (int i = letras.length - 1; i < letras.length; i--) {
			System.out.println(letras[i]);
			textoCompleto += letras[i];
		}

		System.out.println();
		System.out.println("String: " + textoCompleto);

	}
}