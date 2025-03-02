package logger;

public class LoggerTypeFactory {
    LoggerType loggerType;

    public static LoggerType getLoggerType(String loggerType) {
        if(loggerType.equalsIgnoreCase("sync")) {
            new SyncLogger();
        }
        else if(loggerType.equalsIgnoreCase("async")) {
            new AsyncLogger();
        }
        return new SyncLogger();

    }
}
