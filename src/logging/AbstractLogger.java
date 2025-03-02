package logging;

public abstract class AbstractLogger {

    AbstractLogger nextLogger;

    public AbstractLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public  void log(LogLevel level,String message,LogObserverSubject logObserverSubject){

        if(nextLogger != null){
            nextLogger.log(level,message,logObserverSubject);
            return;
        }
        System.out.println("Invalid log level");

    }
}
