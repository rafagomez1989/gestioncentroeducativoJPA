package com.rgcSoftware.gestionCentroEducativoJPA.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.rgcSoftware.gestionCentroEducativoJPA.model.Curso;

public class CursoController {
	
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("centroeducativo");

	/**
	 * 
	 * @return
	 */
	public static List<Curso> findAll() {		
		EntityManager em = entityManagerFactory.createEntityManager();	
		Query q = em.createNativeQuery("SELECT * FROM curso;", Curso.class);	
		List<Curso> list = (List<Curso>) q.getResultList();
		
		em.close();
		return list;
	}
}
