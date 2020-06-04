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
	 * Check if a {@code Collection} is null or empty.
	 *
	 * <pre>
	 * 	isEmpty(null) = true
	 * 	isEmpty(List.of()) = true
	 * 	isEmpty(List.of(1, 2, 3)) = false
	 * </pre>
	 *
	 * @param <T>        The {@code Collection} generic type.
	 * @param collection The {@code Collection} to check.
	 * @return Return true if the {@code Collection} is null or empty.
	 */
	public static <T> boolean isEmpty(final Collection<T> collection) {
		return (collection == null) || (collection.size() == 0);
	}

}
