package logging.logobserverdir;

import logging.LogObserver;

public class ConsoleObserver implements LogObserver {


    @Override
    public void log(String message) {
        System.out.println("Writing to console:" + message);
    }
}
