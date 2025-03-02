package logging.sinkTypeDir;

import logging.SinkType;

public class SyncLogger implements SinkType {
    @Override
    public void log(String message) {
        System.out.println("Sync Message: " + message);
    }
}
