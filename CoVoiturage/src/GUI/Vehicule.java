package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Classe.CBalade;
import Classe.CPersonneMembre;
import Classe.CVehicule;
import DAO.DBalade;
import DAO.DVehicule;

import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Vehicule {

	private JFrame frame;
	private CPersonneMembre cm;
	private CBalade ca;
	private JTextField txtImma;
	private JTextField txtPV;
	private JTextField txtPA;
	
	public Vehicule(CPersonneMembre cm,CBalade ca) {
		this.frame.setVisible(true);
		initialize();
	}
	
	/**
	*@wbp.parser.constructor 
	***/
	public Vehicule() {
		this.frame.setVisible(true);
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 190, 30);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ajouter son v\u00E9hicule");
		lblNewLabel.setBounds(10, 6, 170, 14);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(234, 11, 190, 30);
		frame.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_1 = new JLabel("Demander un v\u00E9hicule");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel_1)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_1.setLayout(gl_panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(10, 57, 190, 130);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Nombre place assise");
		lblNewLabel_2.setBounds(10, 11, 113, 14);
		panel_2.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Nombre place v\u00E9lo");
		lblNewLabel_3.setBounds(10, 44, 113, 14);
		panel_2.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("immatriculation");
		lblNewLabel_4.setBounds(10, 77, 82, 14);
		panel_2.add(lblNewLabel_4);
		
		txtImma = new JTextField();
		txtImma.setBounds(94, 74, 86, 20);
		panel_2.add(txtImma);
		txtImma.setColumns(10);
		
		txtPV = new JTextField();
		txtPV.setBounds(124, 41, 56, 20);
		panel_2.add(txtPV);
		txtPV.setColumns(10);
		
		txtPA = new JTextField();
		txtPA.setBounds(124, 8, 56, 20);
		panel_2.add(txtPA);
		txtPA.setColumns(10);
		
		JButton btnNewButton = new JButton("Ajouter");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				CVehicule cv = new CVehicule(0, cm, Integer.parseInt(txtPA.getText()), Integer.parseInt(txtPV.getText()), txtImma.getText());
				
				DVehicule dv = new DVehicule();
				dv.create(cv);
				
				DBalade db = new DBalade();
				db.create(ca, dv.find(txtImma.getText()));
			}
		});
		btnNewButton.setBounds(10, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(234, 57, 190, 30);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton_1 = new JButton("Inscription");
		btnNewButton_1.setBounds(335, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Retour accueil");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AccueilMembre fenetre = new AccueilMembre(cm);
				frame.dispose();
			}
		});
		btnNewButton_2.setBounds(161, 227, 112, 23);
		frame.getContentPane().add(btnNewButton_2);
	}
}
