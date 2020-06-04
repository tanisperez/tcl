package com.github.tanisperez.tcl.core.converter;

import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

import com.github.tanisperez.tcl.core.collection.CollectionUtils;

/**
 * Abstract implementation of the {@code Converter} interface with null checks.
 *
 * @author Estanislao Pérez Nartallo
 *
 * @param <S> Source type.
 * @param <T> Target type.
 */
public abstract class AbstractConverter<S, T> implements Converter<S, T> {

	/**
	 * Convert an object of type {@code S} to {@code T} with null check.
	 *
	 * @param source Object to be converted.
	 * @return Return the object converted to the target type, null if the source
	 *         object is null.
	 */
	@Override
	public T convert(final S source) {
		if (source != null) {
			return convertAttributes(source);
		}
		return null;
	}

	/**
	 * Convert a {@code Collection} of type {@code S} to {@code Collection} of type
	 * {@code T}.
	 * <p>
	 * This method tries to convert each element individually, discarting null
	 * values.
	 *
	 * @param sources The {@code Collection} to be converted.
	 * @return Return the {@code Collection} converted or empty list.
	 */
	@Override
	public Collection<T> convert(final Collection<S> sources) {
		if (!CollectionUtils.isEmpty(sources)) {
			return sources.stream()
				.map(source -> convert(source))
				.filter(target -> target != null)
				.collect(Collectors.toList());
		}
		return Collections.emptyList();
	}

	/**
	 * This method is executed after the null checks, to convert a class {@code S}
	 * into a class {@code T}.
	 * <p>
	 * This method should never return null or throw an exception.
	 *
	 * @param source Object to be converted.
	 * @return Return the object converted to the target type.
	 */
	protected abstract T convertAttributes(final S source);

}
