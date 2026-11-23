package com.bhavya.diag;

public class LogEntryParser {
    public LogEntry parse(String entryLine, String messageLine) {
        String [] parts = entryLine.split("\\s+");

        String bundle = parts [1];
        int severity = Integer.parseInt(parts [2]);

        // String message = messageLine.substring(9);
        String message = messageLine.substring("!MESSAGE ".length());

        return new LogEntry(bundle, severity, message);
    }
}