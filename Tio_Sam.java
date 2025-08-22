package Atividades;

import java.util.Scanner;

public class Tio_Sam {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double nivel1 = 51.50;
		double nivel2 = 65;
		double nivel3 = 80;
		double nivel4 = 100;
		double desconto;
		String plano;
		int data;
		
		System.out.println("Digite o nível do seu plano: " + "\n1" + "\n2" + "\n3" + "\n4");
		plano = ler.nextLine();
		
		System.out.println("Digite qual a data de pagamento: ");
		data = ler.nextInt();

		
		switch (plano) {
			case "1":
		if (data == 1) {
			desconto = nivel1 - nivel1 * 0.15;
			System.out.println("Valor com desconto: " + desconto);
		}
		else if 
			(data >1 && data <=5) {
			desconto = nivel1 - nivel1 * 0.10;
			System.out.println("Valor com desconto: " + desconto);
			}
		else if 
			(data >6 && data <=10) {
			desconto = nivel1 - nivel1 * (3.89/100);
			System.out.println("Valor com desconto: " + desconto);
		}
		else {
			System.out.println("Não há desconto ");
		}
		break;
		
			case "2":
		if (data == 1) {
			desconto = nivel2 - nivel2 * 0.15;
			System.out.println("Valor com desconto: " + desconto);
		}
		else if 
			(data >1 && data <=5) {
			desconto = nivel2 - nivel2* 0.10;
			System.out.println("Valor com desconto: " + desconto);
		}
		else if 
			(data >5 && data <=10) {
			desconto = nivel2 - nivel2 * (3.89/100);
			System.out.println("Valor com desconto: " + desconto);
		}
		else {
			System.out.println("Não há desconto.");
		}
		break;

			case "3":
		if (data == 1) {
			desconto = nivel3 - nivel3 * 0.15;
			System.out.println("Valor com desconto: " + desconto);
		}
		else if
			(data >1 && data <=5) {
			desconto = nivel3 - nivel3 * 0.10;
			System.out.println("Valor com desconto: " + desconto);
		}
		else if 
			(data >5 && data <=10) {
			desconto = nivel3 - nivel3 * (3.89/100);
			System.out.println("Valor com desconto: " + desconto);
		}
		else {
			System.out.println("Não há desconto.");
		}
		break;
			
			case "4":
		if (data == 1) {
			desconto = nivel4 - nivel4 * 0.15;
			System.out.println("Valor com desconto: " + desconto);
		}
		else if (data >1 && data <=5) {
				desconto = nivel4 - nivel4 * 0.10;
				System.out.println("Valor com desconto: " + desconto);
		}
		else if (data >5 && data <=10) {
				desconto = nivel4 - nivel4 * (3.89/100);
				System.out.println("Valor com desconto: " + desconto);
		}
		else {
			System.out.println("Não há desconto");
		}
		break;
		
		}
	}

}
