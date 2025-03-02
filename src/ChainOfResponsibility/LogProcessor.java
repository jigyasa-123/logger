package ChainOfResponsibility;

public abstract class LogProcessor {
    LogProcessor nextProcessor;

    LogProcessor(LogProcessor logProcessor){
        nextProcessor = logProcessor;
    }

    void log(String logLevel, String message){
        if(nextProcessor != null){
            nextProcessor.log(logLevel, message);
            return;
        }
      //  System.out.println(logLevel + ": " + message);

    }
}
