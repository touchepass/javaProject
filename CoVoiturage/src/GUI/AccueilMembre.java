package GUI;

import java.awt.EventQueue;
import Classe.CPersonneMembre;

import javax.swing.JFrame;

public class AccueilMembre {

	private JFrame frmPageMembre;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AccueilMembre window = new AccueilMembre();
					window.frmPageMembre.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	private CPersonneMembre cm;
	
	public AccueilMembre(CPersonneMembre cm) {
		this.cm = cm;
		initialize();
	}
	
	public AccueilMembre() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPageMembre = new JFrame();
		frmPageMembre.setTitle("Page Membre");
		frmPageMembre.setBounds(100, 100, 450, 300);
		frmPageMembre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
