package br.ufpb.dsc.integracaocontinua;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
	
	private List<User> users;
	
	public UserManager() {
		users = new ArrayList<User>();
	}
	
	public void addUser(User user) {
		users.add(user);
	}
	
	public boolean validarUsuario(String nome, String senha) {
		return pesquisarUsuario(nome).getSenha().equals(senha);
	}
	
	public User pesquisarUsuario(String nome) {
		for(User u: users) {
			if(u.getNome().equals(nome)) {
				return u;
			}
		}
		return null;
	}

}
