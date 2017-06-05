package com.sap.cloud.sample.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.sap.cloud.sample.model.Categoria;
import com.sap.cloud.sample.model.Person;
import com.sap.cloud.sample.model.Usuario;
import com.sap.cloud.sample.util.HibernateUtil;

public class CategoriaDAO {
	public void insert(Categoria categoria) {
		EntityManager em = HibernateUtil.getEntityManager();
		em.getTransaction().begin();
		em.persist(categoria);
		em.getTransaction().commit();
		em.close();
	}

	public void delete(Categoria categoria) {
		EntityManager em = HibernateUtil.getEntityManager();
		em.getTransaction().begin();
		categoria = (Categoria) em.find(Categoria.class, categoria.getId());
		em.remove(categoria);
		em.getTransaction().commit();
		em.close();
	}

	public void update(Categoria categoria) {
		EntityManager em = HibernateUtil.getEntityManager();
		em.getTransaction().begin();
		em.merge(categoria);
		em.getTransaction().commit();
		em.close();

	}

	public Categoria selectById(Long id) {
		Categoria categoria;
		EntityManager em = HibernateUtil.getEntityManager();
		em.getTransaction().begin();
		categoria = em.getReference(Categoria.class, id);
		em.getTransaction().commit();
		em.close();
		return categoria;
	}

	public List<Categoria> selectAll() {
		List<Categoria> categorias = null;
		EntityManager em = HibernateUtil.getEntityManager();
		em.getTransaction().begin();
		categorias = em.createNamedQuery("AllCategoria", Categoria.class).getResultList();
		em.getTransaction().commit();
		em.close();
		return categorias;
	}

}
