package com.spring.tamara;

public class App {
    private Client client;
    private EventLogger eventLogger;



    public App(Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public void logEvent(String msg) {
        String massage = msg.replaceAll(client.getId(), client.getFullName());

        eventLogger.logEvent(massage);

    }

    public static void main(String[] args) {
        App app = new App();

        app.logEvent("Some event for user 1");
    }
}
