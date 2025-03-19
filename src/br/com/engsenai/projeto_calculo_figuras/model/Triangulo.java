package br.com.engsenai.projeto_calculo_figuras.model;

public class Triangulo{
	
	public double altura;
	public double base;
	
	public void setBase(double base) {
		this.base = base;
	}
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double calcularArea() {
		double area = base * altura / 2;
		return area;
	} 
	
	public void mostrarDados(){
		System.out.println("---------");
		System.out.println("Dados do Triangulo");
		System.out.println("---------");
		System.out.println("Área: " + calcularArea());
		System.out.println("Altura: " + altura);
		System.out.println("Altura: " + base);
	}
	
}	