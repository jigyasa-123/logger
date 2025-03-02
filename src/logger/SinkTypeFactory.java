package logger;

public class SinkTypeFactory {
    SinkType sinkType;

    public static SinkType getSinkType(String type){
        switch (type){
            case "console": return new ConsoleSink();
            case "file":return new FileSink();
            default:return new ConsoleSink();
        }
    }
}
