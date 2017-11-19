package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Classe.CPersonneMembre;

public class DonneePerso {

	private JFrame frame;
	private CPersonneMembre cm;
	
	public DonneePerso(CPersonneMembre cm) {
		this.cm = cm;
		initialize();
		
		this.frame.setVisible(true);
	}
	
	/**
	*@wbp.parser.constructor 
	***/
	
	public DonneePerso() {
		initialize();
		this.frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
