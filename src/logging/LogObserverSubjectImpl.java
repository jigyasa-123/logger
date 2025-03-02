package logging;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LogObserverSubjectImpl implements LogObserverSubject {
    private Map<LogLevel, List<LogObserver>> observers = new HashMap<LogLevel, List<LogObserver>>();

    @Override
    public void addObserver(LogLevel logLevel, LogObserver observer) {
        if(!observers.containsKey(logLevel)) {
            observers.put(logLevel, new ArrayList<LogObserver>());
        }
        observers.get(logLevel).add(observer);
    }

    @Override
    public void removeObserver(LogObserver observer) {

        for(var c: observers.values()){
            c.remove(observer);
        }

    }

    @Override
    public void notifyObservers(LogLevel logLevel, String message) {
        if(observers.containsKey(logLevel)) {
           for(var x: observers.get(logLevel)){
               x.log(message);
           }
        }

    }
}
