package com.github.tanisperez.tcl.converter;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.github.tanisperez.tcl.core.converter.Converter;

public class AbstractConverterTest {

	@Test
	@DisplayName("Convert object")
	public void testConvert() {
		final Converter<String, List<Long>> stringNumberConverter = new StringToLongListConverter();

		final List<Long> numbers = stringNumberConverter.convert("1,2,3,4,5");
		final List<Long> expectedNumbers = List.of(1L, 2L, 3L, 4L, 5L);

		assertTrue(expectedNumbers.equals(numbers));
	}

}
