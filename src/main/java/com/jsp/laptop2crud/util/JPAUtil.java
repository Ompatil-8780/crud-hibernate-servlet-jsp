package com.jsp.laptop2crud.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAUtil {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("laptop");

	public static EntityManager getEM() {
		return emf.createEntityManager();
	}
}
