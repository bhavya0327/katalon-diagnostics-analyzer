package com.bhavya.diag;



public class LogEntry {

    private final String bundle;
    private final int severity;
    private final String message;

    public LogEntry (String bundle, int severity, String message) {
        this.bundle=bundle;
        this.severity=severity;
        this.message=message;
    }

    public String getBundle() {
        return bundle;
    }

    public int getSeverity() {
        return severity;
    }

    public String getMessage() {
        return message;
    }

    public boolean isError() {
        return severity == 4;
    }

}