package logging.AbstractLoggerDir;

import logging.AbstractLogger;
import logging.LogLevel;
import logging.LogObserverSubject;

public class DebugLevelLogger extends AbstractLogger {

    public DebugLevelLogger(AbstractLogger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(LogLevel level, String message, LogObserverSubject logObserverSubject) {
        if(level == LogLevel.DEBUG) {
            logObserverSubject.notifyObservers(LogLevel.DEBUG,message);
            return;
        }
        super.log(level, message,logObserverSubject);
    }
}
