package ru.plasticcard;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.xml.bind.JAXBException;

import ru.plasticcard.model.Config;
import ru.plasticcard.util.ConfigReader;
import ru.plasticcard.view.LoginScreen;

public class MainWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Config config = ConfigReader.getCredentials();
			System.out.println(config.getServer());
			System.out.println(config.getDbname());
			System.out.println(config.getDbport());
			System.out.println(config.getLogin());
			System.out.println(config.getPassword());
		} catch (JAXBException e1) {
			e1.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new LoginScreen();
		frame.setLocationRelativeTo(null);
	}
}
