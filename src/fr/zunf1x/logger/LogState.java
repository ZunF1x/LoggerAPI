package fr.zunf1x.logger;

public enum LogState {

    INFO("INFO"), WARN("WARN"), ERR("ERROR");

    private final String title;

    LogState(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }
}
