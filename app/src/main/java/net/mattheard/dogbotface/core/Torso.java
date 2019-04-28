package net.mattheard.dogbotface.core;

public class Torso {
    private final Logger logger;

    public Torso(final Logger logger) {
        this.logger = logger;
    }

    public void handleMessage(final String message) {
        logger.logMessage(message);
    }

}
