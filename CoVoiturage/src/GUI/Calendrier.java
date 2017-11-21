package GUI;

import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

import Classe.CBalade;
import Classe.CCalendrier;
import Classe.CPersonneMembre;
import DAO.DBalade;

import java.awt.Color;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Calendrier {

	private JFrame frame;
	private CPersonneMembre cm;
	private CCalendrier ca;
	private DBalade db; 
	private ArrayList<CBalade> lstB;

	/**
	 * Launch the application.
	 */

	public Calendrier(CPersonneMembre cm, CCalendrier ca) {
		this.cm = cm;
		this.ca = ca;
		db = new DBalade();
		lstB = db.find(ca);
		initialize();
		
		this.frame.setVisible(true);
	}
	/**
	*@wbp.parser.constructor 
	***/
	public Calendrier() {
		initialize();
		this.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 255, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(29, 11, 188, 28);
		frame.getContentPane().add(panel);
		
		JLabel lblNewLabel = new JLabel("Les balades");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(29, 50, 188, 28);
		DBalade db = new DBalade(); 
		ArrayList<CBalade> lstB = db.find(ca);
		
		for(CBalade b : lstB) {
			comboBox.addItem(b);
		}
		
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Liste V\u00E9hicule");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Vehicule fenetre = new Vehicule(cm,(CBalade)comboBox.getSelectedItem());
				frame.dispose();
			}
		});
		
		btnNewButton.setBounds(29, 145, 188, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Retour");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AccueilMembre fenetre = new AccueilMembre(cm);
				frame.dispose();
			}
		});
		btnNewButton_2.setBounds(79, 212, 89, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		
	}
}
