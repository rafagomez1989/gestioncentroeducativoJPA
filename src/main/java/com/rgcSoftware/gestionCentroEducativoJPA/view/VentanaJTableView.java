package com.rgcSoftware.gestionCentroEducativoJPA.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import com.rgcSoftware.gestionCentroEducativoJPA.controller.EstudianteController;
import com.rgcSoftware.gestionCentroEducativoJPA.model.Estudiante;

import java.awt.GridBagLayout;
import javax.swing.JSplitPane;
import java.awt.GridBagConstraints;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JTextField;

public class VentanaJTableView extends JFrame {

	private JPanel contentPane;
	private static PanelDatosPersonales panelDatosPersonales = new PanelDatosPersonales();
	private JTable table;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaJTableView frame = new VentanaJTableView();
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
	public VentanaJTableView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 771, 633);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
//		gbl_contentPane.columnWidths = new int[]{0, 0};
//		gbl_contentPane.rowHeights = new int[]{0, 0};
//		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
//		gbl_contentPane.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		GridBagConstraints gbc_splitPane = new GridBagConstraints();
		gbc_splitPane.weighty = 1.0;
		gbc_splitPane.weightx = 1.0;
		gbc_splitPane.fill = GridBagConstraints.BOTH;
		gbc_splitPane.gridx = 0;
		gbc_splitPane.gridy = 0;
		contentPane.add(splitPane, gbc_splitPane);
		
		table = new JTable(getDatosDeTabla(),getTitulosColumnas());
		splitPane.setLeftComponent(table);
		
		// Accedo a los clics realizados sobre la tabla
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				List<Estudiante> lista = EstudianteController.findAll();
				int i=0;
				for (Estudiante estudiante : lista) {
					if (i==table.getSelectedRow()) {
						rellenarPanel(estudiante);	
						}
					i++;
				}
			}
		});
		
		panel = new PanelDatosPersonales();
		splitPane.setRightComponent(panelDatosPersonales);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{54, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
	}
		
	
	/**
     * 
     * @param e
     */
    public static void rellenarPanel(Estudiante e) {
		panelDatosPersonales.setNombre(e.getNombre());
		panelDatosPersonales.setApellido1(e.getApellido1());
		panelDatosPersonales.setApellido2(e.getApellido2());
		panelDatosPersonales.setDni(e.getDni());
		panelDatosPersonales.setDireccion(e.getDireccion());
		panelDatosPersonales.setEmail(e.getEmail());
		panelDatosPersonales.setTelefono(e.getTelefono());
    }

	
	
	/** 
	 * 
	 * @return
	 */
	public static String[] getTitulosColumnas() {
		return new String[] {"Id", "Nombre", "Apellido 1", "Apellid 2", "DNI", "Dirección", "Email", "Teléfono"};
	}

	
	/**
	 * 
	 * @return
	 */
	public static Object[][] getDatosDeTabla() {
		// Obtengo todas las personas
		List<Estudiante> lista = EstudianteController.findAll();
		// Preparo una estructura para pasar al constructor de la JTable
		Object[][] datos = new Object[lista.size()][8];
		// Cargo los datos de la lista de personas en la matriz de los datos
		for (int i = 0; i < lista.size(); i++) {
			Estudiante e = lista.get(i);
			datos[i][0] = e.getId();
			datos[i][1] = e.getNombre();
			datos[i][2] = e.getApellido1();
			datos[i][3] = e.getApellido2();
			datos[i][4] = e.getDni();
			datos[i][5] = e.getDireccion();
			datos[i][6] = e.getEmail();
			datos[i][7] = e.getTelefono();
		}
		
		return datos;
	}
	
	
}
