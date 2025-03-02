package ChainOfResponsibility;

public class Main {
    public static void main(String[] args){
        LogProcessor logProcessor = new InfoLevelLogProcessor(new DebugLevelLogProcessor(new WarnLevelLogProcessor(null)));

        logProcessor.log("DEBUG","Test");
        logProcessor.log("INFO","Test Info");
        logProcessor.log("WARN","Test warn");

    }
    }
