package ChainOfResponsibility;

public class WarnLevelLogProcessor extends LogProcessor {
    public WarnLevelLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);

    }

    @Override
    void log(String logLevel, String message) {
        if (logLevel.equals("WARN")){
            System.out.println("Warn:"+message);
        }
        super.log(logLevel, message);
    }
}
