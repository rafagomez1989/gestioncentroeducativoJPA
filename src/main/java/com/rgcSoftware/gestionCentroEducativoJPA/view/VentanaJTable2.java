package com.rgcSoftware.gestionCentroEducativoJPA.view;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.rgcSoftware.gestionCentroEducativoJPA.controller.EstudianteController;
import com.rgcSoftware.gestionCentroEducativoJPA.model.Estudiante;

import java.awt.GridBagLayout;
import javax.swing.JSplitPane;
import java.awt.GridBagConstraints;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaJTable2 extends JFrame {

	private JPanel contentPane;
	private static JTable table;
	private JPanel panel;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private static JTextField jtfId;
	private static JTextField jtfNombre;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private static JTextField jtfApellido1;
	private static JTextField jtfApellido2;
	private static JTextField jtfDni;
	private static JTextField jtfDireccion;
	private static JTextField jtfEmail;
	private static JTextField jtfTelefono;
	private JPanel panel_1;
	private JButton btnPrimero;
	private JButton btnAnterior;
	private JButton btnSiguiente;
	private JButton btnUltimo;
	private JButton btnGuardar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaJTable2 frame = new VentanaJTable2();
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
	public VentanaJTable2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 595, 536);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0};
		gbl_contentPane.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		GridBagConstraints gbc_splitPane = new GridBagConstraints();
		gbc_splitPane.fill = GridBagConstraints.BOTH;
		gbc_splitPane.gridx = 0;
		gbc_splitPane.gridy = 0;
		contentPane.add(splitPane, gbc_splitPane);
		
		JScrollPane scrollPane = new JScrollPane();
		splitPane.setLeftComponent(scrollPane);
		
		table = new JTable(getDatosDeTabla(), getTitulosColumnas());
		scrollPane.setViewportView(table);
		scrollPane.setMinimumSize(new Dimension(200, 100));
		
		mouseClicked();		
		
		panel = new JPanel();
		splitPane.setRightComponent(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		lblNewLabel = new JLabel("Datos estudiante");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.gridwidth = 2;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.weightx = 1.0;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Id:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfId = new JTextField();
		jtfId.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 1;
		panel.add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		lblNewLabel_2 = new JLabel("Nombre:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfNombre = new JTextField();
		jtfNombre.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtfNombre.setColumns(10);
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 2;
		panel.add(jtfNombre, gbc_jtfNombre);
		
		lblNewLabel_3 = new JLabel("Apellido 1:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jtfApellido1 = new JTextField();
		jtfApellido1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtfApellido1.setColumns(10);
		GridBagConstraints gbc_jtfApellido1 = new GridBagConstraints();
		gbc_jtfApellido1.insets = new Insets(0, 0, 5, 0);
		gbc_jtfApellido1.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfApellido1.gridx = 1;
		gbc_jtfApellido1.gridy = 3;
		panel.add(jtfApellido1, gbc_jtfApellido1);
		
		lblNewLabel_4 = new JLabel("Apellido 2:");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 0;
		gbc_lblNewLabel_4.gridy = 4;
		panel.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		jtfApellido2 = new JTextField();
		jtfApellido2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtfApellido2.setColumns(10);
		GridBagConstraints gbc_jtfApellido2 = new GridBagConstraints();
		gbc_jtfApellido2.insets = new Insets(0, 0, 5, 0);
		gbc_jtfApellido2.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfApellido2.gridx = 1;
		gbc_jtfApellido2.gridy = 4;
		panel.add(jtfApellido2, gbc_jtfApellido2);
		
		lblNewLabel_5 = new JLabel("Dni:");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 0;
		gbc_lblNewLabel_5.gridy = 5;
		panel.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		jtfDni = new JTextField();
		jtfDni.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtfDni.setColumns(10);
		GridBagConstraints gbc_jtfDni = new GridBagConstraints();
		gbc_jtfDni.anchor = GridBagConstraints.NORTH;
		gbc_jtfDni.insets = new Insets(0, 0, 5, 0);
		gbc_jtfDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDni.gridx = 1;
		gbc_jtfDni.gridy = 5;
		panel.add(jtfDni, gbc_jtfDni);
		
		lblNewLabel_6 = new JLabel("Dirección:");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 0;
		gbc_lblNewLabel_6.gridy = 6;
		panel.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		jtfDireccion = new JTextField();
		jtfDireccion.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtfDireccion.setColumns(10);
		GridBagConstraints gbc_jtfDireccion = new GridBagConstraints();
		gbc_jtfDireccion.insets = new Insets(0, 0, 5, 0);
		gbc_jtfDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDireccion.gridx = 1;
		gbc_jtfDireccion.gridy = 6;
		panel.add(jtfDireccion, gbc_jtfDireccion);
		
		lblNewLabel_7 = new JLabel("Email:");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 0;
		gbc_lblNewLabel_7.gridy = 7;
		panel.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		jtfEmail = new JTextField();
		jtfEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtfEmail.setColumns(10);
		GridBagConstraints gbc_jtfEmail = new GridBagConstraints();
		gbc_jtfEmail.insets = new Insets(0, 0, 5, 0);
		gbc_jtfEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfEmail.gridx = 1;
		gbc_jtfEmail.gridy = 7;
		panel.add(jtfEmail, gbc_jtfEmail);
		
		lblNewLabel_8 = new JLabel("Teléfono:");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 0;
		gbc_lblNewLabel_8.gridy = 8;
		panel.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		jtfTelefono = new JTextField();
		jtfTelefono.setFont(new Font("Tahoma", Font.PLAIN, 16));
		jtfTelefono.setColumns(10);
		GridBagConstraints gbc_jtfTelefono = new GridBagConstraints();
		gbc_jtfTelefono.insets = new Insets(0, 0, 5, 0);
		gbc_jtfTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfTelefono.gridx = 1;
		gbc_jtfTelefono.gridy = 8;
		panel.add(jtfTelefono, gbc_jtfTelefono);
		
		panel_1 = new JPanel();
		GridBagConstraints gbc_panel_1 = new GridBagConstraints();
		gbc_panel_1.insets = new Insets(8, 0, 0, 0);
		gbc_panel_1.gridwidth = 2;
		gbc_panel_1.fill = GridBagConstraints.BOTH;
		gbc_panel_1.gridx = 0;
		gbc_panel_1.gridy = 9;
		panel.add(panel_1, gbc_panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0, 0, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		btnPrimero = new JButton("<<");
		btnPrimero.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btnPrimero = new GridBagConstraints();
		gbc_btnPrimero.weightx = 1.0;
		gbc_btnPrimero.insets = new Insets(0, 0, 5, 5);
		gbc_btnPrimero.gridx = 0;
		gbc_btnPrimero.gridy = 0;
		panel_1.add(btnPrimero, gbc_btnPrimero);
		
		btnAnterior = new JButton("<");
		btnAnterior.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btnAnterior = new GridBagConstraints();
		gbc_btnAnterior.weightx = 1.0;
		gbc_btnAnterior.insets = new Insets(0, 0, 5, 5);
		gbc_btnAnterior.gridx = 1;
		gbc_btnAnterior.gridy = 0;
		panel_1.add(btnAnterior, gbc_btnAnterior);
		
		btnSiguiente = new JButton(">");
		btnSiguiente.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btnSiguiente = new GridBagConstraints();
		gbc_btnSiguiente.weightx = 1.0;
		gbc_btnSiguiente.insets = new Insets(0, 0, 5, 5);
		gbc_btnSiguiente.gridx = 2;
		gbc_btnSiguiente.gridy = 0;
		panel_1.add(btnSiguiente, gbc_btnSiguiente);
		
		btnUltimo = new JButton(">>");
		btnUltimo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		GridBagConstraints gbc_btnUltimo = new GridBagConstraints();
		gbc_btnUltimo.insets = new Insets(0, 0, 5, 0);
		gbc_btnUltimo.weightx = 1.0;
		gbc_btnUltimo.gridx = 3;
		gbc_btnUltimo.gridy = 0;
		panel_1.add(btnUltimo, gbc_btnUltimo);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		btnGuardar.setFont(new Font("Tahoma", Font.BOLD, 16));
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.gridwidth = 4;
		gbc_btnGuardar.insets = new Insets(20, 0, 0, 5);
		gbc_btnGuardar.gridx = 0;
		gbc_btnGuardar.gridy = 1;
		panel_1.add(btnGuardar, gbc_btnGuardar);
	}
	
	/** 
	 * 
	 * @return
	 */
	public static String[] getTitulosColumnas() {
		return new String[] {"Id", "Nombre", "Apellido 1", "Apellido 2", "DNI", "Dirección", "Email", "Teléfono"};
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
	
	/**
	 * Método que controla el clic del ratón sobre la tabla
	 */
	public static void mouseClicked() {
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
	}
	
	/**
     * 
     * @param e
     */
    public static void rellenarPanel(Estudiante e) {
    	jtfId.setText("" + e.getId());
		jtfNombre.setText(e.getNombre());
		jtfApellido1.setText(e.getApellido1());
		jtfApellido2.setText(e.getApellido2());
		jtfDni.setText(e.getDni());
		jtfDireccion.setText(e.getDireccion());
		jtfEmail.setText(e.getEmail());
		jtfTelefono.setText(e.getTelefono());

    }
    
    
    /**
     * 
     */
    private static void guardar() {
        Estudiante o = new Estudiante();
        o.setId(Integer.parseInt(jtfId.getText()));
        o.setNombre(jtfNombre.getText());
        o.setApellido1(jtfApellido1.getText());
        o.setApellido2(jtfApellido2.getText());
        o.setDni(jtfDni.getText());
        o.setDireccion(jtfDireccion.getText());
        o.setEmail(jtfEmail.getText());
        o.setTelefono(jtfTelefono.getText());
        
        EstudianteController.update(o);
    }
	

}
