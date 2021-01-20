package fr.zunf1x.logger;

import fr.zunf1x.logger.utils.LogUtils;

public class Logger {
	
	public Logger(String name) {	
		createLogger(name);
	}
	
	public void createLogger(String name) {
		LogUtils.setPrefix(name);
		
		LoggerAPI.info("Logger succesfuly created!");
	}
}