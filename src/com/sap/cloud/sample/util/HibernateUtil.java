package com.sap.cloud.sample.util;

import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.sql.DataSource;

import org.eclipse.persistence.config.PersistenceUnitProperties;

public class HibernateUtil {
	private static EntityManagerFactory factory;
	private static DataSource ds;

	static {
		try {
			init();
		} catch (Exception e) {
		}

	}

	public static EntityManager getEntityManager() {
		return factory.createEntityManager();
	}

	/** {@inheritDoc} */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void init() {
		Connection connection = null;
		try {
			InitialContext ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/DefaultDB");

			Map properties = new HashMap();
			properties.put(PersistenceUnitProperties.NON_JTA_DATASOURCE, ds);
			factory = Persistence.createEntityManagerFactory("persistence-with-jpa", properties);
		} catch (NamingException e) {
		}
	}

	/** {@inheritDoc} */
	public void destroy() {
		factory.close();
	}

}
