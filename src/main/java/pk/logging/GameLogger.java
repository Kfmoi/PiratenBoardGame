package pk.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.core.config.Configurator;
import org.apache.logging.log4j.util.StackLocator;;

public class GameLogger {

    public static boolean SHOULD_LOG_DEBUG = System.getProperties().containsKey("TRACE");

    private GameLogger() {}

    public static void debuglog(String message){
        if (GameLogger.SHOULD_LOG_DEBUG){
            Logger logger = LogManager.getLogger(StackLocator.getInstance().getCallerClass(2));
            Configurator.setLevel(logger, Level.DEBUG);
            logger.debug(message);
            
        }
    }
}