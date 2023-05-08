package com.rgcSoftware.gestionCentroEducativoJPA.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.rgcSoftware.gestionCentroEducativoJPA.controller.EstudianteController;
import com.rgcSoftware.gestionCentroEducativoJPA.controller.MateriaController;
import com.rgcSoftware.gestionCentroEducativoJPA.controller.ProfesorController;
import com.rgcSoftware.gestionCentroEducativoJPA.controller.ValoracionMateriaController;
import com.rgcSoftware.gestionCentroEducativoJPA.model.Estudiante;
import com.rgcSoftware.gestionCentroEducativoJPA.model.Materia;
import com.rgcSoftware.gestionCentroEducativoJPA.model.Profesor;
import com.rgcSoftware.gestionCentroEducativoJPA.model.Valoracionmateria;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ValoracionMateriaView extends JFrame {
	
	JPanel panelEstudiantes;
	AlumnoNotaPanelView nuevoPanel;
	
	private JPanel contentPane;
	private JComboBox<Materia> jcbMateria;
	private JComboBox<Profesor> jcbProfesor;
	private List<Estudiante> estudiantesGuardar = new ArrayList<>();
	private List<AlumnoNotaPanelView> listaPanelesAlumnos = new ArrayList<AlumnoNotaPanelView>();
	private	List<Valoracionmateria> listaNotas = null;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValoracionMateriaView frame = new ValoracionMateriaView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * Create the frame.
	 */
	public ValoracionMateriaView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{59, 263, 155, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 91, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("Materia:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		jcbMateria = new JComboBox();
		jcbMateria.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_jcbMateria = new GridBagConstraints();
		gbc_jcbMateria.insets = new Insets(0, 0, 5, 5);
		gbc_jcbMateria.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbMateria.gridx = 1;
		gbc_jcbMateria.gridy = 0;
		contentPane.add(jcbMateria, gbc_jcbMateria);
		
		JLabel lblProfesor = new JLabel("Profesor:");
		lblProfesor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_lblProfesor = new GridBagConstraints();
		gbc_lblProfesor.anchor = GridBagConstraints.EAST;
		gbc_lblProfesor.insets = new Insets(0, 0, 5, 5);
		gbc_lblProfesor.gridx = 0;
		gbc_lblProfesor.gridy = 1;
		contentPane.add(lblProfesor, gbc_lblProfesor);
		
		jcbProfesor = new JComboBox();
		jcbProfesor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_jcbProfesor = new GridBagConstraints();
		gbc_jcbProfesor.insets = new Insets(0, 0, 5, 5);
		gbc_jcbProfesor.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbProfesor.gridx = 1;
		gbc_jcbProfesor.gridy = 1;
		contentPane.add(jcbProfesor, gbc_jcbProfesor);
		
		JButton btnRefrescarAlumnado = new JButton("Botón refrescar alumnado");
		btnRefrescarAlumnado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarEstudiantes();
//				cargarNotas();
			}
		});
		GridBagConstraints gbc_btnRefrescarAlumnado = new GridBagConstraints();
		gbc_btnRefrescarAlumnado.insets = new Insets(0, 0, 5, 0);
		gbc_btnRefrescarAlumnado.gridx = 2;
		gbc_btnRefrescarAlumnado.gridy = 1;
		contentPane.add(btnRefrescarAlumnado, gbc_btnRefrescarAlumnado);
		
		panelEstudiantes = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.gridwidth = 3;
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 2;
		contentPane.add(panelEstudiantes, gbc_panel);
		
		JButton btnGuardarNotas = new JButton("Guardar las notas de todos los alumnos");
		btnGuardarNotas.setFont(new Font("Tahoma", Font.PLAIN, 12));
		GridBagConstraints gbc_btnGuardarNotas = new GridBagConstraints();
		gbc_btnGuardarNotas.gridx = 2;
		gbc_btnGuardarNotas.gridy = 3;
		contentPane.add(btnGuardarNotas, gbc_btnGuardarNotas);
		
		cargarMateriasEnJCombo();
		cargarProfesoresEnJCombo();
	}
	
	
	/**
	 * 
	 */
	private void cargarMateriasEnJCombo() {			
		this.jcbMateria.removeAllItems();
		for (Materia m : MateriaController.findAll()) {
			this.jcbMateria.addItem(m);
		}
	}
	
	
	/**
	 * 
	 */
	private void cargarProfesoresEnJCombo() {			
		this.jcbProfesor.removeAllItems();
		for (Profesor p : ProfesorController.findAll()) {
			this.jcbProfesor.addItem(p);
		}
	}
	
	
	/**
	 * 
	 */
	private void cargarEstudiantes() {
		this.panelEstudiantes.removeAll();
		this.listaPanelesAlumnos.clear();
		
		for (Estudiante e : EstudianteController.findAll()) {
		
		nuevoPanel = new AlumnoNotaPanelView((Profesor)this.jcbProfesor.getSelectedItem(), (Materia)this.jcbMateria.getSelectedItem(), e);
		this.panelEstudiantes.add(nuevoPanel);
		this.listaPanelesAlumnos.add(nuevoPanel);		
		}
		
		this.repaint();
		this.revalidate();
	}
	
	/**
	 * 
	 */
//	private void cargarNotas() {
//		Estudiante e = (Estudiante) EstudianteController.findAll();
//		this.panelEstudiantes.removeAll();
//		this.listaNotas.clear();
//		
//		for (Valoracionmateria vm : ValoracionMateriaController.findByIdEstudianteIdProfesorAndIdMateria(
//				e, (Profesor) jcbProfesor.getSelectedItem(), (Materia) jcbMateria.getSelectedItem())) {
//		
//		nuevoPanel = new AlumnoNotaPanelView((Profesor)this.jcbProfesor.getSelectedItem(), (Materia)this.jcbMateria.getSelectedItem(), e);
//		this.panelEstudiantes.add(nuevoPanel);
//		this.listaNotas.add(vm);		
//		}
//		
//		this.repaint();
//		this.revalidate();
//	}
//	
//	
//	/**
//	 * 
//	 */
//	private void guardarNotas() {
//		for (AlumnoNotaPanelView panel : listaPanelesAlumnos) {
//			panel.guardaNota();
//		}
//	}
	
	
	
	

}
