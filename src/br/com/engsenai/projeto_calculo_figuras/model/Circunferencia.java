package br.com.engsenai.projeto_calculo_figuras.model;

public class Circunferencia{
	
	private double raio;
	
	public double calcularArea() {
		double area = Math.PI * Math.pow(raio, 2);
		return area;
	} 
	
	public double calcularCircunferencia() {
		double circunferencia = 2 * Math.PI * raio;
		return circunferencia;
	} 
	
	public void mostrarDados(){
		System.out.println("---------");
		System.out.println("Dados do Retangulo");
		System.out.println("---------");
		System.out.println("Área: " + calcularArea());
		
	}
	
}	