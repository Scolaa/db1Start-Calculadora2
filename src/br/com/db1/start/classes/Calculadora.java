package br.com.db1.start.classes;

public class Calculadora {
	
	private Double valor1 = 0d;
	private Double valor2 = 0d;
	
	public void zerar(){
		valor1 = 0d;
		valor2 = 0d;
	}
	
	
	public Double somar(Double valor1, Double valor2){
		return valor1 + valor2;
	}
	
	public Double subtrair(Double valor1, Double valor2){
		return valor1 - valor2;
	}
	
	public Double multiplicar(Double valor1, Double valor2){
		return valor1 * valor2;
	}
	
	public Double dividir(Double valor1, Double valor2){
		return valor1 / valor2;
	}
	
	public Double getValor1() {
		return valor1;
	}
	public void setValor1(Double valor1) {
		this.valor1 = valor1;
	}
	public Double getValor2() {
		return valor2;
	}
	public void setValor2(Double valor2) {
		this.valor2 = valor2;
	}
	
	
}
