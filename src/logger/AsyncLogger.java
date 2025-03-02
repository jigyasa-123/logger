package logger;

public class AsyncLogger implements LoggerType {

    @Override
    public void log(SinkType sinkType,String message) {
        sinkType.log(message);
    }
}
