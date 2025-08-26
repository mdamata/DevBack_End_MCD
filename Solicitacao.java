package Calculadora;

import java.util.Scanner;

public class Solicitacao {
	Scanner ler = new Scanner(System.in);
	String op;
	Calculo calc = new Calculo();
	
	public void solicitarOperacao () {
		System.out.println("Digite um valor: ");
		calc.setValor_01(ler.nextDouble());
	
		System.out.println("Digite um valor: ");
		calc.setValor_02(ler.nextDouble());
	
		System.out.println("Digite a operação: " +
							"\n + somar " +
							"\n - subtrair " +
							"\n * multiplicar" +
							"\n / dividir" +
							"\n r raiz quadrada");
							op = ler.next();
	
	switch (op) {
		case "+":
		calc.somar(calc.getValor_01(), calc.getValor_02());
		
		case "-":
		calc.subtrair(calc.getValor_01(), calc.getValor_02());
		
		case "*":
		calc.multiplicar(calc.getValor_01(), calc.getValor_02());
		
		case "/":
		calc.dividir(calc.getValor_01(), calc.getValor_02());
		
		case "r":
			calc.raizQuadrada();
	}
}
}