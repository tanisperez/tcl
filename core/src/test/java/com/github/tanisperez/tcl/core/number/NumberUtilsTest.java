package com.github.tanisperez.tcl.core.number;

import static com.github.tanisperez.tcl.core.number.NumberUtils.isNumber;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Test suite for the {@code NumberUtils}.
 *
 * @author Estanislao Pérez Nartallo
 *
 * @version 0.0.1
 * @since 0.0.1
 */
public final class NumberUtilsTest {

	@Test
	@DisplayName("isNumber()")
	public void testIsNumber() {
		assertFalse(isNumber(null));
		assertFalse(isNumber(""));
		assertFalse(isNumber(" a"));
		assertTrue(isNumber("10"));
		assertTrue(isNumber("654232"));
	}

}
