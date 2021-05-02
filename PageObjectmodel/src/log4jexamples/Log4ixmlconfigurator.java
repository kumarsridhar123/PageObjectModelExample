package log4jexamples;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class Log4ixmlconfigurator {

	 static Logger logger = Logger.getLogger(Log4ixmlconfigurator.class);
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DOMConfigurator.configure("log4j.xml");
		logger.debug("This is a debug message");
		logger.info("This is an info message");
		logger.warn("This is a warn message");
		logger.error("This is an error message");
		logger.fatal("This is a fatal message");
		
		
	}

}
