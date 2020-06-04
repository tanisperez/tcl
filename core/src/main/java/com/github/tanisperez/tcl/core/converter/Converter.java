package com.github.tanisperez.tcl.core.converter;

import java.util.Collection;

/**
 * Interface to transform objects of type {@code S} to {@code T}.
 *
 * @author Estanislao Pérez Nartallo
 *
 * @version 0.0.1
 * @since 0.0.1
 *
 * @param <S> Source type.
 * @param <T> Target type.
 */
public interface Converter<S, T> {

	/**
	 * Convert an object of type {@code S} to {@code T}.
	 *
	 * @param source Object to be converted.
	 * @return Return the object converted to the target type.
	 */
	T convert(final S source);

	/**
	 * Convert a {@code Collection} of type {@code S} to {@code Collection} of type
	 * {@code T}.
	 *
	 * @param sources The {@code Collection} to be converted.
	 * @return Return the {@code Collection} converted.
	 */
	Collection<T> convert(final Collection<S> sources);

}
