package Exercicio_Poo;

public class Bomba2 {
	boolean status;
	int cont;
	
	public void ligar(int cont) throws InterruptedException { 
	this.cont = cont;
	status = true;
	
	while(cont >0) {
		System.out.println("Tempo restante: " + cont);
		Thread.sleep(1000);
		cont--;
		}
	
	desligar();
}
	public void desligar () {
		desligar();
	}
}
