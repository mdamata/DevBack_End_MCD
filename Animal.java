package Zoo;

public class Animal {

		private String raca;
		private String cor;
		private String especie;
		private String tamanho;
		private double altura;
		
		//botao direitor - source - create geatter e setter - cria automatico
		public void setRaca (String raca) {
			this.raca = raca;
		}
		
		public void setCor (String cor) {
			this.cor = cor;
		}
		
		public void setEspecie (String espece) {
			this.especie = especie;
		}
		
		public void setTamanho (String tamanho) {
			this.tamanho = tamanho;
		}
		
		public void setAltura (double altura) {
			this.altura = altura;
			
		}
		
		public String getRaca () {
			return raca;
		}
		
		public String getCor () {
			return cor;
		}
		
		public String getEspecie () {
			return especie;
		}
		
		public String getTamanho () {
			return tamanho;
		}
		
		public double getAltura () {
			return altura;
		}
}
