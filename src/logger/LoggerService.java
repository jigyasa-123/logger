package logger;

public class LoggerService {
    LoggerType loggerType;
    SinkType sinkType;
    public LoggerService(String loggerType,String sinkType) {
        this.loggerType = LoggerTypeFactory.getLoggerType(loggerType);
        this.sinkType = SinkTypeFactory.getSinkType(sinkType);
    }

    void log(LogLevel logLevel, String message) {
        loggerType.log(sinkType,message);
    }


}
