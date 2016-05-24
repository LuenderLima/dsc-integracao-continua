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
	
	public boolean validarUsuario(String email, String senha) {
		return pesquisarUsuario(email).getSenha().equals(senha);
	}
	
	public User pesquisarUsuario(String email) {
		for(User u: users) {
			if(u.getEmail().equals(email)) {
				return u;
			}
		}
		return null;
	}

}
