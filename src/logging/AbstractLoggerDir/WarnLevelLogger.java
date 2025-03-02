package logging.AbstractLoggerDir;

import logging.AbstractLogger;
import logging.LogLevel;
import logging.LogObserverSubject;

public class WarnLevelLogger extends AbstractLogger {

    public WarnLevelLogger(AbstractLogger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(LogLevel level, String message, LogObserverSubject logObserverSubject) {
        if(level == LogLevel.WARN) {
            logObserverSubject.notifyObservers(LogLevel.WARN, message);
            return;
        }
        super.log(level, message,logObserverSubject);
    }
}
