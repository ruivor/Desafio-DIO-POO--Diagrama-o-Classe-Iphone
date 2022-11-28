package Application;

import entities.Iphone;

public class Program {

	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();

		System.out.println();
		System.out.println("FUNÇÕES COMO NAVEGADOR INTERNET: ");
		System.out.println();

		iphone.exibirPagina();
		iphone.adicionarNovaAba();
		iphone.atualizarPagina();
		
		System.out.println();
		System.out.println("FUNCÕES COMO TELEFONE: ");
		System.out.println();
		
		iphone.ligar();
		iphone.atender();
		iphone.iniciarCorreioVoz();
		
		System.out.println();
		System.out.println("FUNÇÕES COMO REPRODUTOR MUSICAL: ");
		System.out.println();
		
		iphone.tocarMusica();
		iphone.pausarMusica();
		iphone.selecionarMusica();

	}

}
