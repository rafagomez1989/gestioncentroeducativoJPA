package com.rgcSoftware.gestionCentroEducativoJPA.view;

import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;

import com.rgcSoftware.gestionCentroEducativoJPA.controller.EstudianteController;
import com.rgcSoftware.gestionCentroEducativoJPA.model.Estudiante;

import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelDatosPersonales extends JPanel {
	private static JTextField jtfId;
	private static JTextField jtfNombre;
	private static JTextField jtfApellido1;
	private static JTextField jtfApellido2;
	private static JTextField jtfDni;
	private static JTextField jtfDireccion;
	private static JTextField jtfEmail;
	private static JTextField jtfTelefono;
	private static Estudiante es = new Estudiante();



	/**
	 * Create the panel.
	 */
	public PanelDatosPersonales() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNewLabel = new JLabel("Id:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		add(lblNewLabel, gbc_lblNewLabel);
		
		jtfId = new JTextField();
		GridBagConstraints gbc_jtfId = new GridBagConstraints();
		gbc_jtfId.insets = new Insets(0, 0, 5, 0);
		gbc_jtfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfId.gridx = 1;
		gbc_jtfId.gridy = 0;
		add(jtfId, gbc_jtfId);
		jtfId.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		jtfNombre = new JTextField();
		GridBagConstraints gbc_jtfNombre = new GridBagConstraints();
		gbc_jtfNombre.insets = new Insets(0, 0, 5, 0);
		gbc_jtfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfNombre.gridx = 1;
		gbc_jtfNombre.gridy = 1;
		add(jtfNombre, gbc_jtfNombre);
		jtfNombre.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Apellido1:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		jtfApellido1 = new JTextField();
		GridBagConstraints gbc_jtfApellido1 = new GridBagConstraints();
		gbc_jtfApellido1.insets = new Insets(0, 0, 5, 0);
		gbc_jtfApellido1.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfApellido1.gridx = 1;
		gbc_jtfApellido1.gridy = 2;
		add(jtfApellido1, gbc_jtfApellido1);
		jtfApellido1.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Apellido2:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		jtfApellido2 = new JTextField();
		GridBagConstraints gbc_jtfApellido2 = new GridBagConstraints();
		gbc_jtfApellido2.insets = new Insets(0, 0, 5, 0);
		gbc_jtfApellido2.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfApellido2.gridx = 1;
		gbc_jtfApellido2.gridy = 3;
		add(jtfApellido2, gbc_jtfApellido2);
		jtfApellido2.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("DNI:");
		GridBagConstraints gbc_lblNewLabel_3_1 = new GridBagConstraints();
		gbc_lblNewLabel_3_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3_1.gridx = 0;
		gbc_lblNewLabel_3_1.gridy = 4;
		add(lblNewLabel_3_1, gbc_lblNewLabel_3_1);
		
		jtfDni = new JTextField();
		jtfDni.setColumns(10);
		GridBagConstraints gbc_jtfDni = new GridBagConstraints();
		gbc_jtfDni.insets = new Insets(0, 0, 5, 0);
		gbc_jtfDni.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDni.gridx = 1;
		gbc_jtfDni.gridy = 4;
		add(jtfDni, gbc_jtfDni);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Dirección:");
		GridBagConstraints gbc_lblNewLabel_3_1_1 = new GridBagConstraints();
		gbc_lblNewLabel_3_1_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3_1_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3_1_1.gridx = 0;
		gbc_lblNewLabel_3_1_1.gridy = 5;
		add(lblNewLabel_3_1_1, gbc_lblNewLabel_3_1_1);
		
		jtfDireccion = new JTextField();
		jtfDireccion.setColumns(10);
		GridBagConstraints gbc_jtfDireccion = new GridBagConstraints();
		gbc_jtfDireccion.insets = new Insets(0, 0, 5, 0);
		gbc_jtfDireccion.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfDireccion.gridx = 1;
		gbc_jtfDireccion.gridy = 5;
		add(jtfDireccion, gbc_jtfDireccion);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Email:");
		GridBagConstraints gbc_lblNewLabel_3_1_2 = new GridBagConstraints();
		gbc_lblNewLabel_3_1_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3_1_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3_1_2.gridx = 0;
		gbc_lblNewLabel_3_1_2.gridy = 6;
		add(lblNewLabel_3_1_2, gbc_lblNewLabel_3_1_2);
		
		jtfEmail = new JTextField();
		jtfEmail.setColumns(10);
		GridBagConstraints gbc_jtfEmail = new GridBagConstraints();
		gbc_jtfEmail.insets = new Insets(0, 0, 5, 0);
		gbc_jtfEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfEmail.gridx = 1;
		gbc_jtfEmail.gridy = 6;
		add(jtfEmail, gbc_jtfEmail);
		
		JLabel lblNewLabel_3_1_3 = new JLabel("Teléfono:");
		GridBagConstraints gbc_lblNewLabel_3_1_3 = new GridBagConstraints();
		gbc_lblNewLabel_3_1_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3_1_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3_1_3.gridx = 0;
		gbc_lblNewLabel_3_1_3.gridy = 7;
		add(lblNewLabel_3_1_3, gbc_lblNewLabel_3_1_3);
		
		jtfTelefono = new JTextField();
		jtfTelefono.setColumns(10);
		GridBagConstraints gbc_jtfTelefono = new GridBagConstraints();
		gbc_jtfTelefono.insets = new Insets(0, 0, 5, 0);
		gbc_jtfTelefono.fill = GridBagConstraints.HORIZONTAL;
		gbc_jtfTelefono.gridx = 1;
		gbc_jtfTelefono.gridy = 7;
		add(jtfTelefono, gbc_jtfTelefono);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				guardar();
			}
		});
		GridBagConstraints gbc_btnGuardar = new GridBagConstraints();
		gbc_btnGuardar.gridwidth = 2;
		gbc_btnGuardar.gridx = 0;
		gbc_btnGuardar.gridy = 8;
		add(btnGuardar, gbc_btnGuardar);

	}
	
	public static void guardar() {
		es.setNombre(getNombre());
		es.setApellido1(getApellido1());
		es.setApellido2(getApellido2());
		es.setDni(getDni());
		es.setDireccion(getDireccion());
		es.setEmail(getEmail());
		es.setTelefono(getTelefono());
		es.setId(getId());
		EstudianteController.update(es);
	}
	
	

	void ssetId (int id) {
		this.jtfId.setText(""+id);
	}
	

	void setNombre (String nombre) {
		this.jtfNombre.setText(nombre);
	}
	

	void setApellido1 (String apellido1) {
		this.jtfApellido1.setText(apellido1);
	}
	

	void setApellido2 (String apellido2) {
		this.jtfApellido2.setText(apellido2);
	}
	
	
	void setDni (String dni) {
		this.jtfDni.setText(dni);
	}
	
	void setEmail (String email) {
		this.jtfEmail.setText(email);
	}
	
	void setTelefono (String telefono) {
		this.jtfTelefono.setText(telefono);
	}
	
	
	public static int getId() {
		return Integer.parseInt(jtfId.getText());
	}

	public static String getNombre() {
		return jtfNombre.getText();
	}

	public static String getApellido1() {
		return jtfApellido1.getText();
	}
	
	public static String getApellido2() {
		return jtfApellido2.getText();
	}
	
	public static String getDireccion() {
		return jtfDireccion.getText();
	}

	public void setDireccion(String direccion) {
		this.jtfDireccion.setText(direccion);
	}

	public static String getDni() {
		return jtfDni.getText();
	}
	
	public static String getEmail() {
		return jtfEmail.getText();
	}
	
	public static String getTelefono() {
		return jtfTelefono.getText();
	}
}
