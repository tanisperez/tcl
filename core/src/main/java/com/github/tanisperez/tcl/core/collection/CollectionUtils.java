package com.github.tanisperez.tcl.core.collection;

import java.util.Collection;

public final class CollectionUtils {

	private CollectionUtils() {
		// DO Nothing
	}

	public static <T> boolean isEmpty(final Collection<T> collection) {
		return (collection == null) || (collection.size() == 0);
	}

}
