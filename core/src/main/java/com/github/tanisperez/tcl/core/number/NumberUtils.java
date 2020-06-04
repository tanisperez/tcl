package com.github.tanisperez.tcl.core.number;

import com.github.tanisperez.tcl.core.string.StringUtils;

/**
 * Java Number API utils.
 *
 * @author Estanislao Pérez Nartallo
 *
 * @version 0.0.1
 * @since 0.0.1
 */
public final class NumberUtils {

	private NumberUtils() {
		// DO Nothing.
	}

	/**
	 * Check if a {@code String} is a number.
	 *
	 * <pre>
	 *	isNumber(null) = false
	 *	isNumber("") = false
	 *	isNumber(" a") = false
	 *	isNumber("10") = true
	 *	isNumber("654232") = true
	 * </pre>
	 *
	 * <p>
	 * TODO: Improve performance.
	 *
	 * @param number The {@code String} which contains the number.
	 * @return Return true if the {@code String} is a number, false otherwise.
	 */
	public static boolean isNumber(final String number) {
		if (!StringUtils.isBlank(number)) {
			try {
				Long.valueOf(number);
				return true;
			} catch (final NumberFormatException exception) {
				// DO Nothing.
			}
		}
		return false;
	}

}
