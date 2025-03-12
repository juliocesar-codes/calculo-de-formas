package br.com.engsenai.projeto_calculo_figuras.model;

public class Trapezio{
	
	private double altura;
	private double baseMaior;
	private double baseMenor;
	
	public double calcularArea() {
		double area = (baseMaior + baseMenor) * altura / 2;
		return area;
	} 
	
	public void mostrarDados(){
		System.out.println("---------");
		System.out.println("Dados do Retangulo");
		System.out.println("---------");
		System.out.println("Área: " + calcularArea());
		
	}
	
}	