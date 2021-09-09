package br.com.dio.model;

public class Livro {
	
	private String nome;
	private Integer npag;
	
	public Livro() {}
	
	public Livro(String nome, Integer npag) {
		this.nome = nome;
		this.npag = npag;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNpag() {
		return npag;
	}

	public void setNpag(Integer npag) {
		this.npag = npag;
	}

	@Override
	public String toString() {
		return "Livro [nome=" + nome + ", npag=" + npag + "]";
	}
	
	

	
	
	
}
