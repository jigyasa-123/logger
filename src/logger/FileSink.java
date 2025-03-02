package logger;

public class FileSink implements SinkType{
    @Override
    public void log(String message) {
        System.out.println("File Type:"+message);
    }
}
