package com.github.tanisperez.tcl.core.converter;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Test suite for the {@code AbstractConverter} and {@code Converter}.
 *
 * @author Estanislao Pérez Nartallo
 *
 * @version 0.0.1
 * @since 0.0.1
 */
public final class AbstractConverterTest {

	private static final Converter<String, List<Long>> stringListNumberConverter = new StringToLongListConverter();
	private static final Converter<Integer, String> intToStringConverter = new IntToStringConverter();

	@Test
	@DisplayName("Convert object")
	public void testConvert() {
		final String nullString = null;
		Assertions.assertNull(stringListNumberConverter.convert(nullString));

		final var numbers = stringListNumberConverter.convert("1,2, 3,4, 5");
		final var expectedNumbers = List.of(1L, 2L, 3L, 4L, 5L);

		assertTrue(expectedNumbers.equals(numbers));
	}

	@Test
	@DisplayName("Convert objects")
	public void testConvertList() {
		final List<Integer> nullList = null;
		final var nullNumbers = intToStringConverter.convert(nullList);
		Assertions.assertTrue(nullNumbers.isEmpty());

		final var numbers = intToStringConverter.convert(Arrays.asList(1, 2, 3, 4, null, 5));
		final var expectedNumbers = List.of("1", "2", "3", "4", "5");

		assertTrue(expectedNumbers.equals(numbers));
	}

}
