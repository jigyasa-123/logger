package logger;

public class Logger {

    public static void main(String[] args) {
        LoggerService loggerService = new LoggerService("sync","console");
        loggerService.log(LogLevel.INFO,"test message");

    }
}
