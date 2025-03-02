package ChainOfResponsibility;

public class InfoLevelLogProcessor extends  LogProcessor{

    InfoLevelLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }

    @Override
    void log(String logLevel, String message) {
        if(logLevel.equals("INFO")){
            System.out.println("Info:"+ message);
        }
        super.log(logLevel, message);
    }
}
