package logging;

import logging.AbstractLoggerDir.DebugLevelLogger;
import logging.AbstractLoggerDir.InfoLevelLogger;
import logging.AbstractLoggerDir.WarnLevelLogger;
import logging.logobserverdir.ConsoleObserver;
import logging.logobserverdir.FileObserver;
import logging.sinkTypeDir.AsyncLogger;
import logging.sinkTypeDir.SyncLogger;

public class LogManager {

    public static AbstractLogger chainLogger(){
        AbstractLogger abstractLogger = new InfoLevelLogger(new DebugLevelLogger(new WarnLevelLogger(null)));
        return abstractLogger;
    }


    public static LogObserverSubject addObserver(){
        LogObserverSubject logObserverSubject = new LogObserverSubjectImpl();
        LogObserver fileObserver = new FileObserver();
        LogObserver consoleObserver = new ConsoleObserver();
        logObserverSubject.addObserver(LogLevel.INFO,consoleObserver);
        logObserverSubject.addObserver(LogLevel.DEBUG,fileObserver);
        logObserverSubject.addObserver(LogLevel.WARN,consoleObserver);
        return logObserverSubject;
    }

    public static SinkType getSinkType(String type){
        return switch (type) {
            case "sync" -> new SyncLogger();
            case "async" -> new AsyncLogger();
            default -> new SyncLogger();
        };

    }





}
