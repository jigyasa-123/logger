package logger;

public class SyncLogger implements LoggerType{

    @Override
    public void log(SinkType sinkType,String message) {
        sinkType.log(message);


    }
}
