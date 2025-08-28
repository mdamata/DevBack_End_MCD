package POO;

import java.util.Scanner;

public class Gps {
	Scanner ler = new Scanner(System.in);
	private String idioma;
	private String rota;
	
	
	public String getIdioma() {
		return idioma;
	}
	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	public String getRota() {
		return rota;
	}
	public void setRota(String rota) {
		this.rota = rota;
	}
	
	public void gps (String rota, String idioma) {
		this.rota = rota;
		this.idioma = idioma;
		
	}
	public void gps () {
		this.idioma = "\nPortuguês";
		this.rota = "\n25 de março";
		
		System.out.println(idioma + rota);
	}
	
	public void definir_idioma () {
		this.idioma = "Defina o idioma: ";
		idioma = ler.nextLine();
	}
	public void definir_rota () {
		this.rota = "Defina uma rota: ";
		rota = ler.nextLine();
 	}
	public void mostrar () {
		System.out.println("Defina o idioma: ");
		idioma = ler.nextLine();
		System.out.println("Defina a rota: ");
		rota = ler.nextLine();
	}
}