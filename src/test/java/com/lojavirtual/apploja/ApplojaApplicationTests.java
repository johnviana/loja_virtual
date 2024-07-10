package com.lojavirtual.apploja;

import com.lojavirtual.apploja.api.UsuarioController.AcessoController;
import com.lojavirtual.apploja.domain.model.Acesso;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ApplojaApplication.class)
class ApplojaApplicationTests {


	@Autowired
	private AcessoController acessoController;

	@Test
	public void testCadastraAcesso() {

		Acesso acesso = new Acesso();

		acesso.setDescricao("ROLE_ADMIN");

		acessoController.salvarAcesso(acesso);
	}

}
