package logging;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger();
        logger.setSinkType("sync");
        logger.debug("Try it on");
        logger.info("info level");
        logger.setSinkType("async");

        logger.warn("warn level");
    }
}
