package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Classe.CCategorie;
import Classe.CPersonneMembre;
import DAO.DCalendrier;
import DAO.DCategorie;
import DAO.DPersonneMembre;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class DonneePerso {

	private JFrame frmMesDonnes;
	private CPersonneMembre cm;
	
	private JTextField txtNum;
	private JTextField txtNumRue;
	private JTextField txtRue;
	private JTextField txtCp;
	private JTextField txtLocalite;
	
	public DonneePerso(CPersonneMembre cm) {
		this.cm = cm;
		initialize();
		
		this.frmMesDonnes.setVisible(true);
	}
	
	/**
	*@wbp.parser.constructor 
	***/
	
	public DonneePerso() {
		initialize();
		this.frmMesDonnes.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMesDonnes = new JFrame();
		frmMesDonnes.setTitle("Mes donn\u00E9es");
		frmMesDonnes.setBounds(100, 100, 450, 300);
		frmMesDonnes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMesDonnes.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(10, 11, 169, 24);
		frmMesDonnes.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Mes Donn\u00E9es");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel.setLayout(gl_panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(10, 32, 169, 189);
		frmMesDonnes.getContentPane().add(panel_1);
		
		JLabel lblNom = new JLabel(cm.getNom());
		
		JLabel lblPrenom = new JLabel(cm.getPrenom());
		
		JLabel lblDate = new JLabel(cm.getDateNaissance().toString());
		
		JLabel lblSexe = new JLabel(cm.getSexe());
		
		txtNum = new JTextField(cm.getNumero());
		txtNum.setColumns(10);
		
		txtNumRue = new JTextField(cm.getNumRue());
		txtNumRue.setColumns(10);
		
		txtRue = new JTextField(cm.getRue());
		txtRue.setColumns(10);
		
		txtCp = new JTextField(cm.getCodePostal());
		txtCp.setColumns(10);
		
		txtLocalite = new JTextField(cm.getLocalite());
		txtLocalite.setColumns(10);
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
						.addComponent(txtNum, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
						.addComponent(lblPrenom, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
						.addComponent(lblNom, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
						.addComponent(lblDate, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
						.addComponent(lblSexe, GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(txtCp, 0, 0, Short.MAX_VALUE)
								.addComponent(txtNumRue, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addComponent(txtLocalite, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
								.addComponent(txtRue, GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE))))
					.addContainerGap())
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNom)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblPrenom)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblDate)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblSexe)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(txtNum, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtNumRue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtRue, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtLocalite, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtCp, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
		);
		panel_1.setLayout(gl_panel_1);
		
		JButton btnNewButton = new JButton("Modifier");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					cm.setNumero(txtNum.getText());
					cm.setNumRue(txtNumRue.getText());
					cm.setRue(txtRue.getText());
					cm.setCodePostal(txtCp.getText());
					cm.setLocalite(txtLocalite.getText());
					DPersonneMembre dm = new DPersonneMembre();
					dm.update(cm);
				}
				catch(Exception t) {
					
				}
			}
		});
		btnNewButton.setBounds(10, 227, 99, 23);
		frmMesDonnes.getContentPane().add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(226, 11, 169, 24);
		frmMesDonnes.getContentPane().add(panel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Mes cat\u00E9gories");
		GroupLayout gl_panel_2 = new GroupLayout(panel_2);
		gl_panel_2.setHorizontalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_2.setVerticalGroup(
			gl_panel_2.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_2.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel_1)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_2.setLayout(gl_panel_2);
		
		JComboBox comboBox = new JComboBox();
		for(CCategorie C : cm.getListCategorie()) {
		
			comboBox.addItem(C);
		}
		
		comboBox.setBounds(226, 55, 169, 31);
		
		
		frmMesDonnes.getContentPane().add(comboBox);
		
		JButton btnNewButton_1 = new JButton("Retour");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AccueilMembre fenetre = new AccueilMembre(cm);
				frmMesDonnes.dispose();
			}
		});
		btnNewButton_1.setBounds(306, 227, 89, 23);
		frmMesDonnes.getContentPane().add(btnNewButton_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(226, 110, 169, 24);
		frmMesDonnes.getContentPane().add(panel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Ajouter une Cat\u00E9gorie");
		GroupLayout gl_panel_3 = new GroupLayout(panel_3);
		gl_panel_3.setHorizontalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE)
					.addContainerGap())
		);
		gl_panel_3.setVerticalGroup(
			gl_panel_3.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_3.createSequentialGroup()
					.addGap(5)
					.addComponent(lblNewLabel_2)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panel_3.setLayout(gl_panel_3);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(226, 155, 169, 31);
		DCategorie dc = new DCategorie();
		ArrayList<CCategorie> lstC =  dc.find(cm, false);
		for(CCategorie C : lstC) {
			comboBox_1.addItem(C);
		}
		frmMesDonnes.getContentPane().add(comboBox_1);
		
		JButton btnNewButton_2 = new JButton("Ajouter");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				dc.create((CCategorie)comboBox_1.getSelectedItem(), cm);
			}
		});
		btnNewButton_2.setBounds(306, 197, 89, 23);
		frmMesDonnes.getContentPane().add(btnNewButton_2);
	}
}
