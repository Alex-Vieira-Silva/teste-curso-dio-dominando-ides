package br.com.dio;

import br.com.dio.model.Gato;
import br.com.dio.model.Livro;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato("Eliazar", "Branca", 3);
		
		Livro livro = new Livro("Hist�ria de um gato", 150);
		
		System.out.println("Dados do animal " + gato.toString());
		
		System.out.println("Op��es de Livros " + livro.toString());
		
	}

}

