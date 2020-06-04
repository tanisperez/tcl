package com.github.tanisperez.tcl.core.string;

import java.util.Collections;
import java.util.List;

/**
 * Java String API utils.
 *
 * @author Estanislao Pérez Nartallo
 *
 * @version 0.0.1
 * @since 0.0.1
 */
public final class StringUtils {

	private StringUtils() {
		// DO Nothing.
	}

	/**
	 * Check if a {@code String} is null or empty.
	 *
	 * <pre>
	 * 	isEmpty(null) = true
	 * 	isEmpty("") = true
	 * 	isEmpty("hello") = false
	 * </pre>
	 *
	 * @param str The {@code String} to check.
	 * @return Return true if the {@code String} is null or empty, false otherwise.
	 */
	public static boolean isEmpty(final String str) {
		return (str == null) || (str.length() == 0);
	}

	/**
	 * Check if a {@code String} is null, empty or full of blanks.
	 *
	 * <pre>
	 *	isBlank(null) = true
	 *	isBlank("") = true
	 *	isBlank("   ") = true
	 *	isBlank("hello") = false
	 * </pre>
	 *
	 * @param str The {@code String} to check.
	 * @return Return true if the {@code String} is null, empty or full of blanks.
	 */
	public static boolean isBlank(final String str) {
		if (!isEmpty(str)) {
			final String trimmed = str.trim();
			return trimmed.length() == 0;
		}
		return true;
	}

	/**
	 * Trim a {@code String} checking the null value.
	 *
	 * <pre>
	 *	trim(null) = null
	 *	trim("hello  ") = "hello"
	 *	trim(" world    ") = "world"
	 * </pre>
	 *
	 * @param str The {@code String} to check.
	 * @return Return the {@code String} trimmed or null with a null input.
	 */
	public static String trim(final String str) {
		if (str != null) {
			return str.trim();
		}
		return null;
	}

	/**
	 * Convert to lowercase a {@code String} checking the null value.
	 *
	 * <pre>
	 * 	toLowerCase(null) = null
	 * 	toLowerCase("") = ""
	 * 	toLowerCase("HeLLo") = "hello"
	 * </pre>
	 *
	 * @param str The {@code String} to convert to lowercase.
	 * @return Return the {@code String} converted to lowercase or null with a null
	 *         input.
	 */
	public static String toLowerCase(final String str) {
		if (str != null) {
			return str.toLowerCase();
		}
		return null;
	}

	/**
	 * Convert to uppercase a {@code String} checking the null value.
	 *
	 * <pre>
	 *	toUpperCase(null) = null
	 *	toUpperCase("") = ""
	 *	toUpperCase("hello") = "HELLO"
	 * </pre>
	 *
	 * @param str The {@code String} to convert to uppercase.
	 * @return Return the {@code String} converted to uppercase or null with a null
	 *         input.
	 */
	public static String toUpperCase(final String str) {
		if (str != null) {
			return str.toUpperCase();
		}
		return null;
	}

	/**
	 * Split a {@code String} into tokens using a regular expression as delimiter
	 * checking nulls.
	 *
	 * <pre>
	 *	split(null, null) = []
	 *	split("", null) = []
	 *	split("1,2,3", null) = ["1,2,3"]
	 *	split("1,2,3", ",") = ["1", "2", "3"]
	 * </pre>
	 *
	 * @param str   The {@code String} to be split.
	 * @param regex A {@code String} with a regular expression as delimiter for the
	 *              {@code String}
	 * @return Return a {@code List} of {@code String} with the tokens split.
	 */
	public static List<String> split(final String str, final String regex) {
		if (!isEmpty(str)) {
			try {
				final String[] tokens = str.split(regex);
				return List.of(tokens);
			} catch (final Exception exception) {
				return List.of(str);
			}
		}
		return Collections.emptyList();
	}

}
