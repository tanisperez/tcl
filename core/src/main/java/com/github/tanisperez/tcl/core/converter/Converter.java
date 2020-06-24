package com.github.tanisperez.tcl.core.converter;

import java.util.List;

/**
 * Interface to transform objects of type {@code S} to {@code T}.
 *
 * @author Estanislao Pérez Nartallo
 *
 * @version 0.0.3
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
	 * Convert a {@code List} of type {@code S} to {@code List} of type {@code T}.
	 *
	 * @param sources The {@code List} to be converted.
	 * @return Return the {@code List} converted.
	 */
	List<T> convert(final List<S> sources);

}
