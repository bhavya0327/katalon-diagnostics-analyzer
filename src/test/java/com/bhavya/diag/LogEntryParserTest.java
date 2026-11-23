package com.bhavya.diag;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LogEntryParserTest {
    private final LogEntryParser parser = new LogEntryParser();

    @Test
    void parseBundleAndSeverityFromEntryLine() {
        LogEntry entry = parser.parse("!ENTRY com.kms.katalon.core 4 0 2026-11-20 10:15:32.123", "!MESSAGE Unable to start browser session");

        assertEquals("com.kms.katalon.core", entry.getBundle());
        assertEquals(4, entry.getSeverity());
    }

    @Test
    void parsesMessageWithoutPrefix() {
        LogEntry entry = parser.parse("!ENTRY com.kms.katalon.composer.execution 2 0 2026-11-20 10:15:32.123", "!MESSAGE Unable to start browser session");

        assertEquals("Unable to start browser session", entry.getMessage());
        assertEquals(2, entry.getSeverity());
    }

    @Test
    void rejectsTruncatedEntryLine() {
        assertThrows(LogParseException.class, () -> 
            parser.parse("!ENTRY com.kms.katalon.core", "!MESSAGE Something broke"));
    }

}