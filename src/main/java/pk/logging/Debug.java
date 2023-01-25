package pk.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Debug {
    public static boolean SHOULD_LOG_DEBUG = System.getProperties().containsKey("TRACK");
    private static final Logger logger = LogManager.getLogger(Debug.class);
    public static void debug(String message) {
        logger.debug(message);
    }
}
