package com.github.tanisperez.tcl.string;

import static com.github.tanisperez.tcl.core.string.StringUtils.isBlank;
import static com.github.tanisperez.tcl.core.string.StringUtils.isEmpty;
import static com.github.tanisperez.tcl.core.string.StringUtils.split;
import static com.github.tanisperez.tcl.core.string.StringUtils.toLowerCase;
import static com.github.tanisperez.tcl.core.string.StringUtils.toUpperCase;
import static com.github.tanisperez.tcl.core.string.StringUtils.trim;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Test suite for the {@code StringUtils}
 *
 * @author Estanislao Pérez Nartallo
 *
 * @version 0.0.1
 * @since 0.0.1
 */
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

	@Test
	@DisplayName("toLowerCase()")
	public void testToLowerCase() {
		assertNull(toLowerCase(null));
		assertEquals("", toLowerCase(""));
		assertEquals("hello", toLowerCase("HeLLo"));
	}

	@Test
	@DisplayName("toUppwerCase()")
	public void testToUpperCase() {
		assertNull(toUpperCase(null));
		assertEquals("", toUpperCase(""));
		assertEquals("HELLO", toUpperCase("hello"));
	}

	@Test
	@DisplayName("split()")
	public void testSplit() {
		assertEquals(List.of(), split(null, null));
		assertEquals(List.of(), split("", null));
		assertEquals(List.of("1,2,3"), split("1,2,3", null));
		assertEquals(List.of("1", "2", "3"), split("1,2,3", ","));
	}

}
