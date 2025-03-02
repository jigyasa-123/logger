package logging;

public interface LogObserverSubject {
    void addObserver(LogLevel logLevel,LogObserver observer);
    void removeObserver(LogObserver observer);
    void notifyObservers(LogLevel logLevel,String message);
}
