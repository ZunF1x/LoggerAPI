package fr.zunf1x.logger;

import java.util.Date;

import fr.zunf1x.logger.utils.LogUtils;

public class LoggerAPI {
	
	public static void err(String message, Exception exception) {
		System.out.println(LogUtils.getPrefix() + " " + new Date() + ": " + message + " (" + exception + ")");
	}
	
	public static void info(String message) {
		System.out.println(LogUtils.getPrefix() + " " + new Date() + ": " + message);
	}
}
