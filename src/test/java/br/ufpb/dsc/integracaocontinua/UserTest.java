package br.ufpb.dsc.integracaocontinua;

import static org.junit.Assert.*;

import org.junit.Test;

import br.ufpb.dsc.integracaocontinua.User;
import br.ufpb.dsc.integracaocontinua.UserManager;

public class UserTest {

	@Test
	public void senhaTest() {
		User u = new User("Luender", "1234", "jose.luender@dce.ufpb.br");
		UserManager um = new UserManager();
		um.addUser(u);
		assertEquals(um.validarUsuario("jose.luender@dce.ufpb.br", "1234"), true);
		
	}

}
