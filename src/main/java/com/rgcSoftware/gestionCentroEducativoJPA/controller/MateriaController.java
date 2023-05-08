package com.rgcSoftware.gestionCentroEducativoJPA.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.rgcSoftware.gestionCentroEducativoJPA.model.Materia;

public class MateriaController {
	
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("centroeducativo");
	
	/**
	 * 
	 * @return
	 */
	public static List<Materia> findAll() {		
		EntityManager em = entityManagerFactory.createEntityManager();	
		Query q = em.createNativeQuery("SELECT * FROM materia;", Materia.class);	
		List<Materia> list = (List<Materia>) q.getResultList();
		
		em.close();
		return list;
	}

}
