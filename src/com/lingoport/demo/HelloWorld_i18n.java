package com.lingoport.demo;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HelloWorld_i18n {
	
	public static void main(String[] args) {
		Locale locale = getUserLocale();  // Set to French in France (fr_FR)
		ResourceBundle resourceBundle = ResourceBundle.getBundle("DemoResources", locale);
		String greeting = resourceBundle.getString("HELL_HELLOWO_1");
		
		DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, locale);
		String dateString = dateFormatter.format(new Date());
		
		System.out.println(greeting);
		System.out.println(dateString);
		
		Logger logger = Logger.getLogger("Logger");
		String logMessage = "Logging message - Don't translate me.";
		logger.log(Level.INFO, logMessage);
	}

	public static Locale getUserLocale() {
		Locale locale = new Locale("fr", "FR");
		return locale;
	}
	
}
