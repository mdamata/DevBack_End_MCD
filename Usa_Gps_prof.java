package POO;

import java.util.Scanner;

public class Usa_Gps_prof {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Gps_prof gps_prof = new Gps_prof ();
		
		gps_prof.mostrar();
		
		System.out.println("Digite o idoma!");
		gps_prof.definirIdioma(ler.nextLine());
		System.out.println("Digite a rota!");
		gps_prof.definirRota(ler.nextLine());

		gps_prof.mostrar();
	}

}
