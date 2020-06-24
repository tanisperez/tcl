package com.github.tanisperez.tcl.core.converter;

import java.util.List;

/**
 * Interface to transform objects of type {@code S} to {@code T} and vice versa.
 *
 * @author Estanislao Pérez Nartallo
 *
 * @version 0.0.3
 * @since 0.0.1
 *
 * @param <L> Left type.
 * @param <R> Right type.
 */
public interface BiConverter<L, R> {

	/**
	 * Convert an object of type {@code R} to {@code L}.
	 *
	 * @param right Right object to be converted.
	 * @return Return the object converted to the Left type.
	 */
	L toLeft(final R right);

	/**
	 * Convert a {@code List} of type {@code R} to {@code List} of type {@code L}.
	 *
	 * @param rights The {@code List} of type {@code R} to be converted.
	 * @return Return the {@code List} converted.
	 */
	List<L> toLeft(final List<R> rights);

	/**
	 * Convert an object of type {@code L} to {@code R}.
	 *
	 * @param right Left object to be converted.
	 * @return Return the object converted to the Right type.
	 */
	R toRight(final L left);

	/**
	 * Convert a {@code List} of type {@code L} to {@code List} of type {@code R}.
	 *
	 * @param lefts The {@code List} of type {@code L} to be converted.
	 * @return Return the {@code List} converted.
	 */
	List<R> toRight(final List<L> lefts);

}
