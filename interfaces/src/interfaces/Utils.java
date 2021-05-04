package interfaces;

public class Utils {
	public static void runLoggers(String message,Logger... loggers) {
		for(Logger logger:loggers) {
			logger.log(message);
		}
	}
}
