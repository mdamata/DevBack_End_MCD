package POO;

public class Gps_prof {
	private String idioma;
	private String rota;
	
	public Gps_prof() {
		this.idioma = " default";
		this.rota = " default";
	}
	
	public Gps_prof(String idioma, String rota) {
		this.idioma = idioma;
		this.rota = rota;
	}

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
	
	public void definirIdioma (String idioma) {
		this.idioma = idioma;
		
	}
	public void definirRota(String rota) {
		this.rota = rota;
	}
	public void mostrar () {
		System.out.println("Idioma: " + idioma + "\nRota: " + rota);
	}
}
