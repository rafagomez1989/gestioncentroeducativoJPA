package com.rgcSoftware.gestionCentroEducativoJPA.view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import javax.swing.JTextField;

import com.rgcSoftware.gestionCentroEducativoJPA.controller.ValoracionMateriaController;
import com.rgcSoftware.gestionCentroEducativoJPA.model.Estudiante;
import com.rgcSoftware.gestionCentroEducativoJPA.model.Materia;
import com.rgcSoftware.gestionCentroEducativoJPA.model.Profesor;
import com.rgcSoftware.gestionCentroEducativoJPA.model.Valoracionmateria;

import java.awt.Insets;

public class AlumnoNotaPanelView extends JPanel {
	private Profesor p;
	private Materia m;
	private Estudiante e;
	private JTextField jtfNota;
	private JLabel jlblAlumno;

	/**
	 * Create the panel.
	 */
	public AlumnoNotaPanelView(Profesor p, Materia m, Estudiante e) {
		super();
		this.p = p;
		this.m = m;
		this.e = e;
		
		GridBagLayout gridBagLayout = new GridBagLayout();
//		gridBagLayout.columnWidths = new int[]{179, 0, 0};
//		gridBagLayout.rowHeights = new int[]{0, 0};
//		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
//		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
//		jlblAlumno = new JLabel(e.getNombre() +" "+e.getApellido1() +" "+ e.getApellido2());
		jlblAlumno = new JLabel(e.toString());

		jlblAlumno.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblAlumno = new GridBagConstraints();
		gbc_lblAlumno.anchor = GridBagConstraints.EAST;
		gbc_lblAlumno.insets = new Insets(0, 0, 0, 5);
		gbc_lblAlumno.gridx = 0;
		gbc_lblAlumno.gridy = 0;
		add(jlblAlumno, gbc_lblAlumno);
		
		jtfNota = new JTextField();
		jtfNota.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_jtfNota = new GridBagConstraints();
		gbc_jtfNota.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNota.gridx = 1;
		gbc_jtfNota.gridy = 0;
		add(jtfNota, gbc_jtfNota);
		jtfNota.setColumns(10);

	}

	

//	private int valoracionEstudiante() {
//		Valoracionmateria valoracion = ValoracionController.findBySomeId(m.getId(), p.getId(), e.getId());
//		if (valoracion != null) {
//			return (int) valoracion.getValoracion();
//		} else {
//			return 0;
//		}
//	}
//	
//	/**
//	 * 
//	 * @return
//	 */
//	public Estudiante devolverEstudiante() {
//		return e;
//	}
//	
//	/**
//	 * 
//	 * @return
//	 */
//	public int devolverValoracion() {
//		return (int) spinner.getValue();
//	}
//	
//	/**
//	 * 
//	 * @return
//	 */
//	public Valoracionmateria guardar() {
//		Valoracionmateria o1 = ValoracionMateriaController.findByIdEstudianteIdProfesorAndIdMateria(e.getId(), p.getId(), m.getId());
//		Valoracionmateria o = new Valoracionmateria();
//		
//		if(o1 != null) {
//			o.setId(o1.getId());
//			o.setProfesor(p);
//			o.setEstudiante(e);
//			o.setMateria(m);
//			o.setValoracion((int) spinner.getValue());
//	
//			return o;
//		}
//		else {
//			return null;
//		}
//	}
}
