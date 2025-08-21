package Atividades;

import java.util.Scanner;

public class Aumento_Salario {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double salario_antigo;
		double aumento_salario;
		double valor_aumento;
		double novo_salario;
		
		System.out.println("Digite seu salário: ");
		salario_antigo = ler.nextDouble();
		
		if(salario_antigo <= 1000) {
			aumento_salario = salario_antigo * 0.40;
			novo_salario = salario_antigo + aumento_salario;
			
			System.out.println("Salário antigo: " + salario_antigo +
								"\nValor do aumento: " + aumento_salario +
								"\nO novo salário: " + novo_salario);
		}
			else {
				aumento_salario = salario_antigo * 0.30;
				novo_salario = salario_antigo + aumento_salario;
				
				System.out.println("Salário antigo: " + salario_antigo +
						"\nValor do aumento: " + aumento_salario +
						"\nO novo salário: " + novo_salario);
		}
	}

}
