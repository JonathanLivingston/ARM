package ru.plasticcard.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Config {

	private String server;
	private String dbname;
	private int dbport;
	private String login;
	private String password;
	
	public String getServer() {
		return server;
	}
	public void setServer(String server) {
		this.server = server;
	}
	public String getDbname() {
		return dbname;
	}
	public void setDbname(String dbname) {
		this.dbname = dbname;
	}
	public int getDbport() {
		return dbport;
	}
	public void setDbport(int dbport) {
		this.dbport = dbport;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}
