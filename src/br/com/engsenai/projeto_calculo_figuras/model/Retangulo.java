package br.com.engsenai.projeto_calculo_figuras.model;

public class Retangulo{
	
	public double altura;
	public double base;
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public double calcularArea() {
		double area = base * altura;
		return area;
	} 
	
	public double calcularPerimetro() {
		double perimetro = Math.pow(base, 2) + Math.pow(altura, 2);
		return perimetro;
	}
	public void mostrarDados(){
		System.out.println("---------");
		System.out.println("Dados do Retangulo");
		System.out.println("---------");
		System.out.println("Altura: " + altura);
		System.out.println("Altura: " + base);
		System.out.println("Área: " + calcularArea());
		System.out.println("Perimetro: " + calcularPerimetro());
		
	}
	
}	