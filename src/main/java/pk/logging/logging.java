package pk.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class logging {
    public static boolean log = System.getProperties().containsKey("TRACK");
    public static boolean SHOULD_LOG_DEBUG = System.getProperties().containsKey("TRACK");
    private static final Logger logger = LogManager.getLogger(logging.class);
    public static void debug(String message) {
        logger.debug(message);
    }
}

    
