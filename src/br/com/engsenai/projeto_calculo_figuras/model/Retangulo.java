package br.com.engsenai.projeto_calculo_figuras.model;

public class Retangulo{
	
	private double altura;
	private double base;
	
	public double calcularArea() {
		double area = base * altura;
		return area;
	} 
	
	public double calcularPerimetro() {
		double perimetro = base + altura + base + altura;
		return perimetro;
	}
	public void mostrarDados(){
		System.out.println("---------");
		System.out.println("Dados do Retangulo");
		System.out.println("---------");
		System.out.println("Área: " + calcularArea());
		System.out.println("Perimetro: " + calcularPerimetro());
		
	}
	
}	