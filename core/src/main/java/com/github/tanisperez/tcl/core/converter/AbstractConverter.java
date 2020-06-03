package com.github.tanisperez.tcl.core.converter;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import com.github.tanisperez.tcl.core.collection.CollectionUtils;

public abstract class AbstractConverter<S, T> implements Converter<S, T> {

	@Override
	public T convert(final S source) {
		if (source != null) {
			return convertAttributes(source);
		}
		return null;
	}

	@Override
	public List<T> convert(final List<S> sources) {
		if (!CollectionUtils.isEmpty(sources)) {
			return sources.stream()
				.map(source -> convertAttributes(source))
				.filter(target -> target != null)
				.collect(Collectors.toList());
		}
		return Collections.emptyList();
	}

	protected abstract T convertAttributes(final S source);

}
