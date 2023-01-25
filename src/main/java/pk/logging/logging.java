package pk.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.config.Configurator;

public class logging {

    public static boolean log = System.getProperties().containsKey("TRACK");

    private static final Logger logger = LogManager.getLogger(Debug.class);
    public static void debug(String message){
        if (logging.log){
            Configurator.setLevel(logger, Level.DEBUG);
            logger.debug(message);
            
            
        }
    }
    
}