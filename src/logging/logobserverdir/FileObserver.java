package logging.logobserverdir;

import logging.LogObserver;


public class FileObserver implements LogObserver {

    @Override
    public void log(String message) {
        System.out.println("Writing to file:" + message);
    }
}
