package ru.plasticcard.util;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import ru.plasticcard.model.Config;

public class ConfigReader {

	//TODO set from interface?
	private static final String PATH = "CONFIG_FOLDER/config.xml";
	
	public static Config getCredentials() throws JAXBException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Config.class);
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		return (Config) jaxbUnmarshaller.unmarshal(new File(PATH));
	}

}
