package com.sap.cloud.sample.beans;

import java.util.ArrayList;
import java.util.List;

import com.sap.cloud.sample.model.Usuario;

public class UsuarioBeanList {
	private List<UsuarioBean> usuariosBeanList = new ArrayList<UsuarioBean>();
	
	public UsuarioBeanList() {
		
	}
	
	public UsuarioBeanList(List<Usuario> usuariosList) {
		for (Usuario usuario : usuariosList){
			usuariosBeanList.add(new UsuarioBean(usuario.getId(),usuario.getNomeUsuario()
					, usuario.getNomeCompleto(), usuario.getSenha()));
		}
	}

	public List<UsuarioBean> getUsuariosBeanList() {
		return usuariosBeanList;
	}

	public void setUsuariosBeanList(List<UsuarioBean> usuariosBeanList) {
		this.usuariosBeanList = usuariosBeanList;
	}
	
	
}
