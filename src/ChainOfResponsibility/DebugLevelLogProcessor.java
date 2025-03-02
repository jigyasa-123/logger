package ChainOfResponsibility;

public class DebugLevelLogProcessor extends LogProcessor{
    public DebugLevelLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    void log(String logLevel, String message) {
        if(logLevel.equals("DEBUG")){
            System.out.println("Debug:"+message);
        }
        super.log(logLevel, message);
    }
}
