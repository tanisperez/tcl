package com.github.tanisperez.tcl.string;

import static com.github.tanisperez.tcl.core.string.StringUtils.isBlank;
import static com.github.tanisperez.tcl.core.string.StringUtils.isEmpty;
import static com.github.tanisperez.tcl.core.string.StringUtils.trim;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

	@Test
	@DisplayName("isEmpty()")
	public void testIsEmpty() {
		assertTrue(isEmpty(null));
		assertTrue(isEmpty(""));
		assertFalse(isEmpty("hello"));
		assertFalse(isEmpty(" world "));
	}

	@Test
	@DisplayName("isBlank()")
	public void testIsBlank() {
		assertTrue(isBlank(null));
		assertTrue(isBlank(""));
		assertTrue(isBlank("   "));
		assertFalse(isBlank("hello"));
		assertFalse(isBlank(" world "));
	}

	@Test
	@DisplayName("trim()")
	public void testTrim() {
		assertNull(trim(null));
		assertEquals("", trim("  "));
		assertEquals("hello", trim(" hello   "));
		assertEquals("world", trim("       world"));
	}

}
