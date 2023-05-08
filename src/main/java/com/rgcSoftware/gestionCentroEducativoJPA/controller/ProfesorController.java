package com.rgcSoftware.gestionCentroEducativoJPA.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.rgcSoftware.gestionCentroEducativoJPA.model.Curso;
import com.rgcSoftware.gestionCentroEducativoJPA.model.Profesor;

public class ProfesorController {
	
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("centroeducativo");

	/**
	 * 
	 * @return
	 */
	public static List<Profesor> findAll() {		
		EntityManager em = entityManagerFactory.createEntityManager();	
		Query q = em.createNativeQuery("SELECT * FROM profesor;", Profesor.class);	
		List<Profesor> list = (List<Profesor>) q.getResultList();
		
		em.close();
		return list;
	}
}
