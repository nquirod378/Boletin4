package es.iessoterohernandez.daw.endes.TestsBoletinJUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

import java.util.stream.Stream;

public class TestBoa {
	static Stream<Arguments> boaElements() {
        return Stream.of(
                Arguments.of("A", 12, "granola bars", true),
                Arguments.of("B", 9, "granola bars", true),
                Arguments.of("C", 8, "granola bars", true),
                Arguments.of("D", 15, "mayonesa", false)
        );
    }

    @ParameterizedTest
    @MethodSource("boaElements")
    public void testMetodoIsHealthy(String name, int length, String favoriteFood, boolean expected) {
        Boa boa = new Boa(name, length, favoriteFood);
        assertEquals(expected, boa.isHealthy());
    }

    @ParameterizedTest
    @MethodSource("boaElements")
    public void testMetodoFitsInCage(String name, int length, String favoriteFood, boolean expected) {
        Boa boa = new Boa(name, length, favoriteFood);
        assertEquals(expected, boa.fitsInCage(12));
    }
	
	
}
