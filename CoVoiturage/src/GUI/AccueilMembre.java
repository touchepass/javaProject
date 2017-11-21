package GUI;

import Classe.CCalendrier;
import Classe.CCategorie;
import Classe.CPersonneMembre;
import DAO.DCalendrier;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AccueilMembre {

	private JFrame frmPageMembre;
	
	
	/**
	 * Create the application.
	 */
	private CPersonneMembre cm;
	
	public AccueilMembre(CPersonneMembre cm) {
		this.cm = cm;
		initialize();
		
		this.frmPageMembre.setVisible(true);
	}
	/**
	*@wbp.parser.constructor 
	***/
	public AccueilMembre() {
		initialize();
		this.frmPageMembre.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPageMembre = new JFrame();
		frmPageMembre.setTitle("Page de "+cm.getPseudo() );
		frmPageMembre.setBounds(100, 100, 450, 300);
		frmPageMembre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPageMembre.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(22, 39, 147, 166);
		frmPageMembre.getContentPane().add(panel);
		
		JLabel lblNom = new JLabel(cm.getNom());
		
		JLabel lblPrenom = new JLabel(cm.getPrenom());
		
		JLabel lblDate = new JLabel(cm.getDateNaissance().toString());
		
		JLabel lblSexe = new JLabel(cm.getSexe());
		
		JLabel lblNumero = new JLabel(String.valueOf( cm.getNumero() ));
		
		JLabel lblRue = new JLabel(String.valueOf(cm.getNumRue())+" , " + cm.getRue() );
		
		JLabel lblVille = new JLabel(String.valueOf(cm.getCodePostal())+" , "+ cm.getLocalite() );
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(10)
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNom, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPrenom, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDate, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblSexe, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNumero, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRue, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblVille, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(11)
					.addComponent(lblNom)
					.addGap(6)
					.addComponent(lblPrenom)
					.addGap(6)
					.addComponent(lblDate)
					.addGap(6)
					.addComponent(lblSexe)
					.addGap(6)
					.addComponent(lblNumero)
					.addGap(6)
					.addComponent(lblRue)
					.addGap(6)
					.addComponent(lblVille))
		);
		panel.setLayout(gl_panel);
		
		JButton btnNewButton = new JButton("Modifier mes Infos");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DonneePerso fenetre = new DonneePerso(cm);
				frmPageMembre.dispose();
			}
		});
		
		btnNewButton.setBounds(22, 227, 147, 23);
		frmPageMembre.getContentPane().add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(22, 11, 147, 23);
		frmPageMembre.getContentPane().add(panel_1);
		
		JLabel lblNewLabel_7 = new JLabel("Mes informations");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(7)
					.addComponent(lblNewLabel_7)
					.addGap(51))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel_7))
		);
		panel_1.setLayout(gl_panel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(226, 46, 147, 34);
		CCalendrier Ca = new CCalendrier();
		for(CCategorie C : cm.getListCategorie()) {
			
			DCalendrier DC = new DCalendrier();
			try {
				 Ca = DC.find(C.getNom());
			}
			catch(Exception e){
				
			}
			comboBox.addItem(Ca);
		}
		
		frmPageMembre.getContentPane().add(comboBox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(226, 11, 147, 23);
		frmPageMembre.getContentPane().add(panel_2);
		
		JLabel lblNewLabel = new JLabel("Mes calendriers");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 127, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(226, 116, 147, 23);
		frmPageMembre.getContentPane().add(panel_3);
		
		JLabel lblNewLabel_1 = new JLabel("Mes Co-balades ");
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel_1)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(226, 150, 147, 34);
		comboBox_1.addItem(cm);
		
		frmPageMembre.getContentPane().add(comboBox_1);
		
		JButton btnNewButton_1 = new JButton("D\u00E9connection");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Loggin fenetre = new Loggin();
				frmPageMembre.dispose();
			}
		});
		btnNewButton_1.setBounds(226, 227, 147, 23);
		frmPageMembre.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("voir");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Calendrier fenetre = new Calendrier(cm,(CCalendrier)comboBox.getSelectedItem());
				frmPageMembre.dispose();
			}
		});
		
		btnNewButton_2.setBounds(226, 82, 89, 23);
		frmPageMembre.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Voir");
		
		btnNewButton_3.setBounds(226, 184, 89, 23);
		frmPageMembre.getContentPane().add(btnNewButton_3);
	}
}
