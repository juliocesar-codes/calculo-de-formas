package br.com.engsenai.projeto_calculo_figuras.model;

public class Triangulo{
	
	private double altura;
	private double base;
	
	public double calcularArea() {
		double area = base * altura / 2;
		return area;
	} 
	
	public void mostrarDados(){
		System.out.println("---------");
		System.out.println("Dados do Retangulo");
		System.out.println("---------");
		System.out.println("Área: " + calcularArea());
		
	}
	
}	