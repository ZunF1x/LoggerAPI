package fr.zunf1x.logger.utils;

public class LogUtils {
	
	private static String prefix;
	
	public static void setPrefix(String name) {
		prefix = "[" + name + "]";
	}
	
	public static String getPrefix() {
		return prefix;
	}
}
