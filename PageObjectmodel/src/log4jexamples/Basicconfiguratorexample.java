package log4jexamples;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Basicconfiguratorexample {
	
	static Logger  logger = Logger.getLogger(Basicconfiguratorexample.class); // factory design pattern
	
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasicConfigurator.configure();
		logger.debug("This is a debug message");
		logger.info("This is an info message");
		logger.warn("This is a warn message");
		logger.error("This is an error message");
		logger.fatal("This is a fatal message");
	
	
	}

}
