package Poliformismo;

import java.util.Scanner;

public class TestaPessoa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Pessoa pessoa = new Pessoa ();
		Pessoa usuario = new Pessoa("Huguinho", "Patópolis", "hug@inho.com");
		Pessoa usuaria = new Pessoa("Lindinha");
		
		System.out.println("Altere a configuração como desejado;" + "\nNome: " + pessoa.getNome() + 
										"\nEndereço: " + pessoa.getEndereco() +
										"\nE-mail " + pessoa.getEmail());
		System.out.println("Altere a configuração como desejado;" + "\nNome: " + usuario.getNome() + 
				"\nEndereço: " + usuario.getEndereco() +
				"\nE-mail " + usuario.getEmail());
		System.out.println("Altere a configuração como desejado;" + "\nNome: " + usuaria.getNome() + 
				"\nEndereço: " + usuaria.getEndereco() +
				"\nE-mail " + usuaria.getEmail());
		
		
		System.out.println("Digite o seu nome");
		pessoa.setNome(ler.nextLine());
		System.out.println("Digite o seu endereço");
		pessoa.setEndereco(ler.nextLine());
		System.out.println("Digite o seu email");
		pessoa.setEmail(ler.nextLine());
		
		System.out.println("Configuração alterada;" + "\nNome: " + pessoa.getNome() + 
										"\nEndereço: " + pessoa.getEndereco() +
										"\nE-mail: " + pessoa.getEmail());
		
				
	}

}
