package com.jsp.laptop2crud.dao;

import java.util.List;
import javax.persistence.*;

import com.jsp.laptop2crud.entity.LaptopEntity;
import com.jsp.laptop2crud.util.JPAUtil;

public class LaptopDao {

	// SAVE
	public static void save(LaptopEntity l) {
		EntityManager em = JPAUtil.getEM();
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.persist(l);
		et.commit();
	}

	// GET ALL
	public static List<LaptopEntity> getAll() {
		EntityManager em = JPAUtil.getEM();
		Query q = em.createQuery("FROM LaptopEntity");
		return q.getResultList();
	}

	// GET BY ID
	public static LaptopEntity getById(int id) {
		EntityManager em = JPAUtil.getEM();
		return em.find(LaptopEntity.class, id);
	}

	// DELETE (safe)
	public static void deleteById(int id) {
		EntityManager em = JPAUtil.getEM();
		EntityTransaction et = em.getTransaction();

		LaptopEntity l = em.find(LaptopEntity.class, id);

		if (l != null) {
			et.begin();
			em.remove(l);
			et.commit();
		}
	}

	// UPDATE
	public static void update(LaptopEntity l) {
		EntityManager em = JPAUtil.getEM();
		EntityTransaction et = em.getTransaction();

		et.begin();
		em.merge(l);
		et.commit();
	}
	public static List<LaptopEntity> searchByName(String keyword) {
	    EntityManager em = JPAUtil.getEM();

	    Query q = em.createQuery(
	        "FROM LaptopEntity WHERE nameString LIKE :key");

	    q.setParameter("key", "%" + keyword + "%");

	    return q.getResultList();
	}
}