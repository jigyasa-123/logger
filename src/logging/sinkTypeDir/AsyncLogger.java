package logging.sinkTypeDir;

import logging.SinkType;

public class AsyncLogger implements SinkType {

    @Override
    public void log(String message) {
        System.out.println("Async Message: " + message);

    }
}
