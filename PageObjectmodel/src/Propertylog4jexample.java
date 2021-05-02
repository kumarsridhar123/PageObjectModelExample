
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Propertylog4jexample {
	
	static Logger logger =Logger.getLogger(Propertylog4jexample.class);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
						
		PropertyConfigurator.configure("log4j.properties");
		logger.debug("This is a debug message");
		logger.info("This is an info message");
		logger.warn("This is a warn message");
		logger.error("This is an error message");
		logger.fatal("This is a fatal message");
		
		
	}

}
