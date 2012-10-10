import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Main {

	static final Logger LOGGER = Logger.getLogger(Main.class);

	public static void main(String[] args) {

		PropertyConfigurator.configure("log4j.properties");
		LOGGER.debug("Sample debug message");
		LOGGER.info("Sample info message");
		LOGGER.warn("Sample warn message");
		LOGGER.error("Sample error message");
		LOGGER.fatal("Sample fatal message");

	}

}