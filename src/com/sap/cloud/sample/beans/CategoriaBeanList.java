package com.sap.cloud.sample.beans;

import java.util.ArrayList;
import java.util.List;

import com.sap.cloud.sample.model.Categoria;

public class CategoriaBeanList {

	private List<CategoriaBean> categoriasBeanList = new ArrayList<CategoriaBean>();

	public CategoriaBeanList() {

	}

	public CategoriaBeanList(List<Categoria> categoriasList) {
		// TODO Auto-generated constructor stub
		for (Categoria categoria : categoriasList) {
			categoriasBeanList.add(
					new CategoriaBean(categoria.getId(), categoria.getNome(), categoria.getComplemento()));
		}
	}

	public List<CategoriaBean> getCategoriasBeanList() {
		return categoriasBeanList;
	}

	public void setCategoriasBeanList(List<CategoriaBean> categoriasBeanList) {
		this.categoriasBeanList = categoriasBeanList;
	}
	
	

}
