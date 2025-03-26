package br.com.engsenai.projeto_calculo_figuras.ui;

import java.util.Scanner;

public class Menu {

		public void criarMenu() {
			
			Scanner leitor = new Scanner(System.in);
			
			System.out.println("----------------------");
			System.out.println("CALCULADORA DE POLÍGONOS");
			System.out.println("----------------------");
			System.out.println("1 - Quadrado");
			System.out.println("2 - Triângulo");
			System.out.println("3 - Retângulo");
			System.out.println("4 - Trapézio");
			System.out.println("5 - Circunferência");
			System.out.println("6 - Sair");
			System.out.println("----------------------");
			System.out.print("Escolha uma opção de (1 - 6): ");
			int opcao = leitor.nextInt();
			System.out.println("Você escolheu a opção: " + opcao);
			
		}
}
