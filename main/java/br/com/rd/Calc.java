package br.com.rd;

public class Calc {
	private int valor1;
	private int valor2;
	
	Calc(int v1 , int v2){
		this.valor1 = v1;
		this.valor2 = v2;
	}
	
	public int somar() {
		return this.valor1 + this.valor2;		
	}
	public int subtrair() {
		return this.valor1 - this.valor2;		
	}
	public int multiplicar() {
		return this.valor1 * this.valor2;		
	}
	public int Dividir() {
		return this.valor1 / this.valor2;		
	}
	
}
