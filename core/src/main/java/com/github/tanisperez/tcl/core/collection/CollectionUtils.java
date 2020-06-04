package com.github.tanisperez.tcl.core.collection;

import java.util.Collection;

/**
 * Java Collection API utils.
 *
 * @author Estanislao Pérez Nartallo
 *
 * @version 0.0.1
 * @since 0.0.1
 */
public final class CollectionUtils {

	private CollectionUtils() {
		// DO Nothing
	}

	/**
	 * Checks if a {@code Collection} is null or empty.
	 *
	 * @param <T>        The {@code Collection} generic type.
	 * @param collection The {@code Collection} to check.
	 * @return Returns true if the {@code Collection} is null or empty.
	 */
	public static <T> boolean isEmpty(final Collection<T> collection) {
		return (collection == null) || (collection.size() == 0);
	}

}
