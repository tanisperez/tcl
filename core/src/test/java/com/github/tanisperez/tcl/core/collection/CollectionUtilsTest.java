package com.github.tanisperez.tcl.core.collection;

import static com.github.tanisperez.tcl.core.collection.CollectionUtils.isEmpty;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Test suite for the {@code CollectionUtils}
 *
 * @author Estanislao Pérez Nartallo
 *
 * @version 0.0.1
 * @since 0.0.1
 */
public final class CollectionUtilsTest {

	/**
	 * Private constructor.
	 */
	private CollectionUtilsTest() {
		// DO Nothing.
	}

	@Test
	@DisplayName("isEmpty()")
	public void testIsEmpty() {
		assertTrue(isEmpty(null));
		assertTrue(isEmpty(Collections.emptyList()));
		assertFalse(isEmpty(Set.of(1, 2, 3)));
		assertFalse(isEmpty(List.of("hello", "world")));
	}

}
