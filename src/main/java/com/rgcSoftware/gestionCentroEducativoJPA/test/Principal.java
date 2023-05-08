package com.rgcSoftware.gestionCentroEducativoJPA.test;

import com.rgcSoftware.gestionCentroEducativoJPA.controller.CursoController;
import com.rgcSoftware.gestionCentroEducativoJPA.controller.MateriaController;
import com.rgcSoftware.gestionCentroEducativoJPA.controller.ValoracionMateriaController;
import com.rgcSoftware.gestionCentroEducativoJPA.model.Curso;
import com.rgcSoftware.gestionCentroEducativoJPA.model.Estudiante;
import com.rgcSoftware.gestionCentroEducativoJPA.model.Materia;
import com.rgcSoftware.gestionCentroEducativoJPA.model.Profesor;
import com.rgcSoftware.gestionCentroEducativoJPA.model.Valoracionmateria;

public class Principal {
	
	Estudiante e; 
	Profesor p; 
	Materia m;

	/**
	 * 
	 */
	private static void mostrarCursos() {
		for (Curso c : CursoController.findAll()) {
			System.out.println("Curso: " + c.getDescripcion());
		}
	}
	
	/**
	 * 
	 */
	private static void mostrarMaterias() {
		for (Materia m : MateriaController.findAll()) {
			System.out.println("Materia: " + m.getNombre());
		}
	}
	
//	/**
//	 * 
//	 */
//	private static void mostrarValoracionMateria() {
//		for (Valoracionmateria vm : ValoracionMateriaController.findByIdEstudianteIdProfesorAndIdMateria(e, p, m)) {
//			System.out.println(/*vm.getEstudiante().getNombre()+" "+ vm.getEstudiante().getApellido1() + ". Nota: " +*/ vm.getValoracion());
//		}
//	}
	
//	/**
//	 * 
//	 */
//	public static void nivelesByIdCentro() {
//		for (Nivel n: NivelController.findByIdCentro(1)) {
//			System.out.println("Nivel: " + n.getDescripcion());
//		}
//	}
//	
//	/**
//	 * 
//	 */
//	public static void materiasByIdCentroAndIdNivel() {
//		for (Materia m: MateriaController.findByIdIdNivel(5)) {
//			System.out.println("Nivel: " + m.getNombre());
//		}
//	}
	
	
	public static void main(String[] args) {
//		mostrarCursos();
//		mostrarMaterias(); 
//		mostrarValoracionMateria();
	}

}
