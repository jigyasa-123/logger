package logging;

public class Logger {

    public static Logger logger;
    static AbstractLogger abstractLogger;
    static LogObserverSubject logObserverSubject;
     SinkType sinkType;

    private Logger() {

    }

    public static Logger getLogger() {
        if(logger == null) {
            synchronized (Logger.class){
                if(logger == null) {
                    logger = new Logger();
                    abstractLogger = LogManager.chainLogger();
                    logObserverSubject = LogManager.addObserver();
                }
            }
        }
        return logger;

    }

    public  void setSinkType(String sinkType) {
       this.sinkType =  LogManager.getSinkType(sinkType);
    }

    void info(String message) {
        createLogger(LogLevel.INFO, message);
    }

    void debug(String message) {
        createLogger(LogLevel.DEBUG, message);

    }

    void warn(String message) {
        createLogger(LogLevel.WARN, message);

    }

    private void createLogger(LogLevel logLevel,String message){
        sinkType.log(message);
        abstractLogger.log(logLevel,message,logObserverSubject);

    }


}
