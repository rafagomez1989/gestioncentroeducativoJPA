package com.rgcSoftware.gestionCentroEducativoJPA.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.rgcSoftware.gestionCentroEducativoJPA.model.Estudiante;
import com.rgcSoftware.gestionCentroEducativoJPA.model.Materia;
import com.rgcSoftware.gestionCentroEducativoJPA.model.Profesor;
import com.rgcSoftware.gestionCentroEducativoJPA.model.Valoracionmateria;

public class ValoracionMateriaController {
	
	private static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("centroeducativo");

	/**
	 * 
	 * @param descripcion
	 * @return
	 */
	public static Valoracionmateria findByIdEstudianteIdProfesorAndIdMateria (Estudiante e, Profesor p, Materia m) {
		Valoracionmateria vm = null;
		try {
			EntityManager em = entityManagerFactory.createEntityManager();
			Query q = em.createNativeQuery("SELECT * FROM valoracionmateria where idEstudiante = ? && idProfesor = ? "
					+ "&& idMateria = ?", Valoracionmateria.class);
			q.setParameter(1, e.getId());
			q.setParameter(2, p.getId());
			q.setParameter(3, m.getId());
			vm = (Valoracionmateria) q.getSingleResult();
			em.close();
			
		} catch (Exception e2) {
		}
		
		return vm;
	}
	
	/**
	 * 
	 * @param v
	 */
	public static void update(Valoracionmateria vm) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.merge(vm);
        System.out.println("He realizado la modificacion");
        em.getTransaction().commit();
        em.close();
    }
    
	/**
	 * 
	 * @param v
	 */
    public static void insert(Valoracionmateria vm) {
        EntityManager em = entityManagerFactory.createEntityManager();
        em.getTransaction().begin();
        em.persist(vm);
        System.out.println("He realizado la inserccion");
        em.getTransaction().commit();
        em.close();
    }
	
	
	

}
