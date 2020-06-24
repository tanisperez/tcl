package com.github.tanisperez.tcl.core.converter;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.github.tanisperez.tcl.core.collection.CollectionUtils;

/**
 * Abstract implementation of the {@code BiConverter} interface with null
 * checks.
 *
 * @author Estanislao Pérez Nartallo
 *
 * @param <L> Left type.
 * @param <R> Right type.
 *
 * @version 0.0.3
 * @since 0.0.1
 */
public abstract class AbstractBiConverter<L, R> implements BiConverter<L, R> {

	/**
	 * Convert an object of type {@code R} to {@code L} with null check.
	 *
	 * @param right Right object to be converted.
	 * @return Return the object converted to the Left type.
	 */
	@Override
	public L toLeft(final R right) {
		if (right != null) {
			return convertRightAttributes(right);
		}
		return null;
	}

	/**
	 * Convert a {@code List} of type {@code R} to {@code List} of type {@code L}.
	 * <p>
	 * This method tries to convert each element individually, discarting null
	 * values.
	 *
	 * @param rights The {@code List} of type {@code R} to be converted.
	 * @return Return the {@code List} converted.
	 */
	@Override
	public List<L> toLeft(final List<R> rights) {
		if (!CollectionUtils.isEmpty(rights)) {
			return rights.stream()
					.map(right -> toLeft(right))
					.filter(left -> left != null)
					.collect(Collectors.toList());
		}
		return Collections.emptyList();
	}

	/**
	 * Convert an object of type {@code L} to {@code R} with null check.
	 *
	 * @param right Left object to be converted.
	 * @return Return the object converted to the Right type.
	 */
	@Override
	public R toRight(final L left) {
		if (left != null) {
			return convertLeftAttributes(left);
		}
		return null;
	}

	/**
	 * Convert a {@code List} of type {@code L} to {@code List} of type {@code R}.
	 * <p>
	 * This method tries to convert each element individually, discarting null
	 * values.
	 *
	 * @param lefts The {@code List} of type {@code L} to be converted.
	 * @return Return the {@code List} converted.
	 */
	@Override
	public List<R> toRight(final List<L> lefts) {
		if (!CollectionUtils.isEmpty(lefts)) {
			return lefts.stream()
					.map(left -> toRight(left))
					.filter(right -> right != null)
					.collect(Collectors.toList());
		}
		return Collections.emptyList();
	}

	/**
	 * This method is executed after the null checks, to convert a class {@code R}
	 * into a class {@code L}.
	 * <p>
	 * This method should never return null or throw an exception.
	 *
	 * @param source Object to be converted.
	 * @return Return the object converted to the {@code L} type.
	 */
	protected abstract L convertRightAttributes(final R right);

	/**
	 * This method is executed after the null checks, to convert a class {@code L}
	 * into a class {@code R}.
	 * <p>
	 * This method should never return null or throw an exception.
	 *
	 * @param source Object to be converted.
	 * @return Return the object converted to the {@code R} type.
	 */
	protected abstract R convertLeftAttributes(final L left);

}
