package com.github.tanisperez.tcl.core.converter;

import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Test suite for the {@code AbstractBiConverter} and the {@code BiConverter}.
 *
 * @author Estanislao Pérez Nartallo
 *
 * @version 0.0.1
 * @since 0.0.1
 */
public final class AbstractBiConverterTest {

	private static final BiConverter<Integer, String> intToStringBiConverter = new IntToStringBiConverter();

	@Test
	@DisplayName("toLeft()")
	public void testToLeft() {
		final String nullString = null;
		assertNull(intToStringBiConverter.toLeft(nullString));
		Assertions.assertEquals(1, intToStringBiConverter.toLeft("1"));
		Assertions.assertEquals(100002, intToStringBiConverter.toLeft("100002"));

		final List<String> nullStrings = null;
		final var emptyNumbers = intToStringBiConverter.toLeft(nullStrings);
		assertTrue(emptyNumbers.isEmpty());

		final var numbers = intToStringBiConverter.toLeft(Arrays.asList("1", "2", "3", null, "4"));
		final var expectedNumbers = List.of(1, 2, 3, 4);
		assertTrue(expectedNumbers.equals(numbers));
	}

	@Test
	@DisplayName("toRight()")
	public void testToRight() {
		final Integer nullInteger = null;
		assertNull(intToStringBiConverter.toRight(nullInteger));
		Assertions.assertEquals("1", intToStringBiConverter.toRight(1));
		Assertions.assertEquals("100002", intToStringBiConverter.toRight(100002));

		final List<Integer> nullStrings = null;
		final var emptyNumbers = intToStringBiConverter.toRight(nullStrings);
		assertTrue(emptyNumbers.isEmpty());

		final var numbers = intToStringBiConverter.toRight(Arrays.asList(1, 2, 3, null, 4));
		final var expectedNumbers = List.of("1", "2", "3", "4");
		assertTrue(expectedNumbers.equals(numbers));
	}

}
