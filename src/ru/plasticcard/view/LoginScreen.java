package ru.plasticcard.view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import ru.plasticcard.util.Constants;

import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;

@SuppressWarnings("serial")
public class LoginScreen extends JFrame {

	private static final String BUTTON_LOGIN = "Вход";
	private static final String LABEL_PASSWORD = "Пароль:";
	private static final String LABEL_USERNAME = "Имя пользователя:";
	private static final String TITLE = "Окно входа в систему";
	private JPanel panel;
	private JTextField userNameField;
	private JTextField passField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginScreen frame = new LoginScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LoginScreen() {
		setResizable(false);
		setIconImage(Constants.frameIcon.getImage());
		setTitle(TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 400, 200);
		panel = new JPanel();
		panel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panel);
		
		JLabel userNameLabel = new JLabel(LABEL_USERNAME);
		
		userNameField = new JTextField();
		
		JLabel passLabel = new JLabel(LABEL_PASSWORD);
		
		passField = new JTextField();
		
		JButton button = new JButton(BUTTON_LOGIN);
		GroupLayout layout = new GroupLayout(panel);
		layout.setHorizontalGroup(
			layout.createParallelGroup(Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
					.addGap(19)
					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(passLabel)
						.addComponent(userNameLabel))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(button)
						.addComponent(passField, GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
						.addComponent(userNameField))
					.addContainerGap(32, Short.MAX_VALUE))
		);
		layout.setVerticalGroup(
			layout.createParallelGroup(Alignment.CENTER)
				.addGroup(Alignment.LEADING, layout.createSequentialGroup()
					.addGap(30)
					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(userNameLabel)
						.addComponent(passField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(layout.createParallelGroup(Alignment.BASELINE)
						.addComponent(passLabel)
						.addComponent(userNameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(button)
					.addContainerGap(46, Short.MAX_VALUE))
		);
		panel.setLayout(layout);
	}

}
