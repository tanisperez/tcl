package com.github.tanisperez.tcl.core.string;

import java.util.Collections;
import java.util.List;

public final class StringUtils {

	private StringUtils() {
		// DO Nothing.
	}

	public static boolean isEmpty(final String str) {
		return (str == null) || (str.length() == 0);
	}

	public static boolean isBlank(final String str) {
		if (!isEmpty(str)) {
			final String trimmed = str.trim();
			return trimmed.length() == 0;
		}
		return true;
	}

	public static String trim(final String str) {
		if (str != null) {
			return str.trim();
		}
		return null;
	}

	public static String toLowerCase(final String str) {
		if (str != null) {
			return str.toLowerCase();
		}
		return null;
	}

	public static String toUpperCase(final String str) {
		if (str != null) {
			return str.toUpperCase();
		}
		return null;
	}

	public static List<String> split(final String str, final String regex) {
		if (!isEmpty(str) && (regex != null)) {
			final String[] tokens = str.split(regex);
			return List.of(tokens);
		}
		return Collections.emptyList();
	}

}
