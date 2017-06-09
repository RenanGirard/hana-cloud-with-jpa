package com.sap.cloud.sample.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.sap.cloud.sample.model.Banco;
import com.sap.cloud.sample.util.HibernateUtil;

public class BancoDAO {
	public void insert(Banco banco) {
		// TODO Auto-generated method stub
		EntityManager entityManager = HibernateUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(banco);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public void update(Banco banco) {
		// TODO Auto-generated method stub
		EntityManager entityManager = HibernateUtil.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(banco);
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}

	public void delete(Banco banco) {
		// TODO Auto-generated method stub
		EntityManager entityManager = HibernateUtil.getEntityManager();
		entityManager.getTransaction().begin();
		banco = entityManager.find(Banco.class, banco.getId());
		entityManager.remove(banco);
		entityManager.getTransaction().commit();
		entityManager.close();
		
	}

	public List<Banco> selectAll() {
		// TODO Auto-generated method stub
		List<Banco> bancos = null;
		EntityManager entityManager = HibernateUtil.getEntityManager();
		entityManager.getTransaction().begin();
		bancos = entityManager.createNamedQuery("AllBancos").getResultList();
		entityManager.getTransaction().commit();
		entityManager.close();
		return bancos;
	}

	public Banco selectById(Long id) {
		// TODO Auto-generated method stub
		Banco banco = null;
		EntityManager entityManager = HibernateUtil.getEntityManager();
		entityManager.getTransaction().begin();
		banco = entityManager.getReference(Banco.class, id);
		entityManager.getTransaction().commit();
		entityManager.close();
		return banco;
	}
	
}
