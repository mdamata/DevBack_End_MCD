package Exercicio_Poo;

public class Bomba {
	private boolean status;
	
	// metodo de ação 
	public void ligar() throws InterruptedException {
		int cont =5; // variavel local
		status = true; // recebe true por causa do metodo ligar 
		while (cont >0) {
			System.out.println("Tempo restante: " + cont);
			Thread.sleep(1000);
			cont --; // contagem regressiva
		}
	}
	public void desligar () {
		status = false;
		System.out.println("Bomba desligada: "); 
	}
	
}