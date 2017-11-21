package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;

import Classe.CPersonneResponsable;

public class AccueilResponsable {

	private JFrame frame;
	private CPersonneResponsable pr;
	
	public AccueilResponsable(CPersonneResponsable pr) {
		initialize();
		this.pr = pr;
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
