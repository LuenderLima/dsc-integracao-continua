package br.ufpb.dsc.integracaocontinua;

public class User {
	
	private String nome;
	private String email;
	private String senha;
	
	public User(String nome, String senha, String email) {
		this.nome = nome;
		this.senha = senha;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}
