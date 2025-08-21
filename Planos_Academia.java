package Atividades;

import java.util.Scanner;

public class Planos_Academia {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		 	int data;
			String plano;
			double plano_basico = 80;
			double plano_intermediario = 120;
			double plano_avancado = 180;
			double plano_vip = 250;
			double desconto;

			System.out.println("Digite seu plano: " + "\nplano_basico " +
					"\nplano_intermediario " +
					"\nplano_avancado " +
					"\nplano_vip ");
			plano = ler.nextLine();
			
			System.out.println("Digite qual a data de pagamento: ");
			data = ler.nextInt();

			switch (plano) {
			case "plano_basico":
			if (data <= 3) {
			desconto = plano_basico - plano_basico *0.12;
			System.out.println("Valor com desconto: " + desconto);
			}

			else if 
			(data >3 && data <=7) {
			desconto = plano_basico - plano_basico * 0.07;
			System.out.println ("Valor com desconto: " + desconto);
			}

			else if 
			(data >7 && data <=10) {
			desconto = plano_basico - plano_basico * 0.03;
			System.out.println ("Valor com desconto: " + desconto);	
			}

			else {
			System.out.println ("Não há desconto ");
			}

			break;

			case "plano_intermediario":
				 if (data <= 3 ) {  
				desconto = plano_intermediario - (plano_intermediario * 0.12);
				System.out.println("Valor com desconto: "+ desconto );
				 }

				 else if
				 (data >3 && data<=7 ) {  
				desconto = plano_intermediario - (plano_intermediario  * 0.07);
				System.out.println("Valor com desconto: "+ desconto );
				 }
				 
				 else if (data >7 && data <=10) {  
				desconto = plano_intermediario  - (plano_intermediario  * 0.03);
				System.out.println("Valor com desconto: "+ desconto );
				 }

				 else  {  
				System.out.println("Não há desconto " );
				 }

				 break;

				 case "plano_avancado":
				 if (data <= 3 ) {  
				desconto = plano_avancado - (plano_avancado * 0.12);
				System.out.println("Valor com desconto: "+ desconto );
				 }

				 else if
				 (data >3 && data<=7 ) {  
				desconto = plano_avancado - (plano_avancado  * 0.07);
				System.out.println("Valor com desconto" + desconto );
				 }
				 
				 else if (data >7 && data <=10) {  
				desconto = plano_avancado  - (plano_avancado  * 0.03);
				System.out.println("Valor com desconto: "+ desconto );
				 }

				 else {  
				System.out.println("Não há desconto ");
				 }
				 
				 break;

				 case "plano_vip":
				 if (data <= 3 ) {  
				desconto = plano_vip - (plano_vip * 0.12);
				System.out.println("Valor com desconto:"+ desconto );
				 }

				 else if
				 (data >3 && data<=7 ) {  
				desconto = plano_vip - (plano_vip  * 0.07);
				System.out.println("Valor com desconto:"+ desconto );
				 }
				 else if (data >7 && data <=10) {  
				desconto = plano_vip  - (plano_vip  * 0.03);
				System.out.println("Valor com desconto:"+ desconto );
				 }

				 else {  
				System.out.println("Não há desconto ");
				 }
				 
				 break;
				}
		}
	}
