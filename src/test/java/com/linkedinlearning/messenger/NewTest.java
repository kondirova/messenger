package com.linkedinlearning.messenger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NewTest {

    private final Messenger messenger = new Messenger();
    @Test
    void failsForNullName() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            messenger.createHelloMessage(null, "english");
        });
        assertEquals("Provided word may not be null or an empty string", exception.getMessage());
    }

    @Test
    void canCreateHelloMessageInGerman() {
        assertEquals("Hallo Mary", messenger.createHelloMessage("Mary", "german"));
    }
}
