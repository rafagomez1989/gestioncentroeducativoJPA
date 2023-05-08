package com.rgcSoftware.gestionCentroEducativoJPA.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.rgcSoftware.gestionCentroEducativoJPA.model.Curso;
import com.rgcSoftware.gestionCentroEducativoJPA.model.Estudiante;
import com.rgcSoftware.gestionCentroEducativoJPA.model.Valoracionmateria;

public class EstudianteController {
	
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("centroeducativo");

	/**
	 * 
	 * @return
	 */
	public static List<Estudiante> findAll() {		
		EntityManager em = entityManagerFactory.createEntityManager();	
		Query q = em.createNativeQuery("SELECT * FROM estudiante;", Estudiante.class);	
		List<Estudiante> list = (List<Estudiante>) q.getResultList();
		
		em.close();
		return list;
	}
	
	/**
	 * 
	 */
	public static void obtenerEstudiante (int id) {
		EntityManager em = entityManagerFactory.createEntityManager();

		Query q = em.createNativeQuery("SELECT * FROM estudiante where id = ?", Estudiante.class);
		q.setParameter(1, id);
		Estudiante estudiante = (Estudiante) q.getSingleResult();
		
		if (estudiante != null) {
			System.out.println(estudiante.getNombre());
		}
		
		em.close();
	}
	
	
	/**
	 * 
	 * @param v
	 */
	public static void update(Estudiante e) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.merge(e);
        System.out.println("He realizado la modificacion");
        em.getTransaction().commit();
        em.close();
    }
    
	/**
	 * 
	 * @param v
	 */
    public static void insert(Estudiante e) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(e);
        System.out.println("He realizado la inserccion");
        em.getTransaction().commit();
        em.close();
    }
}
