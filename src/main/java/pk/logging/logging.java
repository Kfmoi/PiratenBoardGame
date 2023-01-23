package pk.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.util.StackLocator;;

public class logging {

    public static boolean SHOULD_LOG_DEBUG = System.getProperties().containsKey("TRACK");

    private logging() {}

    public static void debug(String message){
        if (logging.SHOULD_LOG_DEBUG){
            Logger logger = LogManager.getLogger(StackLocator.getInstance().getCallerClass(2));
            Configurator.setLevel(logger, Level.DEBUG);
            logger.debug(message);
            
        }
    }
}