package br.com.engsenai.projeto_calculo_figuras.model;

public class Trapezio{
	
	private double altura;
	private double baseMaior;
	private double baseMenor;
	
	public void setBaseMaior(double baseMaior) {
		this.baseMaior = baseMaior;
	}
	
	public double getBaseMaior(){
		return baseMaior;
	}
	
	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getBaseMenor() {
		return baseMenor;
	}

	public void setBaseMenor(double baseMenor) {
		this.baseMenor = baseMenor;
	}

	public double calcularArea() {
		double area = (baseMaior + baseMenor) * altura / 2;
		return area;
	}
	
	public void mostrarDados(){
		System.out.println("---------");
		System.out.println("Dados do Trapézio");
		System.out.println("---------");
		System.out.println("Área: " + calcularArea());
		System.out.println("Base Menor: " + baseMenor);
		System.out.println("Base Maior: " + baseMaior);
		System.out.println("Altura:" + altura);
		
	}
	
}	