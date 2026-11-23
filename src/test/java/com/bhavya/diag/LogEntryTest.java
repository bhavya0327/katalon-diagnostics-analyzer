package com.bhavya.diag;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LogEntryTest {

    @Test
    void severityFourIsAnError() {
        LogEntry entry = new LogEntry("com.kms.katalon.core", 4, "Unable to start browser session");

        assertEquals("com.kms.katalon.core", entry.getBundle());
        assertTrue(entry.isError());

        assertEquals("Unable to start browser session", entry.getMessage());
    }

    @Test
    void severityTwoIsNotAnError () {
        LogEntry entry = new LogEntry("com.kms.katalon.core", 2, "Slow response");
        assertFalse(entry.isError());
    }

}