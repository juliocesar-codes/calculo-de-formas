package br.com.engsenai.projeto_calculo_figuras.model;

public class Quadrado{
	
	private double lado;
	
	public void setLado(double lado) {
		if (lado < 0) {
			this.lado = 1;
		}else {
			this.lado = lado;
		}
	}
	
	public double calcularArea() {
		double area = lado * lado;
		return area;
	} 
	
	public double calcularPerimetro() {
		double perimetro = 4 * lado;
		return perimetro;
	}
	public void mostrarDados(){
		System.out.println("---------");
		System.out.println("Dados do Quadrado");
		System.out.println("---------");
		System.out.println("Lado: " + lado);
		System.out.println("Área: " + calcularArea());
		System.out.println("Perimetro: " + calcularPerimetro());
		
	}
	
}	