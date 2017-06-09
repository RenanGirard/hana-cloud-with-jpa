package com.sap.cloud.sample.beans;

import java.util.ArrayList;
import java.util.List;

import com.sap.cloud.sample.model.Banco;

public class BancoBeanList {

	private List<BancoBean> bancoList = new ArrayList<BancoBean>();

	public BancoBeanList() {
		// TODO Auto-generated constructor stub
	}

	public BancoBeanList(List<Banco> bancos) {
		for (Banco banco : bancos) {
			bancoList.add(new BancoBean(banco.getId(), banco.getNome()));
		}
	}

	public List<BancoBean> getBancoList() {
		return bancoList;
	}

	public void setBancoList(List<BancoBean> bancoList) {
		this.bancoList = bancoList;
	}

}
