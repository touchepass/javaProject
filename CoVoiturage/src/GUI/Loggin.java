package GUI;

import java.awt.EventQueue;
import Classe.*;
import DAO.*;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Loggin {

	private JFrame frmConnection;
	private JTextField txtPseudo;
	private JTextField txtPass;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loggin window = new Loggin();
					window.frmConnection.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Loggin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConnection = new JFrame();
		frmConnection.setTitle("Connection");
		frmConnection.setBounds(100, 100, 450, 300);
		frmConnection.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnValider = new JButton("Valider");
		btnValider.setBounds(67, 198, 89, 23);
		btnValider.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				DPersonneMembre pm = new DPersonneMembre();
				CPersonneMembre cm = pm.find(txtPseudo.getText().toLowerCase());
				
				AccueilMembre fenetre = new AccueilMembre(cm);
				fenetre.
				frmConnection.dispose();
				
			}
		});
		frmConnection.getContentPane().setLayout(null);
		frmConnection.getContentPane().add(btnValider);
		
		JButton btnQuitter = new JButton("Quitter");
		btnQuitter.setBounds(260, 198, 89, 23);
		frmConnection.getContentPane().add(btnQuitter);
		
		JLabel lblPseudo = new JLabel("Pseudo");
		lblPseudo.setBounds(67, 63, 46, 14);
		frmConnection.getContentPane().add(lblPseudo);
		
		txtPseudo = new JTextField();
		txtPseudo.setBounds(260, 60, 86, 20);
		txtPseudo.setText("touchepass");
		frmConnection.getContentPane().add(txtPseudo);
		txtPseudo.setColumns(10);
		
		JLabel lblPass = new JLabel("Pass");
		lblPass.setBounds(67, 107, 46, 14);
		frmConnection.getContentPane().add(lblPass);
		
		txtPass = new JTextField();
		txtPass.setBounds(260, 104, 86, 20);
		txtPass.setText("azerty");
		frmConnection.getContentPane().add(txtPass);
		txtPass.setColumns(10);
	}
}
