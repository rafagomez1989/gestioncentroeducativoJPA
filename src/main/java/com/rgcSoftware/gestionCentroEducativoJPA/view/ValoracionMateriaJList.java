package com.rgcSoftware.gestionCentroEducativoJPA.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.eclipse.persistence.internal.sessions.factories.model.platform.NetWeaver_7_1_PlatformConfig;

import com.rgcSoftware.gestionCentroEducativoJPA.controller.EstudianteController;
import com.rgcSoftware.gestionCentroEducativoJPA.controller.MateriaController;
import com.rgcSoftware.gestionCentroEducativoJPA.controller.ProfesorController;
import com.rgcSoftware.gestionCentroEducativoJPA.controller.ValoracionMateriaController;
import com.rgcSoftware.gestionCentroEducativoJPA.model.Estudiante;
import com.rgcSoftware.gestionCentroEducativoJPA.model.Materia;
import com.rgcSoftware.gestionCentroEducativoJPA.model.Profesor;
import com.rgcSoftware.gestionCentroEducativoJPA.model.Valoracionmateria;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JList;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class ValoracionMateriaJList extends JFrame {
	
	private JList jlistIzquierda;
	private JList jlistDerecha;
	private DefaultListModel<Estudiante> listModelIzquierda= null;
	private DefaultListModel<Estudiante> listModelDerecha= null;
	private List<Estudiante> estudiantesGuardar = new ArrayList<>();
	private List<Estudiante> estudiantes = EstudianteController.findAll();
	private JComboBox<Materia> jcbMateria;
	private JComboBox<Profesor> jcbProfesor;
	private JComboBox jcbNota;

//	private int indiceProximaProvinciaParaAgregar = 0;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValoracionMateriaJList frame = new ValoracionMateriaJList();
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
	public ValoracionMateriaJList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 811, 669);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.rowHeights = new int[]{0, 355, 0};
//		gbl_contentPane.columnWidths = new int[]{0, 0};
//		gbl_contentPane.rowHeights = new int[]{189, 0, 0};
//		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
//		gbl_contentPane.rowWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(179, 200, 204));
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.weightx = 1.0;
		gbc_panel.insets = new Insets(0, 0, 5, 0);
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		contentPane.add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JLabel lblNewLabel = new JLabel("Materia:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		jcbMateria = new JComboBox();
		jcbMateria.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_jcbMateria = new GridBagConstraints();
		gbc_jcbMateria.insets = new Insets(0, 0, 5, 0);
		gbc_jcbMateria.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbMateria.gridx = 1;
		gbc_jcbMateria.gridy = 0;
		panel.add(jcbMateria, gbc_jcbMateria);
		
		JLabel lblProfesor = new JLabel("Profesor:");
		lblProfesor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblProfesor = new GridBagConstraints();
		gbc_lblProfesor.anchor = GridBagConstraints.EAST;
		gbc_lblProfesor.insets = new Insets(0, 0, 5, 5);
		gbc_lblProfesor.gridx = 0;
		gbc_lblProfesor.gridy = 1;
		panel.add(lblProfesor, gbc_lblProfesor);
		
		jcbProfesor = new JComboBox();
		jcbProfesor.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_jcbProfesor = new GridBagConstraints();
		gbc_jcbProfesor.insets = new Insets(0, 0, 5, 0);
		gbc_jcbProfesor.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbProfesor.gridx = 1;
		gbc_jcbProfesor.gridy = 1;
		panel.add(jcbProfesor, gbc_jcbProfesor);
		
		JLabel lblNota = new JLabel("Nota:");
		lblNota.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNota = new GridBagConstraints();
		gbc_lblNota.anchor = GridBagConstraints.EAST;
		gbc_lblNota.insets = new Insets(0, 0, 5, 5);
		gbc_lblNota.gridx = 0;
		gbc_lblNota.gridy = 2;
		panel.add(lblNota, gbc_lblNota);
		
		jcbNota = new JComboBox();
		jcbNota.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_jcbNota = new GridBagConstraints();
		gbc_jcbNota.insets = new Insets(0, 0, 5, 0);
		gbc_jcbNota.fill = GridBagConstraints.HORIZONTAL;
		gbc_jcbNota.gridx = 1;
		gbc_jcbNota.gridy = 2;
		panel.add(jcbNota, gbc_jcbNota);
		
		jlistIzquierda = new JList(this.getDefaultListModelIzquierda());
		this.jlistIzquierda.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // Valor por defecto

		jlistDerecha = new JList(this.getDefaultListModelDerecha());
		this.jlistDerecha.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // Valor por defecto

		
		JButton btnActualizarAlumnado = new JButton("Botón actualizar alumnado");
		btnActualizarAlumnado.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarEstudiantesIzquierda();
			}
		});
		btnActualizarAlumnado.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btnActualizarAlumnado = new GridBagConstraints();
		gbc_btnActualizarAlumnado.anchor = GridBagConstraints.EAST;
		gbc_btnActualizarAlumnado.gridx = 1;
		gbc_btnActualizarAlumnado.gridy = 3;
		panel.add(btnActualizarAlumnado, gbc_btnActualizarAlumnado);
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 252, 213));
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(0, 0, 5, 0);
		gbc_panel_1.weighty = 1.0;
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 1;
		contentPane.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Alumnado no seleccionado");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.weightx = 1.0;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 0;
		panel_1.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Alumnado  seleccionado");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_1_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel_1_1.weightx = 1.0;
		gbc_lblNewLabel_1_1.gridx = 2;
		gbc_lblNewLabel_1_1.gridy = 0;
		panel_1.add(lblNewLabel_1_1, gbc_lblNewLabel_1_1);
		
		JScrollPane scrollPane = new JScrollPane(jlistIzquierda);
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.insets = new Insets(0, 0, 0, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 0;
		gbc_scrollPane.gridy = 1;
		panel_1.add(scrollPane, gbc_scrollPane);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBackground(new Color(255, 190, 159));
		GridBagConstraints gbc_panel_2_1 = new GridBagConstraints();
		gbc_panel_2_1.insets = new Insets(0, 0, 0, 5);
		gbc_panel_2_1.fill = GridBagConstraints.BOTH;
		gbc_panel_2_1.gridx = 1;
		gbc_panel_2_1.gridy = 1;
		panel_1.add(panel_2_1, gbc_panel_2_1);
		GridBagLayout gbl_panel_2_1 = new GridBagLayout();
//		gbl_panel_2_1.columnWidths = new int[]{0, 0};
//		gbl_panel_2_1.rowHeights = new int[]{0, 0, 0, 0, 0};
//		gbl_panel_2_1.columnWeights = new double[]{0.0, Double.MIN_VALUE};
//		gbl_panel_2_1.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_2_1.setLayout(gbl_panel_2_1);
		
		JButton btnTodoAIzquierda = new JButton("<<");
		btnTodoAIzquierda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cargarEstudiantesIzquierda();
			}
		});
		btnTodoAIzquierda.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnTodoAIzquierda = new GridBagConstraints();
		gbc_btnTodoAIzquierda.insets = new Insets(0, 0, 5, 0);
		gbc_btnTodoAIzquierda.gridx = 0;
		gbc_btnTodoAIzquierda.gridy = 0;
		panel_2_1.add(btnTodoAIzquierda, gbc_btnTodoAIzquierda);
		
		JButton btnUnoAIzquierda = new JButton("<");
		btnUnoAIzquierda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pasarUnoAIzquierda();
			}
		});
		btnUnoAIzquierda.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnUnoAIzquierda = new GridBagConstraints();
		gbc_btnUnoAIzquierda.insets = new Insets(0, 0, 5, 0);
		gbc_btnUnoAIzquierda.gridx = 0;
		gbc_btnUnoAIzquierda.gridy = 1;
		panel_2_1.add(btnUnoAIzquierda, gbc_btnUnoAIzquierda);
		
		JButton btnUnoADerecha = new JButton(">");
		btnUnoADerecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pasarUnoADerecha();
			}
		});
		btnUnoADerecha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnUnoADerecha = new GridBagConstraints();
		gbc_btnUnoADerecha.insets = new Insets(0, 0, 5, 0);
		gbc_btnUnoADerecha.gridx = 0;
		gbc_btnUnoADerecha.gridy = 2;
		panel_2_1.add(btnUnoADerecha, gbc_btnUnoADerecha);
		
		JButton btnTodoADerecha = new JButton(">>");
		btnTodoADerecha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnTodoADerecha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pasarListaADerecha();
			}
		});
		GridBagConstraints gbc_btnTodoADerecha = new GridBagConstraints();
		gbc_btnTodoADerecha.gridx = 0;
		gbc_btnTodoADerecha.gridy = 3;
		panel_2_1.add(btnTodoADerecha, gbc_btnTodoADerecha);
		
		JScrollPane scrollPane_1 = new JScrollPane(jlistDerecha);
		GridBagConstraints gbc_scrollPane_1 = new GridBagConstraints();
		gbc_scrollPane_1.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_1.gridx = 2;
		gbc_scrollPane_1.gridy = 1;
		panel_1.add(scrollPane_1, gbc_scrollPane_1);
		
		JButton btnGuardar = new JButton("Guardar las notas de todos los alumnos seleccionados");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		btnGuardar.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.anchor = GridBagConstraints.EAST;
		gbc_btnGuardar.gridx = 0;
		gbc_btnGuardar.gridy = 2;
		contentPane.add(btnGuardar, gbc_btnGuardar);
		
		cargarMateriasEnJCombo();
		cargarProfesoresEnJCombo();
		cargarNotasEnJCombo();
	}
	
	/**
	 * M�todo que construye el modelo de JList, a utilizar para agregar y eliminar provincias
	 */
	private DefaultListModel getDefaultListModelIzquierda () {
		this.listModelIzquierda = new DefaultListModel<Estudiante>();
		return this.listModelIzquierda;
	}
	
	/**
	 * M�todo que construye el modelo de JList, a utilizar para agregar y eliminar provincias
	 */
	private DefaultListModel getDefaultListModelDerecha () {
		this.listModelDerecha = new DefaultListModel<Estudiante>();
		return this.listModelDerecha;
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
	private void cargarNotasEnJCombo() {			
		this.jcbNota.removeAllItems();
		for (float i = 0; i < 11; i++) {
			this.jcbNota.addItem(i);
		}
		
	}
	
	/**
	 * 
	 */
	private void cargarEstudiantesIzquierda() {
		listModelDerecha.removeAllElements();
		listModelIzquierda.removeAllElements();
		listModelIzquierda.addAll(estudiantes);
	}
	
	/**
	 * 
	 */
	private void pasarListaADerecha() {
		listModelDerecha.removeAllElements();
		listModelIzquierda.removeAllElements();
		listModelDerecha.addAll(estudiantes);
	}
	
	/**
	 * 
	 */
	private void pasarUnoADerecha() {
		listModelDerecha.addAll(jlistIzquierda.getSelectedValuesList());
		for (int i = this.jlistIzquierda.getSelectedIndices().length - 1; i >= 0; i--) {
			this.listModelIzquierda.removeElementAt(this.jlistIzquierda.getSelectedIndices()[i]);
		}

	}
	
	
	/**
	 * 
	 */
	private void pasarUnoAIzquierda() {
		listModelIzquierda.addAll(jlistDerecha.getSelectedValuesList());
		for (int i = this.jlistDerecha.getSelectedIndices().length - 1; i >= 0; i--) {
			this.listModelDerecha.removeElementAt(this.jlistDerecha.getSelectedIndices()[i]);
		}
	}
	
	
	/**
	 * 
	 */
	private void guardar() {
		estudiantesGuardar.removeAll(estudiantesGuardar);
		for (int i = 0; i < listModelDerecha.size(); i++) {
			estudiantesGuardar.add(listModelDerecha.getElementAt(i));	
		}
		for (Estudiante estudiante : estudiantesGuardar) {
			Valoracionmateria vm = ValoracionMateriaController.findByIdEstudianteIdProfesorAndIdMateria(estudiante, 
					(Profesor) jcbProfesor.getSelectedItem(),(Materia) jcbMateria.getSelectedItem());
			
			if (vm != null) {
				vm.setValoracion((float) jcbNota.getSelectedItem());
				ValoracionMateriaController.update(vm);
			}
			else {
				vm = new Valoracionmateria();
				vm.setProfesor((Profesor) jcbProfesor.getSelectedItem());
				vm.setMateria((Materia) jcbMateria.getSelectedItem());
				vm.setEstudiante(estudiante);
				vm.setValoracion((float) jcbNota.getSelectedItem());
				ValoracionMateriaController.insert(vm);
			}
		}
	}
	
	
	
	
}
