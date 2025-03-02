package logging.AbstractLoggerDir;

import logging.AbstractLogger;
import logging.LogLevel;
import logging.LogObserverSubject;

public class InfoLevelLogger extends AbstractLogger {

    public InfoLevelLogger(AbstractLogger nextLogger) {
        super(nextLogger);
    }

    @Override
    public void log(LogLevel level, String message, LogObserverSubject logObserverSubject) {
        if(level == LogLevel.INFO) {
         logObserverSubject.notifyObservers(LogLevel.INFO, message);
            return;
        }
        super.log(level, message,logObserverSubject);
    }
}
