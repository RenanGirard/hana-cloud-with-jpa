package com.sap.cloud.sample.persistence.integrationtest;

import org.junit.Test;

import com.sap.cloud.sample.dao.CategoriaDAO;
import com.sap.cloud.sample.dao.UsuarioDAO;
import com.sap.cloud.sample.model.Categoria;
import com.sap.cloud.sample.model.Usuario;

import junit.framework.Assert;

public class ContaUsuarioTest {
	
	
	
	@Test
	public void adicionaUsuario() {

		UsuarioDAO usuarioDao = new UsuarioDAO();
		Usuario usuario = new Usuario();
		usuario.setNomeCompleto("Renan Vasconcelos");
		usuario.setNomeUsuario("renan");
		usuario.setSenha("1234");

		usuarioDao.insert(usuario);
		Assert.assertTrue(usuarioDao.selectByUserNameAndPassword("renan", "1234") != null);

	}

	@Test
	public void adicionaCategoria() {

		CategoriaDAO categoriaDAO = new CategoriaDAO();
		Categoria categoria = new Categoria();
		categoria.setNome("alimentacao");
		categoria.setComplemento("alim");
		categoriaDAO.insert(categoria);
		Assert.assertTrue(categoriaDAO.selectAll() != null);

	}

}
