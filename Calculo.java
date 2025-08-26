package Calculadora;

public class Calculo extends CalculoCientifico {
	//calculo é a classe
	// o que tenho (Atributos)
	private double valor_01;
	private double valor_02;
	private double total;
	
	
	// metodos acessores 
	// metodo set serve pra inserir valor 
	public void setValor_01 (double valor01) {
		this.valor_01 = valor01;
	}
	
	public void setValor_02 (double valor02) {
		this.valor_02 = valor02;
	}
	
	public double getValor_01 () {
		return valor_01;
	}
	
	public double getValor_02 () {
		return valor_02;
	}
	public double getTotal() {
		return total;
	}
	
	// o que faço (metodos)
	public void somar (double valor01, double valor02) {
		this.total = this.valor_01 + this.valor_02;
		System.out.println(this.total);
	}
	
	public void subtrair (double valor01, double valor02) {
		this.total = this.valor_01 - this.valor_02;
		System.out.println(this.total);

	}
	
	public void multiplicar (double valor01, double valor02) {
		this.total = this.valor_01 * this.valor_02;
		System.out.println(this.total);
	}
	
	public void dividir (double valor01, double valor02) {
		this.total = this.valor_01 / this.valor_02;
		System.out.println(this.total);
	}
}