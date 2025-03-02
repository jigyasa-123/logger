package logger;

public class ConsoleSink implements SinkType{
    @Override
    public void log(String message) {
        System.out.println("Console Type:"+message);

    }
}
