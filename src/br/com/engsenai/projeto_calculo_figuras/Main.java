package br.com.engsenai.projeto_calculo_figuras;

import br.com.engsenai.projeto_calculo_figuras.model.Quadrado;
import br.com.engsenai.projeto_calculo_figuras.model.Retangulo;
import br.com.engsenai.projeto_calculo_figuras.model.Triangulo;

public class Main {
	public static void main(String[] args) {

		Quadrado q1 = new Quadrado();
		q1.setLado(2);
		q1.mostrarDados();
		
		Triangulo t1 = new Triangulo();
		t1.setBase(3);
		t1.setAltura(5);
		t1.mostrarDados();
		
		Retangulo r1 = new Retangulo();
		r1.setBase(3);
		r1.setAltura(7);
		r1.mostrarDados();
		
	}
}
