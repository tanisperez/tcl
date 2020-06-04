package com.github.tanisperez.tcl.core.number;

public final class NumberUtils {

	private NumberUtils() {
		// DO Nothing.
	}

	/**
	 * TODO: Improve this.
	 * 
	 * @param number
	 * @return
	 */
	public static boolean isNumber(final String number) {
		boolean isNumeric = true;
		try {
			Long.valueOf(number);
		} catch (final NumberFormatException exception) {
			isNumeric = false;
		}
		return isNumeric;
	}

}
