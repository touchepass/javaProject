package DAO;

import java.sql.*;
import javax.swing.JOptionPane;

public class DConnection {

	private static Connection instance = null;
	
	private DConnection(){
		try{
			Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
			String url = "jdbc:ucanaccess://./Database1.accdb";
			instance = DriverManager.getConnection(url);
		}
		catch(ClassNotFoundException ex){
			JOptionPane.showMessageDialog(null, "Classe de driver introuvable" + ex.getMessage());
			System.exit(0);
		}
		catch (SQLException ex) {
			JOptionPane.showMessageDialog(null, "Erreur JDBC : " + ex.getMessage());
		}
		if (instance == null) {
            JOptionPane.showMessageDialog(null, "La base de donn�es est inaccessible, fermeture du programme.");
            System.exit(0);
        }
	}
	
	public static Connection getInstance() {
		if(instance == null){
			new DConnection();
		}
		return instance;
	}
}