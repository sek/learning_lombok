package com.example.learning_lombok;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import nl.jqno.equalsverifier.EqualsVerifier;

import org.joda.time.LocalDate;
import org.junit.Test;

public class JodaTimeEqualsVerifierTest
{
    @Test public void test() {
        // passes
        EqualsVerifier.forClass(ObjectContainingString.class).verify();
        // Causes AbstractMethodError
        EqualsVerifier.forClass(ObjectContainingLocalDate.class).verify();
    }
}

@AllArgsConstructor @EqualsAndHashCode
final class ObjectContainingString {
    private final String time;
}

@AllArgsConstructor @EqualsAndHashCode
final class ObjectContainingLocalDate {
    private final LocalDate time;
}
